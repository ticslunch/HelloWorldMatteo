package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class CuboDeUnNumero {
    
    public static void main(String[] args){
        int cubo, a;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        a = scanner.nextInt();
        
        cubo = a * a * a;
        System.out.println("El cubo es: " + cubo);
    }
    
}
