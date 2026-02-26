/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public interface UI {

    void escrever(String mensagem);

    int lerInt();

    String lerString();

    int perguntarInt(String pergunta);

    String perguntarString(String pergunta);
}