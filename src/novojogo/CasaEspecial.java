/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class CasaEspecial implements Casa {

    private int posicao;
    Desafio desafio;

    public CasaEspecial(int posicao, Desafio desafio) {
        this.posicao = posicao;
        this.desafio = desafio;
    }

    @Override
    public void apresentar(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);
        int pontos = desafio.executar(jogador, scanner);
        jogador.adicionarPontos(pontos);
    }
    
    @Override
    public void exibirTipos() {
        System.out.printf("Casa com Desafio: %d\n", posicao);
    }

}
