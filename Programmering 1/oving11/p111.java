public class p111 {
    public static void main(String[] args) {
        System.out.println("Welcome to PropRegister!");
        PropReg reg = new PropReg();
        System.out.println("Do you want the test cases added? (y/n)");
        java.util.Scanner S = new java.util.Scanner(System.in);
        if (S.nextLine().equals("y")) {
            reg.addProp(new Prop("Gloppen", 1445, 77, 631,"", 1017.6, "Jens Olsen"));
            reg.addProp(new Prop("Gloppen", 1445, 77, 131,"Syningom", 661.3, "Nicolay Madsen"));
            reg.addProp(new Prop("Gloppen", 1445, 75, 19,"Fugletun", 650.6, "Evilyn Jensen"));
            reg.addProp(new Prop("Gloppen", 1445, 74, 188,"", 1457.2, "Karl Ove Bråten"));
            reg.addProp(new Prop("Gloppen", 1445, 69, 47,"Høiberg", 1339.4, "Elsa Indregård"));
        }
        boolean running = true;
        while (running) {
            System.out.println("1. Add property");
            System.out.println("2. Find property with municipality number, lot number and section number");
            System.out.println("3. Average area of all properties");
            System.out.println("4. Print all properties");
            System.out.println("5. Exit");
            String valg = S.nextLine();
            switch (valg) {
                case "1":
                    System.out.println("Municipality:");
                    String Municipality = S.nextLine();
                    System.out.println("Municipality number:");
                    int MunicipalityNumber = Integer.parseInt(S.nextLine());
                    System.out.println("Lot number:");
                    int LotNumber = Integer.parseInt(S.nextLine());
                    System.out.println("Section number:");
                    int SectionNumber = Integer.parseInt(S.nextLine());
                    System.out.println("Name:");
                    String Name = S.nextLine();
                    System.out.println("Area:");
                    double Area = Double.parseDouble(S.nextLine());
                    System.out.println("Owner:");
                    String Owner = S.nextLine();
                    reg.addProp(new Prop(Municipality, MunicipalityNumber, LotNumber, SectionNumber, Name, Area, Owner));
                    break;
                case "2":
                    System.out.println("Municipality number:");
                    int MunicipalityNumber2 = Integer.parseInt(S.nextLine());
                    System.out.println("Lot number:");
                    int LotNumber2 = Integer.parseInt(S.nextLine());
                    System.out.println("Section number:");
                    int SectionNumber2 = Integer.parseInt(S.nextLine());
                    reg.findProps(MunicipalityNumber2, LotNumber2, SectionNumber2);
                    break;
                case "3":
                    reg.avgArea();
                    break;
                case "4":
                    reg.printProps();
                    break;
                default:
                    running = false;
                    break;
            }
            
        }
        S.close();
        reg.findProps(1445, 77, 631);
        System.out.println("\n\n");
        System.out.println("Average area of all properties:");
        reg.avgArea();

    }
}

// Gloppen 1445 77 631 1017,6 Jens Olsen
// Gloppen 1445 77 131 Syningom 661,3, Nicolay Madsen
// Gloppen 1445 75 19 Fugletun 650,6 Evilyn Jensen
// Gloppen 1445 74 188 1457,2, Karl Ove Bråten
// Gloppen 1445 69 47 Høiberg 1339,4 Elsa Indregård
