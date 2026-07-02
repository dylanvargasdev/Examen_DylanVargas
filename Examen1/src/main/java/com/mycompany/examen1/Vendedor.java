/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vendedor {
    private String codigoVendedor;
    private String nombreVendedor;
    private double comision;
    private boolean bonoExtra;
    private int puntos;
    private boolean vehiculo;
    private String sucursal;
    
    
    //Metodo generar vendedor
    public void GenerarVendedor(){
        //Solicitud de datos
        this.codigoVendedor = JOptionPane.showInputDialog("Digite el codigo del agente vendedor: ");
        this.nombreVendedor = JOptionPane.showInputDialog("Digite el nombre del agente vendedor: ");
        this.comision = 0;
        this.bonoExtra = false;
        this.puntos = 0;
        this.vehiculo = false;
        this.sucursal = JOptionPane.showInputDialog("Ingrese la sucursal donde trabaja: ");
        
        //muestra de datos
        JOptionPane.showMessageDialog(null, "El agente vendedor: " + nombreVendedor + "código: " + codigoVendedor + 
                "\nVendio un total de " + " facturas" + 
                "\nObtuvo un total de comisión de " + comision + 
                "\nEl agente vendedor " + bonoExtra + " logro el objetivo de llegar al BONO EXTRA" +
                "\nPuntos obtenidos por el vendedor: " + puntos + 
                "\nEl agente vendedor " + vehiculo + " cuenta con un vehiculo propio" +
                "\nSucursal: " + sucursal);        
        
    }

    //gets y sets
    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public boolean isBonoExtra() {
        return bonoExtra;
    }

    public void setBonoExtra(boolean bonoExtra) {
        this.bonoExtra = bonoExtra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigoVendedor=" + codigoVendedor + ", nombreVendedor=" + nombreVendedor + ", comision=" + comision + ", bonoExtra=" + bonoExtra + ", puntos=" + puntos + ", vehiculo=" + vehiculo + ", sucursal=" + sucursal + '}';
    }
    
    
}
