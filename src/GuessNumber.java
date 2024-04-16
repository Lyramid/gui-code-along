//importing javax swing JOptionPane Class
import javax.swing.JOptionPane;

//Start of GuessNumber class
public class GuessNumber {
    //Start of numberGuess method
    public static void numberGuess(){
        //Initializing the number that is being guessed
        int realNumber = 84;
        //Getting the intial guess from the user
        int guessNumber = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
        
        //Continually prompting the user for a guess until they guess the correct number. Providing feedback on their guess
        while(guessNumber!=realNumber){
            //JOptionPane.showMessageDialog(null, guessNumber+" is not the correct number, guess again.");
            if(guessNumber > realNumber){
                JOptionPane.showMessageDialog(null, guessNumber+" is too high");
            }
            else if(guessNumber < realNumber){
                JOptionPane.showMessageDialog(null, guessNumber+" is too low");
            }
            guessNumber = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
        }
        //When they guess correctly, giving them a congratulatory message
        JOptionPane.showMessageDialog(null, "Correct, "+realNumber+" is the number.");
    }//End of numberGuess method
}//End of GuessNumber class
