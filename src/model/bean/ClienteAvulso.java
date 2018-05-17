/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class ClienteAvulso extends Usuario {
    private ArrayList<Compra> compras;
    public ClienteAvulso(){
        this.setCpf("0");
        this.setRg("0");
        this.setNome("Avulso");
        this.setCiade("Sem cidade");
        this.setBairro("Sem Bairro");
        this.setRua("Sem rua");
    }
}
