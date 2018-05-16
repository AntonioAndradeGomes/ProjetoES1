/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathas
 */
public class TesteDao {
    public static void main(String[] args) throws ParseException, SQLException{
        
        
        
        
        
        System.out.println(readCompra());
//        Date data;
//        String convert = "1988-05-01";
//        data = Date.valueOf(convert);
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            //Tabela de compra sendo adicionado os valores
//            stmt = con.prepareStatement("INSERT INTO `infotech`.`Compra` (data, "
//                    + "valor, Vendedor_cpf) "
//                    + "Values(?,?,?)");
//            //Não precisa do código, pois é gerado automaticamente por incremento
//            stmt.setDate(1, data); //Não era pra pedir para converter para Date, já que está em formato date, mas já que o netbeans pediu coloquei
//            stmt.setDouble(2, 999.99);
//            stmt.setString(3, "123456789");
//            
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null,
//                    "Compra Realizada com sucesso");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,
//                    "Ocorreu alguma falha na compra \n"
//                            + ex);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt);
//        }
    }
    public static long readCompra() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        long maximo = 0;
        try {
            stmt = con.prepareStatement("SELECT max(Codigo_compra) FROM infotech.Compra");
            rs = stmt.executeQuery();
            if(rs.next())
                maximo = rs.getLong(1);
        } catch (Exception e) {
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
            //falta ligar os produtos as compras JOnatas
        }
        return maximo;
    }
}
