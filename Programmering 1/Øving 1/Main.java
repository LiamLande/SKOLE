import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
    public static void main(String [] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateWithoutTime;
        try {
            dateWithoutTime = sdf.parse(sdf.format(new Date()));
            System.out.println(sdf.parse(sdf.format(dateWithoutTime)));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        
        //Making an array of test cases in doubles, since centimeters are often used with millimeters.
        double[] testCases = {21, 2.54, 63.2, 205};
        for (double centimeter : testCases) {
            System.out.println(cmToInch(centimeter));
        }
        
        //Calling a function with the specified Time of 1 hour, 34 minutes and 22 seconds. (5662 seconds)
        System.out.println("Totalt Antall sekunder: "+timeInSeconds(1, 34, 22));
        
        //Declaring an answer array because of the type of return. Thereafter looping through and printing out.
        int[] answer = timeInHoursMinutesSeconds(5662);
        for (int i : answer) {
            System.out.println(i);
        }
        
    }
    
    static float cmToInch(double cm){
        return (float) (cm/2.54);
    }
    
    static int timeInSeconds(int hours, int minutter, int seconds){
        int a = seconds + (minutter*60) + (hours*60*60);
        return a;
    }
    
    static int[] timeInHoursMinutesSeconds(int seconds){
        int[] output= {0,0,0};
        output[0] = seconds/3600;
        output[1] = (seconds-(output[0]*3600))/60;
        output[2] = seconds-((output[0]*3600)+(output[1]*60));
        return output;
    }

}