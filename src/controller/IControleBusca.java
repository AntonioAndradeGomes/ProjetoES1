
package controller;

import java.util.ArrayList;
import model.bean.*;

public interface IControleBusca {
    
    public Vendedor buscaVendedorCpf(String cpf);
    
    public Produto bucaProdutocodigo(String code);
    
    public ArrayList<Produto> buscaProdutoNome (String nome);
}
