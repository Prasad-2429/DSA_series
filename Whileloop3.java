// import range 1 to N numbers 
import java.util.Scanner;

public class Whileloop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();
    }
}