//n! n factorial
//int f=1;n=4
//for(i=1 to n){
//f=f*i};
//}
//return f; f is factorial
//24=n!=4!
//i=1, f=1*1 =1
//i=2, f=1*2 =2
//i=3, f=2*3 =6
//i=4, f=6*4 =24.
public class findfactorial {
    public static int factorial (int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*1;
    }
    return f;//factorial of n
}
    public static void main (String args []){
        System.out.println(factorial(8));
    }
}

