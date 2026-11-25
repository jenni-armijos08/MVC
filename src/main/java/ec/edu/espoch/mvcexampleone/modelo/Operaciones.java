/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcexampleone.modelo;

/**
 *
 * @author PERSONAL
 */
public class Operaciones implements InterfazOperacion {
    public float sumar(Operacion operacion){
        return  operacion.getNumUno()+ operacion.getNumDos();
    }
    
}
