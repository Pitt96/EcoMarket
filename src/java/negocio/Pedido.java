
package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pitt
 */
public class Pedido {
    private String num;
    private LocalDate fecha;
    private Estados estado;
    private Cliente cliente;
    private Empleado empleado;
    private final double igv=0.18;
    private List lineasPedidos = new ArrayList();
    
    public enum Estados{
        RECEPCIONADO,GESTIONADO,ENVIADO,RECIBIDO
    }

    public Pedido() {
    }

    public Pedido(String num, LocalDate fecha, Estados estado, Cliente cliente, Empleado empleado) {
        this.num = num;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List getLineasPedidos() {
        return lineasPedidos;
    }

    public void setLineasPedidos(List lineasPedidos) {
        this.lineasPedidos = lineasPedidos;
    }
    
    //metodos de operaciones
    public double subTotal(){
        double subTotal=0;
        for (int i = 0; i < lineasPedidos.size(); i++) {
            Linea lin=(Linea)lineasPedidos.get(i);
            subTotal+=lin.getImp();
        }
        return subTotal;
    }
    
    public void addLinea(Producto producto,int cant){
        Linea linea = new Linea(cant, producto);
        lineasPedidos.add(linea);
    }
    
    public void deleteLine(String cod){
        lineasPedidos.remove(buscarCod(cod));
    }
    public int buscarCod(String cod){
        int indiceBuscado = -1;
        for (int i = 0; i < lineasPedidos.size(); i++) {
            Linea lin=(Linea)lineasPedidos.get(i);
            if(lin.getProducto().getCodigo().equals(cod)){
                indiceBuscado = i;
                break;
            }
        }
        return indiceBuscado;
    }
    
    public double getIGV(){
        return subTotal()*igv;
    }
    
    public double getTotal(){
        return subTotal()+getIGV();
    }
}
