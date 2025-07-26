public class operatorexample {
    public static void main (String args []){
        int a = 10 , b = 5;
        // Arithematic Operators 
        int sum = a + b ;
        int difference = a - b ;
        int product = a * b ;
        int division = a / b ;
        int modulus = a % b ;
        // logical Operators 
        boolean result1 = (a> b) && (a<20);
        boolean result2 = (a==10) || (b==5);
        boolean result3 = !(a>5);
        // Bitwise Operators
        int bitwiseAnd =  a & b;
        int bitwiseOr = a | b ;
        int bitwiseXor =  a^b ;
        int bitwiseNotA =-a;
        //comparison Operators 
        boolean  isEqual = a == b ;
        boolean isNotEqual = a!=b;
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isGreaterOrEqual = a >=b;
        boolean isLessOrEqual = a <=b;
        //Assignment Operators
        int num = 10;
        num += 5;
        num -= 3;
        num *= 2;
        num /= 4;
        num %= 3;
    }
}
