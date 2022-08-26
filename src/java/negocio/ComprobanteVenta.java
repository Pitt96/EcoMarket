
package negocio;

import java.time.LocalDate;

/**
 *
 * @author Pitt
 */
public class ComprobanteVenta {
    private String codigo;
    private LocalDate fecha;
    private Pedido pedido;

    public ComprobanteVenta() {
    }

    public ComprobanteVenta(String codigo, LocalDate fecha, Pedido pedido) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
