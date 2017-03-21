package hackerrank.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author meng
 */
public class Hangman24
{

    String mysteryWord; //Strings are immutable, so if you want to change it you have to use StringBuilder
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fReader;
    private static BufferedReader bReader; //File reader will only get the file for us and the buffered reader will let us to iterate through the file - take things in and out of it

    public Hangman24() throws IOException
    {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    public void initializeStreams() throws IOException
    {
        try
        {
            File inFile = new File("dictionary.txt");
            fReader = new FileReader(inFile);
            bReader = new BufferedReader(fReader);
            String currentLine = bReader.readLine();
            while (currentLine != null)
            {
                dictionary.add(currentLine);
                currentLine = bReader.readLine();
            }
            bReader.close();
            fReader.close();
        } catch (IOException e)
        {
            System.out.println("Could not initiate stream");
        }
    }

    public String pickWord()
    {
        Random r = new Random();
        int wordIndex = Math.abs(r.nextInt()) % dictionary.size();
        return dictionary.get(wordIndex);
    }

    public StringBuilder initializeCurrentGuess()
    {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++)
        {
            if (i % 2 == 0)
            {
                current.append("_");
            } else
            {
                current.append(" ");
            }

        }
        return current;
    }

    //_ _ A _ _ B
    public String getFormalCurrentGuess()
    {
        return "Current guess: " + currentGuess.toString();
    }

    public boolean gameOver()
    {
        if (didWeWin())
        {
            System.out.println();
            System.out.println("Congrats! You won!");
            return true;
        } else if (didWeLose())
        {
            System.out.println();
            System.out.println("Sorry you lostttttt :(((( The word was " + mysteryWord + ".");
            return true;

        }
        return false;
    }

    public boolean didWeWin(){
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }
    // " - - - - -\n"+
    // "|        |\n"+
    // "|        O\n" +
    // "|      / | \\ \n"+
    // "|        |\n" +
    // "|       / \\ \n" +
    // "|\n" +
    // "|\n";
    public String drawPicture()
    {
        switch (currentTry)
        {
            case 0:
                return noPersonDraw();
            case 1:
                return addHeadDraw();
            case 2:
                return addBodyDraw();
            case 3:
                return addLArm();
            case 4:
                return addRArm();
            case 5:
                return addLLeg();
            default:
                return fullBodyDraw();
        }
    }

    private String noPersonDraw()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        \n"
                + "|        \n"
                + "|        \n"
                + "|        \n"
                + "|\n"
                + "|\n";

    }

    private String addHeadDraw()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|         \n"
                + "|        \n"
                + "|       \n"
                + "|\n"
                + "|\n";
    }

    private String addBodyDraw()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|        |  \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addLArm()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / |  \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addRArm()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addLLeg()
    {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|       /  \n"
                + "|\n"
                + "|\n";
    }

    private String fullBodyDraw()
    {//Need the \\ for things on the right side because java will think it's \
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|       / \\ \n"
                + "|\n"
                + "|\n";
    }

    public boolean isGuessedAlready(char guess)
    {
        return previousGuesses.contains(guess);
    }

    public boolean playGuess(char guess)
    {
        boolean isItAGoodGuess = false;
        previousGuesses.add(guess);
        for (int i = 0; i < mysteryWord.length(); i++)
        {
            if (mysteryWord.charAt(i) == guess)
            {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }

        }
        if (!isItAGoodGuess)
        {
            currentTry++;
        }
        return isItAGoodGuess;
    }

    public String getCondensedCurrentGuess()
    {
        String guess = currentGuess.toString();
        return guess.replace(" ", "");
    }

    private boolean didWeLose()
    {
        return currentTry>=maxTries;
    }

}
