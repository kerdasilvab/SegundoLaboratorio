/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Keren
 */
public class Metodos {
    
    private Nodo raiz, fondo;
    
    public Metodos() {
        this.raiz = null;
        this.fondo = null;
    }//fin constructor
    
    public boolean vaciar() {
        if (raiz != null) {
            return true;
        }
        return false;
    }//fin vaciar
    
    /**
     * Se inserta al final cuendo es cita Normal
     **/
    public void insertarFinal(Nodo nuevo) {
        if (!vaciar()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
    }//fin de insertar
    
    /**
     * Se inserta al inicio cuando es cita Preferencial
     **/
    public void insertarInicio(Nodo nuevo)
    {
        nuevo.setSiguiente(raiz);
        raiz = nuevo;
    }//insertarRaiz
    
    public Nodo getRaiz() {
        if (raiz != null) {
            return raiz;
        }//fin if
        return null;
    }//fin extraer
    
    public String imprimir () {
        Nodo reco = raiz;
        String mensaje = "LISTA DE CITAS:";
        int posicion = 0;
        while (reco!=null) {
            posicion++;
            mensaje += "\n" + posicion + " ) Nombre: " + reco.getNombre() + ", Cedula: " + reco.getCedula();
            reco = reco.getSiguiente();
        }//fin while
        return mensaje;
    }//fin imprimir
    
    public void eliminarPrimero() {
        raiz = raiz.getSiguiente();
    }//eliminarPrimero
    
    public Nodo getFondo() {
        return fondo;
    }//fin getFondo
    
    public void menorMayor(){
        Nodo temporal=raiz;
        Nodo siguiente=temporal.getSiguiente();
        Nodo temp=new Nodo("",0,0,"",null);
        
        for(int ii=0;ii<getCantidadNodos();ii++)
        {
            for(int i=0;i<getCantidadNodos();i++)
            {
                if(siguiente != null){
                    if(temporal.getEdad()>siguiente.getEdad()){
                        temp.setEdad(temporal.getEdad());
                        temp.setNombre(temporal.getNombre());
                        temp.setCedula(temporal.getCedula());
                        temporal.setEdad(siguiente.getEdad());
                        temporal.setNombre(siguiente.getNombre());
                        temporal.setCedula(siguiente.getCedula());
                        temporal.getSiguiente().setEdad(temp.getEdad());
                        temporal.getSiguiente().setNombre(temp.getNombre());
                        temporal.getSiguiente().setCedula(temp.getCedula());
                    }//fin if
                    temporal = temporal.getSiguiente();
                    siguiente = temporal.getSiguiente(); 
                }//fin if
            }//fin for
          temporal = raiz;  
          siguiente = temporal.getSiguiente();
        }//fin for
    }//menorMayor
    
    public void mayorMenor(){
        Nodo temporal = raiz;
        Nodo siguiente = temporal.getSiguiente();
        Nodo temp = new Nodo("",0,0,"",null);
        
        for(int contador = 0;contador < getCantidadNodos();contador++)
        {
            for(int conta = 0;conta < getCantidadNodos();conta++)
            {
                if(siguiente != null)
                {
                    if(temporal.getEdad()<siguiente.getEdad()){
                        temp.setEdad(temporal.getEdad());
                        temp.setNombre(temporal.getNombre());
                        temp.setCedula(temporal.getCedula());
                        temporal.setEdad(siguiente.getEdad());
                        temporal.setNombre(siguiente.getNombre());
                        temporal.setCedula(siguiente.getCedula());
                        temporal.getSiguiente().setEdad(temp.getEdad());
                        temporal.getSiguiente().setNombre(temp.getNombre());
                        temporal.getSiguiente().setCedula(temp.getCedula());
                    }//fin if
                    temporal=temporal.getSiguiente();
                    siguiente=temporal.getSiguiente(); 
                }//fin if
            }//fin for
        }//fin for
    }//fin mayorMenor
    
    public int getCantidadNodos(){
        Nodo temp = raiz;
        int contador = 0;
        while(temp!=null){
            temp=temp.getSiguiente();
            contador++;
        }//fin while
        return contador;
    }//fin getCantidadNodos
    
}//fin Metodos