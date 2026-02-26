/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public class Aluno implements Jogador {

    private String nome;
    private int posicao;
    private int pontos;

    public Aluno(String nome) {
        this.nome = nome;
        this.posicao = 1;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getPosicao() {
        return posicao;
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public void setPontuacao(int pontuacao) {
        this.pontos = pontuacao;
    }

    @Override
    public int adicionarPontos(int pontos) {
        this.pontos = +pontos;
        return this.pontos;
    }

    @Override
    public void avancar(int casas) {
        this.posicao += casas;
    }
}
