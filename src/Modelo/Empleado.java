/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import VistaVentanas.TablaEmpleados;
/**
 *
 * @author ashle
 */
public class Empleado {
    private String DNI;
    private String Nombres;
    private String Apellidos;
    private String Puesto;
    private String Contacto;
    private String Contrasena;

    public Empleado(String DNI, String Nombres, String Apellidos, String Puesto, String Contacto, String Contrasena) {
        //darle validación a cada campo
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Puesto = Puesto;
        this.Contacto = Contacto;
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Empleados{" + "DNI=" + DNI + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Puesto de trabajo=" + Puesto + ", Contacto=" + Contacto + ", Contrasena=" + Contrasena + '}';
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

    public String getPuesto() {
        return Puesto;
    }

    public String getContacto() {
        return Contacto;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
}
