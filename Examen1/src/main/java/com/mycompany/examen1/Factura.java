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
public class Factura {
    private String codigo;
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoVendedor;
    private double monto;
    private String mes;
    private int electricos;
    private int automotrices;
    private int construccion;
    public double bono;
    public int puntos;
    public int cantidadFacturas = 0;
    int cantidadproductos;
    
    // metodo generar factura
    public void GenerarFactura(){
        //Solicitud de datos
        this.codigo = JOptionPane.showInputDialog("Digite el codigo de factura: ");
        this.nombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
        this.cedulaCliente = JOptionPane.showInputDialog("Digite la cedula del cliente: ");
        this.codigoVendedor = JOptionPane.showInputDialog("Digite el codigo del vendedor: ");
        this.monto = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto: "));
        this.mes = JOptionPane.showInputDialog("Digite el mes: ");
        this.electricos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos eléctricos: "));
        this.automotrices = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos automotrices: "));
        this.construccion = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos de construcción: "));
        
        //Muestra de datos
        JOptionPane.showMessageDialog(null, "***Factura***" + 
                "\nCódigo: " + codigo + 
                "\nCliente: " + nombreCliente + 
                "\nCedula: " + cedulaCliente + 
                "\nVendedor: " + codigoVendedor + 
                "\nMonto: " + monto + 
                "\nMes: " + mes + 
                "\nEléctricos: " + electricos + 
                "\nAutomotices: " + automotrices + 
                "\nConstrucción: " + construccion);
        cantidadFacturas++;
    }
    
    //Crear Bono
    public void CrearBono(){
        if(electricos >=1 && automotrices >=1 && construccion >= 1){
            bono = monto * 0.10;
            puntos = 3;
        }if(electricos >= 3 ){
            bono = monto * 0.04;
            puntos = 1;
        }
        if(automotrices > 4 ){
            bono = monto * 0.04;
            puntos = 1;
        }if(electricos != 0 ){
            bono = monto * 0.08;
            puntos = 2;
        }
        if(electricos >= 3 ){
            bono = monto * 0.04;
            puntos = 1;
        }if(monto > 50000 ){
            bono = monto * 0.05;
            puntos = 1;
        }
    }

    
    //Gets y Sets
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getElectricos() {
        return electricos;
    }

    public void setElectricos(int electricos) {
        this.electricos = electricos;
    }

    public int getAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(int automotrices) {
        this.automotrices = automotrices;
    }

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", nombreCliente=" + nombreCliente + ", cedulaCliente=" + cedulaCliente + ", codigoVendedor=" + codigoVendedor + ", monto=" + monto + ", mes=" + mes + ", electricos=" + electricos + ", automotrices=" + automotrices + ", construccion=" + construccion + '}';
    }
    
    
    
}


