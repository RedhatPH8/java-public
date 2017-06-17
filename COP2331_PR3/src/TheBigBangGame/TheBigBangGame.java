/*
* Author: Ryan Geddings N01067534
* Course: COP2551
* Project #: 3
* Title : Rock, Paper, Scissors, Lizard, Spock
* Due Date: 3/X/2016
*
* Uses command line arguments to run a game and determine winner and win count.
 */
package TheBigBangGame;

import java.io.BufferedReader;
import java.io.FileReader;

/**
*
* Uses command line arguments to run a game and determine winner and win count.
*/

public class TheBigBangGame {
   
    
    private static final String LEONARD = "Leonard", SHELDON = "Sheldon"; 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ryan Geddings, N01067534\nProject 3 Rock Paper Scissors Lizard Spock\n");
    //Create new game object called TheBigBangGame
        TheBigBangGame tbbg  = new TheBigBangGame();
    tbbg.execute(args);
    
    }
    
   
/**
 * 
 * @param sheldonsInitialMove
 * @param sheldonWins
 * @param leonardsInitialMove
 * @param leonardWins
 * @param ties 
 */    
    private static void displayResults(String sheldonsInitialMove, int sheldonWins, String leonardsInitialMove, int leonardWins, int ties){
        
        System.out.println(SHELDON+"'s initial move: " + sheldonsInitialMove);
        System.out.println(LEONARD+"'s initial move: " + leonardsInitialMove +"\n");
        if (leonardWins == sheldonWins){
                System.out.println("Tie Game!"); 
                System.out.println(SHELDON+" and " +LEONARD+" each won " +leonardWins+ " game(s) and they tied "+ties+ " game(s).\n");}
            else if (leonardWins > sheldonWins){
                System.out.println(LEONARD+ " wins!"); 
                System.out.println(SHELDON+" won " +sheldonWins+ " game(s), "+LEONARD+" won " +leonardWins+ " game(s) and they tied "+ties+ " game(s).\n");}
            else {
                System.out.println(SHELDON+ " wins!"); 
                System.out.println(SHELDON+" won " +sheldonWins+ " game(s), "+LEONARD+" won " +leonardWins+ " game(s) and they tied "+ties+ " game(s).\n");
            }
        }
/**
 * 
 * @param args 
 */   
    public void execute(String[] args){
        game game = new game();
        game.sheldonsInitialMove=game.convertShape(args[0].toUpperCase());
        game.leonardsInitialMove=game.convertShape(args[1].toUpperCase());
        game.numberGames=Integer.parseInt(args[2]);
        game.playGame(game.sheldonsInitialMove, game.leonardsInitialMove, game.numberGames);
    displayResults(args[0],game.getSheldonsWinCount(),args[1],game.getLeonardsWinCount(),game.getTieCount());
    }
}
