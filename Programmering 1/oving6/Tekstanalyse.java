/**
 * Tekstanalyse
 */
import java.util.*;
public class Tekstanalyse {
    private static int[] antallTegn;
    private static String[] bokstaver = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","æ","ø","å"};

    public Tekstanalyse(String a){
        String a_ny = a.toLowerCase();
        antallTegn = new int[30];
        for (int i = 0; i < a.length(); i++) {
            char char1 = a_ny.charAt(i);
            System.out.println(char1);
            String bokstav = Character.toString(char1);
            
            int index = Arrays.asList(bokstaver).indexOf(bokstav);
            
            antallTegn[(index==-1)?29:index]++;
        }
    }

    public int getAntallBokstaver(){
        int x = 0;
        for (int i = 0; i < antallTegn.length-1; i++) {
            x += antallTegn[i];
        }
        return x;
    }

    public List<String> getAntallForekomst(){
        List<String> out = new ArrayList<String>();
        for (String string : bokstaver) {
            int x = this.getForekomstAvBokstav(string);
            if (x != 0) {
                out.add(string + ":" + x);
            }
        }
        return out;

    }

    public int getProsent(){
        int percent = (this.getAntallBokstaver() * 100) / (this.getAntallBokstaver()+antallTegn[29]);
        return percent;
    }

    public int getForekomstAvBokstav(String bokstav){
        int index = Arrays.asList(bokstaver).indexOf(bokstav);
        
        return antallTegn[(index==-1)?29:index];
    }

    public String getMestBrukt(){
        int largest = 0;
        for ( int i = 1; i < antallTegn.length-1; i++ )
        {
            if ( antallTegn[i] > antallTegn[largest] ) largest = i;
        }
        return "Bokstaven som forekom mest er \""+bokstaver[largest]+"\" og den forekom "+antallTegn[largest]+" ganger"; // position of the first largest found
    }





}