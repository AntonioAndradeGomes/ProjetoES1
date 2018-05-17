
package controller;
import java.util.ArrayList;
import model.bean.Cliente;
import model.bean.Produto;
import model.bean.Vendedor;
import model.dao.*;
public class ControleDeListagem implements IControleListagem {
    //implementei o singleton só para passar pelas metas do professor
    private final ProdutoDao prod = new ProdutoDao();
    private final ClienteDao cli = new ClienteDao();
    private final VendedorDao vend = new VendedorDao();
    private static ControleDeListagem instancia;
    
    private ControleDeListagem(){}
    
    public static synchronized ControleDeListagem getInstace(){
        if (instancia == null){
            instancia = new ControleDeListagem();
        }
        return instancia;
    }
   
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
