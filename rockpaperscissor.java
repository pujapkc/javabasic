

/*    Rules for playing the game:
 
       i) To play the game you have to just enter only 1 number.
       ii) You can only enter number between 0 - 2
       iii) Enter 0 - Rock
            Enter 1 - Paper
            Enter 2 - Scissor   */

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor
{
    public static void main(String[] args) {
       
       Scanner user = new Scanner(System.in);
       int user_inp = user.nextInt(3);
        
       Random computer = new Random();
       int computer_inp = computer.nextInt(3);
       
       String  computer_move;
       
       
       if(computer_inp == 0) {
               computer_move = "Rock";
           }
       else if(computer_inp == 1) {
           computer_move = "Paper";
       }
       else {
           computer_move = "Scissor";
       }
       
       
       switch(user_inp) {
       
           case 0 : System.out.println("You      : " + "Rock");
           System.out.println("     vs     ");
           System.out.println("Computer : " + computer_move);
           break;
           
           case 1 : System.out.println("You      : " + "Paper");
           System.out.println("     vs     ");
           System.out.println("Computer : " + computer_move);
           break;
           
           case 2 : System.out.println("You      : " + "Scissor");
           System.out.println("     vs     ");
           System.out.println("Computer : " + computer_move);
       }
       
        
       if(computer_inp == user_inp) {
           System.out.println("\nMatch Draw");
       }
       
       else if((user_inp == 0 && computer_inp ==2) || (user_inp == 1 && computer_inp == 0) || (user_inp==2 && computer_inp == 1)) {
           System.out.println("\nYou Win");
       }
       
       else {
           System.out.println("\nComputer Win");
       }
       user.close();
    }
}
