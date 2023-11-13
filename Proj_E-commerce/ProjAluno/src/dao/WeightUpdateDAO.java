/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import gym.ConnectionGym;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


public class WeightUpdateDAO {
    private Connection connection;
    
    public WeightUpdateDAO(){
        this.connection = new ConnectionGym().getConnection();   
    }
    public void updateWeight(int clientId, double newWeight){
        try{
            String updateSql = "UPDATE users SET weight = (?) WHERE client_id = (?)";
            PreparedStatement updateStmt = connection.prepareStatement(updateSql);
            updateStmt.setDouble(1, newWeight);
            updateStmt.setInt(2, clientId);
            updateStmt.executeUpdate();
            updateStmt.close();  
            
            String insertSql = "INSERT INTO weight_evolution (client_id, date, weight) VALUES (?,?,?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertSql);
            insertStmt.setInt(1,clientId);
            insertStmt.setDate(2, new java.sql.Date(new Date().getTime()));
            insertStmt.setDouble(3,newWeight);
            insertStmt.executeUpdate();
            insertStmt.close();
            
            }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        //lembrar de criar um botão para fazer o updade do novo peso e seu respectivo registro no BD
        //WeightUpdateDAO weightUpdateDAO = new WeightUpdateDAO();
        //int clientId = 123; // Substitua pelo ID do cliente atual
        //double newWeight = 75.5; // Substitua pelo novo peso
        //weightUpdateDAO.updateWeight(clientId, newWeight);
    }
}