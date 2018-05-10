package controller;

import java.util.ArrayList;
import model.bean.Cliente;
import model.bean.Produto;
import model.bean.Vendedor;

public interface IControleListagem {
    
    public ArrayList<Produto> Produtos();
    public ArrayList<Cliente> Clientes();
    public ArrayList<Vendedor> Vendedores();
    
}
