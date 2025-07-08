//returnType name (type param1, type param2){
//body
//return statement;
//}
import java.util.Scanner;
public class Syntaxwithparameter {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculateSum( int num1, int num2){//parameters or formal parameters, // Definitions.
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = (a + b);//arguments or actual parameters //calls
        System.out.println("sum is :"+ sum);
    }
}
