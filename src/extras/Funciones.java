package extras;

/**
 *
 * @author Shostakovic
 */
public class Funciones {

    public int suma(int a, int b) {
        return a + b;
    }
    
    public String getNombreCompleto(String nombre, String apellido){
        return "Hola " + nombre + " " + apellido + "! Bienvenido(a)";
    }
    
    public boolean getMayorOMenor(int edad){
       
        if(edad > 17){
            return true;
        }else{
            return false;
        }
    }
    
    public Double getIGSS(Double sueldo){
        return sueldo * 0.0483;
    }
    
    public void miFuncion(){
        System.out.println("HOLA Y ADIOS");
    }
    
}
