/**
 * Game.java
 * 
 * @author        Ami Yoshikawa
 * @assignment    ICS 211 Assignment 06
 * @date          October 9, 2022
 */
import java.awt.*; 
import java.awt.event.*; 
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Game extends JFrame{
   private JLabel label = new JLabel("TicTacToe");
   private JPanel jp = new JPanel();
   private final int SIZE = 9;
   private JButton button[] = new JButton[SIZE];   
   private final int WIDTH = 500;
   private final int HEIGHT = 500;
   private boolean userTurn = true;
   private boolean computerTurn = true; //TEST
   private Random random = new Random();
   
   File f = new File("Tfile.txt"); //test
   FileWriter fw; //test
   PrintWriter pw; //test
   
   
   public Game(){
      //Instructions to initialize the frame
      this.setSize(WIDTH,HEIGHT);
      this.setTitle("TicTacToe");
      this.add(jp);
      this.setVisible(true);
      this.setResizable(false);  
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   /* Puts the elements in the screen where they belong
         and adds listeners to elements that will monitor events
      */
   public void initializeGUI() throws Exception{

      fw = new FileWriter (f); //test
      pw = new PrintWriter (fw); //test
   
      jp.setLayout(new GridLayout(3,3));
      ActionListener ears = new MyListener( );

      String caption = "";
      for(int i = 0; i<SIZE; i++){
         button[i] = new JButton();
         button[i].addActionListener(ears);
         button[i].setFont(new Font("Arial Narrow",Font.BOLD,120));
         jp.add(button[i]);
      } 
      pw.close();
   }
    
   //Inner class  
   private class MyListener implements ActionListener{
      public void actionPerformed(ActionEvent event){
         //Assign colors for both X and O
         Color red = Color.RED;
         Color blue = Color.BLUE;
                  
         //Assigns an X or O to a button after it has been selected and checks for a winner
         for(int i = 0; i < SIZE; i++){
            if(event.getSource()==button[i]){
               if(userTurn){
                  button[i].setForeground(red);
                  button[i].setText("X");
                  userTurn = false;
                  //disable the button[i] set enabled(false) ****DR.POLO****
                  //button[i].setEnabled(false);
                  winningCombination();
               }
               else{ //this needs to go in computer plays loops. pick place first.
                     
                     button[i].setForeground(blue);
                     button[i].setText("O");
                     userTurn=true;
                     winningCombination();
                     
               }//closes else statement 
               
            }
         } //for ends

         // computer plays is a loop (use while loop)
         /*
         int i = 0;
         while(button[i] == null){
         //generate random number from 0 to 8
         random.nextInt(8);
         button[i].setForeground(blue);
         button[i].setText("O");
         userTurn=true;
         //button[i].setEnabled(false);
         winningCombination();
         //if button[i] check if X, O, empty
         }  
         */
      }
   }//Closes inner class
   
   
   //Method that checks for all possible winning combinations
   public void winningCombination(){
      //Winning combinations for X
      if((button[0].getText()=="X") && (button[1].getText()=="X") && (button[2].getText()=="X")){
         userWins(0,1,2);
      }     
      if((button[3].getText()=="X") && (button[4].getText()=="X") && (button[5].getText()=="X")){
         userWins(3,4,5);
      }
      if((button[6].getText()=="X") && (button[7].getText()=="X") && (button[8].getText()=="X")){
         userWins(6,7,8);
      }
      if((button[0].getText()=="X") && (button[3].getText()=="X") && (button[6].getText()=="X")){
         userWins(0,3,6);
      }
      if((button[1].getText()=="X") && (button[4].getText()=="X") && (button[7].getText()=="X")){
         userWins(1,4,7);
      }
      if((button[2].getText()=="X") && (button[5].getText()=="X") && (button[8].getText()=="X")){
         userWins(2,5,8);
      }
      if((button[0].getText()=="X") && (button[4].getText()=="X") && (button[8].getText()=="X")){
         userWins(0,4,8);
      } 
      if((button[2].getText()=="X") && (button[4].getText()=="X") && (button[6].getText()=="X")){
         userWins(2,4,6);
      } 
      
      //Winning combinations for O
      if((button[0].getText()=="O") && (button[1].getText()=="O") && (button[2].getText()=="O")){
         computerWins(0,1,2);
      }     
      if((button[3].getText()=="O") && (button[4].getText()=="O") && (button[5].getText()=="O")){
         computerWins(3,4,5);
      }
      if((button[6].getText()=="O") && (button[7].getText()=="O") && (button[8].getText()=="O")){
         computerWins(6,7,8);
      }
      if((button[0].getText()=="O") && (button[3].getText()=="O") && (button[6].getText()=="O")){
         computerWins(0,3,6);
      }
      if((button[1].getText()=="O") && (button[4].getText()=="O") && (button[7].getText()=="O")){
         computerWins(1,4,7);
      }
      if((button[2].getText()=="O") && (button[5].getText()=="O") && (button[8].getText()=="O")){
         computerWins(2,5,8);
      }
      if((button[0].getText()=="O") && (button[4].getText()=="O") && (button[8].getText()=="O")){
         computerWins(0,4,8);
      } 
      if((button[2].getText()=="O") && (button[4].getText()=="O") && (button[6].getText()=="O")){
         computerWins(2,4,6);
      }    
   } //Closes the winningCombinations method
   

  //Method to change the background color for the winning spots and generate a message to display the winner
   public void userWins(int a, int b, int c){
      button[a].setBackground(Color.YELLOW);
      button[b].setBackground(Color.YELLOW);
      button[c].setBackground(Color.YELLOW);

      JOptionPane.showMessageDialog(new JFrame(),"User Won!","TicTacToe",JOptionPane.ERROR_MESSAGE);
      resetGame();   
   }
   
   //Method to change the background color for the winning spots and generate a message to display the winner
   public void computerWins(int a, int b, int c){
      button[a].setBackground(Color.YELLOW);
      button[b].setBackground(Color.YELLOW);
      button[c].setBackground(Color.YELLOW);
      
      JOptionPane.showMessageDialog(new JFrame(),"Computer Won!","TicTacToe",JOptionPane.ERROR_MESSAGE);
      resetGame();
   }
   
   
   //Method to reset the buttons so user can play again
	private void resetGame(){
		for(int i =0;i<9;i++) {
	      button[i].setText("");
         button[i].setBackground(Color.white);  
      }	
   }
  
} 
