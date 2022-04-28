import java.util.Scanner;

public class test {
    public static void Calculator(double a, double b){
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a x b = " + (a*b));
        System.out.println("a / b = " + (a/b));
    }
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        Calculator(a,b);
    }
}