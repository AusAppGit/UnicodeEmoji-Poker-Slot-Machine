package com.ausappgit.poksloma;
import java.util.*;

public class Play {
    /* public static void main(String[] args) {
        Play game = new Play();
        game.roll();
        game.chance();
    }
  */
  void roll(){
        // player needs to begin the game with any input
    Scanner start = new Scanner(System.in);
    System.out.println("Hit any key to roll!");
    String input = start.nextLine();
    System.out.println("You hit the \"" + input + "\" key.");
    System.out.println("Remember, 3 of a kind to win! \nLet's see what comes up!");
    System.out.println("Rolling...");
    start.close();
    }

  void chance(){
        // array of unicode emojis based off https://www.unicode.org/emoji/charts/full-emoji-list.html
    ArrayList<String> pokerSymbols = new ArrayList<String>();
    pokerSymbols.add("\u2660");
    pokerSymbols.add("\u2663");
    pokerSymbols.add("\u2665");
    pokerSymbols.add("\u2666");
    pokerSymbols.add("\u2600");
    pokerSymbols.add("\u2610");
    pokerSymbols.add("\u2620");
    pokerSymbols.add("\u2615");
    pokerSymbols.add("\u2680");
    pokerSymbols.add("\u2601");
    pokerSymbols.add("\u2602");
    pokerSymbols.add("\u2603");
    pokerSymbols.add("\u2604");
    pokerSymbols.add("\u2703");

    System.out.println("Your symbols are:");
    
    // used for displaying the emojis
    int round = 1;
    // randomly add the symbols from the array to the player's array
    ArrayList<String> playerSymbols = new ArrayList<String>();
    do{
      Collections.shuffle(pokerSymbols, new Random());
      playerSymbols.add(pokerSymbols.get(round));

      // 3 or 6 are the end of the row
      if(round == 3 || round == 6){
        System.out.println(pokerSymbols.get(round));
      }
      else{
      System.out.print(pokerSymbols.get(round));
      }
      round++;
    }while(round != 10);
    
    // add space
    System.out.println();
    System.out.println();

    // check rows, columns, and diagonals for the win... or lose
    if(playerSymbols.get(0).equals(playerSymbols.get(1)) && playerSymbols.get(0).equals(playerSymbols.get(2))){
      youWin();
    }
    else if(playerSymbols.get(0).equals(playerSymbols.get(4)) && playerSymbols.get(0).equals(playerSymbols.get(8))){
      youWin();
    }
    else if(playerSymbols.get(0).equals(playerSymbols.get(3)) && playerSymbols.get(0).equals(playerSymbols.get(6))){
      youWin();
    }
    else if(playerSymbols.get(3).equals(playerSymbols.get(4)) && playerSymbols.get(3).equals(playerSymbols.get(5))){
      youWin();
    }
    else if(playerSymbols.get(6).equals(playerSymbols.get(7)) && playerSymbols.get(6).equals(playerSymbols.get(8))){
      youWin();
    }
    else if(playerSymbols.get(6).equals(playerSymbols.get(4)) && playerSymbols.get(6).equals(playerSymbols.get(2))){
      youWin();
    }
    else if(playerSymbols.get(2).equals(playerSymbols.get(5)) && playerSymbols.get(2).equals(playerSymbols.get(8))){
      youWin();
    }
    else if(playerSymbols.get(1).equals(playerSymbols.get(4)) && playerSymbols.get(1).equals(playerSymbols.get(7))){
      youWin();
    }
    else{
      System.out.println("Better luck next time.");
      System.out.println();
      System.out.println("Your money has been thrown into the unfathomably large pit.");
      System.out.println();
      System.out.println("Thanks for playing.");
    }
    }
  
  // in case the player wins
  static void youWin(){
    System.out.println("Congratulations! You won!!");
    System.out.println("Do not spend all your winnings at once.");
    System.out.println();
    System.out.println("That's not financial advice.  This is not real.  It is barely even entertainment.");
    System.out.println();
    System.out.println("Thanks for playing and reading this far.");
  }
}
