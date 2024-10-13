import java.util.Arrays;
import java.util.Scanner;

public class P63 {
    public static void main(String[] args) {
        System.out.println("Hei velkommen til Matriseregning \n Skriv inn størrelsen på matrisen her: Først Rader, så Kolonner.");
        Scanner S = new Scanner(System.in);
        int A = Integer.parseInt(S.nextLine());
        int B = Integer.parseInt(S.nextLine());
        Matrise M1 = new Matrise(A, B, S);
        M1.print2D();
        
        System.out.println("Ny matrise samme greie:");
        int C = Integer.parseInt(S.nextLine());
        int D = Integer.parseInt(S.nextLine());
        Matrise M2 = new Matrise(C, D, S);
        M2.print2D();

        System.out.println("Addering av disse 2:");
        Matrise M3 = M1.Addisjon(M2);
        M3.print2D();

        System.out.println("Multiplisering av disse 2:");
        Matrise M4 = M1.Multiplikasjon(M2);
        M4.print2D();
        
        System.out.println("Transponering av første matrise");
        Matrise M5 = M1.Transponer();
        M5.print2D();
    }

    public static class Matrise{
        private double[][] m;
        private int rows;
        private int columns;
        Scanner S;

        public Matrise(int rowsA, int colsA, Scanner s){
            rows = rowsA;
            columns = colsA;
            S = s;
            m = new double[rows][columns];

            double a = 0;

            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    System.out.println("Tast inn verdien til ["+i+"]["+j+"]:");
                    a = Integer.parseInt(S.nextLine());
                    m[i][j] = a;
                }
            }
        
        }
        public Matrise(int rowsA, int colsA, Scanner s, int AA){
            rows = rowsA;
            columns = colsA;
            S = s;
            m = new double[rows][columns];

            double a = 0;

            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    m[i][j] = a;
                }
            }
        
        }
        public Matrise(double[][] A){
            m = A;
            rows = m.length;
            columns = m[0].length;
        }
        public double[][] getMatrise(){
            return m;
        }
        public int getRows(){
            return rows;
        }
        public int getColumns(){
            return columns;
        }
        public double getElement(int i, int j){
            return m[i][j];
        }
        public void setElement(int i, int j, double a){
            m[i][j] = a;
            
        }


        public Matrise Addisjon(Matrise A) {
            Matrise B = new Matrise(A.getRows(), A.getColumns(), S, 1);
            double value;
        
            if(this.getRows() == A.getRows() && this.getColumns() == A.getColumns())
                {
                    for(int i = 0; i < this.getRows(); i++)
                        {
                            for(int j = 0; j < this.getColumns(); j++)
                            {
                                value = this.getElement(i,j) + A.getElement(i,j);
                                B.setElement(i, j, value);
                            }
                        }
                    return B;
                }
            return null;
        }
        public Matrise Multiplikasjon(Matrise A) {
            Matrise B = new Matrise(this.getRows(), A.getColumns(),S, 1 );
            double value;
        
            if(this.getColumns() == A.getRows())
                {
                    for(int i = 0; i < this.getRows(); i++)
                        {
                            for(int j = 0; j < A.getColumns(); j++)
                                {
                                    double sum = 0;
                                    for(int k = 0; k < this.getRows(); k++)
                                        {
                                            sum += this.getElement(i,k) * A.getElement(k,j);
                                            
                                        }
                                    value = sum;
                                    B.setElement(i, j, value);
                                }
                        }
                    return B;
                }
            return null;
        }
        public Matrise Transponer() {
            double[][] temp = new double[m[0].length][m.length];
            for (int i = 0; i < m.length; i++)
                for (int j = 0; j < m[0].length; j++)
                    temp[j][i] = m[i][j];
            return new Matrise(temp);
            
        }
        public void print2D()
        {
            // Loop through all rows
            for (double[] row : m)
    
                // converting each row as string
                // and then printing in a separate line
                System.out.println(Arrays.toString(row));
        }
    }
}
