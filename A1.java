public class A1 {
    /**
     * 建立 3×4 的二維整數陣列，設定 a[2][1]=4，用巢狀迴圈逐列印出所有元素。
     */
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a[i].length ; j++)
            {
                System.out.printf("a[%d][%d]=%d",i,j,a[i][j]);
            }
            System.out.println();
        }
    }
}
