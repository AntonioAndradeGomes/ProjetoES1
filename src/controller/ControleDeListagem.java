
package controller;
import java.util.ArrayList;
import model.bean.Produto;
import model.dao.ProdutoDao;
public class ControleDeListagem implements IControleListagem {
    
    private ProdutoDao prod = new ProdutoDao();
    public ArrayList<Produto> Produtos() {
        return prod.read();
    }
    
    
    
}
