
package controller;
import java.util.ArrayList;
import model.bean.Cliente;
import model.bean.Produto;
import model.bean.Vendedor;
import model.dao.*;
public class ControleDeListagem implements IControleListagem {
    
    private ProdutoDao prod = new ProdutoDao();
    private ClienteDao cli = new ClienteDao();
    private VendedorDao vend = new VendedorDao();
    public ArrayList<Produto> Produtos() {
        return prod.read();
    }

    public ArrayList<Cliente> Clientes() {
        return cli.readCliente();
    }


    public ArrayList<Vendedor> Vendedores() {
        return vend.read();
    }
    
    
    
}
