package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class MayorOMenorDeEdad {

    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        edad = scanner.nextInt();
        
        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }

}
