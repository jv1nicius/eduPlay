/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.tabuleiro;

/**
 *
 * @author jose_
 */
public class Tabuleiro {

    private Casa[] casas;
    private int tamanho;

    public Tabuleiro(int tam) {
        this.tamanho = tam;
        this.casas = new Casa[tamanho + 2];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Tabuleiro:\n");

        for (int i = 0; i < tamanho; i++) {
            if (casas[i] != null) {
                sb.append("[ ").append(casas[i]).append(" ]");
            } else {
                sb.append("[   ]");
            }
        }

        return sb.toString();
    }
}
