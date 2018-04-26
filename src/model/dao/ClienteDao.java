package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;
import model.bean.Cliente;

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
}
