/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import VistaVentanas.*;

/**
 *
 * @author ashle
 */
public class Principal {
    
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    
    public static ArrayList<Producto> productos = new ArrayList<>();
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public LogIn login;
    
    public Principal () {
        login = new LogIn();
    }
    
    public void mostrarVentanaLogIn() {
        login.setVisible(true);
    }
    
    public static void main(String args[]){
        //ArrayList<Empleados> empleados = new ArrayList<>();
         
        System.out.println(empleados);
        System.out.println(proveedores);
        System.out.println(productos);
        
        Principal principal = new Principal();
        principal.mostrarVentanaLogIn();
    }
}
