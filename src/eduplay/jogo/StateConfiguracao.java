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
import eduplay.jogador.Aluno;
import eduplay.desafio.DesafioFactory;
import eduplay.desafio.Desafio;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class StateConfiguracao implements JogoState {

    @Override
    public void iniciar(Jogo jogo) {
        UI ui = jogo.getUI();

        ui.escrever("Escolha o tamanho do tabuleiro:");
        int tamanho = ui.lerInt();

        Tabuleiro tabuleiro = new Tabuleiro(tamanho);
        jogo.setTabuleiro(tabuleiro);

        DesafioFactory factory = new DesafioFactory();
        Map<Integer, Supplier<Desafio>> tiposDesafio = new HashMap<>();
        tiposDesafio.put(1, factory::criarDesafioMatematica);
        tiposDesafio.put(2, factory::criarDesafioLogica);
        tiposDesafio.put(3, factory::criarDesafioProgramacao);

        boolean criando = true;
        while (criando) {

            ui.escrever("1-Matemática 2-Lógica 3-Programação 0-Sair");
            int tipo = ui.lerInt();

            if (tipo == 0) {
                criando = false;
                break;
            }
            Supplier<Desafio> criador = tiposDesafio.get(tipo);
            if (criador == null) {
                ui.escrever("Inválido");
                continue;
            }

            Desafio desafio = criador.get();

            for (String descricao : tabuleiro.getDescricoesCasas()) {
                ui.escrever(descricao);
            }
            int casa = ui.lerInt();

            try {
                tabuleiro.adicionarDesafio(desafio, casa);
            } catch (IllegalArgumentException e) {
                ui.escrever(e.getMessage());
            }
        }

        ui.escrever("Quantos jogadores?");
        int qtd = ui.lerInt();

        for (int i = 0; i < qtd; i++) {
            ui.escrever("Nome:");
            String nome = ui.lerString();
            jogo.getJogadores().add(new Aluno(nome));
        }

        jogo.setEstado(new StateAndamento());
        ui.escrever("Jogo iniciado!");
    }

    @Override
    public void jogarTurno(Jogo jogo) {
        jogo.getUI().escrever("Jogo ainda em configuração.");
    }

    @Override
    public void desfazer(Jogo jogo) {
        jogo.getUI().escrever("Nada para desfazer.");
    }

    @Override
    public void finalizar(Jogo jogo) {
        jogo.getUI().escrever("Ainda não iniciado.");
    }
}
