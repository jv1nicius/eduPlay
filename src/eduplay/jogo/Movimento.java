/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.jogo;

/**
 *
 * @author jose_
 */
public class Movimento {
    private String nome;
    private int origem;
    private int destino;
    private String mensagem;

    public Movimento(String nome, int origem, int destino, String mensagem) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.mensagem = mensagem;
        
    }

    @Override
    public String toString() {
        return nome + " foi da casa " + origem + " para a casa " + destino + "\n" + mensagem;
    }
}