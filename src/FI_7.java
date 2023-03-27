import java.util.Scanner;

public class FI_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesete dolzina na strana a: ");
        double a = scanner.nextDouble();

        System.out.print("Vnesete dolzina na strana b: ");
        double b = scanner.nextDouble();

        System.out.print("Vnesete dolzina na strana c: ");
        double c = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = a + b + c;

        // Calculate the semi-perimeter of the triangle
        double s = perimeter / 2;
        

        System.out.println("Perimeter na triagolnikot: " + perimeter);
       
    }
}
