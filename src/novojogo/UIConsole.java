/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
import java.util.Scanner;

public class UIConsole implements UI {

    private final Scanner scanner;

    public UIConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void escrever(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public int lerInt() {
        return scanner.nextInt();
    }

    @Override
    public String lerString() {
        return scanner.next();
    }

    @Override
    public int perguntarInt(String pergunta) {
        escrever(pergunta);
        return lerInt();
    }

    @Override
    public String perguntarString(String pergunta) {
        escrever(pergunta);
        return lerString();
    }
}