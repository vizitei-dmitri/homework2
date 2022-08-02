import java.util.Arrays;
import java.util.Scanner;

public class home1 {
    public static void main(String[] arg){
        System.out.println("Введите число a и b" );
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        if (a==b) {
            System.out.println("a=b");
        } else if (a>b) {
            System.out.println("a>b");
        } else if (a<b) {
            System.out.println("a<b");
        }


    }
}