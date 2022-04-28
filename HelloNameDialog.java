import java.swing.jOptionPane;
public class HelloNameDialog{
    public static void main(String[] args){
    String result;
    result = jOptionPane.showInputDialog("Please enter your name:");
    jOptionPane.showMesageDialog(null, "Hi" + result + "!");
    System.exit(0);
    }
}
