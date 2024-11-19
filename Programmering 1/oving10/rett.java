public class rett {
    private String Navn;
    private int Pris;
    private String Type;
    private String Oppskrift;


    public rett(String navn, int pris, String type, String oppskrift){
        this.Navn = navn;
        this.Pris = pris;
        this.Type = type;
        this.Oppskrift = oppskrift;
    }
    public String getNavn() {
        return Navn; 
    }
    public String getOppskrift() {
        return Oppskrift;
    }
    public int getPris() {
        return Pris;
    }
    public String getType() {
        return Type;
    }
    public void setNavn(String navn) {
        Navn = navn;
    }
    public void setOppskrift(String oppskrift) {
        Oppskrift = oppskrift;
    }
    public void setPris(int pris) {
        Pris = pris;
    }
    public void setType(String type) {
        Type = type;
    }

}
