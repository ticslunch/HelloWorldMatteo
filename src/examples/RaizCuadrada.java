package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class RaizCuadrada {
    public static void main(String[] args){
        
        Double respuesta, num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = scanner.nextDouble();
        
        respuesta = Math.pow(num, .5);
        System.out.println("La raiz cuadrada es: " + respuesta);
        
    }
}
