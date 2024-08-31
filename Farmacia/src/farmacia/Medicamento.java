/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author CETECOM
 */
public class Medicamento {
    private String codigo, nombre, tipo;
    private int stock;
    //private Date caducidad;

    public Medicamento(String codigo, String nombre, String tipo, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    public void vender(){
        System.out.println("Registrar venta");
    }
}
