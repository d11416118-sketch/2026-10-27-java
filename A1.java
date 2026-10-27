public class A1 {
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a[2].length ; j++)
            {
                System.out.printf("a[%d][%d]=%d",i,j,a[i][j]);
            }
            System.out.println();
        }
    }
}
