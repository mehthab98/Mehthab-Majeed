import java.util.Scanner;


public class SwitchExample {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" choose a number between 1 and 3");
        int num = sc.nextInt();
        switch(num)
        {
            case 1 :
                System.out.println("Month 1 in January");
                break;
            case 2 :
                System.out.println("Month 2 in February");
                break;
            case 3:
                System.out.println("Month 3 in March");
                break;
            default:
                System.out.println( " Please choose a number between 1 and 3");

        }
    }
}
