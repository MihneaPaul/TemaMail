/**
 * Created by Mihnea on 27.03.2017.
 */
//tabel conversie lbs to kg.
    import java.util.Scanner;
public class exercitiu10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima valoare in lbs: ");
        double lbsx = scanner.nextDouble();
        System.out.println("Introduceti a doua valoare in lbs: ");
        double lbsy = scanner.nextDouble();
        for(double j=lbsx;j<=lbsy;j++) {
            System.out.println(j+ " lbs is "+ j/2.20462262185 + " kg.");
        }
    }
}
