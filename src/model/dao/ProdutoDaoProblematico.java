package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Compra;
import model.bean.Produto;
import controller.ControleBusca;
import controller.IControleBusca;

public class ProdutoDaoProblematico {
    
    private IControleBusca i = new ControleBusca();
    public void create(Produto produto){
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar o produto! \n"
                            + ex);
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
            //    produto.setCompra(this.compras(produto));
                produtos.add(produto);
                
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
            //falta ligar os produtos as compras JOnatas
        }
        return produtos;
    }
    
    public ArrayList<Compra> compras(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Compra> ComprasDesseProduto = new ArrayList<Compra>();
        try {
            stmt = con.prepareStatement("select `infotech`.`Compra`.`Codigo_compra`, `infotech`.`Compra`.`data`, "
                                          + "`infotech`.`Compra`.`valor`, `infotech`.`compra`.`Vendedor_cpf`\n" +
                                        "from `infotech`.`Compra`,\n" +
                                        "`infotech`.`Produto_tem_Compra`, `infotech`.`Produto` \n" +
                                        "where `infotech`.`Compra`.`Codigo_compra` = `infotech`.`Produto_tem_Compra`.`Compra_Codigo_compra` and \n" +
                                        "`infotech`.`Produto`.`codigo` = `infotech`.`Produto_tem_Compra`.`Produto_codigo` and\n" +
                                        " `infotech`.`Produto`.`codigo` = " + p.getCodigo());
            //acima tem o comando para pegar todas as compras associadas ao produto passando o codigo como chave
            rs = stmt.executeQuery();
            while (rs.next()){
                Compra c = new Compra(
                           rs.getLong(1),
                           rs.getDate(2),
                           rs.getDouble(3),
                           i.buscaVendedorCpf(rs.getString(4))
                           //preciso criar uma pesquisa em vendedor.Dao passando o cpf, e outra passando o nome
                );
                
                ComprasDesseProduto.add(c);
            }
        } catch (Exception e) {
        }finally{
             ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return ComprasDesseProduto;
    }
    
    public ArrayList<Produto> buscaNome(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> produtosBuscados = new ArrayList<Produto>();
        try {
            stmt = con.prepareStatement("Select * from `infotech`.`Produto` where `infotech`.`Produto`.`nome` = " + nome);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(5),
                        rs.getLong(3),
                        rs.getInt(4),
                        rs.getDouble(6));
                p.setCompra(this.compras(p));
                produtosBuscados.add(p);
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return produtosBuscados;
    }
    public Produto buscaCode(String code){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto buscado = null;
        try {
            stmt = con.prepareStatement("Select * from `infotech`.`Produto` where `infotech`.`Produto`.`nome` = " + code);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto(
                        rs.getString(2),
                        rs.getString(1),
                        rs.getString(5),
                        rs.getLong(3),
                        rs.getInt(4),
                        rs.getDouble(6));
                p.setCompra(this.compras(p));
                buscado = p;
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        return buscado;
    }
}
