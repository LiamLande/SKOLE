import java.util.*;
public class meny {
    private ArrayList<rett> retter;
    private int totalPris;

    public meny(){
        this.retter = new ArrayList<rett>();
        this.totalPris = 0;
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
}
