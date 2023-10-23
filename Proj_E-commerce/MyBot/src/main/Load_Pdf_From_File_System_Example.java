/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.FileSystemDocumentLoader;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author mto_l
 */
public class Load_Pdf_From_File_System_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path filePath = toPath("text.pdf");
            Document document = FileSystemDocumentLoader.loadDocument(filePath);
            System.out.println(document);
        // TODO code application logic here
    }

    private static Path toPath(String fileName) {
        try {
            URL fileUrl = ChatWithDocumentsExamples.class.getResource(fileName);
            return Paths.get(fileUrl.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        
    
}
    
    }
}