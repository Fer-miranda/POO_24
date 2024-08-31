/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraenlinea;

/**
 *
 * @author CETECOM
 */
public class Cliente {
    private String idCliente, nombreCliente;
    private CarritoCompra carrito;

    public Cliente(String idCliente, String nombreCliente, CarritoCompra carrito) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.carrito = carrito;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public CarritoCompra getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoCompra carrito) {
        this.carrito = carrito;
    }
    
    
    
    
    
}
