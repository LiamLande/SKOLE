import java.util.*;
public class P32{
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Velkommen til primtallsjekk, Det er bare å skrive inn tall så får du enten true eller false, om du velger å ta slutt bare trykk enter");
        String A = "placeholder";
        int B;
        while(!"".equals(A)){
            A = myObj.nextLine();
            if(!"".equals(A)){
                B = Integer.parseInt(A);
                System.out.println(isPrime(B));
            }
        }        
        myObj.close();
    }  
//Source 
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } 
}