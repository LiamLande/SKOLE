import java.util.*;
public class P91 {
    
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        boolean run = true;
        System.out.println("Hei velkommen til Student registeret");
        OppgaveOversikt studenter = new OppgaveOversikt();
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
                    studenter.addStudent(S);
                    break;
                case 2:
                    studenter.fintAntOppg(S);
                    break;
                case 3:
                    studenter.getAntStud();
                    break;
                case 4:
                    studenter.increaseAntOppg(S);
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

        public Student(String navn, int antOppg) {
            this.Navn = navn;
            this.antOppg = antOppg;
        }

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
        public OppgaveOversikt() {
            this.studenter = new ArrayList<Student>();
            this.antStud = 0;
        }
        public int getAntStud() {
            return antStud;
        }
        public List<Student> getStudenter() {
            return studenter;
        }
        public void addStudent(Scanner S) {
            System.out.println("Navn:");
            String navn = S.nextLine();
            System.out.println("Oppgaver gjort:");
            int oppg = Integer.parseInt(S.nextLine());
            Student s = new Student(navn, oppg);
            this.studenter.add(s);
            this.antStud++;
        }
        public void increaseAntOppg(Scanner S) {
            System.out.println("Navn:");
            String navn = S.nextLine();
            System.out.println("Antall oppgaver løst (Legges til tidligere total):");
            int oppg = Integer.parseInt(S.nextLine());
            for (Student student : studenter) {
                if (student.getNavn().equals(navn)) {
                    student.increaseAntOppg(oppg);
                }
            }
        }
        public void fintAntOppg(Scanner S) {
            System.out.println("Navn:");
            String navn = S.nextLine();
            for (Student student : studenter) {
                if (student.getNavn().equals(navn)) {
                    System.out.println(student.getAntOppg());
                }
            }
        }
    }
}
