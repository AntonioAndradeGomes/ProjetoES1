/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class TelaCliente extends javax.swing.JInternalFrame {
    private String tipo_vendedor;
    /**
     * Creates new form Cliente
     */
    public TelaCliente(String tipo) {
        initComponents(); 
        this.tipo_vendedor = tipo;
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        label_cpf = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        label_cpf10 = new javax.swing.JLabel();
        label_cpf11 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        label_cpf13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        label_cpf14 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JTextField();
        label_cpf15 = new javax.swing.JLabel();
        telefone2 = new javax.swing.JTextField();
        label_cpf16 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        label_cpf17 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        label_cpf18 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        label_cpf19 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        label_cpf21 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Cliente");
        setPreferredSize(new java.awt.Dimension(674, 555));

        label_titulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        label_titulo.setText("Registrar Clientes");
        label_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        label_cpf.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf.setText("*CPF");

        label_cpf10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf10.setText("*RG");

        label_cpf11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf11.setText("*NOME");

        label_cpf13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf13.setText("EMAIL");

        label_cpf14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf14.setText("TEL");

        label_cpf15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf15.setText("TEL 2");

        label_cpf16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf16.setText("*RUA");

        label_cpf17.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf17.setText("*CIDADE");

        label_cpf18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf18.setText("*BAIRRO");

        rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaActionPerformed(evt);
            }
        });

        label_cpf19.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf19.setText("NUMERO");

        label_cpf21.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf21.setText("COMPLEMENTO");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("o que esta com * no começo é obrigatorio");

        listar.setText("Listar Todos os Clientes");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cpf11)
                            .addComponent(label_cpf10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_cpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_titulo)
                            .addComponent(jLabel1))
                        .addGap(242, 242, 242))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cpf14)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_cpf17)
                                    .addComponent(label_cpf16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_cpf18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_cpf19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_cpf13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_cpf21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(listar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(125, 125, 125))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_cpf15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_cpf10)
                        .addComponent(label_cpf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf13)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf14)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf15)
                    .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf17)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf18)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf19)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf21)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setBounds(0, 0, 640, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
       //RESOLVER O PROBLEMA DO mysql permitir campos '' e não os considerar como null
        int confirma = JOptionPane.showConfirmDialog(null, "Quer cadastrar esse cliente?", "Confiarmar", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            ArrayList<String> lista = new ArrayList<String>();
            lista.add(this.nome.getText());
            lista.add(this.cpf.getText());
            lista.add(this.rg.getText());
            lista.add(this.cidade.getText());
            lista.add(this.rua.getText());
            lista.add(this.bairro.getText());
            if(testeNulos(lista)){
                try{
                    long num;
                    if (this.numero.getText().equals("")){//receber o numero para transformar em int
                        num = 0;
                    }else{
                        num = Long.parseLong(this.numero.getText()); //coloacr na variavel num o valor da casa
                    }
                  
                    IControleCadastro c = new ControleCadastro(); //instanciar o controlador de cadastro
                    c.CadastrarCliente(this.nome.getText(), this.cpf.getText(), this.rg.getText(), this.telefone1.getText(), this.telefone2.getText(), this.email.getText(), this.cidade.getText(), 
                       this.rua.getText(), this.bairro.getText(), this.complemento.getText(), num);
                    this.setarCampos();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Campos não foram preenchidos CORRETAMENTE!");
                } 
             }else{
                    JOptionPane.showMessageDialog(null, "Campos obrigatorios não foram preenchidos!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed
   
    private boolean testeNulos(ArrayList<String> lista){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals("")){
                return false;
            }
        }
        return true;
    }
   
    private void setarCampos(){
        this.nome.setText(""); this.cpf.setText(""); this.rg.setText(""); this.telefone1.setText("");
        this.telefone2.setText(""); this.email.setText(""); this.cidade.setText("");this.email.setText(""); this.cidade.setText(""); this.rua.setText(""); this.bairro.setText(""); this.complemento.setText("");
        this.numero.setText("");
    }
    private void ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        ListaClientes l = new ListaClientes();
        l.setTipo(this.tipo_vendedor);
        l.setVisible(true);
    }//GEN-LAST:event_listarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_cpf;
    private javax.swing.JLabel label_cpf10;
    private javax.swing.JLabel label_cpf11;
    private javax.swing.JLabel label_cpf13;
    private javax.swing.JLabel label_cpf14;
    private javax.swing.JLabel label_cpf15;
    private javax.swing.JLabel label_cpf16;
    private javax.swing.JLabel label_cpf17;
    private javax.swing.JLabel label_cpf18;
    private javax.swing.JLabel label_cpf19;
    private javax.swing.JLabel label_cpf21;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JButton listar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField telefone1;
    private javax.swing.JTextField telefone2;
    // End of variables declaration//GEN-END:variables
}
