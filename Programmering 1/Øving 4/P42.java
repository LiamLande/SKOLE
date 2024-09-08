
public class P42 {
    public static void main(String[] args) {
        spiller A = new spiller(0);

        spiller B = new spiller(0);

        int runde = 0;
        while(!A.erFerdig() && !B.erFerdig()){
            runde += 1;
            A.kastTerningen();
            B.kastTerningen();

            System.out.println("Runde "+runde+"\n"+ //
            "A: "+A.totalsum +"\n"+ //
            "B: "+B.totalsum);

        }
        System.out.println((A.erFerdig()?"A":"B") + " Vant!");
    }

}

