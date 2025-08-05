import java.util.Scanner;
public class ArraysEx {
        public static void main (String args[]){
            int marks []= new int [100];//Size
            Scanner sc = new Scanner (System.in);
            //int phy ;
            //phy=sc.nexrint ();
            marks [0] = sc.nextInt (); //phy
            marks [1] = sc.nextInt (); //chem
            marks [2] = sc.nextInt (); //Math

            System.out.println("phy:" + marks [0]);
            System.out.println("chem:" + marks[1]);
            System.out.println("Math:" + marks [2]);
            marks[2]= 100;
            System.out.println("Math:" + marks[2]);

        }
    }
    
