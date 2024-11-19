import java.util.ArrayList;
public class PropReg {
    ArrayList<Prop> propList;
    public PropReg(){
        propList = new ArrayList<Prop>();
    }
    public void addProp(Prop p){
        propList.add(p);
    }
    public void printProps(){
        for (Prop prop : propList) {
            System.out.println(prop.toString());
        }
    }
    public void findProps(int municipalityNumber, int lotNr, int sectionNr){
        for (Prop prop : propList) {
            if (prop.getMunicipalityNumber() == municipalityNumber && prop.getLotNr() == lotNr && prop.getSectionNr() == sectionNr) {
                System.out.println(prop.toString());
            }
        }
    }
    public void avgArea(){
        double sum = 0;
        for (Prop prop : propList) {
            sum += prop.getArea();
        }
        System.out.println("Gjennomsnittlig areal: "+sum/propList.size());
    }

}
