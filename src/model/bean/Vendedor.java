package model.bean;

import java.util.ArrayList;

public class Vendedor extends Usuario{
    
    private String senha;
    private String tipo;
    private ArrayList<Compra> compras;
    
    public Vendedor(String nome, String cpf, String rg, String telefone1, String telefone2,
            String email, String cidade, String rua, String bairro, String complemento, long numero, String tipo, 
            String senha) 
    {    
        super(nome, cpf, rg, telefone1, telefone2, email, cidade, rua, bairro, complemento, numero);
        this.senha = senha;
        this.tipo = tipo;
        this.compras = new ArrayList<Compra>();
    }


    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
