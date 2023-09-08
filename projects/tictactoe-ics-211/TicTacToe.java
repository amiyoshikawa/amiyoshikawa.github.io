/**
 * TicTacToeGame.java
 * 
 * @author        Ami Yoshikawa
 * @assignment    ICS 211 Assignment 06
 * @date          October 9, 2022
 */

public class TicTacToeGame{
   public static void main(String[ ] arg) throws Exception{
      Game game = new Game();
      game.initializeGUI();
      game.setVisible(true);
   }
}
