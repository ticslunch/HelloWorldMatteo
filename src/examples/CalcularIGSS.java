package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class CalcularIGSS {

    public static void main(String[] args) {
        Double sueldo, igss;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo:");

        sueldo = scanner.nextDouble();

        igss = sueldo * 0.0483;
        System.out.println("El igss es: " + igss);
    }

}
