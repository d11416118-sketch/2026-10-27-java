public class A7 {
     public static void main(String[] args) {
        double [][][] a ={
                    {
                        {9,12,67},
                        {1,87},
                        {23,24,487,55,63},
                    },
                    {
                        {2412,124,674},
                        {142,87},
                        {234,2442,487,455,263},
                    }
        };
        double max = a[0][0][0];
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a[i].length ; j++)
            {
                for(int k=0 ; k<a[i][j].length; k++){
                    if(a[i][j][k]>max){
                    max=a[i][j][k];
                }
                }
            }
            System.out.println();
        }
        System.out.printf("max=%.2f",max);

        System.out.println("\n for each");
        max=a[0][0][0];
        for(double[][] y:a)
        {
            for(double[] z:y){
                for(double p:z){
                        if(p>max){
                        max=p;
                    }
                }
            }
        }    
        System.out.printf("max=%.2f",max);

    }
}


