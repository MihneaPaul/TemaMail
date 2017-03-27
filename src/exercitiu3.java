/**
 * Created by Mihnea on 27.03.2017.
 */
import java.util.Scanner;
public class exercitiu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0;
        int max=0;
        do {
            System.out.println("Enter a number: ");
            x = scanner.nextInt();
            if(x>max){
                max=x;
            }
        }
        while(x != 0);
        System.out.println("Numarul cel mai mare este: "+max);
    }
}
