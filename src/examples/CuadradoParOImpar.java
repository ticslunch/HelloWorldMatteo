package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class CuadradoParOImpar {
    
    public static void main(String[] args){
        
        int num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = scanner.nextInt();
        
        //num = num * num;
        num = (int) Math.pow(num, 2);
        
        if(num%2==0){
            System.out.println("El cuadrado es " + num + " y es par"); 
        }else{
            System.out.println("El cuadrado es " + num + " y es impar"); 
        }
    }
    
}
