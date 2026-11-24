public class A3 {
    /**
     * 主程式：把二維陣列逐列（a[i] 本身是一維陣列）傳給 print()，每列印完換行。
     */
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
        for(int i=0 ; i<a.length ; i++)
        {
            print(i,a[i]);
            System.out.println();
        }
        

    }
    /**
     * 印出第 i 列（一維陣列 x）的所有元素，格式為 a[i][j]=值。
     */
    public static void print(int i,int[] x) {
        
        
            for(int j=0 ; j<x.length ; j++)
            {
                System.out.printf("a[%d][%d]=%d ",i,j,x[j]);
            }
            //System.out.println();
        

    }
}
