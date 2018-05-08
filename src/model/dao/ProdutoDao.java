
package model.dao;

import conection.ConnectionFactory;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Produto;


public class ProdutoDao {
    public boolean create(Produto produto){
        //abrir conexao
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Produto` (codigo, nome, quantidade, "
                    + "tempo_garantia, descricao, preco)"
                    + "Values(?,?,?,?,?,?)");
            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getNome());
            stmt.setLong(3, produto.getQt_disponiveis());
            stmt.setInt(4, produto.getTempo_garantia());
            stmt.setString(5, produto.getDescicao());
            stmt.setDouble(6, produto.getPrecoUnitario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Salvo com sucesso o novo produto no BD!");
            return true;
        //abaixo uma seção de gambiarras do Antonio
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex) {
            //verificar se cai no erro de já ter uma instancia no banco de dados com aqueles atributos
            return false;
            
        }catch(SQLException e){
            //se outro erro acontecer vai ser mostrado
            //vai ser retornado true, pois iria dar pau com a verificação no controller
          JOptionPane.showMessageDialog(null,
                    "erro " + e);
          return true;
        
        }finally{//independente de salvar ou cair na exceção acima cai nesse bloco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Produto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        try {
            stmt = con.prepareStatement("SELECT * FROM `infotech`.`Produto`");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(5),
                        rs.getLong(3),
                        rs.getInt(4),
                        rs.getDouble(6));
                produtos.add(produto);
                
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
            //falta ligar os produtos as compras JOnatas
        }
        return produtos;
    }
    
    
    
    //bucar Produtos passando o nome como parametro, gera um array de produtos
    public ArrayList<Produto> buscaNome(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> produtosBuscados = new ArrayList<Produto>();

        try {
            stmt = con.prepareStatement("Select * from `infotech`.`Produto` where `infotech`.`Produto`.`nome` = ?");
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(5),
                        rs.getLong(3),
                        rs.getInt(4),
                        rs.getDouble(6));
                produtosBuscados.add(p);
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return produtosBuscados;
    }
    
    
    //buscar produtos passano o codigo, retorno de uma instrancia
    public Produto buscaCodigo(String codigo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto buscado = null;
        try {
            stmt = con.prepareStatement("Select * from `infotech`.`Produto` where `infotech`.`Produto`.`codigo` = ?");
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(5),
                        rs.getLong(3),
                        rs.getInt(4),
                        rs.getDouble(6));
                buscado = p;
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return buscado;
    }
    
   public void update(Produto p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       try {
           stmt = con.prepareStatement("UPDATE `infotech`.`Produto` SET nome = ?, quantidade = ?,"
                     + "tempo_garantia = ?, descricao = ?, preco = ? where codigo = ?");
           stmt.setString(1, p.getNome());
           stmt.setLong(2, p.getQt_disponiveis());
           stmt.setInt(3, p.getTempo_garantia());
           stmt.setString(4, p.getDescicao());
           stmt.setDouble(5, p.getPrecoUnitario());
           stmt.setString(6, p.getCodigo());
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,
                    "Produto com dados atualizados com sucesso!");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,
                    "erro! " +  e);
       }
           
       
   }


             


    
}
