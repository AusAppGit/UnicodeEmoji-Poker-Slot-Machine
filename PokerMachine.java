package com.ausappgit.poksloma;
import java.util.Scanner;

/*
                AusAppGit's Unicode Emoji Poker Slot Machine
                      STEP RIGHT UP, TEST YOUR LUCK!!
In order to begin your wild adventure of luck, daring and intrigue, the program requires
you to input something.  Probably anything.

Will lady luck shine her graces upon you?

Three of the same symbols in a row and you win.

Special thanks to Solomoni Railoa and Minho
*/
public class PokerMachine {
    public static void main(String[] args) {
        Play game = new Play();
        game.roll();
        game.chance();
    }
}
