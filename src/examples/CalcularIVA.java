package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class CalcularIVA {

    public static void main(String[] args){
        
        Double precio, iva;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto:");
        precio = scanner.nextDouble();
        
        iva = precio * 0.12;
        System.out.println("El iva del producto es: " + iva);
    }
    
}
