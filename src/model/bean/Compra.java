package model.bean;

import java.util.ArrayList;
import java.sql.Date;

public class Compra {
    private Cliente comprador;
    private ArrayList<Produto> produtos;
    private long codigo;
    private Date data;
    private double valor;
    private Vendedor vendedor;

    public Compra(long codigo, Date data, double valor, Vendedor vendedor) 
    {    
//        this.comprador = comprador;
        this.produtos = new ArrayList<Produto>();
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
  

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
