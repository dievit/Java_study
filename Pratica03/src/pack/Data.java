/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

/**
 *
 * @author mto_l
 */
public class Data {
    private String dia;
    private String mes;
    private String ano;
    
        public Data(String dia, String mes, String ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        public String formatarData() {
            String data = this.dia  + "/" +  this.mes + "/" + this.ano;
            return data;
        }
}
