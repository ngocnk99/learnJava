import java.util.Scanner;

public class displayNumberOfMonth{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int month, year;
        
        do{
            System.out.println("Enter month: ");
            month = keyboard.nextInt();
        } while(month >12 || month <1);
        
        System.out.println("Enter year: ");
        year = keyboard.nextInt();


        System.out.println("------------------------");

        switch(month){
            case 1 : System.out.println("31"); break;
            case 2 : {
                if(year%4==0){
                    System.out.println("29");
                }else System.out.println("28");
                }
            case 4 : System.out.println("30"); break;
            case 5 : System.out.println("31"); break;
            case 6 : System.out.println("30"); break;
            case 7 : System.out.println("31"); break;
            case 8 : System.out.println("31"); break;
            case 9 : System.out.println("30"); break;
            case 10 : System.out.println("31"); break;
            case 11 : System.out.println("30"); break;
            case 12 : System.out.println("31"); break;

        }
        
    }
}