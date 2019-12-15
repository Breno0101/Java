/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanalSaidaFiltroSimplesTeste;

import CanalSaidaFiltroAbstratoTeste.CanalSaidaFiltroAbstrato;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/**
 *
 * @author Breno Lins
 */
public class CanalSaidaFiltroSimples extends CanalSaidaFiltroAbstrato {
   private String palavraChave;

    public CanalSaidaFiltroSimples(File file) throws FileNotFoundException {
        super(file);
     }

    public CanalSaidaFiltroSimples (OutputStream fluxoSaida) {
        super(fluxoSaida);
    }

   public void adicionaPalavraChave(String chave){
    this.palavraChave = "novo";
   }
   public String consultaPalavraChave(){
       return palavraChave;
   }
   @Override
   public boolean testaFiltro(String dado){
       return false;
    
}
 public static void main(String [] args) throws FileNotFoundException{
  
     File testando;
     
 testando = new File("Arquivoteste21.txt");
 CanalSaidaFiltroSimples  canal = new CanalSaidaFiltroSimples(testando);
canal.palavraChave = "Novo";
System.out.print(canal);

 }
    
}