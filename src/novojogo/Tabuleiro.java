/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose_
 */
public class Tabuleiro {

    private int tamanho;
    private List<Casa> casas = new ArrayList<>();

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        for (int i = 1; i <= tamanho; i++) {
            adicionarCasa(new CasaNormal(i));
        }
    }

    public void adicionarDesafio(Desafio desafio, int posicao) {

        if (posicao < 1 || posicao > casas.size()) {
            System.out.println("Posição inválida!");
            return;
        }

        int indice = posicao - 1;

        casas.set(indice, new CasaEspecial(posicao, desafio));
    }

    public void adicionarCasa(Casa casa) {
        casas.add(casa);
    }

    public Casa getCasa(int posicao) {
        return casas.get(posicao - 1);
    }

    public int getTamanho() {
        return casas.size();
    }

    public void exibirTipos() {
        for (Casa c : casas) {
            c.exibirTipos();
        }
    }

    public void moverJogador(Jogador jogador, int valorDado) {

        int posicaoAtual = jogador.getPosicao();
        int novaPosicao = posicaoAtual + valorDado;

        // Regra: não pode passar do fim
        if (novaPosicao > getTamanho()) {
            novaPosicao = getTamanho();
        }

        jogador.setPosicao(novaPosicao);

        System.out.println(jogador.getNome()
                + " foi da casa " + posicaoAtual
                + " para a casa " + novaPosicao);

        // ativa a casa após mover
        casas.get(novaPosicao - 1).apresentar(jogador);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < casas.size(); i++) {

            sb.append("[")
                    .append(String.format("%02d", i + 1))
                    .append("]");

            if (i < casas.size() - 1) {
                sb.append("--");
            }

            if ((i + 1) % 5 == 0) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
