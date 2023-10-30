/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_ponto;


/**
 *
 * @author mto_l
 */
public class Ponto {
    private int x;
    private int y;
    
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
        
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public float calculoDistancia(Ponto p2){
        int deltaX = this.x - p2.getX();
        int deltaY = this.y - p2.getY();
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        
        
    }
}
