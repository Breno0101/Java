package CanalSaidaContadorTeste;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Breno Lins
 */
public class CanalSaidaContador extends PrintStream {

    

    
     private static String NEW_LINE = System.getProperty("line.separator");
     private int numeroCaracteres;
     private int numeroDigitos;
     private int numeroLetras;
     private int numeroLinhas;
     private int numeroPalavras;

    public CanalSaidaContador(File arquivo) throws FileNotFoundException {
        super(arquivo);
        this.numeroCaracteres = 0;
        this.numeroDigitos = 0;
        this.numeroLetras = 0;
        this.numeroLinhas = 0;
        this.numeroPalavras = 0;
    }
     public CanalSaidaContador (OutputStream out){
       super(out);
      
        this.numeroCaracteres = 0;
        this.numeroDigitos = 0;
        this.numeroLetras = 0;
        this.numeroLinhas = 0;
        this.numeroPalavras = 0;
         
     }
     
     public void ContaCaracteres(String dado){
        String [] caracteres = dado.split("");
        String texto = "";
         char[] chars;
         for (String one: caracteres){
             texto+=one;
             
         }
         chars = texto.toCharArray();
         
         for(char oneChar: chars){
             if(Character.isAlphabetic(oneChar)){
                 this.numeroCaracteres++;
             }
         } 
     }
     
     public void ContaDigitos(String dado){
         String [] caracteres = dado.split("");
        String texto = "";
         char[] chars;
         for (String one: caracteres){
             texto+=one;
             
         }
         chars = texto.toCharArray();
         
         for(char oneChar: chars){
             if(Character.isDigit(oneChar)){
                 this.numeroDigitos++;
             }                 
         }
     }
     public void ContaLetras (String dado){
         String [] caracteres = dado.split("");
         String texto = "";
          char[] chars;
          for (String one: caracteres){
              texto+=one;
          }
          
          chars = texto.toCharArray();
          
          for(char oneChar: chars){
              if(Character.isLetter(oneChar)){
                  this.numeroLetras++;
              }
              
              
              
          }
     }   
         
        public void ContaPalavras(String dado){
            this.numeroPalavras += dado.split("").length;
            
            
        }

        public void Print (String dado){
            super.print( dado + "");
            this.ContaCaracteres(dado);
            this.ContaDigitos(dado);
            this.ContaLetras(dado);
            this.ContaPalavras(dado);
        
        }
     @Override
        public void println(String dado){
            this.Print(dado + NEW_LINE);
            this.numeroLinhas++;
        }
        
        public String geraEstatisticas(){
         return String.format("\n Número de linhas: %d \n Número de Palavras: %d \n Numero de letras:%d \n Numero de caracteres:%d \n Número de digitos: %d \n",
                 this.getNumeroLinhas(),this.getNumeroPalavras(),this.getNumeroLetras(), this.getNumeroCaracteres(), this.getNumeroDigitos());
                          
}       

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public int getNumeroDigitos() {
        return numeroDigitos;
    }

    public int getNumeroLetras() {
        return numeroLetras;
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    public int getNumeroPalavras() {
        return numeroPalavras;
    }
 public static void main(String[] args) throws FileNotFoundException {
        File teste;
         teste = new File("arquivoteste.txt");
        CanalSaidaContador canal = new CanalSaidaContador(teste);

          canal.print(" Breno 2");
        canal.print("Teste 6");
        canal.println("Teste 41");
        canal.Print("Breno25");

        System.out.println(canal.geraEstatisticas());
    }    
    
}

     



 
         
      


     


