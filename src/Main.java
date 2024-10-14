import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       String player1 = "";
       String player2 = "";
       boolean done = false;
       Scanner input = new Scanner(System.in);

       do {
           System.out.println(" player 1 enter your move! [R/P/S] ");
           player1 = input.nextLine().trim().toUpperCase();
           while (!player1.matches("[RPS]")) {
               System.out.println(" Please enter a accurate move (R/P/S) ");
               player1 = input.nextLine().trim().toUpperCase();}

               System.out.println(" correct move! ");


           System.out.println(" player 2 enter your move! [R/P/S] ");
           player2 = input.nextLine().trim().toUpperCase();
           while (!player2.matches("[RPS]")) {
               System.out.println(" Please enter a accurate move (R/P/S) ");
               player2 = input.nextLine().trim().toUpperCase();}

           System.out.println(" correct move! ");

           if (player1.equals(player2)) {
               System.out.println("tie!");
           } else if (player1.equals("R") && player2.equals("S")) {
               System.out.println(" Player1 Wins! Rock breaks scissors ");
           } else if (player1.equals("S") && player2.equals("P")) {
               System.out.println(" Player1 Wins! Scissors cut paper ");
           } else if (player1.equals("P") && player2.equals("R")) {
               System.out.println(" Player1 Wins! Paper covers Rock ");
           } else if (player2.equals("R") && player1.equals("S")) {
               System.out.println(" Player2 Wins! Rock breaks scissors ");
           } else if (player2.equals("S") && player1.equals("P")) {
               System.out.println(" Player2 Wins! Scissors cut paper ");
           } else if (player2.equals("P") && player1.equals("R")) {
               System.out.println(" Player2 Wins! Paper covers Rock ");
           }

           System.out.println(" Would you like to play again? (Y/N) ");
           String playAgain = null;
           if (input.hasNextLine()) {
           }playAgain = input.nextLine().trim().toUpperCase();
           done = playAgain.equals("N");
       }while(!done);

       input.close();
    }
}