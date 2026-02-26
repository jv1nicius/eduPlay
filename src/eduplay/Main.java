/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduplay;

import eduplay.ui.UI;
import eduplay.ui.UIConsole;
import eduplay.jogo.Jogo;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UI ui = new UIConsole(scan);

        Jogo jogo = new Jogo(ui);

        jogo.executar();
    }
}
