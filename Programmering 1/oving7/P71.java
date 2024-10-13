import java.util.Scanner;

public class P71 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);;
        System.out.println("Forkorting av String:");
        System.out.println("Skriv inn en string:");
        NyString N = new NyString(S.nextLine());
        System.out.println(N.forkortString());
        System.out.println("Fjerning av tegn:");
        System.out.println("Skriv inn en string:");
        NyString N2 = new NyString(S.nextLine());
        System.out.println("Skriv inn tegnet du vil fjerne:");
        System.out.println(N2.fjernTegn(S.nextLine()));
        S.close();

    }
    public static class NyString{
        private static String main;

        public NyString(String A){
            main = A;
        }
        
        
        
        public String forkortString() {
            String[] words = main.split(" ");
            String a = "";
            for (String string : words) {
                a += string.charAt(0);
            }
            return a;
        }

        public String fjernTegn(String A) {
            return main.replace(A,"");
        }


    }
}
