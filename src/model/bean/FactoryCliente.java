/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Jonathas
 */
public class FactoryCliente {
    public Usuario getPessoa(String tipo) {
        if (tipo.equals("Avulso")){
                return new ClienteAvulso();
        }else{
                return new Cliente();
        }
    }
}
