/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author gabest
 */
public class ConjuntoV {
    
    int colorClase;
    int cR, cG, cB;
    ArrayList <DotFC> listaV= new ArrayList();
    
    public ConjuntoV(){
        
    }
            
    public ConjuntoV(int c)
    {
        this.colorClase= c;
    }
    
    public void AgregarColor(int c)
    {
        this.colorClase= c;
    }
    public void agregarDotFC(DotFC dot)
    {
        this.listaV.add(dot);
    }
    
    public void sumarColorPromedios(int red, int green, int blue)
    {
        this.cR= this.cR+red;
        this.cG= this.cR+green;
        this.cB= this.cR+blue;
    }
    
    
    public void agregarDotColor(int r, int g, int b)
    {
        this.cR= r;
        this.cG= g;
        this.cB= b;
    }
    
    
    public void definirColorClase()
    {
        int nI= this.listaV.size();
        cR= this.cR/nI;
        cG= this.cG/nI;
        cB= this.cB/nI;
    }
    
    
}
