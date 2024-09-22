/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SEGURIDAD
 */
public class Producto {
    private String ID;
    private String Proveedor;
    private String PrecioC;
    private String PrecioV;
    private String Stock;
    private String Descripcion;

    public Producto(String ID, String Proveedor, String PrecioC, String PrecioV, String Stock, String Descripcion) {
        //darle validación a cada campo
        this.ID = ID;
        this.Proveedor = Proveedor;
        this.PrecioC = PrecioC;
        this.PrecioV = PrecioV;
        this.Stock = Stock;
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "ID=" + ID + ", Proveedor=" + Proveedor + ", PrecioC=" + PrecioC + ", PrecioV=" + PrecioV + ", Stock=" + Stock + ", Descripcion=" + Descripcion + '}';
    }    
    
    private boolean validarID(String id){
        int longitud_id = id.length();
        return longitud_id == 5;
    }
    
    public boolean validarDatos(String id){
        return validarID(id);
    }

    public String getID() {
        return ID;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public String getPrecioC() {
        return PrecioC;
    }

    public String getPrecioV() {
        return PrecioV;
    }

    public String getStock() {
        return Stock;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public void setPrecioC(String PrecioC) {
        this.PrecioC = PrecioC;
    }

    public void setPrecioV(String PrecioV) {
        this.PrecioV = PrecioV;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
