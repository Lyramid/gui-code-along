//importing javax swing JOptionPane Class
import javax.swing.JOptionPane;

//Start of App Class
public class App {
    //Start of Main Method
    public static void main(String[] args) throws Exception {
        //Prompting User for their name
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Oh Hello.." +name);

        //Prompting user for their age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Wow, you are "+age+" years old");
        
        //Repeatedly asking them a question until they answer correctly
        int answer = 0;
        while(answer!=1){
            answer = JOptionPane.showConfirmDialog(null,"Is the sky blue?", "Truly Tragic Some Would Say",JOptionPane.YES_NO_OPTION);
            if(answer == 1){
                JOptionPane.showMessageDialog(null,"Correct, not bad for a "+age+" year old");
            }
            else{
                JOptionPane.showMessageDialog(null,"Damn "+name+", you must've just come from stupid town");
            }
        }
        
        //Calling the numberGUess method
        GuessNumber.numberGuess();
    }//End of Main Method
}//End of App Class
