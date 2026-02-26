/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.jogo;

import eduplay.ui.UI;
import eduplay.jogador.Jogador;



/**
 *
 * @author jose_
 */
public class StateAndamento implements JogoState {

    @Override
    public void iniciar(Jogo jogo) {
        jogo.getUI().escrever("Jogo já está em andamento.");
    }

    @Override
    public void jogarTurno(Jogo jogo) {
        UI ui = jogo.getUI();

        Jogador jogador = jogo.getJogadorAtual();

        ui.escrever("\nTurno de " + jogador.getNome());

        Jogada jogada = new Jogada(
                jogador,
                jogador.getPosicao(),
                jogador.getPontos()
        );

        jogo.getHistorico().push(jogada);

        int valor = jogo.getDado().jogar();
        ui.escrever("Dado: " + valor);

        Movimento movimento = jogo.getTabuleiro()
                .moverJogador(jogador, valor, ui);

        ui.escrever(movimento.toString());

        if (jogador.getPosicao() == jogo.getTabuleiro().getTamanho()) {

            ui.escrever("🏆 " + jogador.getNome() + " venceu!");

            jogo.marcarFinalizado();
            jogo.setEstado(new StateFinalizado());
            return;
        }

        jogo.avancarTurno();
    }

    @Override
    public void desfazer(Jogo jogo) {
        UI ui = jogo.getUI();
        if (!jogo.getHistorico().isEmpty()) {

            jogo.voltarTurno();

            Jogada ultima = jogo.getHistorico().pop();
            ultima.desfazer();

            ui.escrever("Jogada desfeita!");
        } else {
            ui.escrever("Sem jogadas.");
        }
    }

    @Override
    public void finalizar(Jogo jogo) {
        jogo.setEstado(new StateFinalizado());
    }
}
