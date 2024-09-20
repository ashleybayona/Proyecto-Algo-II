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
    
}
