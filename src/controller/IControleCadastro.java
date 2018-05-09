
package controller;

import model.bean.Cliente;
import model.dao.ClienteDao;

public interface IControleCadastro {
    public void CadastrarCliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String cidade, String rua, String bairro, String complemento, long numero);
    public void CadastrarProduto(String nome, String codigo, String descricao, 
            long quantidade, int garantia, double precoUnitario);
    public void CadastrarVendedor(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String cidade, String rua, String bairro, String complemento, 
            long numero, String tipo, String senha);
    
    public void AtualizarProduto(String nome, String codigo, String descricao, 
            long quantidade, int garantia, double precoUnitario);
    
    public void DeletarProduto(String nome, String codigo, String descricao, 
            long quantidade, int garantia, double precoUnitario);
    
    public void AtualizarCliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
        String email, String cidade, String rua, String bairro, String complemento, long numero);
    
    public boolean DeletarClienteCpf(String cpf);
}
