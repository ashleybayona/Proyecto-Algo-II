/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import VistaVentanas.TablaEmpleados;
/**
 *
 * @author ashle
 */
public class Empleados {
     private String DNI;
     private String Nombres;
     private String Apellidos;
     private String Contacto;
     private String Contrasena;

    public Empleados(String DNI, String Nombres, String Apellidos, String Contacto, String Contrasena) {
        //darle validación a cada campo
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Contacto = Contacto;
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Empleados{" + "DNI=" + DNI + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Contacto=" + Contacto + ", Contrasena=" + Contrasena + '}';
    }    
    
    private boolean validarDNI(String dni){
        int longitud_dni = dni.length();
        return longitud_dni == 8;
    }
    
    private boolean validarContacto(String telef){
        int longitud_telef= telef.length();
        return longitud_telef == 9;
    }
    
    public boolean validarDatos(String dni, String telef){
        return validarDNI(dni) && validarContacto(telef);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getContacto() {
        return Contacto;
    }

    public String getContrasena() {
        return Contrasena;
    }
    
    
}
