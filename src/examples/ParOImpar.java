package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class ParOImpar {
    
    public static void main(String args[]){
        int num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = scanner.nextInt();
        
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
}
