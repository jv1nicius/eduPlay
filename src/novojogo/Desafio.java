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
public abstract class Desafio {

    // Nome do desafio
    protected String nome;

    public Desafio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método que todo desafio deve implementar
    // Recebe jogador e retorna pontos ganhos
    public abstract int executar(Jogador jogador, Scanner scanner);
}
