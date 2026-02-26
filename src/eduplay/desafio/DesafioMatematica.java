/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.desafio;

/**
 *
 * @author jose_
 */

import java.util.Random;

public class DesafioMatematica implements Desafio {

    private int a;
    private int b;

    public DesafioMatematica() {
        Random random = new Random();
        this.a = random.nextInt(10) + 1;
        this.b = random.nextInt(10) + 1;
    }

    @Override
    public String getPergunta() {
        return "Resolva: " + a + " + " + b + " = ?";
    }

    @Override
    public boolean respostaCorreta(int resposta) {
        return resposta == (a + b);
    }

    @Override
    public int getPontos() {
        return 10;
    }
}
