import java.util.*;

public class P41{
    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Vil du regne til eller fra nok?\n1. Regne til NOK fra utenlandsk valuta,\n2. Regne fra Utenlandsk valuta til NOK.\n3.Avslutt");
                
            Integer regneValg = myObj.nextInt();

            if(regneValg==3){System.exit(0);}
            
            System.out.println("Velg hvilken valuta du vil regne med.\n1.USD\n2.SEK\n3.DDK\n4.Avslutt");

            Integer valutavalg = myObj.nextInt();

            if((valutavalg != 1 && valutavalg != 2)){System.exit(0);}

            System.out.println("Hvor mye av den valutaen vil du regne om?");

            Integer amount = myObj.nextInt();

            Valuta Val = new Valuta((valutavalg == 1)?"USD":((valutavalg==2)?"SEK":"DDK"), amount, (valutavalg == 1)?10.6:((valutavalg==2)?1.03:1.57));

            System.out.println("Du har "+Val.amount_local+" "+Val.fname+" som gir "+((regneValg==1)?Val.convertedtoNOK:Val.convertedtoFOREIGN)+" i "+((regneValg==2)?Val.fname:"NOK"));
            // if(regneValg==1){
            //     switch(valutavalg){
            //         case 1:
            //             Valuta Val = new Valuta("USD", amount, 10.6);
            //             System.out.println("Du har "+Val.amount_local+"USD som gir "+Val.convertedtoNOK+" i NOK");
            //         break;
            //         case 2:
            //             Valuta Val = new Valuta("SEK", amount, 10.6);
            //             System.out.println("Du har "+Val.amount_local+"USD som gir "+Val.convertedtoNOK+" i NOK");

            //         break;
            //         case 3:
            //             Valuta Val = new Valuta("DDK", amount, 10.6);
            //             System.out.println("Du har "+Val.amount_local+"USD som gir "+Val.convertedtoNOK+" i NOK");
 
            //         break;
            //         default:

            //         System.exit(0);
            //         break;
            //     }

            // }else if(regneValg==2){

           
            // }
        }
    }  

}
class Valuta{
    double convToNOK;
    int amount_local;
    String fname;
    double convertedtoFOREIGN;
    double convertedtoNOK;
    public Valuta(String name, int amount, double conversion){
        fname = name;
        amount_local = amount;
        convToNOK = conversion;
        convertedtoNOK = amount*conversion;
        convertedtoFOREIGN = amount/conversion;
    }
}
