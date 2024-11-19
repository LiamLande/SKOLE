import java.util.*;
public class p2 {
    public static void main(String[] args) {
        System.out.println("Velkommen til Menyregisteret!");
        Scanner S = new Scanner(System.in);
        menyRegister reg = new menyRegister();
        boolean on = true;
        while (on) {
            System.out.println("1. Legg til rett");
            System.out.println("2. Legg til meny");
            System.out.println("3. Legg til rett i meny");
            System.out.println("4. Skriv ut meny");
            System.out.println("5. Finn rett med navn");
            System.out.println("6. Finn rett med type");
            System.out.println("7. Finn meny mellom to priser");
            System.out.println("8. Avslutt");
            String valg = S.nextLine();
            switch (valg) {
                case "1":
                    reg.newRett(S);
                    break;
                case "2":
                    reg.newMeny(S);
                    break;
                case "3":
                    reg.addRettToMeny(S);
                    break;
                case "4":
                    System.out.println("Navn på meny:");
                    String menyNavn = S.nextLine();
                    reg.printMeny(menyNavn);
                    break;
                case "5":
                    System.out.println("Navn på rett:");
                    String rettNavn = S.nextLine();
                    reg.findRettMedNavn(rettNavn);
                    break;
                case "6":
                    System.out.println("Type:");
                    String type = S.nextLine();
                    reg.findRettMedType(type);
                    break;
                case "7":
                    reg.finnMenyTotalPris(S);
                    break;
                default:
                    on = false;
                    break;
            }
        }
        S.close();
    }
}
