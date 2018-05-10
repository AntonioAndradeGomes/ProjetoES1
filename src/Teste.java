
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
       
       Cliente c = i.ClienteBuscaCpf("23456789101");
       JOptionPane.showMessageDialog(null, "Cliente: " + c.getCpf() + " MORA EM: " + c.getCidade() + " NO BAIRRO:" + c.getBairro() + " \n"
                    + "NA RUA: " + c.getRua() + " COM CASA DE NUMERO: " + c.getNumero() + "\n"
                    + "COMPLEMENTO: " + c.getComplemento() + "\n"
                    + "Telefone1: " + c.getTelefone1() + " Telefone2: " + c.getTelefone2());
    }
    
}
