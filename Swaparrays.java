public class Swaparrays {
    public static void main (String args[]){
        //Declare two Strings
        String a = "Hello";
        String b = "World";
        //Print String Before Swapping 
        System.out.println("Strings before swap : a = "+ a +" and b ="+b);
        //append 2nd string to 1st 
        a = a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("Strings after swap : a= "+ a + "and b =" +b);
    }
}
