public class callbyjava {
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
        //swap - values exchange
        int a = 5;
        int b = 10;

        //swap
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

