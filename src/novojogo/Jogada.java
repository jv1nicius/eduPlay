/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public class Jogada {

    private Jogador jogador;
    private int posicaoAnterior;
    private int pontuacaoAnterior;

    public Jogada(Jogador jogador, int posicaoAnterior, int pontuacaoAnterior) {
        this.jogador = jogador;
        this.posicaoAnterior = posicaoAnterior;
        this.pontuacaoAnterior = pontuacaoAnterior;
    }

    public void desfazer() {
        jogador.setPosicao(posicaoAnterior);
        jogador.setPontuacao(pontuacaoAnterior);
    }
}