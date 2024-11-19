import java.util.*;
public class meny {
    private String Navn;
    private ArrayList<rett> retter;
    private int totalPris;

    public meny(String navn){
        this.retter = new ArrayList<rett>();
        this.totalPris = 0;
        this.Navn = navn;
    }
    public void addRett(rett R){
        this.retter.add(R);
        this.totalPris += R.getPris();
    }

    public int getTotalPris() {
        return totalPris;
    }
    public ArrayList<rett> getRetter() {
        return retter;
    }
    public String getNavn() {
        return Navn;
    }
}
