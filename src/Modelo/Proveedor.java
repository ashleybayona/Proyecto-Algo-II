/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author SEGURIDAD
 */
public class Proveedor {
    private String RUC;
    private String RazSocial;
    private String Marca;
    private String Contacto;
    private String Direccion;

    public Proveedor(String RUC, String RazSocial, String Marca, String Contacto, String Direccion) {
        //darle validación a cada campo
        this.RUC = RUC;
        this.RazSocial = RazSocial;
        this.Marca = Marca;
        this.Contacto = Contacto;
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "RUC=" + RUC + ", RazSocial=" + RazSocial + ", Marca=" + Marca + ", Contacto=" + Contacto + ", Direccion=" + Direccion + '}';
    }    
    
    private boolean validarRUC(String ruc){
        int longitud_ruc = ruc.length();
        return longitud_ruc == 11;
    }
    
    private boolean validarContacto(String telef){
        int longitud_telef= telef.length();
        return longitud_telef == 9;
    }
    
    public boolean validarDatos(String dni, String telef){
        return validarRUC(dni) && validarContacto(telef);
    }

    public String getRUC() {
        return RUC;
    }

    public String getRazSocial() {
        return RazSocial;
    }

    public String getMarca() {
        return Marca;
    }

    public String getContacto() {
        return Contacto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setRazSocial(String RazSocial) {
        this.RazSocial = RazSocial;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
