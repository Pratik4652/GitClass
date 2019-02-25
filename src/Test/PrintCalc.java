package Test;

import java.util.Scanner;

public class PrintCalc {
    public static void main(String[] args) {
    int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
        FunctionClass c= new FunctionClass();
        System.out.println("Addition of two numbers is: "+c.addition(a,b));
        System.out.println("Subtraction of two numbers is: "+c.subtract(a,b));
        System.out.println("Multiplication of two numbers is: "+c.multiply(a,b));
        System.out.println("Division of two numbers is: "+c.divide(a,b));

}
}