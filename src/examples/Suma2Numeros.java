package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class Suma2Numeros {

    public static void main(String[] args) {

        try {
            int a, b, suma;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese a:");
            a = scanner.nextInt();

            System.out.println("Ingrese b:");
            b = scanner.nextInt();

            suma = a + b;
            System.out.println("La suma de " + a + " y " + b + " es " + suma);
        } 
        
        catch (InputMismatchException e) {  
            System.out.println("Has ingresado un valor erroneo!");
        }

    }

}
