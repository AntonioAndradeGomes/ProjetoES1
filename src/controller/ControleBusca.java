package controller;

import java.util.ArrayList;
import model.bean.*;
import model.dao.*;
import javax.swing.JOptionPane;


public class ControleBusca implements IControleBusca{

    private final ProdutoDao pd = new ProdutoDao();
    private final VendedorDao vd = new VendedorDao();
    private final ClienteDao cd = new ClienteDao();
    
    public Vendedor buscaVendedorCpf(String cpf) {
       return vd.searchCpf(cpf);
    }

    public Produto buscaProdutocodigo(String code) {
        return pd.buscaCodigo(code);
    }

    public ArrayList<Produto> buscaProdutoNome(String nome) {
        return pd.buscaNome(nome);
    }

    public Cliente ClienteBuscaCpf(String cpf) {
           return cd.BuscaCpf(cpf);
    }
    public ArrayList<Cliente> ClienteBuscaNome (String nome){
        return cd.buscaNome(nome);
    }
    
    public ArrayList<Vendedor> BuscaVendedorNome(String nome){
        return vd.buscaNome(nome);
    }
}
