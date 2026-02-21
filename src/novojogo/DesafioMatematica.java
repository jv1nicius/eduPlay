/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
import java.util.Random;
import java.util.Scanner;

public class DesafioMatematica extends Desafio {

    private Random random = new Random();

    public DesafioMatematica() {
        super("Matemática");
    }

    @Override
    public int executar(Jogador jogador, Scanner scanner) {
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;

        System.out.println(jogador.getNome() + ", resolva: " + a + " + " + b + " = ?");
        int resposta = scanner.nextInt();

        if (resposta == (a + b)) {
            System.out.println("Resposta correta! +10 pontos");
            return 10;
        } else {
            System.out.println("Resposta errada! Nenhum ponto.");
            return 0;
        }
    }
}
