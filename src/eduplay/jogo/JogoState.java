/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eduplay.jogo;

/**
 *
 * @author jose_
 */

public interface JogoState {

    void iniciar(Jogo jogo);

    void jogarTurno(Jogo jogo);

    void desfazer(Jogo jogo);

    void finalizar(Jogo jogo);
}