
package controller;

import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.TelaPrincipal;

public class ControleLogin implements IControleLogin{
    
    private Connection conexao = null;
    private PreparedStatement stmt = null; //conjunto de bibliotecas para manipular as instruções sql
    private ResultSet rs = null; //exibe o resultado das instruções sql feitos no java
    
    public boolean login(String cpf, String senha){
                //fazer uma busca no banco de dados por estas informações
        this.conexao = ConnectionFactory.getConnection();
        String sql = "select * from `infotech`.`Vendedor` where cpf=? and senha=?";
        try{
            stmt = conexao.prepareStatement(sql);//preparam a string para a ser executada no bd
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
           // executar no Bd
            rs = stmt.executeQuery();
            
            //se houve resultado da pesquisa
            if (rs.next()){
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                tela.usuario.setText(rs.getString(3));
                ConnectionFactory.closeConnection(conexao, stmt, rs);
                return true;
               // 
            }else{
                 JOptionPane.showMessageDialog(null, "Não foi encontrado essa entidade no BD");
                 return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
