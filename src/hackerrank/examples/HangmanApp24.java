package hackerrank.examples;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meng
 */
public class HangmanApp24
{

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        //How to play the game
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it"
                + "\ncharacter by character. If you Guess wrong 6 times, I win. "
                + "\nIf you can guess it before then, then you win!"
                + "\nEr du klar? I hope so because I am!");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture and under that is your "
                + "\ncurrent guess, which starts off as nothing. Everytime you guess incorrectly"
                + "\nI will add a body part to the picture. When there is a full person, you lose!");

        //Allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay)
        {   //Setting up the game
            System.out.println();
            System.out.println("Alright! Vi skal spiller!");

            Hangman24 game = new Hangman24();

            do
            {
                //Draw the items
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
//                System.out.println(game.mysteryWord);

                //Get the guess
                System.out.println();
                System.out.println("Enter a character that you think is in the word:");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                //Check if the character has been guessed already
                while(game.isGuessedAlready(guess)){
                    System.out.println("Try again! You've already guessed this character.");
                    guess =(sc.next().toLowerCase()).charAt(0);
                }
                
                if(game.playGuess(guess)){
                    System.out.println("Great guess! That character is in the word.");
                } else{
                    System.out.println("Sorry, that's not in the word :(");
                    
                }
            } while (!game.gameOver());//Keep playing until game ends

            //Play again?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y for yes!");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');

        }
    }

}
