/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.bean.*;
import model.dao.*;
import javax.swing.JOptionPane;


public class ControleBusca implements IControleBusca{

    private ProdutoDao pd = new ProdutoDao();
    private VendedorDao vd = new VendedorDao();
    private ClienteDao cd = new ClienteDao();
    
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
       if(cd.BuscaCpf(cpf).equals(null)){
           return null;
       }else{
           return cd.BuscaCpf(cpf);
       }
    }
    public ArrayList<Cliente> ClienteBuscaNome (String nome){
        return cd.buscaNome(nome);
    }
}
