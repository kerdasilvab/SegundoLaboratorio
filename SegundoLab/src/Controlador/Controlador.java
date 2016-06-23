/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosNodo;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Keren
 */
public class Controlador implements ActionListener {
    
    MetodosNodo metodos;
    FRM_VentanaPrincipal ventanaPrincipal;
    int tipoPlataforma=0;
    public Controlador(FRM_VentanaPrincipal ventanaPrincipal)
    {
        this.ventanaPrincipal=ventanaPrincipal;
        metodos= new MetodosNodo();
       // FRM_VentanaPrincipal=new ventanaPrincipal(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Nuevo"))
        {
            if(metodos.verificarCita(tipoPlataforma))
            {
                if(ventanaPrincipal.enviarPrioridad().equals("A"))
                {
                    metodos.agregarConPrioridad(ventanaPrincipal.enviarInformacion(),ventanaPrincipal.enviarInformacionEdad(),ventanaPrincipal.enviarPrioridad());
                }
                else
                {
                    metodos.agregarNormal(ventanaPrincipal.enviarInformacion(),ventanaPrincipal.enviarInformacionEdad(),ventanaPrincipal.enviarPrioridad());
                }
                    
            }
            else
            {
                metodos.crearCita(ventanaPrincipal.enviarInformacion(),ventanaPrincipal.enviarInformacionEdad(),ventanaPrincipal.enviarPrioridad());
            }
            ventanaPrincipal.colocarCita(metodos.imprimir());
            ventanaPrincipal.actualizarLista(metodos.imprimir(tipoPlataforma));
            ventanaPrincipal.imprimirArea(metodos.imprimirLista(tipoPlataforma));
            ventanaPrincipal.refresarInformacion();
        }
        
        if(e.getActionCommand().equals("Ordenar"))
        {
            metodos.mayorMenor();
            metodos.menorMayor();
            ventanaPrincipal.ordenarLista(metodos.imprimir());
            ventanaPrincipal.imprimirArea(metodos.imprimirLista());
            System.out.println("Ordenar");
        }
        if(e.getActionCommand().equals("Siguiente"))
        {
            metodos.eliminarPrimero(tipoPlataforma);
            informacionPersonal.actualizarLista(metodos.imprimir());
            informacionPersonal.fichaActual(metodos.imprimir());
            informacionPersonal.imprimirArea(metodos.imprimirLista());
            System.out.println("Siguiente");
        } 
    }  
}
