import java.util.*;
public class P91 {
    
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        boolean run = true;
        System.out.println("Hei velkommen til Student registeret");
        List<Student> studenter = new ArrayList<Student>();
        while (run) {
            System.out.println("Her er dine valg:");
            System.out.println("1: Registrer ny Student");
            System.out.println("2. Finn ut av antall oppgaver en student har levert");
            System.out.println("3. Finn antall studenter i registeret");
            System.out.println("4. Øk Antall oppgaver en student har levert");
            System.out.println("5. Avslutt");
            int valg = Integer.parseInt(S.nextLine());
            switch (valg) {
                case 1:
                    System.out.println("Registrer ny Student:");
                    System.out.println("Navn:");
                    String navn = S.nextLine();
                    System.out.println("Oppgaver gjort:");
                    int oppg = Integer.parseInt(S.nextLine());
                    Student s = new Student();
                    s.antOppg = oppg;
                    s.Navn = navn;
                    studenter.add(s);

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    break;
            }

        }
        S.close();

    }

    public static class Student {
        private String Navn;
        private int antOppg;

        public String getNavn() {
            return Navn;
        }
        public int getAntOppg() {
            return antOppg;
        }

        public void increaseAntOppg(int a) {
            antOppg+= a;
        }
        @Override
        public String toString() {
            return this.getNavn() + " har levert " + this.getAntOppg() + " oppgaver.";  
        }
    }
    public static class OppgaveOversikt {
        private List<Student> studenter;
        private int antStud;
        public int getAntStud() {
            return antStud;
        }

    }
}
