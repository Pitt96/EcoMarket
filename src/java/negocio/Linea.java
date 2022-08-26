
package negocio;

/**
 *
 * @author Pitt
 */
public class Linea {
    private int cant;
    private Producto producto;

    public Linea() {
    }

    public Linea(int cant, Producto producto) {
        this.cant = cant;
        this.producto = producto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    //metodos 
    public double getImp(){
        double imp=producto.getPrecio()*cant;
        return imp;
    }
}
