/* Check if a String ia a Palindrone
 * "racecar","noon","madam"
 * 1st - race
 * 2nd - car
 * for (int i=0 to length/2)
 * str(i) == str (n-i-1)
 */
//a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards
public class Stringpalindrone {
    public static boolean StringPalindrone(String str){
        for(int i=0; i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) == str.charAt(n-1-i)){
                //Not a palindrone
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]){
        String str = "racecar";
        System.out.println(StringPalindrone(str));
    }
}