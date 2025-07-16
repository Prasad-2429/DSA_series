// Functions used to calculate the circumference of a circle
public class CircleUtils {
    public static double getCircumference (double radius){
        return 2 * Math.PI * radius ;
    }
    public static void main (String args []){
        double radius = 5.0;
        double circumference = getCircumference(radius);
        System.out.println("The circumference of the circle is :" + circumference );
    }
    }