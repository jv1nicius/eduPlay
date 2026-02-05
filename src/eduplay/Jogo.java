/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay;

import eduplay.tabuleiro.Tabuleiro;
import eduplay.models.Professor;
import eduplay.models.Aluno;

/**
 *
 * @author jose_
 */
public class Jogo {

    private Tabuleiro tabuleiro;
    private Aluno[] alunos;

    public void inicializar(Professor professor, int tamanho) {
        professor.configurarJogo(this, tamanho);
    }

    public void pausar() {
    }

    public void finalizar() {
    }

    public void criarTabuleiro(int tamanho) {
        this.tabuleiro = new Tabuleiro(tamanho);
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
