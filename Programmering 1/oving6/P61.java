public class P61 {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int tall = r.nextInt(10);
        int[] antall = new int[10];

        int iterasjon = 1000;

        for (int i = 0; i < iterasjon; i++) {
            antall[tall]++;
            tall = r.nextInt(10);
        }
        for (int x = 0; x < antall.length; x++) {
            System.out.println(x +" "+ antall[x] +" " +"*".repeat((int)Math.round(antall[x]/10)));
        }
    }
}
