/* For a given set of Strings, print the largest string
 * "apple", "mango", "banana"
 * str1.compareTo(str2)
 * 0 : equal
 * <0 : -ve st1 < st2
 * >0 : +ve st1 > st2
 */

public class LargestString {
     public static void main (String args[]){
        String fruits [] = {"apple","mango","banana"};
        String largest = fruits [0];
        for (int i=1;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest = fruits [i];

            }
        }
        System.out.println(largest);
     }
}
//Output : mango  because among first letter a,m,b. m is the largest aplhabet.