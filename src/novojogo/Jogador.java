/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public interface Jogador {
    String getNome();
    int getPosicao();
    int getPontos();
    void setPosicao(int posicao);
    void avancar(int casas);
    int adicionarPontos(int pontos);
    void setPontuacao(int pontuacao);
}
