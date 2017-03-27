/**
 * Created by Mihnea on 27.03.2017.
 */
//- se citeste un numar. sa se afiseze tabla inmultirii de la 0 la 10 cu acel numar (am facut in clasa)
import java.util.Scanner;
public class exercitiu6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double nr = scanner.nextDouble();
        System.out.println("Tabla inmultirii de la 0 la 10 cu numarul "+nr+" este:");
        System.out.println("");
        for(int j=0;j<=10;j++) {
            System.out.println(nr+" x "+ j+" = "+ nr*j);
        }
    }
}
