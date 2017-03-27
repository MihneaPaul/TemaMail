/**
 * Created by Mihnea on 27.03.2017.
 */
//- se citeste un numar gen 1980. sa verificati daca este un an bisect . cautati pe google ce inseamna an bisect
import java.util.Scanner;
public class exercitiu5 {
    public static void main(String[] args) {
        System.out.println("Please enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("Anul " + year + " este un an bisect.");
        } else {
            System.out.println("Anul " + year + " nu este un a bisect.");
        }
    }
}
