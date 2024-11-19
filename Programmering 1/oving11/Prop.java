public class Prop {
    private int municipalityNumber;
    private String municipality;
    private int lotNr;
    private int sectionNr;
    private String name;
    private double area;
    private String ownerName;

    public Prop(String municipality, int municipalityNumber, int lotNr, int sectionNr, String name, double area, String ownerName) {
        try {
            if (municipalityNumber < 101 || municipalityNumber > 5054) {
                throw new IllegalArgumentException("Kommunenummeret må være mellom 101 og 5054");
            }
            if (lotNr < 0) {
                throw new IllegalArgumentException("Gårdsnummeret kan ikke være negativt");
            }
            if (sectionNr < 0) {
                throw new IllegalArgumentException("Bruksnummeret kan ikke være negativt");
            }
            if (area < 0) {
                throw new IllegalArgumentException("Arealet kan ikke være negativt");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.municipalityNumber = municipalityNumber;
        this.municipality = municipality;
        this.lotNr = lotNr;
        this.sectionNr = sectionNr;
        this.name = name;
        this.area = area;
        this.ownerName = ownerName;
    }
    public double getArea() {
        return area;
    }
    public int getLotNr() {
        return lotNr;
    }
    public String getMunicipality() {
        return municipality;
    }
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }
    public String getName() {
        return name;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public int getSectionNr() {
        return sectionNr;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setLotNr(int lotNr) {
        this.lotNr = lotNr;
    }
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }
    public void setMunicipalityNumber(int municipalityNumber) {
        this.municipalityNumber = municipalityNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setSectionNr(int sectionNr) {
        this.sectionNr = sectionNr;
    }
    @Override
    public String toString() {
        return "Kommune: " + municipality + "Nummer" + municipalityNumber + "-" + lotNr + "/" + sectionNr +  "\nBruksnavn: " + name + "\nAreal: " + area + "\nEier: " + ownerName;
    }

}

// Kommunenummer - et tall fra og med 101 (Halden) til og med 5054 (Indre Fosen) (eng: municipality number)
// Kommunenavn (eng: municipality name)
// Gårdsnummer - ofte forkortet gnr. Et positivt heltall. (eng: lot number)
// Bruksnummer - ofte forkortet bnr. Et positivt heltall. (eng: section number)
// Bruksnavn - et navn på tomta. (eng: name). Ikke alle eiendommer har navn.
// Areal i m2
// . Et positivt desimaltall (eng: area)
// Navn på eier (eng: Name of owner) - kan lagres som en tekststreng