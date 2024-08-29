import java.util.*;

public class P22 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Skriv inn prisen på din første vare (Kr):");
        Integer prisA = Integer.valueOf(myObj.nextLine());

        System.out.println("Skriv inn vekten på din første vare (g):");
        Integer vektA = Integer.valueOf(myObj.nextLine());

        System.out.println("Skriv inn prisen på din andre vare (Kr):");
        Integer prisB = Integer.valueOf(myObj.nextLine());

        System.out.println("Skriv inn vekten på din andre vare (g):");
        Integer vektB = Integer.valueOf(myObj.nextLine());
        myObj.close();
        System.out.println(
            "Vare 1 koster "+prisA+"\n"+
            "Og veier "+vektA+"\n"+
            "Vare 2 koster "+prisB+"\n"+
            "Og veier "+vektB
        );
        float [] answers = leastExpensive(vektA, prisA, vektB, prisB);
        if(answers[0]!=3){
            System.out.println("Vare "+answers[0]+" var billigst! Med grampris på "+answers[1]);
        }else{
            System.out.println("De var like billige med grampris på "+answers[1]);
        }
    }
    static float[] leastExpensive(int a, int b, int c, int d)
    {
        float ppgA = a/b;
        float ppgB = c/d;
        if(ppgA<ppgB){
            return new float[] {1,ppgA};
        }else if(ppgA>ppgB){
            return new float[] {2,ppgB};
        }else{
            return new float[] {3,ppgA};
        }
    }
}