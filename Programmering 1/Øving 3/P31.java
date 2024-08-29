import java.util.*;
public class P31{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Skriv hvor du vil starte:");
        Integer A = Integer.valueOf(myObj.nextLine());

        System.out.println("Skriv hvor du vil slutte:");
        Integer B = Integer.valueOf(myObj.nextLine());
        myObj.close();
        for (int i = A; i <= B; i++) {
            System.out.println(i+" gangen:");
            for (int x = 1; x <= 10; x++) {
                System.out.println(i +" x "+x+" = "+(i*x));
            }
        }
    }   
}