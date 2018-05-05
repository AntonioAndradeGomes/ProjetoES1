package model.dao;

import conection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.*;

public class VendedorDao {
    public void create(Vendedor vendedor){
        //abrir conexao
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("INSERT INTO `infotech`.`Vendedor` (cpf, rg, nome, "
                    + "email, cidade, bairro, rua, numero, complemento, "
                    + "telefone1, telefone2, tipo, senha) "
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, vendedor.getCpf());
            stmt.setString(2, vendedor.getRg());
            stmt.setString(3, vendedor.getNome());
            stmt.setString(4, vendedor.getEmail());
            stmt.setString(5, vendedor.getCidade());
            stmt.setString(6,vendedor.getBairro());
            stmt.setString(7, vendedor.getRua());
            stmt.setLong(8, vendedor.getNumero());
            stmt.setString(9, vendedor.getComplemento());
            stmt.setString(10, vendedor.getTelefone1());
            stmt.setString(11, vendedor.getTelefone2());
            stmt.setString(12, vendedor.getTipo());
            stmt.setString(13, vendedor.getSenha());
            
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
    
    public ArrayList<Vendedor> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM `infotech`.`Vendedor`");
            rs = stmt.executeQuery();
            while(rs.next()){
                Vendedor vendedor = new Vendedor(
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
                         rs.getInt("numero"),
                        rs.getString("tipo"),
                        rs.getString("senha"));
                vendedor.setCompras(this.readCompras(vendedor));
                vendedores.add(vendedor);
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vendedores;
    }
    
    public ArrayList<Compra> readCompras(Vendedor vendedor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Compra> vendas = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM `infotech`.`Compra` where Vendedor_cpf = " + vendedor.getCpf());
            rs = stmt.executeQuery();
            while(rs.next()){
                Compra compra = new Compra(rs.getLong("codigo"),
                                            rs.getDate("data"),
                                            rs.getDouble("valor"),
                                            vendedor);
                vendas.add(compra);
            }
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vendas;
    }
    
    public Vendedor searchCpf(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vendedor v = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM `infotech`.`Vendedor` where Vendedor_cpf = " + cpf);
            rs = stmt.executeQuery();
            while (rs.next()){
                Vendedor achado = new Vendedor(
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
                         rs.getInt("numero"),
                        rs.getString("tipo"),
                        rs.getString("senha")); 
                v = achado;
            }
        } catch (Exception e) {
        }
        return v;
    }
}
