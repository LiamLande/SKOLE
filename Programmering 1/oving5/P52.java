public class P52 {
    public static void main(String[] args) {
        System.out.println(TilfeldigGen.getHeltall(1100,1200));
    }

    public static class TilfeldigGen {
        private static java.util.Random r = new java.util.Random();

        public static int getHeltall(int nedre, int ovre){
            return r.nextInt(nedre, ovre);
        }
        public static double getDouble(double nedre, double ovre){
            return r.nextDouble(nedre, ovre);
        }

    }
}
