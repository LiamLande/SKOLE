import java.util.*;

public class P62 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Skriv inn tekst:");

        String tekst = S.nextLine();

        Tekstanalyse analyse = new Tekstanalyse(tekst);

        System.out.println("Antall Bokstaver:");

        System.out.println(analyse.getAntallBokstaver());

        System.out.println(analyse.getAntallForekomst());

        System.out.println("Tekst i Prosent");

        System.out.println(analyse.getProsent()+"%");

        System.out.println("A forekom: "+analyse.getForekomstAvBokstav("a"));

        System.out.println(analyse.getMestBrukt());
        
        S.close();
    }

}
