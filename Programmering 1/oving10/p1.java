import java.util.*; 


public class p1{
    public static void main(String[] args) {
        ArrangementRegister reg = new ArrangementRegister();
        Boolean on = true;
        try (Scanner S = new Scanner(System.in)) {
        while (on) {
            System.out.println("Hei Velkommen til ditt arrangementregister!");

            System.out.println("1. Legge til arrangement");
            
            System.out.println("2. Finne arrangement på gitt sted");

            System.out.println("3. Finne arrengement på gitt dato");

            System.out.println("4. Finne arrangement innenfor tidsramme");

            System.out.println("5. Liste over alle arrangement sortert etter kriterie.");
            
            System.out.println("6. Avslutt.");
            String valg = S.nextLine();

            switch (valg) {
                case "1":
                    reg.addArrangement(S);
                    break;
                
                case "2":
                    System.out.println("Sted:");
                    String a = S.nextLine();
                    reg.findArrangements(true, a, 0);
                    break;
                case "3":
                    System.out.println("Dato:");
                    String temp = S.nextLine();
                    int b = Integer.parseInt(temp);
                    reg.findArrangements(false, "", b);
                
                    break;
                case "4":
                    System.out.println("Startdato:");
                    String temp2 = S.nextLine();
                    int c = Integer.parseInt(temp2);
                    System.out.println("Sluttdato:");
                    String temp3 = S.nextLine();
                    int d = Integer.parseInt(temp3);
                    reg.findArrangementsBetweenDates(c, d);
                    break;
                case "5":
                    reg.allArrangements(S);
                    break;
                default:
                    on = false;
                    break;
            }   
        }
        }
    }
}
