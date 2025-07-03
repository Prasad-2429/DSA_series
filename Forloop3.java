//Reverse the given number
//Formula for reversse the given number rev = (rev*10)+last Digit
//n=10899
//rev=0
//rev=(0*0)+9=9
//rev=(9*10)+9=90+9=99
//rev=(99*10)+8=990+8=998
//rev=(998*10)+0=9980
//rev=(9980*10)+1=99800+1=99801
import java.util.Scanner;
public class Forloop3 {
    public static void main (String args[]){
        int n=10899;
        int rev = 0 ;
        
        while (n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n /10;
        }
    System.out.println (rev);
    }
}
