//Print reverse of a number
//Remainder is last digit.
//last digit num % 10
//remove last Digit num/10
import java.util.Scanner;
public class Forloop2 {
    public static void main (String args[]){
        int n = 10899;
        while (n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10 ; //n/=10
        }
        System.out.println();
    }
    
}
