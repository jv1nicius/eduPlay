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
public class CasaEspecial implements Casa {

    private final Desafio desafio;

    public CasaEspecial(Desafio desafio) {
        this.desafio = desafio;
    }

    @Override
    public String entrar(Jogador jogador, UI ui) {

        ui.escrever(desafio.getPergunta());

        // Lê resposta
        int resposta = ui.lerInt();

        if (desafio.respostaCorreta(resposta)) {
            jogador.adicionarPontos(desafio.getPontos());
            return "Correto! +" + desafio.getPontos() + " pontos.";
        } else {
            return "Errado! Nenhum ponto.";
        }
    }

    @Override
    public String getDescricao() {
        return "Especial";
    }

    @Override
    public String toString() {
        return "E";
    }
}
