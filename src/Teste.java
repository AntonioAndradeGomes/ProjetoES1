
import controller.ControleBusca;
import controller.IControleBusca;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.Compra;
import model.bean.Produto;
import model.bean.Vendedor;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;

public class Teste {

   
    public static void main(String[] args) {
        
       IControleBusca i = new ControleBusca();
       
       VendedorDao v = new VendedorDao();
       System.out.println(v.searchCpf("12345678900").getNome());
    }
}
