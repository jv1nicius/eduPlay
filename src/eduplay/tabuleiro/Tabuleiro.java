/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.tabuleiro;

import eduplay.ui.UI;
import eduplay.jogo.Movimento;
import eduplay.jogador.Jogador;
import eduplay.desafio.Desafio;
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
            adicionarCasa(new CasaNormal());
        }
    }

    public void adicionarDesafio(Desafio desafio, int posicao) {

        if (posicao < 1 || posicao > casas.size()) {
            throw new IllegalArgumentException("Posição inválida");
        }

        int indice = posicao - 1;

        casas.set(indice, new CasaEspecial(desafio));
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

    public List<String> getDescricoesCasas() {
        List<String> descricoes = new ArrayList<>();

        for (int i = 0; i < casas.size(); i++) {
            descricoes.add("Casa " + (i+1) + " - " + casas.get(i).getDescricao());
        }

        return descricoes;
    }

    public Movimento moverJogador(Jogador jogador, int valorDado, UI ui) {

        int posicaoAtual = jogador.getPosicao();
        int novaPosicao = posicaoAtual + valorDado;

        if (novaPosicao > getTamanho()) {
            novaPosicao = getTamanho();
        }

        jogador.setPosicao(novaPosicao);

        String mensagemCasa = casas.get(novaPosicao - 1)
                                .entrar(jogador, ui);


        return new Movimento(jogador.getNome(), posicaoAtual, novaPosicao, mensagemCasa);
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
