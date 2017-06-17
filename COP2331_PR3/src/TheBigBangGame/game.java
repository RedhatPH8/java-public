/*
* Author: Ryan Geddings N01067534
* Course: COP2551
* Project #: 3
* Title : Rock, Paper, Scissors, Lizard, Spock
* Due Date: 3/27/2016
*
* Uses command line arguments to run a game and determine winner and win count.
 */
package TheBigBangGame;

/**
*
* Uses command line arguments to run a game and determine winner and win count.
*/
public class game {

    private  final int SHELDON_WINS = 0, LEONARD_WINS = 1, TIE = 2, ROCK = 0, PAPER = 1, SCISSORS = 2, LIZARD = 3, SPOCK = 4;
    public  int leonardsMove, leonardsWinCount, sheldonsMove, sheldonsWinCount, tieCount;
    public  int sheldonsInitialMove, leonardsInitialMove, numberGames, gameOutcome,sheldonPreviousMove; 


/**
 * Converts string from argument into appropriate CONSTANT Integer        
 * @param shape
 * @return 
 */
    public  int convertShape(String shape){
            int newShape=-1; 
                        
        switch(shape) {
            case "ROCK":
                newShape = 0;
                break;
            case "PAPER":
                newShape = 1;
                break;
            case "SCISSORS":
                newShape = 2;
                break;
            case "LIZARD":
                newShape = 3;
                break;
            case "SPOCK":
                newShape = 4;
                break;
                   }
            return newShape;
    }
/**
 * Implements Leonards strategy to determine his next move
 *
 * @param sheldonsLastMove
 * @param leonardsLastMove
 * @param gameOutcome 
 */
    private  void determineLeonardsNextMove(int sheldonsLastMove, int leonardsLastMove, int gameOutcome){
        switch(gameOutcome){
            case LEONARD_WINS:
                leonardsMove = leonardsLastMove;
                break;
            case SHELDON_WINS:
                leonardsMove = getBetterMove(sheldonsLastMove);
                break;
            case TIE:
                leonardsMove = getBetterMove (leonardsLastMove);
                break;
        }
    }
//Implements Sheldons strategy to determine his next move
/**
 * 
 * @param sheldonsLastMove
 * @param leonardsLastMove
 * @param gameOutcome 
 */    
    private  void determineSheldonsNextMove(int sheldonsLastMove, int leonardsLastMove, int gameOutcome){
            //sheldonPreviousMove=sheldonsLastMove;
        if (sheldonsLastMove != SPOCK){
            sheldonsMove = SPOCK; }
            else if (gameOutcome == SHELDON_WINS) {
            sheldonsMove = ROCK;}
        else if (gameOutcome == LEONARD_WINS) {
            sheldonsMove = PAPER;}
        else sheldonsMove = LIZARD;
}
//Applies the Rock, Paper, Scissors, Lizard, Spock game logic to determine winner
/**
 * 
 * @param sheldonsMove
 * @param leonardsMove 
 */
/**
 * 
 * @param sheldonsMove
 * @param leonardsMove 
 */
    private  void determineWinner(int sheldonsMove, int leonardsMove){
            if (sheldonsMove == ROCK && (leonardsMove == SCISSORS || leonardsMove == LIZARD)){
                gameOutcome = SHELDON_WINS;
                }
            else if (sheldonsMove == SPOCK && (leonardsMove == ROCK || leonardsMove == SCISSORS)){
                gameOutcome = SHELDON_WINS;
                }
            else if (sheldonsMove == LIZARD && (leonardsMove == PAPER || leonardsMove == SPOCK)){
                gameOutcome = SHELDON_WINS;
                }
            else if (sheldonsMove == PAPER && (leonardsMove ==  SPOCK || leonardsMove == ROCK)){
                gameOutcome = SHELDON_WINS;
                }
            else if (sheldonsMove == SCISSORS && (leonardsMove ==  PAPER || leonardsMove == LIZARD)){
                gameOutcome = SHELDON_WINS;
                }
            else if (sheldonsMove == leonardsMove){
                gameOutcome = TIE;
                }
            else {gameOutcome = LEONARD_WINS;
                }
    }
//Uses logic from Rock, Paper, Scissors, Lizard, Spock to determine best of two moves based on player previous move input
/**
 * 
 * @param lastMove
 * @return 
 */
    private  int getBetterMove(int lastMove){
        int newMove=0; /*Start at -1, if error then method not properly executing */
        
        switch(lastMove) {
            case ROCK:
                newMove = PAPER;
                break;
            case PAPER:
                newMove = SCISSORS;
                break;
            case SCISSORS:
                newMove = SPOCK;
                break;
            case LIZARD:
                newMove = ROCK;
                break;
            case SPOCK:
                newMove = LIZARD;
                break;
        }              
        return newMove;}
//Returns LEONARD wins to calling method
/**
 * 
 * @return 
 */
    public  int getLeonardsWinCount(){
            int wins =leonardsWinCount;
            return wins;
    }
//Returns SHELDON wins to calling method
/**
 * 
 * @return 
 */
    public  int getSheldonsWinCount(){
            int wins =sheldonsWinCount;
            return wins;
    }
//Returns TIES to calling method
/**
 * 
 * @return 
 */
    public  int getTieCount(){
            int ties =tieCount;
            return ties;
    }
//
    public void playGame(int sheldonsInitialMove, int leonardsInitialMove, int numberGames){
        sheldonsMove=sheldonsInitialMove;
        leonardsMove=leonardsInitialMove;
        for (int i=numberGames ; i>0;){
            determineWinner(sheldonsMove, leonardsMove);
            determineLeonardsNextMove(sheldonsMove, leonardsMove, gameOutcome);
            determineSheldonsNextMove(sheldonsMove, leonardsMove, gameOutcome);
            updateScores(gameOutcome);
        i--;
        }
    }
//
    private  void updateScores(int gameOutcome){
            if (gameOutcome == SHELDON_WINS){
                 sheldonsWinCount ++;}
            else if (gameOutcome == TIE){
                 tieCount ++;}
            else {
                 leonardsWinCount ++;}
    }
}
    

