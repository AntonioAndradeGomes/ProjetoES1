
package controller;

import java.util.ArrayList;
import java.sql.Date;
import model.bean.*;


public interface IControleCompras {
    public void Comprar(Cliente cliente, ArrayList<Produto> produto, Vendedor vendedor, Date data, long codigo, double valor);
    public Compra ListarCompras(Cliente cliente);
    public Compra BuscarCompra(String nomeProduto);
}
