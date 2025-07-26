public class switchstatement {
    public static void main (String args[]){
        int dayOfweek = 2;
        String dayName ;
        switch (dayOfweek){
            case 1 :
            dayName = "Sunday";
            break;
            case 2 :
            dayName = "Monday";
            break;
            case 3 :
            dayName = "Tuesday";
            break;
            //Add cases for other days 
            default :
            dayName = "Invalid day";
        }
        System.out.println("today is" + dayName);
        }
    }
    

