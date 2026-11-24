public class A2 {
    /**
     * 主程式：建立 3×4 二維陣列並設定 a[2][1]=4，交給 print() 印出。
     */
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[2][1]=4;
       print(a);

    }
    /**
     * 用巢狀迴圈印出二維陣列的所有元素，每列換行。
     * （內層用 x[2].length 當長度，只適用每列一樣長的陣列。）
     */
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
