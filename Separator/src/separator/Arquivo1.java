/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author mto_l
 */
public class Arquivo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{ //throws IOException {
        try{FileWriter fw = new FileWriter("D:\\Faculdade\\Semestre - 2\\LP - Juliana\\exemplo1.txt");
            BufferedWriter escrita = new BufferedWriter(fw);
            
            escrita.write("frase Um");
            escrita.write("\n");
            escrita.write("frase Dois");
            
            escrita.close();
        }
        catch(IOException ex){
            System.out.println("\nProblemas ao abrir o arquivo.");
                 
        }
    
        try{
            FileReader fr = new FileReader("D:\\Faculdade\\Semestre - 2\\LP - Juliana\\exemplo1.txt");
            BufferedReader leitor = new BufferedReader(fr);
            String linha;
            linha = leitor.readLine();
            System.out.println(linha);
            do{
            linha = leitor.readLine();
                    if(linha != null){
                        System.out.println (linha);
                    }
            }while(linha != null);
            leitor.close();
        }
        catch (IOException ex){
            System.out.println("\nProblemas ao abrir o arquivo.");
        }
        }   
            
            

            
        
        //File arq = new File ("D:\\Faculdade\\Semestre - 2\\LP - Juliana");
        //arq.createNewFile();
        //System.out.println("O arquivo ou diretorio existe? " + arq.exists());
        //System.out.println("E um arquivo? " + arq.isFile());
        //System.out.println("E um diretorio? " + arq.isDirectory());
        //System.out.println(arq.length());
        //System.out.println(arq.canRead());
        //System.out.println(arq.getName());
        //System.out.println(arq.getPath());
        //String[] vet_arquivos=arq.list();
        //if (vet_arquivos != null){
            //for (int i=0; i < vet_arquivos.length; i++)
                //System.out.println((i+1)+ "o arquivo: " + vet_arquivos[i]);
        //}
}
    

