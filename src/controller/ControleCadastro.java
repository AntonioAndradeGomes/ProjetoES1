package controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bean.*;
import model.dao.*;

public class ControleCadastro implements IControleCadastro {

    public void CadastrarVendedor(String nome, String cpf, String rg, String telefone1, String telefone2,
            String email, String cidade, String rua, String bairro, String complemento,
            long numero, String tipo, String senha) {

        Vendedor v = new Vendedor(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero,
                tipo, senha);
        VendedorDao vv = new VendedorDao();
        vv.create(v);
    }

    public void DeletarVendedorCpf(String cpf) {
       VendedorDao d = new VendedorDao();
       Vendedor achado = d.searchCpf(cpf);
       d.remove(achado);
        
    }
    
    
    public void AtualizarVendedor(Vendedor v){
       VendedorDao d = new VendedorDao();
       d.update(v);
    }
    public void CadastrarProduto(String nome, String codigo, String descricao, long quantidade,
            int garantia, double precoUnitario) {

        Produto p = new Produto(nome, codigo, descricao, quantidade, garantia, precoUnitario);
        ProdutoDao dao = new ProdutoDao();
        boolean flag = dao.create(p);

        if (flag != true) {
            int confirma = JOptionPane.showConfirmDialog(null, "Produto ja existe no Banco de dados \n"
                    + "Deseja Atualizar existente com os dados novos", "Confiarmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                dao.update(new Produto(nome, codigo, descricao, quantidade, garantia, precoUnitario));
            }
        }
    }

    public void AtualizarProduto(String nome, String codigo, String descricao, long quantidade, int garantia, double precoUnitario) {
        Produto p = new Produto(nome, codigo, descricao, quantidade, garantia, precoUnitario);
        ProdutoDao dao = new ProdutoDao();
        dao.update(p);
    }

    public void DeletarProduto(String nome, String codigo, String descricao, long quantidade, int garantia, double precoUnitario) {
        Produto p = new Produto(nome, codigo, descricao, quantidade, garantia, precoUnitario);
        ProdutoDao dao = new ProdutoDao();
        dao.Delete(p);
    }

    public void CadastrarCliente(String nome, String cpf, String rg, String telefone1, String telefone2,
            String email, String cidade, String rua, String bairro, String complemento, long numero) {

        Cliente p = new Cliente(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero);
        ClienteDao d = new ClienteDao();
        d.create(p);
    }

//    public void AtualizarCliente(String nome, String cpf, String rg, String telefone1, String telefone2,
//            String email, String cidade, String rua, String bairro, String complemento, long numero) {
//        
//        Cliente p = new Cliente(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero);
//        ClienteDao d = new ClienteDao();
//        d.update(p);
//    }
//    
    public void AtualizarCliente(Cliente c) {
        
       // Cliente p = new Cliente(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero);
        ClienteDao d = new ClienteDao();
        d.update(c);
    }


    public void DeletarClienteCpf(String cpf) {
        ClienteDao d = new ClienteDao();
        Cliente achado = d.BuscaCpf(cpf);
        d.remove(achado);
    }

    

}
