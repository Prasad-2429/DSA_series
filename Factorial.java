 //To hold number
        int fact=//Program to find the factorial of any number entered by the user'
import java.util.Scanner;
public class Factorial {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int num;1;//To hold factorial
        System.out.print("Enter any positive integers:");
        num=sc.nextInt();

        for (int i=1 ; i<=num;i++){
            fact *= i;
        }
        System.out.println ("Factorial:"+fact);
    }
}
