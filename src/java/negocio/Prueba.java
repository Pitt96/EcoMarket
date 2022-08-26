package negocio;

import java.util.Scanner;

/**
 *
 * @author Pitt
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    static int incrementarC = 1;
    static int incrementarP = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ciclo
        boolean ciclo = true;
        int aux=0;
        int procesado=0;
        //variables categoria
        String categoria = "";
        String descripcion = "";
        String codigoC = "";
        //variables producto
        String nombreProducto = "";
        double precio = 0;
        String codigoP = "";

        do {
            System.out.println("***************PEDIDO*********************");
            System.out.println("Escoge una categoria: \n1.-Lacteos\n2.-Bebidas\n3.-Cereales\nEscoge Opcion[1-3]");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    categoria = "Lacteos";
                    descripcion = "Los lácteos son productos altamente perecederos que deben mantener rigurosamente la cadena de frío.";
                    codigoC = generarCodigo(incrementarC);
                    incrementarC++;
                    System.out.println("Escoge un producto: \n1.-Leche\n2.-Queso\n3.-Yogurt\nEscoge Opcion[1-3]");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Leche";
                            precio = 4.8;
                            break;
                        case 2:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Queso";
                            precio = 10;
                            break;
                        case 3:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Yogurt";
                            precio = 16;
                            break;
                    }
                    break;
                case 2:
                    categoria = "Bebidas";
                    descripcion = "Los lácteos son productos altamente perecederos que deben mantener rigurosamente la cadena de frío.";
                    codigoC = generarCodigo(incrementarC);
                    incrementarC++;
                    System.out.println("Escoge un producto: \n1.-Alcohol\n2.-Frugos\n3.-Gaseosa\nEscoge Opcion[1-3]");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Alcohol";
                            precio = 22.50;
                            break;
                        case 2:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Frugos";
                            precio = 2.5;
                            break;
                        case 3:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Gaseosa";
                            precio = 3.5;
                            break;
                    }
                    break;
                case 3:
                    categoria = "Cereales";
                    descripcion = "Los lácteos son productos altamente perecederos que deben mantener rigurosamente la cadena de frío.";
                    codigoC = generarCodigo(incrementarC);
                    incrementarC++;
                    System.out.println("Escoge un producto: \n1.-Arroz\n2.-Quinua\n3.-Avena\nEscoge Opcion[1-3]");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Arroz";
                            precio = 3.5;
                            break;
                        case 2:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Quinua";
                            precio = 8.6;
                            break;
                        case 3:
                            codigoP = generarCodigo(incrementarP);
                            incrementarP++;
                            nombreProducto = "Avena";
                            precio = 2.3;
                            break;
                    }
                    break;
            }
            CategoriaProducto c = new CategoriaProducto(codigoC, categoria, descripcion);

            Producto p = new Producto(codigoP, nombreProducto, precio, 20, c);

            Pedido pe = new Pedido();

            pe.addLinea(p, 6);
            System.out.println("*********************************************");
            System.out.println("Producto : " + p.getNombre());
            System.out.println("Ctegoria : " + c.getNombre());
            System.out.println("Subtotal : S/." + pe.subTotal());
            System.out.println("IGV : S/." + pe.getIGV());
            System.out.println("Total : " + pe.getTotal());
            System.out.println("*********************************************");
            System.out.println("Pagar -> 1    Cancelar -> 2");
            procesado = sc.nextInt();
            if(procesado==1){
                System.out.println("Gracias por su preferencia");
                System.out.println("*********************************************");
            }else{
                String cox=p.getCodigo();
                pe.deleteLine(cox);
                System.out.println("Venta cancelada");
                System.out.println("*********************************************");
            }
            System.out.println("Desea realizar otra venta: [SI->1   NO->0]");
            aux=sc.nextInt();
            if(aux!=1){
                ciclo=false;
            }
        } while (ciclo);

    }

    static public String generarCodigo(int incrementar) {
        String codigo = "";
        if (incrementar < 10) {
            codigo += "00000" + incrementar;
        } else if (incrementar < 100) {
            codigo += "0000" + incrementar;
        } else if (incrementar < 1000) {
            codigo += "000" + incrementar;
        }

        return codigo;
    }

}
