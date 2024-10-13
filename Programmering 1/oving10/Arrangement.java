/**
 * Arrangement
 */
public class Arrangement {

    private int ArrangementID;
    private String Name;
    private String Host;
    private String Location;
    private String Type;
    private long Time;

    public Arrangement(int ID, String name, String host, String location, String type, long time2){
        this.ArrangementID = ID;
        this.Name = name;
        this.Host = host;
        this.Location = location;
        this.Type = type;
        this.Time = time2;
    }
    public int getID() {
        return ArrangementID;
    }
    public long getTime() {
        return Time;
    }
    public String getName() {
        return Name;
    }
    public String getHost() {
        return Host;
    }
    public String getLocation() {
        return Location;
    }
    public String getType() {
        return Type;
    }



    public void printUt() {
        System.out.println("-------");
        System.out.println(this.getTime());
        System.out.println("Arrangement: "+this.getID());
        System.out.println("\""+this.getName()+"\""+" arrangert av "+this.getHost()+" på "+ this.getLocation());
        System.out.println("Type: "+this.getType());
        System.out.println("-------");
    }

}

