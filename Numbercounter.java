import java.util.Scanner;
public class Numbercounter {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        char choice;
        do{
            System.out.print("Enter the number : ");
            int num = scanner.nextInt();
            if (num > 0){
                positiveCount++;
            } else if (num<0){
                negativeCount++;

            }else{
            zeroCount++;
            }
            System.out.print("Do you want to enter another number ? (y/n):");
            choice = scanner.next().charAt(0);
        }
        while ( choice == 'y'|| choice == 'Y');
        System.out.println("\nSummary:");
        System.out.println ("positive numbers:"+ positiveCount);
        System.out.println("Negative numbers:" + negativeCount);
        System.out.println("zero numbers : " + zeroCount);
        scanner.close();
            }
        }

