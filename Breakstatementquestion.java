import java.util.Scanner;
public class Breakstatementquestion {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter Your Number");
            int n = sc.nextInt ();
            if (n%10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
