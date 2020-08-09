import java.util.Scanner;
public class drawTriangle{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of line: ");
        int iNumber = keyboard.nextInt();
        int k =0;
        /*for(int i = 0; i < iNumber; i++){
            for(int j =0; j<=i ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //System.out.println("Number: "+ iNumber);
        for(int i = 1; i <= iNumber; ++i, k = 0) {
            for(int space = 1; space <= iNumber - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}