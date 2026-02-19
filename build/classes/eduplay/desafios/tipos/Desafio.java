/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.desafios.tipos;

import eduplay.desafios.DesafioI;

/**
 *
 * @author jose_
 */
public class Desafio implements DesafioI {

    private String questao;
    private String respostaCorreta;
    private int pontuacao;

    public Desafio(String questao, String respostaCorreta, int pontuacao) {
        this.questao = questao;
        this.respostaCorreta = respostaCorreta;
        this.pontuacao = pontuacao;
    }

    @Override
    public String getQuestao() {
        return questao;
    }

    @Override
    public boolean validarResposta(String resposta) {
        return respostaCorreta.equalsIgnoreCase(resposta);
    }

    @Override
    public int calcularPontuacao() {
        return pontuacao;
    }
}
