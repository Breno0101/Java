/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanalSaidaDuplicadorTeste;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 *
 * @author Bruno Sousa
 */
public class CanalSaidaDuplicador extends OutputStream {

    private java.io.OutputStream primeiro;
    private java.io.OutputStream segundo;
    
   public CanalSaidaDuplicador(OutputStream primeiraSaida, OutputStream segundaSaida){
       this.primeiro = primeiraSaida;
       this.segundo = segundaSaida;
    
}
    public static void main (String[] args) throws IOException{
        CanalSaidaDuplicador teste;
        teste = new CanalSaidaDuplicador(System.out, new FileOutputStream("arquivoteste25.txt"));
        String a = "BRENO";
        String a2 ="HENRIQUE";
        int count = 0;
        
        while(count < a.length()){
            teste.write(a.charAt(count));
        
        }
        teste.flush();
        count = 0;
        while(count<a2.length()){
            teste.write(a2.charAt(count));
            count++;
        }
        teste.close();
    }

    @Override
    public void write(int b) throws IOException {
    this.primeiro.write(b);
    this.segundo.write(b);
    
    }
    
    @Override
    public void flush() throws IOException{
    this.primeiro.flush();
    this.segundo.flush();
    }
    @Override
    public void close() throws IOException{
        this.primeiro.close();
        this.segundo.close();
        
    }
    
   
        
    }
    
           
