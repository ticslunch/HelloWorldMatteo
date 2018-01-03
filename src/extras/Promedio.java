package extras;

/**
 *
 * @author Shostakovic
 */
public class Promedio {
    
    private int ingles;
    private int matematicas;
    private int computacion;

    public int getIngles() {
        return ingles;
    }

    public void setIngles(int ingles) {
        this.ingles = ingles;
    }

    public int getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(int matematicas) {
        this.matematicas = matematicas;
    }

    public int getComputacion() {
        return computacion;
    }

    public void setComputacion(int computacion) {
        this.computacion = computacion;
    }
    
    public int getPromedio(){
        return (ingles+matematicas+computacion)/3;
    }
    
}
