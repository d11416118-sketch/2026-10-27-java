public class A4 {
    /**
     * 建立每列長度不同的不規則二維陣列（jagged array），用巢狀迴圈印出所有元素。
     */
    public static void main(String[] args) {
        int [][] a ={
                    {9,12,67},
                    {1,87},
                    {23,254,487,55,63},
        };
        
        
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a[i].length ; j++)
            {
                System.out.printf("a[%d][%d]=%d     ",i,j,a[i][j]);
            }
            System.out.println();
        }
    }
}
