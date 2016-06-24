/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Keren
 */
public class Nodo {
    
    private String nombre;
    private int edad;
    private int cedula;
    private Nodo siguiente;
    private String prioridad;

    public Nodo(String nombre, int edad,int cedula,String prioridad , Nodo siguiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.prioridad=prioridad;
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }//fin getNoimbre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//fin setNombre

    public int getEdad() {
        return edad;
    }//fin getEdad

    public void setEdad(int edad) {
        this.edad = edad;
    }//fin setEdad

    public Nodo getSiguiente() {
        return siguiente;
    }//fin getSiguiente

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }//fin setSiguiente

    public int getCedula() {
        return cedula;
    }//fin getCedula

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }//fin setCedula

    public String getPrioridad() {
        return prioridad;
    }//fin getPrioridad

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }//fin setPrioridad
    
}//fin class Nodo