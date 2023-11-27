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
        String sql = "INSERT INTO users(cpf, client_name, birthday, weight, height) VALUES(?, ?, ?, ?, ?)";
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
        private Connection getConnection() throws SQLException {
        // Método para estabelecer conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/gym";
        String username = "root";
        String password = "fatec";
        return DriverManager.getConnection(url, username, password);
    }

    public void excluirPeso(int idPeso) {
        String sql = "DELETE FROM weight_evolution WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPeso);
            stmt.executeUpdate();
            System.out.println("Peso excluído com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceções
        }
    }

    public void excluirAluno(String cpf) {
        String sqlDeletePesos = "DELETE FROM weight_evolution WHERE cpf_aluno = ?";
        String sqlDeleteUsuario = "DELETE FROM users WHERE cpf = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmtDeletePesos = conn.prepareStatement(sqlDeletePesos);
             PreparedStatement stmtDeleteUsuario = conn.prepareStatement(sqlDeleteUsuario)) {

            // Excluir pesos do aluno
            stmtDeletePesos.setString(1, cpf);
            stmtDeletePesos.executeUpdate();

            // Excluir usuário
            stmtDeleteUsuario.setString(1, cpf);
            stmtDeleteUsuario.executeUpdate();

            System.out.println("Aluno e pesos associados excluídos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceções
        }
    }
    public boolean clientExists(String cpf) {
        boolean exists = false;
        String sql = "SELECT COUNT(*) AS count FROM users WHERE cpf = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("count");
                    exists = count > 0;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar cliente existente: " + e.getMessage());
        }

        return exists;
    }

    }
