
import java.util.ArrayList;
import model.bean.Cliente;
import model.bean.Compra;
import model.bean.Produto;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;

public class Teste {

   
    public static void main(String[] args) {
        
        ClienteDao cliente = new ClienteDao();
        
        Cliente cliente2 = new Cliente("Teste","Teste","Teste","teste","teste","teste","teste",
        "teste","teste","teste",777);
        cliente.create(cliente2);     
        
    }
    
}
