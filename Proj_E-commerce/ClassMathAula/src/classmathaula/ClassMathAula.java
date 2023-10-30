/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classmathaula;

/**
 *
 * @author mto_l
 */
public class ClassMathAula {

    public static void main(String[] args) {
        double pi = Math.PI;
        double raiz = Math.sqrt(2);
        double potencia = Math.pow(2, 3);
        int valor = Integer.parseInt("21");
        valor = valor * 2;
        
        float v1 = Float.parseFloat("1.2");
        double v2 = Double.parseDouble("21.2");
        v2 = v1 * v2;
        
        String n1 = "Maria";
        String n2 = "Maria";
        if(n1.equals("Maria")){
            //System.out.println("iguais ao parametro Maria");
        }
        if (n1.equals(n2)){
            //System.out.println("n1 e n2 sao iguais");
        }
        char carac = n1.charAt(2);
        int asc = n1.codePointAt(2);
        
        String m2 = n1.toUpperCase();
        
        String frase = "Se nao puder fazer tudo faca, tudo o que puder";
        System.out.println(frase.indexOf('t'));
        System.out.println(frase.indexOf('t', 20));
        System.out.println(frase.indexOf("tudo"));
        System.out.println(frase.indexOf("tudo", 20));
        System.out.println("\n");
        System.out.println(frase.lastIndexOf('t'));
        System.out.println(frase.lastIndexOf('t', 20));
        System.out.println(frase.lastIndexOf("tudo"));
        System.out.println(frase.lastIndexOf("tudo",20));
        System.out.println("\n");
        System.out.println("Carac: " +carac);
        System.out.println("ASC: " + asc);
        
        System.out.println(valor);
        System.out.println(v2);
        System.out.println(m2);
        
        System.out.println(frase.substring(13,18));
        System.out.println(frase.substring(13));
        
        String frase2 = "Cada dia e um novo dia e apos cada dia existe um novo dia";
        String fraseNova = frase2.replace("dia", "noite");
        System.out.println("Original: " + frase2);
        System.out.println("Nova: " + fraseNova);
        
        String frase3 = "Cada dia";
        boolean resp = frase.startsWith("Cad");
        System.out.println("Comeca por \"Cad\": " + resp);
        resp = frase3.startsWith("ad");
        System.out.println("Comeca por \"ad\": " + resp);
        resp = frase3.endsWith("ia");
        System.out.println("Termina com \"ia\": " + resp);
        resp = frase3.endsWith("Cada");
        System.out.println("Termina com \"Cada\": " + resp);
        System.out.println("\n");
        
        String nome2 = "  Ana Marcia    ";
        System.out.println("Nome: \"" + nome2 + "\"");
        String semEspacos = nome2.trim();
        System.out.println("Nome: \"" + semEspacos + "\"");
        
        
                
        
    } 
}
