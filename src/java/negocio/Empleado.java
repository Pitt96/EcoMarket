
package negocio;

/**
 *
 * @author Pitt
 */
public class Empleado extends Persona{
    private String cod;
    private String dni;
    private CargoEmpleado cargo;
    private AreaTrabajo seccion;
    public Empleado() {
    }

    public Empleado(String cod, String dni, CargoEmpleado cargo, AreaTrabajo seccion, String nombre, String apellido, String direccion, String celular, String email, int edad) {
        super(nombre, apellido, direccion, celular, email, edad);
        this.cod = cod;
        this.dni = dni;
        this.cargo = cargo;
        this.seccion = seccion;
    }

    
    
    public enum CargoEmpleado{
        ADMINISTRADOR,CAJERO,REPONEDORES,GERENTE
    }
    
    public enum AreaTrabajo{
        VENTAS,PANADERIA,HIGIENE,CUIDADO_PERSONAL
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CargoEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(CargoEmpleado cargo) {
        this.cargo = cargo;
    }

    public AreaTrabajo getSeccion() {
        return seccion;
    }

    public void setSeccion(AreaTrabajo seccion) {
        this.seccion = seccion;
    }
    
    
    

    
    
    
    
    
    
}
