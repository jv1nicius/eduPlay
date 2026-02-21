/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novojogo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author jose_
 */
public class NovoJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Boas Vindas!");
        System.out.println("Digite qualquer tecla para iniciar: ");
        scan.next();
        System.out.println("Adicionar um novo Professor: ");
        String professor = scan.next();
        System.out.printf("Olá, professor %s!\n", professor);

        System.out.println("Para iniciar o jogo você terá que definir os seguintes dados:");
        System.out.println("\ttamanho do tabuleiro");
        System.out.println("\tcriar desafios e escolher as casas que receberão eles");
        System.out.println("\tadicionar alunos no jogo para poder iniciar-ló");

        System.out.println("\n\nEscolha o tamanho do Tabuleiro: ");
        int tamanhoTabuleiro = scan.nextInt();
        Tabuleiro tabuleiro = new Tabuleiro(tamanhoTabuleiro);
        System.out.printf("\nTabuleiro com %d casas criado! \n\n\n", tamanhoTabuleiro);
        System.out.println(tabuleiro);

        boolean criarMaisDesafios = true;

        while (criarMaisDesafios) {

            System.out.println("\nCriar Desafios e escolher suas Casas: ");
            System.out.println("1 - Criar desafio de Matemática");
            System.out.println("2 - Criar desafio de Lógica");
            System.out.println("3 - Criar desafio de Programação");
            System.out.println("0 - Finalizar criação de desafios");
            int tipoDesafio = scan.nextInt();
            Desafio desafio;
            DesafioFactory factory = new DesafioFactory();

            if (tipoDesafio == 0) {
                System.out.println("ok, saindo...");
                criarMaisDesafios = false;
                break;
            } else if (tipoDesafio == 1) {
                desafio = factory.criarDesafioMatematica();
            } else if (tipoDesafio == 2) {
                desafio = factory.criarDesafioLogica();
            } else if (tipoDesafio == 3) {
                desafio = factory.criarDesafioProgramacao();
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }
            System.out.println("Escolha a casa que receberá o desafio: ");
            tabuleiro.exibirTipos();
            int localCasa = scan.nextInt();

            System.out.println("\nTabuleiro atualizado:");
            tabuleiro.adicionarDesafio(desafio, localCasa);
            tabuleiro.exibirTipos();
        }//Fim do loop

        System.out.println("\nTodos os desafios foram criados!");
        System.out.println("\n\nHora de adicionar os Alunos para competir: ");
        System.out.println("Quantos alunos participarão?");
        int numeroAlunos = scan.nextInt();
        List<Jogador> jogadores = new ArrayList<>();
        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.println("Nome do jogador " + i + ": ");
            String nome = scan.next();
            Jogador jogador = new Aluno(nome);
            jogadores.add(jogador);
            System.out.printf("Aluno %s entrou no game!\n", nome);
        }
        Dado dado = new Dado();
        Stack<Jogada> historico = new Stack<>();

        boolean jogoAtivo = true;
        int indiceJogador = 0;

        while (jogoAtivo) {

            for (Jogador jogador : jogadores) {

                System.out.println("\nTurno de " + jogador.getNome());
                System.out.println("1 - jogar dado");
                System.out.println("2 - Desfazer");

                int opcao = scan.nextInt();

                if (opcao == 1) {
                    Jogada jogada = new Jogada(
                            jogador,
                            jogador.getPosicao(),
                            jogador.getPontos()
                    );
                    historico.push(jogada);

                    int valorDado = dado.jogar();
                    System.out.println("Dado rolou: " + valorDado);
                    tabuleiro.moverJogador(jogador, valorDado);
                    System.out.println("Posição atual: " + jogador.getPosicao());
                    System.out.println("Pontuação: " + jogador.getPontos());

                    // Verifica vitória
                    if (jogador.getPosicao() == tabuleiro.getTamanho()) {
                        System.out.println("\n🏆 " + jogador.getNome() + " venceu o jogo!");
                        jogoAtivo = false;
                        break;
                    }
                    // Avança turno
                    indiceJogador = (indiceJogador + 1) % jogadores.size();
                } else if (opcao == 2) {
                    if (!historico.isEmpty()) {

                        // Volta turno
                        indiceJogador--;
                        if (indiceJogador < 0) {
                            indiceJogador = jogadores.size() - 1;
                        }

                        Jogada ultimo = historico.pop();
                        ultimo.desfazer();

                        System.out.println("Jogada desfeita!");
                        System.out.println("Posição restaurada: " + jogador.getPosicao());
                        System.out.println("Pontuação restaurada: " + jogador.getPontos());
                    } else {
                        System.out.println("Não há jogadas para desfazer.");
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
            }

        }
        System.out.println("Fim de jogo!");
    }

}
