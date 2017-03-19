package hackerrank.examples;

import java.util.Scanner;

/**
 *
 * @author meng
 */
public class TicTacToeApp23
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay)
        {
            System.out.println("Welcome to Tic Tac Toe! You are about to go against"
                    + "\nthe master of Tic Tac Toe. Er du klar? Jeg håber så! "
                    + "\nBUT first, you must pick what character you want to "
                    + "\nbe and which character I will be!");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board:");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that wil represent your opponent on the board:");
            char opponentToken = sc.next().charAt(0);
            if (playerToken == opponentToken)
            {
                System.out.println("Both players cannot have the same tokens, choose the token for the opponent again:");
                opponentToken = sc.next().charAt(0);
            }
            TicTacToeLogic23 game = new TicTacToeLogic23(playerToken, opponentToken);
            AI23 ai = new AI23();

            System.out.println("Now we can start the game! To play, enter a number and your token shall be put in its place.");

            TicTacToeLogic23.printIndexBoard();
            
            while (game.gameOver().equals("notOver"))
            {
                if (game.currentMarker == game.userMarker)
                {
                    System.out.println("It's your turn! Enter a spot for your token:");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot))
                    {
                        System.out.println("Try again. " + spot + " is invalid. This spot is already taken or is out of range.");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else
                {
                    System.out.println("It's my turn!");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");

                }
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("Do you want to play again? Enter Y if yes, enter anything else if no.");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }

}
