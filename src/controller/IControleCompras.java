
package controller;

import model.bean.*;


public interface IControleCompras {
    public void Comprar(Cliente cliente, Produto produto, Vendedor vendedor);
    public Compra ListarCompras(Cliente cliente);
    public Compra BuscarCompra(String nomeProduto);
}
