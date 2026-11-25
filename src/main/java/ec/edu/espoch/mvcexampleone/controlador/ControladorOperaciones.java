
package ec.edu.espoch.mvcexampleone.controlador;

import ec.edu.espoch.mvcexampleone.modelo.InterfazOperacion;
import ec.edu.espoch.mvcexampleone.modelo.Operacion;
import ec.edu.espoch.mvcexampleone.modelo.Operaciones;
import ec.edu.espoch.mvcexampleone.vista.Vista;


public class ControladorOperaciones {
    public void cotrolarOpreciones(){
          Vista vista = new Vista();
        try {
           
    
            float numUno = Float.parseFloat(vista.getNumOne());
            float numDos = Float.parseFloat(vista.getNumTwo());
            Operacion operacion = new Operacion (numUno, numDos);
            InterfazOperacion interfazOperacion = new Operaciones();
             float respueta = interfazOperacion.sumar(operacion);
             vista.mostrar(respueta);          
            
        } catch (Exception e) {
            vista.mostarError();
            
        }
    }
    
}
