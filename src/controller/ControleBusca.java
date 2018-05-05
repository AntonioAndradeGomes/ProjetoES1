/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.*;
import model.dao.*;
import javax.swing.JOptionPane;


public class ControleBusca implements IControleBusca{

    private VendedorDao vd = new VendedorDao();
    public Vendedor buscaVendedorCpf(String cpf) {
        if (vd.searchCpf(cpf) != null){
            return vd.searchCpf(cpf);
        }else{
            JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
            return vd.searchCpf(cpf);
        }
    }
    
}
