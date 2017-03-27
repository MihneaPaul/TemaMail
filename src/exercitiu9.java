/**
 * Created by Mihnea on 27.03.2017.
 */
//lbs to kg. 1kg =  2.20462262185 lbs
    import java.util.Scanner;
public class exercitiu9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lbs: ");
        double lbs = scanner.nextDouble();
        System.out.println(lbs+ " lbs is "+ lbs/2.20462262185 + " kg.");
    }
}
