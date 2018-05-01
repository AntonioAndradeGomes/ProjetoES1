
package controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bean.*;
import model.dao.*;
public class ControleCadastro implements IControleCadastro {

    public void CadastrarCliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String cidade, String rua, String bairro, String complemento, long numero){
        
        int confirma = JOptionPane.showConfirmDialog(null, "Quer cadastrar esse cliente?", "Confiarmar", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            Cliente p = new Cliente(nome, cpf, rg, telefone1, telefone2, email,cidade, rua, bairro, complemento, numero);
            ClienteDao d = new ClienteDao();
            d.create(p);
        }
    }

    public void CadastrarProduto() {
        
    }
}
