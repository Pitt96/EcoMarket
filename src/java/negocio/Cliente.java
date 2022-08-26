/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Pitt
 */
public class Cliente extends Persona{
    private String dni;

    public Cliente() {
    }

    
    public Cliente(String dni, String nombre, String apellido, String direccion, String celular, String email, int edad) {
        super(nombre, apellido, direccion, celular, email, edad);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
