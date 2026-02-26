/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduplay.jogo;

import java.util.Random;

/**
 *
 * @author jose_
 */
public class Dado {
    private Random random = new Random();

    public int jogar() {
        return random.nextInt(6) + 1;
    }
}
