
import java.util.ArrayList;
import model.bean.Cliente;
import model.bean.Compra;
import model.bean.Produto;
import model.bean.Vendedor;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;

public class Teste {

   
    public static void main(String[] args) {
        
        ClienteDao cliente = new ClienteDao();        
        Cliente cliente2 = new Cliente("Teste","Teste","Teste","teste","teste","teste","teste",
        "teste","teste","teste",777);
        cliente.create(cliente2);    
        System.out.println(cliente.BuscaCpf("Teste").getBairro());
  
        VendedorDao d = new VendedorDao();
        for (Vendedor dd: d.read()){
            System.out.println(dd.getNome());
        }
    }
    
}
