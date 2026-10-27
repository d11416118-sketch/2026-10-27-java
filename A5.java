public class A5 {
    public static void main(String[] args) {
        double[] a0={1,2,3,4,5,6};
        for(int i=0 ; i<a0.length ; i++){
            System.out.printf("a0[%d]-%.2f  ",i,a0[i]);
        }
        System.out.println("\n for each");
        for(double x:a0){
            System.out.printf("%.2f ",x);
        }


        System.out.println("\n ####################################");
        double [][] a1 ={
                    {9,12,67},
                    {1,87},
                    {23,254,487,55,63},
        };
        
        
        for(int i=0 ; i<a1.length ; i++)
        {
            for(int j=0 ; j<a1[i].length ; j++)
            {
                System.out.printf("a1[%d][%d]=%.2f     ",i,j,a1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n for each");
        for(double[] y:a1)
        {
            for(double z:y){
                System.out.printf("%.2f", z);
            }
        }    
        
    }
}
