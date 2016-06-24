/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Metodos;
import Modelo.Nodo;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Keren
 */
public class Controlador implements ActionListener {
    
    Metodos metodos;
    FRM_VentanaPrincipal ventana;
    public Controlador(FRM_VentanaPrincipal ventana) {
        this.ventana=ventana;
        metodos= new Metodos();
        ventana.mostrarInfo(metodos.imprimir());
        ventana.setCedulaSiguiente("Sin registros");
    }//fin constructor

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Nueva cita"))
        {
            if(ventana.validarCampos()){
                if(ventana.getPrioridad().equals("Normal")) {
                    metodos.insertarFinal(ventana.getCita());
                }else{
                    metodos.insertarInicio(ventana.getCita());
                }//fin else
                ventana.setCedulaSiguiente("Cédula del siguiente: "+metodos.getRaiz().getCedula());
                ventana.mostrarInfo(metodos.imprimir());
                ventana.limpiarDatos();            
            } else {
                JOptionPane.showMessageDialog(null,"Acción denegada:\nUno o más campos vacios.");
            }//fin else
        }//fin evento Nueva Cita
        
        if(e.getActionCommand().equals("<"))
        {
            metodos.menorMayor();
            ventana.mostrarInfo(metodos.imprimir());
        }//fin accion <
        
        if(e.getActionCommand().equals(">")){
            metodos.mayorMenor();
            ventana.mostrarInfo(metodos.imprimir());
        }//fin accion >
        
        if(e.getActionCommand().equals("Siguiente")) {
            Nodo temp = metodos.getRaiz();
            if (temp != null) {
                System.out.println(temp);
                JOptionPane.showMessageDialog(null,"Siguiente consulta:\n\nNombre: "+
                    temp.getNombre() + "\nCédula: " + temp.getCedula());
                metodos.eliminarPrimero();
                if(metodos.getRaiz() != null) {
                    ventana.setCedulaSiguiente("Cédula del siguiente: "+metodos.getRaiz().getCedula());
                } else {
                    ventana.setCedulaSiguiente("Sin registros");
                }//fin else
                ventana.mostrarInfo(metodos.imprimir());
            } else {
                JOptionPane.showMessageDialog(null,"Actualmente sin registros");
                ventana.setCedulaSiguiente("Sin registros");
            }//fin else
        }//fin accion siguiente
        
    }//fin actionPerformed
}//fin class Controlador