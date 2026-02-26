/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novojogo;

/**
 *
 * @author jose_
 */

public class StateFinalizado implements JogoState {

    @Override
    public void iniciar(Jogo jogo) {
        jogo.getUI().escrever("Jogo já terminou.");
    }

    @Override
    public void jogarTurno(Jogo jogo) {
        jogo.getUI().escrever("Jogo finalizado.");
    }

    @Override
    public void desfazer(Jogo jogo) {
        jogo.getUI().escrever("Não é possível desfazer após o fim.");
    }

    @Override
    public void finalizar(Jogo jogo) {
        jogo.getUI().escrever("Já está finalizado.");
    }
}