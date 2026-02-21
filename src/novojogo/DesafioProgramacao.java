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
public class DesafioProgramacao extends Desafio {

    public DesafioProgramacao() {
        super("Programação");
    }

    @Override
    public int executar(Jogador jogador, Scanner scanner) {
        System.out.println(jogador.getNome() + ", qual é o resultado de 5 * 2?");
        int resposta = scanner.nextInt();

        if (resposta == 10) {
            System.out.println("Correto! +20 pontos");
            return 20;
        } else {
            System.out.println("Errado! Nenhum ponto.");
            return 0;
        }
    }
}