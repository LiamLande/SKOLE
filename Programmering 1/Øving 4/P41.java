import java.util.*;
public class P41{
    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("
                Vil du regne til eller fra nok?
                \n1. Regne til NOK fra utenlandsk valuta,
                \n2. Regne fra Utenlandsk valuta til NOK.\n
                ");
                
            Integer regneValg = myObj.nextInt();

            
            System.out.println("
                Velg hvilken valuta du vil regne med.
                \n1.USD
                \n2.SEK
                \n3.DDK
                \n4.Avslutt");

            Integer valutavalg = myObj.nextInt();

            if(regneValg==1){
                switch(valutavalg){
                    case 1:
                        USD total = new USD();

                    break;
                    case 2:


                    break;
                    case 3:
                    
 
                    break;
                    default:


                    break;
                }

            }else if(regneValg==2){


            }
        }
    }  

}
class SEK{
    double convToNOK = 1.2;
    int amount;
    public SEK(){
    }
}
class DDK{
    double convToNOK = 1.34;
    int amount;
    public DDK(){
    }
}
class USD{
    double convToNOK = 11.8;
    int amount;
    public USD(){
    }
}