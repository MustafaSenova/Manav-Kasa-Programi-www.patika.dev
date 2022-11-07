import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Armut = 2.14, Elma = 3.67 , Domates = 1.11 , Muz = 0.95 , Patlican = 5.00 , tutar ;

        System.out.println("Armut kac kilo ? : ");
        double a = input.nextDouble();

        System.out.println("Elma kac kilo ? : ");
        double e = input.nextDouble();

        System.out.println("Domates kac kilo ? : ");
        double d = input.nextDouble();

        System.out.println("Muz kac kilo ? : ");
        double m = input.nextDouble();

        System.out.println("Patlican kac kilo ? : ");
        double p = input.nextDouble();

        tutar = (a * Armut) + (e * Elma) + (d * Domates) + (m * Muz) + (p * Patlican);

        System.out.println("Toplam Tutar : " + tutar + "TL");

    }

}
