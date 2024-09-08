public class spiller {
    int totalsum;
    java.util.Random Terning = new java.util.Random();

    public spiller(int startsum){
        totalsum = startsum;

    }
    public int GetSumPoeng(){
        return totalsum;
    }
    public void kastTerningen(){
        totalsum += Terning.nextInt(6)+1;
    }
    public boolean erFerdig(){
        return (totalsum >= 100);
    }
        
}