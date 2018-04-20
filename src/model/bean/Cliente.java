
package model.bean;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private ArrayList<Compra> compra;
    
    public Cliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String ciade, String rua, String bairro, String complemento, long numero) 
    {    
        super(nome, cpf, rg, telefone1, telefone2, email, 
                ciade, rua, bairro, complemento, numero);
        this.compra = new ArrayList<Compra>();
    }

    public ArrayList<Compra> getCompra() {
        return compra;
    }
    
}
