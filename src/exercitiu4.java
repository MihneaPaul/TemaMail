/**
 * Created by Mihnea on 27.03.2017.
 */
import java.util.Scanner;
public class exercitiu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean x = true;
        System.out.println("Enter a number from 1 to 12: ");
        int month = scanner.nextInt();
        String monthString;

//        while (5 == 5) {
//            if (1 <= month && month <= 12) {
            switch (month) {
                case 1:
                    monthString = "Ianuarie";
                    break;
                case 2:
                    monthString = "Februarie";
                    break;
                case 3:
                    monthString = "Martie";
                    break;
                case 4:
                    monthString = "Aprilie";
                    break;
                case 5:
                    monthString = "Mai";
                    break;
                case 6:
                    monthString = "Iunie";
                    break;
                case 7:
                    monthString = "Iulie";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "Septembrie";
                    break;
                case 10:
                    monthString = "Octombrie";
                    break;
                case 11:
                    monthString = "Noiembrie";
                    break;
                case 12:
                    monthString = "Decembrie";
                    break;
                default:
                    monthString = "Eroare.";


            }
            System.out.println(monthString);
//            } else x = false;
//            System.out.println(monthString);
        }
    }



