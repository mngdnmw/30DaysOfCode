package hackerrank.examples;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author meng
 */
class AI23
{


    public int pickSpot(TicTacToeLogic23 game)
    {
        ArrayList<Integer> choices = new ArrayList();
        for (int i = 0; i < 9; i++)
        {
            //If slot is not taken then add it as a choice
            if (game.board[i] == '-')
            {
                choices.add(i + 1);
            }

        }
        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));

        return choice;
    }

}
