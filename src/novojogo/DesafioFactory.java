/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */
public class DesafioFactory {

    public Desafio criarDesafioMatematica() {
        return new DesafioMatematica();
    }

    public Desafio criarDesafioLogica() {
        return new DesafioLogica();
    }

    public Desafio criarDesafioProgramacao() {
        return new DesafioProgramacao();
    }
}
