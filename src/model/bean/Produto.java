package model.bean;

import java.util.ArrayList;

public class Produto {
    private String nome, codigo, descicao;
    private long qt_disponiveis;
    private int tempo_garantia;
    private double precoUnitario;
    private ArrayList<Compra> compra;

    public Produto(String nome, String codigo, String descicao, long qt_disponiveis, 
            int tempo_garantia, double precoUnitario) 
    {
        this.nome = nome;
        this.codigo = codigo;
        this.descicao = descicao;
        this.qt_disponiveis = qt_disponiveis;
        this.tempo_garantia = tempo_garantia;
        this.precoUnitario = precoUnitario;
        this.compra = new ArrayList<Compra>();
       
    }

    public ArrayList<Compra> getCompra() {
        return compra;
    }

    public void setCompra(ArrayList<Compra> compra) {
        this.compra = compra;
    }
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public long getQt_disponiveis() {
        return qt_disponiveis;
    }

    public void setQt_disponiveis(long qt_disponiveis) {
        this.qt_disponiveis = qt_disponiveis;
    }

    public int getTempo_garantia() {
        return tempo_garantia;
    }

    public void setTempo_garantia(int tempo_garantia) {
        this.tempo_garantia = tempo_garantia;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
