package Test;
import java.util.Scanner;

public class FirstClassPritam {
    public static void main(String [] args){
        System.out.println("Hello World!!!");

        SecondClassPritam obj = new SecondClassPritam();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for addition:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum = obj.addition(n1, n2);
        System.out.println(sum);

        System.out.println("Enter two numbers for subtraction:");
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int diff = obj.subtraction(n3,n4);
        System.out.println(diff);

        System.out.println("Enter two numbers for multiplication:");
        int n5=sc.nextInt();
        int n6=sc.nextInt();
        int mul = obj.multiplication(n5, n6);
        System.out.println(mul);

        System.out.println("Enter two numbers for division:");
        float n7=sc.nextFloat();
        float n8=sc.nextFloat();
        float div = obj.division(n7,  n8);
        System.out.println(div);
    }
}
