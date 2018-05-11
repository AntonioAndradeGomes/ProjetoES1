
package controller;

import java.util.ArrayList;
import model.bean.*;

public interface IControleBusca {
    
    public Vendedor buscaVendedorCpf(String cpf);
    
    public Produto buscaProdutocodigo(String code);
    
    public ArrayList<Produto> buscaProdutoNome (String nome);
    
    public Cliente ClienteBuscaCpf(String cpf);
    
    public ArrayList<Cliente> ClienteBuscaNome (String nome);
    
    public ArrayList<Vendedor> BuscaVendedorNome (String nome);
}
