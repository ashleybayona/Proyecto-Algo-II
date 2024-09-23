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
    private String Nombre;
    private String Proveedor;
    private String PrecioC;
    private String PrecioV;
    private String Tipo;
    private String Talla;
    private String Stock;
    private String Descripcion;

    public Producto(String ID, String Nombre, String Proveedor, String PrecioC, String PrecioV, String Tipo, String Talla, String Stock, String Descripcion) {
        //darle validación a cada campo
        this.ID = ID;
        this.Nombre = Nombre;
        this.Proveedor = Proveedor;
        this.PrecioC = PrecioC;
        this.PrecioV = PrecioV;
        this.Tipo = Tipo;
        this.Talla = Talla;
        this.Stock = Stock;
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "ID=" + ID + ", Nombre=" + Nombre + ", Proveedor=" + Proveedor + ", PrecioC=" + PrecioC + ", PrecioV=" + PrecioV + ", Tipo=" + Tipo + ", Talla=" + Talla + ", Stock=" + Stock + ", Descripcion=" + Descripcion + '}';
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

    public String getNombre() {
        return Nombre;
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

    public String getTipo() {
        return Tipo;
    }

    public String getTalla() {
        return Talla;
    }

    public String getStock() {
        return Stock;
    }

    public String getDesc() {
        return Descripcion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public void setDesc(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
