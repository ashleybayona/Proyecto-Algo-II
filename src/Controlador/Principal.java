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
    public static TablaEmpleados tablaEmpleados;
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();
    public static TablaProveedores tablaProveedores;
    public static ArrayList<Producto> productos = new ArrayList<>();
    public static TablaProductos tablaProductos;
    
    public static LogIn login;
    
    public Principal () {
        login = new LogIn();
        tablaEmpleados = new TablaEmpleados();
        tablaProveedores = new TablaProveedores();
        tablaProductos = new TablaProductos();
    }
    
    public void mostrarVentanaLogIn() {
        login.setVisible(true);
    }
    
    public static void main(String args[]){
        Principal principal = new Principal();
        principal.mostrarVentanaLogIn();
    }
}


