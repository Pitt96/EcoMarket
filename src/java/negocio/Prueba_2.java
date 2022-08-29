package negocio;

/**
 *
 * @author Pitt
 */
public class Prueba_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="",categoria="";
        int indice=0;
        CategoriaProducto c = new CategoriaProducto("0001CAT", "Bebida", "Refresco para el verano");
        CategoriaProducto c1 = new CategoriaProducto("0002CAT", "Cereales", "Para ser mas fuerte");
        CategoriaProducto c2 = new CategoriaProducto("0003CAT", "Lacteos", "Los lácteos son productos altamente perecederos que deben mantener rigurosamente la cadena de frío.");
        Producto p = new Producto("0001PRO", "Gaseosa",3.5, 20, c);
        Producto p1 = new Producto("0002PRO", "Arroz",4.2, 80, c1);
        Producto p2 = new Producto("0003PRO", "Queso",15.5, 30, c2);
        Pedido pe = new Pedido();
        
        pe.addLinea(p, 6);
        pe.addLinea(p1, 8);
        pe.addLinea(p2, 3);
        
        indice=pe.buscarCod("0001PRO");
        Linea lin=(Linea) pe.getLineasPedidos().get(indice);
        nombre=lin.getProducto().getNombre();
        categoria=lin.getProducto().getCategoria().getNombre();
        System.out.println("******************************************************");
        System.out.println("Nombre : "+nombre);
        System.out.println("Categoria : "+categoria);
        System.out.println("Cantidad : "+lin.getCant());
        System.out.println("Precio Unitario : S/."+lin.getProducto().getPrecio());
        System.out.println("Costo : S/."+lin.getImp());
        
        indice=pe.buscarCod("0002PRO");
        Linea lin1=(Linea) pe.getLineasPedidos().get(indice);
        nombre=lin1.getProducto().getNombre();
        categoria=lin1.getProducto().getCategoria().getNombre();
        System.out.println("******************************************************");
        System.out.println("Nombre : "+nombre);
        System.out.println("Categoria : "+categoria);
        System.out.println("Cantidad : "+lin1.getCant());
        System.out.println("Precio Unitario : S/."+lin1.getProducto().getPrecio());
        System.out.println("Costo : S/."+lin1.getImp());
        
        indice=pe.buscarCod("0003PRO");
        Linea lin2=(Linea) pe.getLineasPedidos().get(indice);
        nombre=lin2.getProducto().getNombre();
        categoria=lin2.getProducto().getCategoria().getNombre();
        System.out.println("******************************************************");
        System.out.println("Nombre : "+nombre);
        System.out.println("Categoria : "+categoria);
        System.out.println("Cantidad : "+lin2.getCant());
        System.out.println("Precio Unitario : S/."+lin2.getProducto().getPrecio());
        System.out.println("Costo : S/."+lin2.getImp());
        
        System.out.println("*******************************************************");
        System.out.println("Subtotal de las ventas : S/."+pe.subTotal());
        System.out.println("IGV : S/."+pe.getIGV());
        System.out.println("Total : S/."+pe.getTotal());
        
        
        /*Eliminar una linea*/
        pe.deleteLine("0002PRO");
        System.out.println("*******************************************************");
        System.out.println("Elimino un producto");
        System.out.println("*******************************************************");
        System.out.println("Subtotal de las ventas : S/."+pe.subTotal());
        System.out.println("IGV : S/."+pe.getIGV());
        System.out.println("Total : S/."+pe.getTotal());
        
    }

}
