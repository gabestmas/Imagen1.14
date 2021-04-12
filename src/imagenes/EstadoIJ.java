/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

/**
 *
 * @author gabest
 */
public class EstadoIJ {
    
    String estado= new String();
    PunteroASector punteroS= new PunteroASector();
    
    public void EIJn () { estado= "n";} // no visitado
    public void EIJp () { estado= "p";} // pendiente
    public void EIJv () { estado= "v";} // visitado
    public void EIJa () { estado= "a";} // vecino actual
    public void EIJc () { estado= "c";} // contorno
    
   }
