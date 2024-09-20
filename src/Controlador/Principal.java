/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author ashle
 */
public class Principal {
    
    public static ArrayList<Empleados> empleados = new ArrayList<>();
    
    public static void main(String args[]){
        //ArrayList<Empleados> empleados = new ArrayList<>();
        
        Empleados emp1 = new Empleados("99999999", "Ashley", "Bayona", "999999999", "user1");
        Empleados emp2 = new Empleados("99999998", "Elizabeth", "Vera", "999999998", "user2");
        Empleados emp3 = new Empleados("99999997", "Ola", "Chau", "999999997", "user3");
        
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        
        System.out.println(empleados);
    }
}
