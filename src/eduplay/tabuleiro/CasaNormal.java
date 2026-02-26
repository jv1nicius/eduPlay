/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.tabuleiro;

import eduplay.ui.UI;
import eduplay.jogador.Jogador;


/**
 *
 * @author jose_
 */
public class CasaNormal implements Casa {

    @Override
    public String entrar(Jogador jogador, UI ui) {
        return jogador.getNome() + " caiu em uma casa normal.";
    }

    @Override
    public String getDescricao() {
        return "Normal";
    }

    @Override
    public String toString() {
        return "N";
    }
}
