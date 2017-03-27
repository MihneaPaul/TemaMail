/**
 * Created by Mihnea on 27.03.2017.
 */
//se citeste inaltimea, greutatea si gender-ul uneri persoane.
// sa se calculeze indicele de masa corporala (BMI) pentru acea persoana
// si in functie de valoare sa se spuna daca acea persoana e obeza, normala, schija sau altele .
// gasiti pe net formula pt BMI. ge ex bmi calculator , bmi calculator formula
    import java.util.Scanner;
public class exercitiu8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you weight (in kg): ");
        double mass = scanner.nextDouble();
        System.out.println("Enter you height (in meters): ");
        double h = scanner.nextDouble();
//        System.out.println("Please enter your gender: ");
//        boolean gender = true;
        double BMI = mass/(h*h)*10000; //*10.000 pentru ca heigth se scrie in cm. Daca scria 1,75 in loc de 175, se putea fara *10.000
        System.out.println("Your BMI is "+ BMI);
        if(BMI>=18.5 && BMI <=24.9){
            System.out.println("You are healthy!");
        }
        if(BMI<18.5)
            System.out.println("You are underweight! Please eat more.");
        if(BMI>24.9 && BMI <=29.9)
            System.out.println("You are overweight.");
        if(BMI>29.9 && BMI <39.9)
            System.out.println("You are obese. Please eat less.");
        if(BMI>=39.9)
            System.out.println("Heart attack from fat in 3...2...1...");
    }
}
