package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDao {
    
    public void create(Produto produto){
        //abrir conexao
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Produto` (codigo, nome, quantidade, "
                    + "tempo_garantia, descricao, preco)"
                    + "Values(?,?,?,?,?,?)");
            stmt.setString(0, produto.getCodigo());
            stmt.setString(1, produto.getNome());
            stmt.setLong(2, produto.getQt_disponiveis());
            stmt.setInt(3, produto.getTempo_garantia());
            stmt.setString(4, produto.getDescicao());
            stmt.setDouble(5, produto.getPrecoUnitario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Salvo com sucesso o novo produto no BD!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar o produto! \n"
                            + ex);
        }finally{//independente de salvar ou cair na exceção acima cai nesse bloco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
