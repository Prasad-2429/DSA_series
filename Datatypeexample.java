import java.util.Arrays;

public class Datatypeexample {
    public static void main (String args []){
        // Primitive data types 
        int age = 30;
        double salary = 45000.75;
        char gender = 'M';
        boolean isEmployed = true ;
        // Reference data type 
        String name = " John Doe";
        int [] numbers = { 1,2,3,4,5};
        // Using data types 
        System.out.println ("name :" + name );
        System.out.println ("Age:" + age );
        System.out.println ("Salary : " + salary);
        System.out.println ("Employed :" + isEmployed);
        System.out.println (" Numbers" + Arrays.toString(numbers));


    }
    
}

