/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.models;

import eduplay.Jogo;
import eduplay.desafios.DesafioI;
import eduplay.desafios.DesafioFactory;

/**
 *
 * @author jose_
 */
public class Professor {

    private String nome;
    private DesafioFactory desafioFabrica;

    public Professor(String nome) {
        this.nome = nome;
    }

    public DesafioI criarDesafio(String nome, String resposta, int pontuacao) {
        return DesafioFactory.criarDesafio(nome, resposta, pontuacao);
    }
}
