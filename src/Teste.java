
import java.util.ArrayList;
import model.bean.Produto;
import model.dao.ProdutoDao;
import model.dao.ProdutoDaoProblematico;
public class Teste {

   
    public static void main(String[] args) {
      
        ProdutoDao t = new ProdutoDao();
        ArrayList<Produto> p = t.buscaNome("cabo usb tipo c");

//        ArrayList<Produto> pds = t.buscaNome("teste");
        for (int i = 0; i < p.size(); i++){
            System.out.println(p.get(i).getNome());
        }
//        }
        
    }
    
}
