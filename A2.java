public class A2 {
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
       print(a);

    }
    public static void print(int[][] x) {
        
        for(int i=0 ; i<x.length ; i++)
        {
            for(int j=0 ; j<x[2].length ; j++)
            {
                System.out.printf("a[%d][%d]=%d",i,j,x[i][j]);
            }
            System.out.println();
        }

    }
}
