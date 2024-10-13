import java.util.*;;
public class P81 {
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        boolean run = true;
        System.out.println("Hei velkommen til ArbTaker registeret");
        ArbTaker a = new ArbTaker();
        while (run) {
            
            System.out.println("Her er dine valg:");
            System.out.println("1: Registrer ny ArbTaker");
            System.out.println("2: Endre paa ArbTaker");
            System.out.println("3: Skriv ut ArbTaker Detaljer");
            System.out.println("4: Avslutt");
            int valg = Integer.parseInt(S.nextLine());
            switch (valg) {
                case 1:
                    System.out.println("Registrer ny ArbTaker:");
                    System.out.println("Fornavn:");
                    String fornavn = S.nextLine();
                    System.out.println("Etternavn:");
                    String etternavn = S.nextLine();
                    System.out.println("Fødselsaar:");
                    int fødselsaar = Integer.parseInt(S.nextLine());
                    System.out.println("Arbtakernr:");
                    int arbtakernr = Integer.parseInt(S.nextLine());
                    System.out.println("Ansettelsesaar:");
                    int ansettelsesaar = Integer.parseInt(S.nextLine());
                    System.out.println("Maanedslønn:");
                    double maanedslønn = Double.parseDouble(S.nextLine());
                    System.out.println("Skatteprosent:");
                    double skatteprosent = Double.parseDouble(S.nextLine());
                    Person p = new Person(fornavn, etternavn, fødselsaar);
                    
                    a.setPersonalia(p);
                    a.setArbtakernr(arbtakernr);
                    a.setAnsettelsesaar(ansettelsesaar);
                    a.setMaanedslønn(maanedslønn);
                    a.setSkatteprosent(skatteprosent);
                    break;
                case 2:
                    System.out.println("Endre paa en ArbTaker:");
                    System.out.println("Hva vil du endre paa?");
                    System.out.println("1: ArbTakernr");
                    System.out.println("2: Skatteprosent");
                    System.out.println("3: Maanedslønn");

                    int valg2 = Integer.parseInt(S.nextLine());
                    switch (valg2) {
                        case 1:
                            System.out.println("Ny ArbTakernr:");
                            a.setArbtakernr(Integer.parseInt(S.nextLine()));
                            break;
                        case 2:
                            System.out.println("Ny Skatteprosent:");
                            a.setSkatteprosent(Double.parseDouble(S.nextLine()));
                            break;
                        case 3:
                            System.out.println("Ny Maanedslønn:");
                            a.setMaanedslønn(Double.parseDouble(S.nextLine()));
                            break;
                        default:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("ArbTaker Detaljer:");
                    System.out.println("Navn: " + a.getFulltNavn());
                    System.out.println("Fødselsaar: " + a.getPersonalia().getFødselsaar());
                    System.out.println("Alder: " + a.getAlder());
                    System.out.println("Arbtakernr: " + a.getArbtakernr());
                    System.out.println("Ansettelsesaar: " + a.getAnsettelsesaar());
                    System.out.println("Ansatt i: " + a.getAnsattaar() + " aar");
                    System.out.println("Maanedslønn: " + a.getMaanedslønn());
                    System.out.println("Bruttolønn: " + a.BruttoLønn());
                    System.out.println("Skatt per maaned: " + a.SkattperMaaned());
                    System.out.println("Skatt per aar: " + a.Skattperaar());
                    System.out.println("Er senior (Ansatt i mer enn 10 aar): " + a.isSenior());

                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }
        }
        S.close();
    }



    public static class Person{
        String fornavn = "";
        String etternavn = "";
        int fødselsaar = 0;

        public Person(String fornavn, String etternavn, int fødselsaar){
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.fødselsaar = fødselsaar;
        }


        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }
        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }
        public void setFødselsaar(int fødselsaar) {
            this.fødselsaar = fødselsaar;
        }



        public String getEtternavn() {
            return etternavn;
        }
        public String getFornavn() {
            return fornavn;
        }
        public int getFødselsaar() {
            return fødselsaar;
        }

    }
    public static class ArbTaker{
        private Person personalia;
        private int arbtakernr = 0;
        private int ansettelsesaar = 0;
        private double maanedslønn = 0;
        private double skatteprosent = 0;

        public void setAnsettelsesaar(int ansettelsesaar) {
            this.ansettelsesaar = ansettelsesaar;
        }
        public void setArbtakernr(int arbtakernr) {
            this.arbtakernr = arbtakernr;
        }
        public void setMaanedslønn(double maanedslønn) {
            this.maanedslønn = maanedslønn;
        }
        public void setPersonalia(Person personalia) {
            this.personalia = personalia;
        }
        public void setSkatteprosent(double skatteprosent) {
            this.skatteprosent = skatteprosent;
        }
        public int getAnsettelsesaar() {
            return ansettelsesaar;
        }
        public int getArbtakernr() {
            return arbtakernr;
        }
        public double getMaanedslønn() {
            return maanedslønn;
        }
        public Person getPersonalia() {
            return personalia;
        }
        public double getSkatteprosent() {
            return skatteprosent;
        }
        public int SkattperMaaned(){
            return (int) (maanedslønn * (skatteprosent/100));
            
        }
        public int Skattperaar(){
            return (int) (maanedslønn * (skatteprosent/100) * 10.5);
        }
        public int BruttoLønn(){
            return (int) (maanedslønn * 10.5);
        }
        public String getFulltNavn(){
            return personalia.getFornavn() + ", " + personalia.getEtternavn();
        }
        public int getAnsattaar(){
            java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
            int year = cal.get(java.util.Calendar.YEAR);
            return year - ansettelsesaar;
        }
        public int getAlder(){
            java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
            int year = cal.get(java.util.Calendar.YEAR);
            return year - personalia.getFødselsaar();
        }
        public Boolean isSenior(){
            return (getAnsattaar() > 10)?true:false;
        }
    }

}
