/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanalSaidaFiltroAbstratoTeste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author Breno Lins 
 */
public abstract class CanalSaidaFiltroAbstrato  extends PrintStream{

    
    
   private boolean aceitarFiltro;
   private boolean filtroAtivado;

    public CanalSaidaFiltroAbstrato(File arquivo) throws FileNotFoundException {
        super(arquivo);
        this.aceitarFiltro = true;
        
    }

    public CanalSaidaFiltroAbstrato(OutputStream fluxoSaida) {
        super(fluxoSaida);
        this.aceitarFiltro = true;
    }
    
    public void ativarFiltro(boolean ativar){
        this.filtroAtivado = ativar;
        
    }
    
    public void defineModoDeFiltro(boolean aceitar){
        this.aceitarFiltro = aceitar;
        
    }
    
    public boolean FiltroAtivado(){
        return this.filtroAtivado;
    }
    
    public void InverteFiltro(){
      this.filtroAtivado = !this.filtroAtivado;
      
    }
    
   @Override
    public void print(String dado){
     super.print(dado);   
    
    }
    
    private void printcomFiltro(String dado){
        super.print(dado);
        
    }
    public abstract boolean testaFiltro(String dado);
    
    
    
}
