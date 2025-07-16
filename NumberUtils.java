public class NumberUtils {

    // Function to return the greater of two numbers
    public static int getGreater(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Example usage
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int greater = getGreater(a, b);
        System.out.println("The greater number is: " + greater);
    }
}
// The function getGreater uses a ternary operator to compare the two numbers.
<<<<<<< HEAD
// it returns num1 if its greater, otherwise it returns num2.
=======
// it returns num1 if its greater, otherwise it returns num2.
>>>>>>> a2715db (All files uploaded successfully)
