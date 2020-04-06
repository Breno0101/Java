/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import Atividades.CanalSaidaFiltroAbstrato;
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
       return dado.contains(this.palavraChave);
    
}
 public static void main(String [] args){
  
       CanalSaidaFiltroSimples teste = new CanalSaidaFiltroSimples(System.out);
        teste.adicionaPalavraChave("teste");
        System.out.println(teste.consultaPalavraChave());
        System.out.println(teste.testaFiltro("teste"));
    }
     



 }
    