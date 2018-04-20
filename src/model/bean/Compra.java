package model.bean;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private Cliente comprador;
    private ArrayList<Produto> produtos;
    private String codigo;
    private Date data;
    private double valor;
    private Vendedor vendedor;

    public Compra(Cliente comprador, ArrayList<Produto> produtos, 
            String codigo, Date data, double valor, Vendedor vendedor) 
    {    
        this.comprador = comprador;
        this.produtos = produtos;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
