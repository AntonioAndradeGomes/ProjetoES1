package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;
import model.bean.Compra;

public class CompraDao {
    public void Create(Compra compra){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Tabela de compra sendo adicionado os valores
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Compra` (Codigo_compra, "
                    + "data, valor, Vendedor_cpf) "
                    + "Values(?,?,?,?)");
            stmt.setLong(1, compra.getCodigo());
            stmt.setDate(2, (Date) compra.getData()); //Não era pra pedir para converter para Date, já que está em formato date, mas já que o netbeans pediu coloquei
            stmt.setDouble(3, compra.getValor());
            stmt.setString(4, compra.getVendedor().getCpf());
            
            //Tabela de cliente realizando compra
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Cliente_Realiza_Compra` (Compra_Codigo_compra, "
                    + "Cliente_cpf) "
                    + "Values(?,?)");
            stmt.setLong(1, compra.getCodigo());
            stmt.setString(2, compra.getVendedor().getCpf());
            
            //Tabela de Produto tem Compra
            for(int i = 0; i < compra.getProdutos().size(); i++){
                stmt = con.prepareStatement("INSERT INTO `infotech`.`Produto_tem_Compra` (Produto_codigo, "
                    + "Compra_Codigo_compra) "
                    + "Values(?,?)");
                stmt.setLong(1, compra.getCodigo());
                stmt.setString(2, compra.getProdutos().get(i).getCodigo());    
            }
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Compra Realizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu alguma falha na compra \n"
                            + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
    
//    public void Create(Compra compra, Vendedor vendedor){ //Como Vendedor é chave estrangeira, compra só vai ser criada com algum vendedor já cadastrado.
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO `infotech`.`Compra` (Codigo_compra, "
//                    + "data, valor, Vendedor_cpf) "
//                    + "Values(?,?,?,?)");
//            stmt.setString(1, compra.getCodigo());
//            stmt.setDate(2, (Date) compra.getData()); //Não era pra pedir para converter para Date, já que está em formato date, mas já que o netbeans pediu coloquei
//            stmt.setDouble(3, compra.getValor());
//            stmt.setString(4, vendedor.getCpf());
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
//    public void Compra_realizada(Produto produto, Compra compra){ //Tabela Produto_Tem_Compra, que é formada pela chave estrangeira produto e compra
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO `infotech`.`Produto_tem_Compra` (Produto_codigo, "
//                    + "Compra_Codigo_compra) "
//                    + "Values(?,?)");
//            stmt.setString(1, produto.getCodigo());
//            stmt.setString(2, compra.getCodigo());
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
}
