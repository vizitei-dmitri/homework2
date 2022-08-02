import java.util.Arrays;
import java.util.Scanner;

public class home2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("это 0дин");
                break;
            case 2:
                System.out.println("это два");
                break;
            case 3:
                System.out.println("а это три");
                break;
            case 4:
                System.out.println("а вот это четыре");
                break;
            case 5:
                System.out.println("5 (пять)");
                break;
            default:
                System.out.println("нет");
        }
    }
}
