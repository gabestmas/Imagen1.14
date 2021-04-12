/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.util.ArrayList;

/**
 *
 * @author gabest
 */
public class CtoColor {
    
    int Color;
    int R, G, B;
    
    ArrayList <ClSector> Sectores= new ArrayList();
    

    public CtoColor(){
        
    }
            
    public CtoColor(int c)
    {
        this.Color= c;
    }
    
    public void addColorCtoColor(int c)
    {
        Color= c;
    }
    
    public void addRGBalCtoColor(int r, int g, int b)
    {
        this.R= r;
        this.G= g;
        this.B= b;
    }

}
    