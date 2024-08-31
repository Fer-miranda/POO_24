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
public class SistemaGestionInventarios {
    private String medicamentoActual, clienteActual, proveedorActual;

    public SistemaGestionInventarios(String medicamentoActual, String clienteActual, String proveedorActual) {
        this.medicamentoActual = medicamentoActual;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }
    
    
    public void registrarMedicamento(){
        System.out.println("Medicamento registrado");
    }
    
    public void registrarCliente(){
        System.out.println("Cliente registrado");
    }
    
    public void generarInformeVentas(){
        System.out.println("Informe generado");
    }
}
