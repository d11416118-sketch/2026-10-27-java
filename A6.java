public class A6 {
    public static void main(String[] args) {
        double [][] a1 ={
                    {9,12,67},
                    {1,87},
                    {23,24,487,55,63},
        };
        double max = a1[0][0];
        for(int i=0 ; i<a1.length ; i++)
        {
            for(int j=0 ; j<a1[i].length ; j++)
            {
                if(a1[i][j]>max){
                    max=a1[i][j];
                }
            }
            System.out.println();
        }
        System.out.printf("max=%.2f",max);

        System.out.println("\n for each");
        max=a1[0][0];
        for(double[] y:a1)
        {
            for(double z:y){
                if(z>max){
                    max=z;
                }
            }
        }    
        System.out.printf("max=%.2f",max);

    }
}
