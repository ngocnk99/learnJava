//import java.util.Scanner;

public class arrangeArray{
    public static void main(String[] args){
        //Scanner keyboard = new Scanner(System.in);
        
        //final int MAX = 5;
        int[] array={30,7,12,1999};
        int mid, sum;
        float agv;

        sum = 0;

        for(int i = 0; i< array.length-1; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    mid = array[j+1];
                    array[j+1] = array[j];
                    array[j] = mid;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("----------------");

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
            
        }

        agv = sum/array.length;

        System.out.println("Summary of array is:" +sum);
        System.out.println("----------------");
        System.out.println("Summary of array is:" +agv);

    }
}