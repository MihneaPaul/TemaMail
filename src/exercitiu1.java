/**
 * Created by Mihnea on 27.03.2017.
 */
import java.util.Scanner;
public class exercitiu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();
        if(a>b) {
            System.out.println("Numarul cel mai mare dintre cele introduse este: "+a+".");
        }
        else {
            System.out.println("Numarul cel mai mare dintre cele introduse este: "+b+".");
        }
    }
}
