package Test;

import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println(" Hello world Calculation");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a first number: ");
        float a = reader.nextFloat();

        System.out.println("Enter a second number: ");
        float b = reader.nextFloat();
        //creating instance of object
        calculator obj = new calculator();
        //adding
        float d = obj.addition(a, b);
        System.out.println("When added " + d);
        // substracting
        System.out.println("When substracted " + obj.substraction(a, b));
        //multiplying
        System.out.println("When multipled " + obj.multiplication(a, b));
        //dividing
        System.out.println("When divided " + obj.division(a, b));

    }


}
