/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.ui;

import eduplay.tabuleiro.Tabuleiro;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Console implements UI_I {

    Scanner scan = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n"
                + "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n"
                + "| |  _________   | || |  ________    | || | _____  _____ | || |   ______     | || |   _____      | || |      __      | || |  ____  ____  | |\n"
                + "| | |_   ___  |  | || | |_   ___ `.  | || ||_   _||_   _|| || |  |_   __ \\   | || |  |_   _|     | || |     /  \\     | || | |_  _||_  _| | |\n"
                + "| |   | |_  \\_|  | || |   | |   `. \\ | || |  | |    | |  | || |    | |__) |  | || |    | |       | || |    / /\\ \\    | || |   \\ \\  / /   | |\n"
                + "| |   |  _|  _   | || |   | |    | | | || |  | '    ' |  | || |    |  ___/   | || |    | |   _   | || |   / ____ \\   | || |    \\ \\/ /    | |\n"
                + "| |  _| |___/ |  | || |  _| |___.' / | || |   \\ `--' /   | || |   _| |_      | || |   _| |__/ |  | || | _/ /    \\ \\_ | || |    _|  |_    | |\n"
                + "| | |_________|  | || | |________.'  | || |    `.__.'    | || |  |_____|     | || |  |________|  | || ||____|  |____|| || |   |______|   | |\n"
                + "| |              | || |              | || |              | || |              | || |              | || |              | || |              | |\n"
                + "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n"
                + " '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
    }

    public void run1() {
        System.out.println("   ,ggggggg,                    ,ggggggggggg,                               \n"
                + " ,dP\"\"\"\"\"\"Y8b        8I        dP\"\"\"88\"\"\"\"\"\"Y8,,dPYb,                       \n"
                + " d8'    a  Y8        8I        Yb,  88      `8bIP'`Yb                       \n"
                + " 88     \"Y8P'        8I         `\"  88      ,8PI8  8I                       \n"
                + " `8baaaa             8I             88aaaad8P\" I8  8'                       \n"
                + ",d8P\"\"\"\"       ,gggg,8I  gg      gg 88\"\"\"\"\"    I8 dP    ,gggg,gg  gg     gg \n"
                + "d8\"           dP\"  \"Y8I  I8      8I 88         I8dP    dP\"  \"Y8I  I8     8I \n"
                + "Y8,          i8'    ,8I  I8,    ,8I 88         I8P    i8'    ,8I  I8,   ,8I \n"
                + "`Yba,,_____,,d8,   ,d8b,,d8b,  ,d8b,88        ,d8b,_ ,d8,   ,d8b,,d8b, ,d8I \n"
                + "  `\"Y8888888P\"Y8888P\"`Y88P'\"Y88P\"`Y888        8P'\"Y88P\"Y8888P\"`Y8P\"\"Y88P\"888\n"
                + "                                                                       ,d8I'\n"
                + "                                                                     ,dP'8I \n"
                + "                                                                    ,8\"  8I \n"
                + "                                                                    I8   8I \n"
                + "                                                                    `8, ,8I \n"
                + "                                                                     `Y8P\"  ");
    }

    public void run2() {
        System.out.println(" ________        __          _______  __                   \n"
                + "|_   __  |      |  ]        |_   __ \\[  |                  \n"
                + "  | |_ \\_|  .--.| | __   _    | |__) || |  ,--.    _   __  \n"
                + "  |  _| _ / /'`\\' |[  | | |   |  ___/ | | `'_\\ :  [ \\ [  ] \n"
                + " _| |__/ || \\__/  | | \\_/ |, _| |_    | | // | |,  \\ '/ /  \n"
                + "|________| '.__.;__]'.__.'_/|_____|  [___]\\'-;__/[\\_:  /   \n"
                + "                                                  \\__.'    ");
    }

    public int tamanhoTabuleiro() {
        System.out.println("Digite o tamanho desejado do tabuleiro: ");
        int tamanho = scan.nextInt();
        return tamanho;
    }

    public void imprimirTabuleiro(Tabuleiro tabuleiro) {
        System.out.println(tabuleiro);
    }

    @Override
    public void inicializar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void finalizar() {
    }

}
