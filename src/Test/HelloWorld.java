package Test;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a first number: ");
        int a = reader.nextInt();

        System.out.println("Enter a second number: ");
        int b = reader.nextInt();
        addition(a,b);

    }
    public static void addition(int a , int b){
        System.out.println("Total: " + (a+b));
    }
}
