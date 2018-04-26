package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;
import model.bean.Vendedor;

public class VendedorDao {
    public void create(Vendedor vendedor){
        //abrir conexao
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Vendedor` (cpf, rg, nome, "
                    + "email, cidade, bairro, rua, numero, complemento, "
                    + "telefone1, telefone2, tipo, senha) values)"
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(0, vendedor.getCpf());
            stmt.setString(1, vendedor.getRg());
            stmt.setString(2, vendedor.getNome());
            stmt.setString(3, vendedor.getEmail());
            stmt.setString(4, vendedor.getCidade());
            stmt.setString(5,vendedor.getBairro());
            stmt.setString(6, vendedor.getRua());
            stmt.setLong(7, vendedor.getNumero());
            stmt.setString(8, vendedor.getComplemento());
            stmt.setString(9, vendedor.getTelefone1());
            stmt.setString(10, vendedor.getTelefone2());
            stmt.setString(11, vendedor.getTipo());
            stmt.setString(12, vendedor.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Salvo com sucesso o novo vendedor no BD!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar o novo vendedor! \n"
                            + ex);
        }finally{//independente de salvar ou cair na exceção acima cai nesse bloco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
