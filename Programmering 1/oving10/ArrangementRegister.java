/**
 * ArrangementRegister
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrangementRegister {

    private ArrayList<Arrangement> register;

    public ArrangementRegister(){
        this.register = new ArrayList<Arrangement>();
    }

    // public void addPremade(Arrangement A){
    //     register.add(A);

    // }
    public void addArrangement(Scanner S) {
        System.out.println("Registrer arrangement");

        System.out.println("ID:");
        String temp = S.nextLine();
        int ID = Integer.parseInt(temp);
        System.out.println("Navn på arrangement:");
        String Name = S.nextLine();
        System.out.println("Navn på arrangør:");
        String Host = S.nextLine();
        System.out.println("Sted:");
        String Location = S.nextLine();
        System.out.println("Type:");
        String Type = S.nextLine();
        System.out.println("Dato (YYYYMMDD):");
        String temp2 = S.nextLine();
        long Date = Long.parseLong(temp2);

        // Add the new Arrangement object to the register
        this.register.add(new Arrangement(ID, Name, Host, Location, Type, Date));

        // Print all arrangements to verify
        register.forEach( (n) -> { System.out.println(n.getName()); } );
    }
    public void findArrangements(Boolean locOrDat, String Location, int Date){

        ArrayList<Arrangement> sortedReg = new ArrayList<Arrangement>();
        
        if (locOrDat) {
            
            for (Arrangement arrangement : register) {
                if (arrangement.getLocation().equals(Location)) {
                    sortedReg.add(arrangement);
                }
            }
        }else{
            for (Arrangement arrangement : register) {
                if (arrangement.getTime() == (Date)) {
                    sortedReg.add(arrangement);
                }
            }
        }
        for (Arrangement arrangement : sortedReg) {
            arrangement.printUt();
        }
    }
}
