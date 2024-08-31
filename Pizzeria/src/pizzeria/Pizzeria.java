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
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        Pizza pizza1 = new Pizza("pepperoni", "gruesa", "grande");
        
        String nombre = pizza1.getNombre();
        System.out.println("Comprado "+ nombre);
        pizza1.setNombre("Hawaiana");
        String nombre_new = pizza1.getNombre();
        System.out.println("Comprado "+ nombre_new);
    }
}
