/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.models;

public class Aluno {

    private String nome;
    private int pontuacao;
    private int posicao;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.posicao = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }
}
