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
public class DesafioLogica extends Desafio {

    public DesafioLogica() {
        super("Lógica");
    }

    @Override
    public int executar(Jogador jogador, Scanner scanner) {
        System.out.println(jogador.getNome() + ", resolva: Se 2 + 2 = 4, então 3 + 3 = ?");
        int resposta = scanner.nextInt();

        if (resposta == 6) {
            System.out.println("Correto! +15 pontos");
            return 15;
        } else {
            System.out.println("Errado! Nenhum ponto.");
            return 0;
        }
    }
}
