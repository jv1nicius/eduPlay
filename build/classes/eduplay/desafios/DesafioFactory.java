/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.desafios;

import eduplay.desafios.tipos.Desafio;

/**
 *
 * @author jose_
 */
public class DesafioFactory {

    public static DesafioI criarDesafio(
            String questao,
            String resposta,
            int pontuacao) {

        return new Desafio(questao, resposta, pontuacao);
    }
}
