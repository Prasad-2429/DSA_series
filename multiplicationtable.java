import java.util.Scanner;
class multiplicationtable {
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner (System.in);
        System.out.print ( "enter number:");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
             System.out.println(n+ "*" + "="+ n*i);
    }
}
public static void main (String s []){
    printMultiplicationTable(5);
}
}

