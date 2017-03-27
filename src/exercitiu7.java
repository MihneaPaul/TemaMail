/**
 * Created by Mihnea on 27.03.2017.
 */
//se citesc doua numere. sa se afiseze tabla inmultirii de la 0 la 10 incepand cu primul numar pana la al doilea …
// gen daca citim 1 si 7 sa se afiseze tabla inmultirii de la 0 la 10 pentru 1 2 3 4 5 6 si 7
    import java.util.Scanner;
public class exercitiu7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println("Tabla inmultirii de la 0 la 10 pentru numarul " + i + " este ");
            System.out.println("");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
