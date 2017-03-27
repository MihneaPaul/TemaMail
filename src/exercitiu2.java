/**
 * Created by Mihnea on 27.03.2017.
 */
import java.util.Scanner;
public class exercitiu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();
        int min = a;
        if (a < b && a < c) {
            System.out.println("Numarul cel mai mic este: " + a);
            if (b < a && b < c) {
                min = b;
                System.out.println("Numarul cel mai mic este: " + min);
            } else
                if(c<a && c<b){
                min = c;
                System.out.println("Numarul cel mai mic este: " + min);


            }
        }
    }
}
