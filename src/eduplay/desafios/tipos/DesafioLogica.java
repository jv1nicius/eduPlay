/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.desafios.tipos;

import eduplay.desafios.Desafio;

/**
 *
 * @author jose_
 */
public class DesafioLogica implements Desafio {

    String questao;

    public DesafioLogica(String questao) {
        this.questao = questao;
    }

    public String questao() {
        return questao;
    }
}
