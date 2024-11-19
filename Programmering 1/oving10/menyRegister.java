import java.util.*;
public class menyRegister {
    private HashMap<String, rett> retter;
    private HashMap<String, meny> menyer;

    public menyRegister(){
        this.retter = new HashMap<String, rett>();
        this.menyer = new HashMap<String, meny>();
    }
    public HashMap<String, rett> getRetter() {
        return retter;
    }
    public HashMap<String, meny> getMenyer() {
        return menyer;
    }
    public void newRett(Scanner S){
        System.out.println("Navn på rett: ");
        String navn = S.nextLine();
        System.out.println("Pris på rett: ");
        int pris = Integer.parseInt(S.nextLine());
        System.out.println("Type på rett: ");
        String type = S.nextLine();
        System.out.println("Oppskrift på rett: ");
        String oppskrift = S.nextLine();
        rett R = new rett(navn, pris, type, oppskrift);
        this.retter.put(navn, R);
    }
    public void newMeny(Scanner S){
        System.out.println("Navn på meny: ");
        String navn = S.nextLine();
        meny M = new meny(navn);
        this.menyer.put(navn, M);
    }
    public void addRettToMeny(Scanner S){
        System.out.println("Navn på meny: ");
        String menyNavn = S.nextLine();
        System.out.println("Navn på rett: ");
        String rettNavn = S.nextLine();
        meny M = this.menyer.get(menyNavn);
        rett R = this.retter.get(rettNavn);
        M.addRett(R);
    }
    public void printMeny(String menyNavn){
        meny M = this.menyer.get(menyNavn);
        System.out.println("Meny: " + M.getNavn());
        System.out.println("Total pris: " + M.getTotalPris());
        System.out.println("Retter: ");
        for (rett R : M.getRetter()) {
            System.out.println(R.getNavn());
        }
    }
    public void findRettMedNavn(String rettNavn){
        rett R = this.retter.get(rettNavn);
        System.out.println("Rett: " + R.getNavn());
        System.out.println("Pris: " + R.getPris());
        System.out.println("Type: " + R.getType());
        System.out.println("Oppskrift: " + R.getOppskrift());
    }
    public void findRettMedType(String type){
        for (rett R : this.retter.values()) {
            if (R.getType().equals(type)) {
                System.out.println("-----------------");
                System.out.println("Rett: " + R.getNavn());
                System.out.println("Pris: " + R.getPris());
                System.out.println("Type: " + R.getType());
                System.out.println("Oppskrift: " + R.getOppskrift());
            }
        }
    }
    public void finnMenyTotalPris(Scanner S){
        System.out.println("Billigste Prisklasse: ");
        int nedre = Integer.parseInt(S.nextLine());
        System.out.println("Dyreste Prisklasse: ");
        int ovre = Integer.parseInt(S.nextLine());
        for (meny M : this.menyer.values()) {
            if (M.getTotalPris() >= nedre && M.getTotalPris() <= ovre) {
                System.out.println("-----------------");
                System.out.println("Meny: " + M.getNavn());
                System.out.println("Total pris: " + M.getTotalPris());
                System.out.println("Retter: ");
                for (rett R : M.getRetter()) {
                    System.out.println(R.getNavn());
                }
            }
        }
    }

}
