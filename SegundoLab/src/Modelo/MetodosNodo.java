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
public class MetodosNodo {
    
    Nodo nodo;
    
    int cita=0;
    String prioridadCita="";
    
 public MetodosNodo() {
    }
    
    public boolean verificarCita(int tipo)
    {
        boolean existe=true;
        if(tipo==1)
        {
            if(nodo==null)
            {
                existe=false;
            } 
        }
        else
        {
            if(nodo==null)
            {
                existe=false;
            }
        }
        return existe;
    }
    
    public void crearCita (String nombre,int cedula, int edad, String prioridad, int tipo)
    {
        if(tipo==1)
        {
            nodo=new Nodo(nombre,edad,001,prioridad,null);
            cita=(1);
            prioridadCita=prioridad;
        }
        else
        {
            if(tipo==2)
            {
                nodo=new Nodo(nombre,edad,001,prioridad,null);
                cita=(1);
                prioridadCita=prioridad;
            }
        }    
    }
    
    public void agregarNormal(String nombre, int cedula, int edad,String prioridad, int tipo)
    {
        if(normal(tipo))
        {
            agregarAlFinal(nombre,cedula,edad,prioridad,tipo);
        }
        else
        {
            agregarPrimeroAlFinal(nombre,cedula,edad,prioridad,tipo);
        }
    }
    
    public void agregarAlFinal(String nombre, int cedula, int edad,String prioridad, int tipo)
    {
        if(tipo==1)
        {
            Nodo temporal=devolverUltimo(prioridad);
            temporal.setSiguiente(new Nodo(nombre,edad,(devolverNodo(prioridad).getCedula()+1),prioridad,null));
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;
        }
        else
        {
            Nodo temporal=devolverUltimo(prioridad);
            temporal.setSiguiente(new Nodo(nombre,edad,(devolverNodo(prioridad).getCedula()+1),prioridad,null));
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;  
        }
    }
    
    public void agregarConPrioridad(String nombre, int cedula,int edad,String prioridad, int tipo)
     {
         if(prioridad(tipo))
         {
             agregarPrioridadAlFinal(nombre,cedula,edad,prioridad,tipo);
         }
         else
         {
             agregarAlInicio(nombre,cedula,edad,prioridad,tipo);
         }
     }
    
    public void agregarPrimeroAlFinal(String nombre, int cedula, int edad,String prioridad, int tipo)
    {
        if(tipo==1)
        {
            Nodo temporal=devolverUltimo(prioridad);
            temporal.setSiguiente(new Nodo(nombre,cedula,edad,prioridad,null));
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;
        }
        else
        {
            Nodo temporal=devolverUltimo(prioridad);
            temporal.setSiguiente(new Nodo(nombre,cedula,edad,prioridad,null));
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;  
        }
    }
    
    
    public void agregarAlInicio(String nombre, int cedula, int edad,String prioridad, int tipo)
    {
        System.out.print("AlInicio");
        if(tipo==1)
        {
            Nodo temporal=new Nodo(nombre,cedula,edad,prioridad,null);
            temporal.setSiguiente(nodo);
            nodo=temporal;
            cedula=(devolverUltimoNodoPrioridad(prioridad).getCedula()+1);
            prioridadCita=prioridad;
        }
        else
        {
            Nodo temporal=new Nodo(nombre,cedula,edad,prioridad,null);
            temporal.setSiguiente(nodo);
            nodo=temporal;
            cedula=(devolverUltimoNodoPrioridad(prioridad).getCedula()+1);
            prioridadCita=prioridad;  
        }
    }
    
    public void agregarPrioridadAlFinal(String nombre, int cedula, int edad,String prioridad, int tipo)
    {
        if(tipo==1)
        {
            System.out.println(tipo);
            Nodo temporal=devolverUltimoNodoPrioridad(prioridad);
            if(temporal.getSiguiente()!=null)
            {
                System.out.println("Conn algo");
                Nodo aux=temporal.getSiguiente();
                temporal.setSiguiente(new Nodo(nombre,edad,(devolverUltimoNodoPrioridad(prioridad).getCedula()+1),prioridad,aux));
                
            }
            else
            { 
                System.out.println("null");
                temporal.setSiguiente(new Nodo(nombre,edad,(devolverUltimoNodoPrioridad(prioridad).getCedula()+1),prioridad,null));
            }
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;
        }
        else
        {
            System.out.println(tipo);
            Nodo temporal=devolverUltimoNodoPrioridad(prioridad);
            if(temporal.getSiguiente()!=null)
            {
                System.out.println("Conn algo");
                Nodo aux=temporal.getSiguiente();
                temporal.setSiguiente(new Nodo(nombre,edad,(devolverUltimoNodoPrioridad(prioridad).getCedula()+1),prioridad,aux));
                
            }
            else
            { 
                System.out.println("null");
                temporal.setSiguiente(new Nodo(nombre,edad,(devolverUltimoNodoPrioridad(prioridad).getCedula()+1),prioridad,null));
            }
            cedula=temporal.getSiguiente().getCedula();
            prioridadCita=prioridad;
        }
    }
    
    public String imprimirCita()
    {
        String numCita="";
         numCita=prioridadCita+numCita;   
        return numCita;
    }
    

    public boolean prioridad(int tipo)
    { 
        Nodo temporal=nodo;
        Nodo temp=nodo;
        String funciona="No hay";
        boolean existe=false;
        if(tipo==1)
        {
            if(temporal.getPrioridad().equals("A"))
            {
                existe=true;
            }
        while(temporal.getSiguiente()!=null)
        {
            if(temporal.getPrioridad().equals("A"))
            {
                existe=true;
                funciona="Si hay";
            }
            temporal=temporal.getSiguiente();
        }
        }
        else
        {
            if(tipo==2)
            {
                if(temp.getPrioridad().equals("A"))
            {
                existe=true;
            }
            while(temp.getSiguiente()!=null)
            {
                if(temp.getPrioridad().equals("A"))
                {
                    existe=true;
                    funciona="Si hay";
                }
                temp=temp.getSiguiente();
            }
            }
        }
        System.out.println(funciona);
        return existe;   
    }
    
    public boolean normal(int tipo)
    {
        Nodo temporal=nodo;
        Nodo temp=nodo;
        String funciona="No hay";
        boolean existe=false;
        if(tipo==1)
        {
            if(temporal.getPrioridad().equals("B"))
            {
                existe=true;
            }
        while(temporal.getSiguiente()!=null)
        {
            if(temporal.getPrioridad().equals("B"))
            {
                existe=true;
                funciona="Si hay";
            }
            temporal=temporal.getSiguiente();
        }
        if(temporal.getPrioridad().equals("B"))
            {
                existe=true;
            }
        }
        else
        {
            if(tipo==2)
            {
             if(temp.getPrioridad().equals("B"))
            {
                existe=true;
            }
                while(temp.getSiguiente()!=null)
                {
                    if(temp.getPrioridad().equals("B"))
                    {
                        existe=true;
                        funciona="Si hay";
                    }
                    temp=temp.getSiguiente();
                }
        if(temp.getPrioridad().equals("B"))
            {
                existe=true;
            }
            }
        }
        System.out.println(funciona);
        return existe;
    }
    
    public String[] imprimir(int tipo)
    {
        String[] texto=new String[100];
        
        if(tipo==1)
        {
        Nodo temporal=nodo;
        int posicion=0;
        
        while(temporal.getSiguiente()!=null)
        {
            texto[posicion]=temporal.getPrioridad()+temporal.getCedula();
            posicion++;
            temporal=temporal.getSiguiente();
        }
        texto[posicion]=temporal.getPrioridad()+temporal.getCedula();
        }
        else
        {
            Nodo temporal=nodo;
            int posicion=0;

            while(temporal.getSiguiente()!=null)
            {
                texto[posicion]=temporal.getPrioridad()+temporal.getCedula();
                 posicion++;
                temporal=temporal.getSiguiente();
            }
            texto[posicion]=temporal.getPrioridad()+temporal.getCedula();
        }
        
        return texto;
    }
    
    public String imprimirLista(int tipo)
    {
        String texto="";
        if(tipo==1)
        {
        Nodo temporal=nodo;
        while(temporal.getSiguiente()!=null)
        {
            texto+=temporal.getPrioridad()+temporal.getCedula()+"\n";
            temporal=temporal.getSiguiente();
        }
        texto+=temporal.getPrioridad()+temporal.getCedula()+"\n";
        }
        else
        {
          Nodo temporal=nodo;
        while(temporal.getSiguiente()!=null)
        {
            texto+=temporal.getPrioridad()+temporal.getCedula()+"\n";
            temporal=temporal.getSiguiente();
        }
        texto+=temporal.getPrioridad()+temporal.getCedula()+"\n";  
        }
        return texto;
        
    }
    
    public int devolverCantidadNodos(){
        Nodo temporal = nodo;
        int contador = 0;
        
        while(temporal.getSiguiente()!=null){
            temporal=temporal.getSiguiente();
            contador++;
        }
        
        contador++;
        return contador;
    }
    
    public Nodo devolverNodo(String prioridad)
    {     
        Nodo temporal=nodo;
        Nodo temp=nodo;
             while(temporal.getSiguiente()!=null)
            {
                if(temporal.getPrioridad().equals("B"))
                {
                    temp=temporal.getSiguiente();

                }
                temporal=temporal.getSiguiente();
            }
            if(temporal.getPrioridad().equals("B"))
            {
                temp=temporal;
            } 
        
        return temp;   
    }
    
    public Nodo devolverUltimoNodo(){
        Nodo temporal = nodo;
        while(temporal.getSiguiente()!=null){
        temporal = temporal.getSiguiente();
        }
        return temporal;
    }
    
    public Nodo devolverUltimo(String prioridad)
    {
        
        Nodo temporal=nodo;
        while(temporal.getSiguiente()!=null)
        {
            temporal=temporal.getSiguiente();
        }
        return temporal;   
    }
    
    public Nodo devolverUltimoNodoPrioridad(String prioridad)
    {
        Nodo temporal=nodo;
        Nodo temp=nodo;
        while(temporal.getSiguiente()!=null)
        {
            if(temporal.getPrioridad().equals("A"))
            {
                temp=temporal;
                temporal=temporal.getSiguiente();
                System.out.println("Cita Prioridad"+temp.getPrioridad());
                System.out.println("Cita Prioridad"+temp.getCedula());
            }
            else
            {
                temporal=temporal.getSiguiente();
            }
        }
        if(temporal.getPrioridad().equals("A"))
        {
            temp=temporal;
        }
        System.out.println(temp.getPrioridad()+temp.getCedula());
        return temp;    
    }
    
    public void menorMayor(){
        Nodo temporal=nodo;
        Nodo siguiente=temporal.getSiguiente();
        Nodo temp=new Nodo("",0,0,"",null);
        
        for(int ii=0;ii<devolverCantidadNodos();ii++)
        {
            for(int i=0;i<devolverCantidadNodos();i++)
            {
                if(siguiente!=null){
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
                    }
                    temporal=temporal.getSiguiente();
                    siguiente=temporal.getSiguiente(); 
                }
            }
          temporal=nodo;  
          siguiente=temporal.getSiguiente();
        }
    }
    
    public void mayorMenor(){
        Nodo temporal=nodo;
        Nodo siguiente=temporal.getSiguiente();
        Nodo temp=new Nodo("",0,0,"",null);
        devolverUltimoNodo();
        for(int contador=0;contador<devolverCantidadNodos();contador++)
        {
            for(int conta=0;conta<devolverCantidadNodos();conta++)
            {
                if(siguiente!=null)
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
                    }
                    temporal=temporal.getSiguiente();
                    siguiente=temporal.getSiguiente(); 
                }
            }
        }
    }
}
