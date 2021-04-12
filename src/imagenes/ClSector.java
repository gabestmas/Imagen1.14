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
public class ClSector {
    
    ArrayList <VertDelSec> VerticesDelSr= new ArrayList();
    
    ArrayList <PuntACont> Contorno= new ArrayList();
    //ArrayList <VertDelSec> Contorno= new ArrayList();
    
    ArrayList <SectorVecino> SsVecinos= new ArrayList();
    
    
    public void AgregarVDS (VertDelSec V)
    {
        VerticesDelSr.add(V);
    }
       
}



/////////////////////////////////////////////////////

