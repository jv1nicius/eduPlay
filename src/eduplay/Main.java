/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduplay;

import eduplay.models.Professor;
import eduplay.ui.Console;

/**
 *
 * @author jose_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console ui = new Console();
        Jogo jogo = new Jogo();
        ui.run();
        Professor professor = new Professor("Barros");
        int tamanho = ui.tamanhoTabuleiro();
        jogo.inicializar(professor, tamanho);
        ui.imprimirTabuleiro(jogo.getTabuleiro());
        professor.adicionarDesafio();
    }

}
