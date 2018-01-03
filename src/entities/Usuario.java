package entities;

/**
 *
 * @author Shostakovic
 */
public class Usuario {
    
    private static final String DEFAULT_USUARIO = "admin";
    private static final String DEFAULT_CONTRASEÑA = "abc123";
    
    private String nombre;
    private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean login(){
        
        if(getNombre().equals(DEFAULT_USUARIO)&& getContraseña().equals(DEFAULT_CONTRASEÑA)){
            return true;
        }else{
            return false;
        }
        
    }
    
}
