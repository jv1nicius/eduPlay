/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay;

/**
 *
 * @author jose_
 */
public class Professor {
    private String nome;
    private DesafioFactory desafioFactory;
    
    public Professor(String nome) {
        this.nome = nome;
        this.desafioFactory = new DesafioFactory();
    } 
    public Desafio criarDesafio(){
        return desafioFactory;
    }
}
