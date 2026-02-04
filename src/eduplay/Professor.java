/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay;

/**
 *
 * @author jose_
 */
public class Professor {

    private String nome;
    private DesafioFactory desafioFabrica;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void configurarJogo(Jogo jogo, int tamanho) {
        jogo.criarTabuleiro(tamanho);
    }

    public void adicionarDesafio() {
        
    }
}
