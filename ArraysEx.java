import java.util.Scanner ;
public class ArraysEx {
    public class ArrayCC{
        public static void main (String args[]){
            int marks []= new int [50];//Size
            Scanner sc = new Scanner (System.in);
            //int phy ;
            //phy=sc.nexrint ();
            marks [0] = sc.nextInt (); //phy
            marks [1] = sc.nextInt (); //chem
            marks [2] = sc.nextInt (); //Math

            System.out.println("phy:" + marks [0]);
            System.out.println("chem:" + marks[1]);
            System.out.println("Math:" + marks [2]);
        }
    }
    
}
