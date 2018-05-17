package controller;
import java.util.ArrayList;
import java.sql.Date;
import model.bean.*;
import model.dao.CompraDao;

public class ControleCompras implements IControleCompras {
    
    

    public Compra ListarCompras(Cliente cliente) {
        return null; //enquanto não implementei nada deixa assim
    }

    public Compra BuscarCompra(String nomeProduto) {
        return null; //enquanto não implementei nada deixa assim
    }

    public void Comprar(Cliente cliente, Vendedor vendedor, Date data, long codigo, double valor, String Codigoproduto) {
        Compra compra = new Compra(codigo, data, valor, vendedor);
        compra.setComprador(cliente);
        CompraDao realizada = new CompraDao();
        realizada.Create(compra, Codigoproduto);
        //Compra compra = new Compra(long codigo, Date data, double valor, Vendedor vendedor);
    }   
}
