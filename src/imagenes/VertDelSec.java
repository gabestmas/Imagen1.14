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
public class VertDelSec {
    
    DotFC v= new DotFC();
    PuntACont pc= null;
    ArrayList <DotFC> normales= new ArrayList();
          
       
    public void VertDelSecAddV(DotFC v1)
    {
        v.cx= v1.cx;
        v.fy= v1.fy;
    }
    
    public void VertDelSecAddP (PuntACont p)
    {
        pc= p;
    }
    
}
