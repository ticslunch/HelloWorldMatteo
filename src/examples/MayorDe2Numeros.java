package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class MayorDe2Numeros {
    
    public static void main(String[] args){
        
        int num1, num2;
        Scanner manzana = new Scanner(System.in);
                
        System.out.println("Ingrese un numero:");
        num1 = manzana.nextInt();
        
        System.out.println("Ingrese otro numero:");
        num2 = manzana.nextInt();
        
        if(num1>num2){
            System.out.println("El mayor es " + num1);
            System.out.println("El menor es " + num2);
        }else{
            System.out.println("El mayor es " + num2);
            System.out.println("El menor es " + num1);
        }
    }
    
}
