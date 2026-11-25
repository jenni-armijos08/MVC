/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcexampleone.vista;

import ec.edu.espoch.mvcexampleone.controlador.ControladorOperaciones;


public class Vista {
    
    ControladorOperaciones controlador = new ControladorOperaciones();
    
    public String getNumOne( ){
        return "5";
        
    }
    
     public String getNumTwo( ){
        return "6";
     }
     
    public void mostrar (float respuesta){
        System.out.println("El resulatdo"+ respuesta);
    }
    
    public void mostarError(){
        System.out.println("Error");
    }
    public void enviar (){
        controlador.cotrolarOpreciones();
    }
    
}
