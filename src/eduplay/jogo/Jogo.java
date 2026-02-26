/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.jogo;

/**
 *
 * @author jose_
 */
import eduplay.tabuleiro.Tabuleiro;
import eduplay.ui.UI;
import eduplay.jogador.Jogador;
import java.util.*;


public class Jogo {

    private JogoState estado;

    private Tabuleiro tabuleiro;
    private List<Jogador> jogadores = new ArrayList<>();
    private Stack<Jogada> historico = new Stack<>();
    private Dado dado = new Dado();

    private final UI ui;
    private int indiceJogador = 0;

    public Jogo(UI ui) {
        this.ui = ui;
        this.estado = new StateConfiguracao();
    }

    public void executar() {

        iniciar();

        while (!estaFinalizado()) {

            ui.escrever("\n1 - Jogar turno");
            ui.escrever("2 - Desfazer");

            int opcao = ui.lerInt();

            switch (opcao) {
                case 1 ->
                    jogarTurno();
                case 2 ->
                    desfazer();
                default ->
                    ui.escrever("Opção inválida.");
            }
        }

        ui.escrever("Fim de jogo!");
    }

    public void setEstado(JogoState estado) {
        this.estado = estado;
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void jogarTurno() {
        estado.jogarTurno(this);
    }

    public void desfazer() {
        estado.desfazer(this);
    }

    public void finalizar() {
        estado.finalizar(this);
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public Stack<Jogada> getHistorico() {
        return historico;
    }

    public Dado getDado() {
        return dado;
    }

    public UI getUI() {
        return ui;
    }

    public Jogador getJogadorAtual() {
        return jogadores.get(indiceJogador);
    }

    public void avancarTurno() {
        indiceJogador = (indiceJogador + 1) % jogadores.size();
    }

    public void voltarTurno() {
        indiceJogador--;
        if (indiceJogador < 0) {
            indiceJogador = jogadores.size() - 1;
        }
    }
    private boolean finalizado = false;

    public boolean estaFinalizado() {
        return finalizado;
    }

    public void marcarFinalizado() {
        this.finalizado = true;
    }
}
