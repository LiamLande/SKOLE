import java.util.*;

public class P21 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a year:");

        String year = myObj.nextLine();
        System.out.println("Du Valgte "+ year);
        if(isLeapYear(Integer.parseInt(year))){
            System.out.println("Det er et skuddår!");
        }else{
            System.out.println("Det er ikke et skuddår!");
        }
        myObj.close();
    }
    static boolean isLeapYear(int y)
    {
        if((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)){
            return true;
        }
        else
        {
            return false;
        }
    }
}