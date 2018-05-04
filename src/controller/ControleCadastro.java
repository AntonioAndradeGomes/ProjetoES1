
package controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bean.*;
import model.dao.*;
public class ControleCadastro implements IControleCadastro {

    public void CadastrarCliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
        String email, String cidade, String rua, String bairro, String complemento, long numero){
        
        Cliente p = new Cliente(nome, cpf, rg, telefone1, telefone2, email,cidade, rua, bairro, complemento, numero);
        ClienteDao d = new ClienteDao();
        d.create(p);
    }

    public void CadastrarVendedor(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String cidade, String rua, String bairro, String complemento, 
            long numero, String tipo, String senha){
        
            Vendedor v = new Vendedor(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero,
                                    tipo, senha);
            VendedorDao vv = new VendedorDao();
            vv.create(v);
    }
    public void CadastrarProduto(String nome, String codigo, String descricao, long quantidade, 
        int garantia, double precoUnitario) {
            
            Produto p = new Produto(nome, codigo, descricao,quantidade, garantia, precoUnitario);
            ProdutoDao dao = new ProdutoDao();
            dao.create(p);
        
    }
}
