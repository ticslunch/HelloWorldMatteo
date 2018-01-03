package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class CambiarDeSigno {
    
    public static void main(String[] args){
        
        int num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = scanner.nextInt();
        
        num = num * (-1);
        System.out.println(num);
                 
    }
    
    
}
