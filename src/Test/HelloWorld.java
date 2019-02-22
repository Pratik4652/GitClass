package Test;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Calculation");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a first number: ");
        float a = reader.nextFloat();

        System.out.println("Enter a second number: ");
        float b = reader.nextFloat();

        calculator obj = new calculator();
        System.out.println( "When added" + obj.addition(a,b));
       // calculator(a,b);
        substraction(a,b);
        multiplication(a,b);
        division(a,b);

    }
  /*  public static void calculator(float a , float b){
        System.out.println("When added: " + (a+b));
    }*/

    public static void substraction(float a , float b){
        System.out.println("when substracted: " + (a-b));
    }
    public static void multiplication(float a , float b){
        System.out.println("when multiply: " + (a*b));
    }
    public static void division(float a , float b){
        System.out.println("when divide: " + (a/b));
    }
}
