package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.Compra;

public class ClienteDao {
    public void create(Cliente cliente){
        //abrir conexao
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Cliente` (cpf, rg, nome, "
                    + "email, cidade, bairro, rua, numero, complemento, "
                    + "telefone1, telefone2) "
                    + "Values(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getNome());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getCidade());
            stmt.setString(6, cliente.getBairro());
            stmt.setString(7, cliente.getRua());
            stmt.setLong(8, cliente.getNumero());
            stmt.setString(9, cliente.getComplemento());
            stmt.setString(10, cliente.getTelefone1());
            stmt.setString(11, cliente.getTelefone2());


            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Salvo com sucesso o novo cliente no BD!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar o novo cliente! \n"
                            + ex);
        }finally{//independente de salvar ou cair na exceção acima cai nesse bloco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Cliente> readCliente(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM `infotech`.`Cliente`");
            rs = stmt.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente(
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("rg"),
                        rs.getString("telefone1"),
                        rs.getString("telefone2"),
                        rs.getString("email"),
                        rs.getString("cidade"),
                        rs.getString("bairro"),
                        rs.getString("rua"),
                        rs.getString("complemento"),
                        rs.getInt("numero"));
                clientes.add(c);
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }
    
    public void update(Cliente cliente){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       try {
           stmt = con.prepareStatement("UPDATE `infotech`.`Cliente` SET nome = ?, email = ?,"
                     + "cidade = ?, bairro = ?, rua = ?, numero = ?, complemento = ?, telefone1 = ?, telefone2 = ?,"
                   + " where cpf = ?");
           stmt.setString(1, cliente.getNome());
           stmt.setString(2, cliente.getEmail());
           stmt.setString(3, cliente.getCidade());
           stmt.setString(4, cliente.getBairro());
           stmt.setString(5, cliente.getRua());
           stmt.setLong(6, cliente.getNumero());
           stmt.setString(7, cliente.getComplemento());
           stmt.setString(8, cliente.getTelefone1());
           stmt.setString(9, cliente.getTelefone2());
           stmt.setString(10, cliente.getCpf());
 
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,
                    "Dados do cliente atualizados com sucesso!");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,
                    "erro! " +  e);
       }finally{
            ConnectionFactory.closeConnection(con, stmt); 
       } 
    }
    
    public Cliente BuscaCpf(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente buscado = null;
        try {
            stmt = con.prepareStatement("Select * from `infotech`.`Cliene` where `infotech`.`Cliente`.`cpf` = ?");
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente p = new Cliente(
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("rg"),
                    rs.getString("telefone1"),
                    rs.getString("telefone2"),
                    rs.getString("email"),
                    rs.getString("cidade"),
                    rs.getString("bairro"),
                    rs.getString("rua"),
                    rs.getString("complemento"),
                    rs.getInt("numero")    
                );
                buscado = p;
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return buscado;
    }
    
//    public ArrayList<Cliente> buscaNome(String nome){
//        
//    }
    
    public void removeCpf (String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from `infotech`.`Cliente` where `infotech`.`Cliente`.`cpf` = ?");
            stmt.setString(1, cpf);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Cliete deletado com sucesso!");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,
                    "erro! " +  e);
        }finally{
             ConnectionFactory.closeConnection(con, stmt); 
       } 
    }
    
    public void remove (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from `infotech`.`Cliente` where `infotech`.`Cliente`.`cpf` = ?");
            stmt.setString(1, c.getCpf());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Cliete deletado com sucesso!");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,
                    "erro! " +  e);
        }finally{
             ConnectionFactory.closeConnection(con, stmt); 
       } 
    }
 }
//falta descobrir o comando sql que exiba todas as compras feitas por um cliente dado seu cpf
//JOnathas 

    
    
//    public void Cliente_compra(Cliente cliente){ //Tabela de Cliente e compra, ou seja, compras realizadas pelo cliente
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO `infotech`.`Cliente_Realiza_Compra` (Compra_Codigo_compra, "
//                    + "Cliente_cpf) "
//                    + "Values(?,?)");
//            stmt.setString(1, cliente.getCompraAtual().getCodigo());
//            stmt.setString(2, cliente.getCpf());
//            
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null,
//                    "Salvo com sucesso o novo cliente no BD!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,
//                    "Erro ao salvar o novo cliente! \n"
//                            + ex);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    
