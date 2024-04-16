//importing javax swing JOptionPane Class
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Oh Hello.." +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Wow, you are "+age+" years old");
        
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
    }
}
