/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanalSaidaFiltroFlexivelTeste;

import CanalSaidaFiltroAbstratoTeste.CanalSaidaFiltroAbstrato;
import Filtrador.Filtrador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/**
 *
 * @author Breno Lins
 */
public class CanalSaidaFlexivel extends CanalSaidaFiltroAbstrato {
 private Filtrador filtrador;
 
 
    public CanalSaidaFlexivel(Filtrador filtrador, File arquivo) throws FileNotFoundException {
        super(arquivo);
        this.filtrador = filtrador;
    }
 
  
  
  
    public CanalSaidaFlexivel(Filtrador filtrador, OutputStream fluxoSaida) {
        super(fluxoSaida);
        this.filtrador = filtrador;
       }
    
 @Override
    public boolean testaFiltro(String dado){
    return this.filtrador.testaFiltro(dado);
     
}
}
  
 



   
    
    

