import java.util.*;
public class P51 {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Brøk 1: a / b");
            
            System.out.println("a");
            int a = s.nextInt();

            System.out.println("b");
            int b = s.nextInt();
            
            System.out.println("Brøk 2: c / d");
            
            System.out.println("c");
            int c = s.nextInt();

            System.out.println("d");
            int d = s.nextInt();

            fraction f1 = new fraction(a, b);
            fraction f2 = new fraction(c, d);
            

            System.out.println("Vil du \n1. Addere" + //
                            "2. Subtrahere" + //
                            "3. Multiplisere" + //
                            "4. Dividere");
            int regneValg = s.nextInt();

            fraction temp = new fraction(1);

            switch (regneValg) {
                case 1:
                    System.out.println("Adderer...");
                    temp = f1.summere(f2);
                    break;
                case 2:
                    System.out.println("Subtraherer...");
                    temp = f1.subtrahere(f2);
                    break;
                case 3:
                    System.out.println("Multipliserer...");
                    temp = f1.multiplisere(f2);
                    break;
                case 4:
                    System.out.println("Dividerer...");
                    temp = f2.dividere(f2);
                    break;
                default:
                    break;
            }
            temp.forkortbrøk();
            System.out.println("Svaret ditt er "+temp.getNum()+"/"+temp.getDen());
        }

        
    }

    public static class fraction{
        private int Numerator;
        private int Denominator;
        public fraction(int a) {
            Numerator = a;
            Denominator = 1;
        } 
        public fraction(int a, int b) {
            if (b==0) {
                throw new IllegalArgumentException("Kan ikke ha 0 som nevner");
            }else{
                Numerator = a;
                Denominator = b;
            }
        
        } 
        public int getNum(){
            return Numerator;
        }
        public int getDen(){
            return Denominator;
        }
        public fraction summere(fraction f1){
            int a = f1.getNum(); 
            int b = f1.getDen(); 
    
            int c = Numerator;
            int d = Denominator;
            
            return new fraction(a*d + c*b, b*d);
        }
        public fraction subtrahere(fraction f1){
            int a = f1.getNum() * Denominator;
            int b = f1.getDen() * Denominator;
    
            int c = Numerator * f1.getDen();
            
            return new fraction(a-c, b);
        }
        public fraction multiplisere(fraction f1){
            fraction temp = new fraction(Numerator * f1.getNum(),Denominator * f1.getDen());
            return temp;
        }
        public fraction dividere(fraction f1){
            fraction temp = new fraction(Denominator * f1.getNum(), Numerator * f1.getDen());
            return temp;
        }
        public int gcd(int a, int b){
            if (b == 0) 
                return a; 
            return gcd(b, a % b); 
        }
        public void forkortbrøk() 
        { 
            int d; 
            d = gcd(Numerator, Denominator); 
        
            Numerator = Numerator / d; 
            Denominator = Denominator / d; 
        } 
    }
}
