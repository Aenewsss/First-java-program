package firstdioexercise;

import java.util.Calendar;
import java.util.Date;

/*
 * @author Aenã
 */
public class CheckDate {
    public static void checkDate(){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("\nNow it's " + hour);
        if(hour > 5 && hour < 12){
            System.out.println("Good morning!");
        }else if(hour > 12 && hour < 18){
            System.out.println("Good afternoon!");
        }else{
            System.out.println("Good night!");
        }
    }
}
