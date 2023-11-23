/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import gym.ConnectionGym;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.Client;

/**
 *
 * @author mto_l
 */
public class ClientDAO {
    private Connection connection;
    
    public ClientDAO(){
        this.connection = new ConnectionGym().getConnection();
    }
    
    public void addName(Client client){
        String sql = "INSERT INTO users(cpf, name, birthday, weight, height) VALUES(?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,client.getCpf());
            stmt.setString(2, client.getName());
            stmt.setString(3, client.getBirthday());
            stmt.setDouble(4,client.getWeight());
            stmt.setDouble(5,client.getHeight());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException u){
            throw new RuntimeException(u);
        }
        
    
    }
}