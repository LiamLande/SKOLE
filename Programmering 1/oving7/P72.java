import java.util.Scanner;
public class P72 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Tekstbehandling:");
        System.out.println("Skriv inn en tekst:");

        tekstbehandling T = new tekstbehandling(S.nextLine());
        
        System.out.println("Antall ord i teksten: "+T.antallOrd());

        System.out.println("Ordsnittlengde: "+T.ordsnittlengde());
        
        System.out.println("Setningsnittlengde: "+T.setningsnittlengde());
        
        System.out.println("Teksten med byttet ord:");
        
        System.out.println("Skriv inn ordet du vil bytte ut:");
        String A = S.nextLine();
        
        System.out.println("Skriv inn ordet du vil bytte til:");
        String B = S.nextLine();
        
        System.out.println(T.replaceOrd(A,B));
        
        System.out.println("Teksten i store bokstaver:");
        System.out.println(T.getStringToUpper());
        S.close();

    }
    public static class tekstbehandling {
        public String A;
        public String[] OrdListe;

        public tekstbehandling(String AA){
            A = AA;
            OrdListe = AA.split("\\?|\\.|\\!");

        }


        public int antallOrd() {
            return OrdListe.length;
        }

        public double ordsnittlengde() {
            double a = 0;
            
            for (String string : OrdListe) {
                a += string.length();
            }

            return a/ (double) OrdListe.length;
        }

        public double setningsnittlengde() {
            String[] setninger = A.split("\\?|\\.|\\!");
            
            double a = 0;
            for (String string : setninger) {
                a += string.length();
            }

            return a/ (double) setninger.length;

        }

        public String replaceOrd(String AA, String BA) {
            return A.replaceAll("\\b"+AA+"\\b",BA);
        }

        public String getString(){
            return A;
        }

        public String getStringToUpper(){
            return A.toUpperCase();
        }
        

    }
}
