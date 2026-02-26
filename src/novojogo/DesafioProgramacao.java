/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;


/**
 *
 * @author jose_
 */
public class DesafioProgramacao implements Desafio {

    @Override
    public String getPergunta() {
        return "Qual é o resultado de 5 * 2?";
    }

    @Override
    public boolean respostaCorreta(int resposta) {
        return resposta == 10;
    }

    @Override
    public int getPontos() {
        return 20;
    }
}