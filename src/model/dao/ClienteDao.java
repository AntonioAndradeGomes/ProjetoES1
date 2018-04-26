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
            stmt.setString(0, cliente.getCpf());
            stmt.setString(1, cliente.getRg());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getBairro());
            stmt.setString(6, cliente.getRua());
            stmt.setLong(7, cliente.getNumero());
            stmt.setString(8, cliente.getComplemento());
            stmt.setString(9, cliente.getTelefone1());
            stmt.setString(10, cliente.getTelefone2());

            
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
