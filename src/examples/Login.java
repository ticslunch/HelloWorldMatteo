package examples;

import java.util.Scanner;

/**
 *
 * @author Shostakovic
 */
public class Login {
    
    public static void main(String[] args){
        
        String usuario, contraseña;
        Scanner scanner = new Scanner(System.in);
              
        System.out.println("Ingrese su usuario");
        usuario = scanner.nextLine();
        
        System.out.println("Ingrese su contraseña");
        contraseña = scanner.nextLine();
        
        if(usuario.equals("admin") && contraseña.equals("abc123")){
            System.out.println("Bienvenido :)");
        }
        
        else{
            System.out.println("Usuario o contraseña no validos, intente nuevamente");
        }
    }
    
}
