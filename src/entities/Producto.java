
package entities;

/**
 *
 * @author Shostakovic
 */
public class Producto {

    private static final Double PORCENTAJE_IVA = 0.12;
    
    private int id;
    private int id_proveedor;
    private int id_categoria;
    private String nombre;
    private String descripcion;
    private Double precio_costo;
    private Double precio_venta;
    private Double margen;
    private int stock_minimo;
    private int stock_actual;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(Double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Double getMargen() {
        return margen;
    }

    public void setMargen(Double margen) {
        this.margen = margen;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }
    
    public Double getIVA(){
        return precio_venta * PORCENTAJE_IVA;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", id_proveedor=" + id_proveedor + ", id_categoria=" + id_categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio_costo=" + precio_costo + ", precio_venta=" + precio_venta + ", margen=" + margen + ", stock_minimo=" + stock_minimo + ", stock_actual=" + stock_actual + '}';
    }
    
    
    
}
