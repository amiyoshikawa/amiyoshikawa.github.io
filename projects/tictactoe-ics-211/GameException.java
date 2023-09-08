/**
  *GameException.java
  *@author        Ami Yoshikawa
  *@assignment    Assignment #06
  *@date          October 9, 2022
  */
public class GameException extends Exception{
   private String message = "ERROR";
   
   public GameException(){
   }

   public void setMessage(String newMessage){
      this.message = newMessage;
   }

   public String getMessage(){
      return this.message;
   }
}
  
