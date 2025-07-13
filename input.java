import java.util.Scanner;
public class input {
    public static void main (String args[]){
        int marks []= new int [100];
        Scanner sc = new Scanner (System.in);
        // int phy;
        // phy = sc.nextInt();
        System.out.print("Give phy Mark  ");
        marks[0] = sc.nextInt (); // phy

        System.out.print("Give Chem Mark ");
        marks [1] = sc.nextInt ();// chem

        System.out.print("Give Math Mark ");
        marks[2 ] = sc.nextInt ();// math
        
        System.out.println("phy:" + marks [0]);
        System.out.println("che:" + marks[1]);
        System.out.println("math:" + marks [2]);
    }
}
