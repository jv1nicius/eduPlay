/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public class CasaNormal implements Casa {

    private int posicao;

    public CasaNormal(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return posicao;
    }

    @Override
    public void apresentar(Jogador jogador) {
        System.out.println(jogador.getNome() + " caiu em uma casa normal.");
    }

    @Override
    public void exibirTipos() {
        System.out.println("Casa Normal: " + posicao);
    }

    @Override
    public String toString() {
        return "N";
    }
}
