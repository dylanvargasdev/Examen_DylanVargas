/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Examen1 {

    public static void main(String[] args) {
        //Solicitud de cantidad de facturas por realizar.
        int contador = 0;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de factutras que desea agregar"));
        do{
            //Llamado a Facturas
            Factura factura = new Factura();
            factura.GenerarFactura();
            contador++;
        }while(cantidad>contador);
        
        //Llamado a Vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.GenerarVendedor();
       
        
        /* PRUEBA
        String codigo;5
        String nombreCliente;
        String cedulaCliente;
        String codigoVendedor;
        double monto;
        String mes;
        int electricos;
        int automotrices;
        int construccion;
        
        codigo = JOptionPane.showInputDialog("Digite el codigo de factura: ");
        nombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
        cedulaCliente = JOptionPane.showInputDialog("Digite la cedula del cliente: ");
        codigoVendedor = JOptionPane.showInputDialog("Digite el codigo del vendedor: ");
        monto = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto: "));
        mes = JOptionPane.showInputDialog("Digite el mes: ");
        electricos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos eléctricos: "));
        automotrices = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos automotrices: "));
        construccion = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de aticulos de construcción: "));
        
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
                
                */
        
    }
}
