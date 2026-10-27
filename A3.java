public class A3 {
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
        for(int i=0 ; i<a.length ; i++)
        {
            print(i,a[i]);
            System.out.println();
        }
        

    }
    public static void print(int i,int[] x) {
        
        
            for(int j=0 ; j<x.length ; j++)
            {
                System.out.printf("a[%d][%d]=%d ",i,j,x[j]);
            }
            //System.out.println();
        

    }
}
