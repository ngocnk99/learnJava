public class addTwoMatices{

    public static void main(String[] args){
        int matrix1[][] = { {1, 3, 5}, {2, 4, 6} };
        int matrix2[][] = { {7, 8, 9}, {10, 12, 12} };
        int matrix0[][] = new int[matrix1.length][matrix1[0].length];

        if(compareSizeMatrices(matrix1,matrix2) == 0) System.out.println("The size is not equal");
        else {
            addMatrix(matrix0, matrix1, matrix2);
            
            for (int i = 0 ; i < matrix0.length; ++i) {
                for(int j = 0; j < matrix0[i].length; ++j) {
                  System.out.print(matrix0[i][j]);
                  System.out.print("\t");
                }
                
                System.out.print("\n");
              }
        }
    }

    public static int compareSizeMatrices(int matrix1[][], int matrix2[][]){
        if(matrix1.length!=matrix2.length) return 0;
        else{
            for(int i = 0; i < matrix1.length; i++){
                if(matrix1[i].length!=matrix2[i].length) return 0;
            }
        }

        return 1;
    }

    public static void addMatrix(int matrix0[][], int matrix1[][], int matrix2[][]){
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix0[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
    }
}