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
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "Eroare.";


            }
            System.out.println(monthString);
//            } else x = false;
//            System.out.println(monthString);
        }
    }



