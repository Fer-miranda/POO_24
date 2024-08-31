/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author CETECOM
 */
public class Pizza {
    private String nombre, masa, tamano;

    public Pizza(String nombre, String masa, String tamano) {
        this.nombre = nombre;
        this.masa = masa;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    public void preparar(){
        System.out.println("Preparando");
    }
    
    public void cocinar(){
        System.out.println("Cocinando");
    }
    
    
    
}
