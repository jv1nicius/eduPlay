/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.desafio;


/**
 *
 * @author jose_
 */
public class DesafioLogica implements Desafio {

    @Override
    public String getPergunta() {
        return "Se 2 + 2 = 4, então 3 + 3 = ?";
    }

    @Override
    public boolean respostaCorreta(int resposta) {
        return resposta == 6;
    }

    @Override
    public int getPontos() {
        return 15;
    }
}