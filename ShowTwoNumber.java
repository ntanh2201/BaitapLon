import Javax.swing.jOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        strNum1 = jOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number", jOptionPane.INFORMATION_MESSAGE);
        StrNum2 = jOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", jOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        jOptionPane.showMesageDialog(null, strNotification,"Show two numbers", jOptionPane.INFORMATION_MESSAGE);
        System.ext(0);
    }
}