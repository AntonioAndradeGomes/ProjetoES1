
package model.bean;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private ArrayList<Compra> compras; //Todas as compras feitas
    private Compra atual; //Compra atual, que vai ser inserido no banco de dados
    public Cliente(){}
    public Cliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String cidade, String rua, String bairro, String complemento, long numero) 
    {    
        super(nome, cpf, rg, telefone1, telefone2, email, 
                cidade, rua, bairro, complemento, numero);
        this.compras = new ArrayList<Compra>();
    }

    public ArrayList<Compra> getCompra() {
        return compras;
    }
    
    public void serCompras(ArrayList<Compra> compras){
        this.compras = compras;
    }
    
    public void comprar(Compra comprarealizada){ //Adicionando nova compra do cliente
        this.atual = comprarealizada;
        compras.add(atual); //Adicionando no historico de compras
    }
    public Compra getCompraAtual(){
        return this.atual;
    }
    
}
