/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleBusca;
import controller.ControleCompras;
import controller.IControleBusca;
import controller.IControleCompras;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.Produto;
import model.bean.Vendedor;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;

/**
 *
 * @author Gildo
 */
public class Vendas extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpfdocliente = new javax.swing.JTextField();
        nomecliente = new javax.swing.JTextField();
        pesquisarcpf = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        pesquisarcodigo = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        nomeproduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cpfdovendedor = new javax.swing.JTextField();
        pesquisacpfvendedor = new javax.swing.JButton();
        RealizarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Vendas");
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(674, 555));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(674, 555));
        jInternalFrame1.setVisible(true);

        jLabel1.setText("CPF do cliente");

        jLabel2.setText("Nome do cliente");

        jLabel3.setText("Codigo produto");

        cpfdocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfdoclienteActionPerformed(evt);
            }
        });

        nomecliente.setEditable(false);

        pesquisarcpf.setText("Pesquisar");
        pesquisarcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarcpfActionPerformed(evt);
            }
        });

        pesquisarcodigo.setText("Pesquisar");
        pesquisarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarcodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome produto");

        nomeproduto.setEditable(false);

        jLabel5.setText("Quantidade");

        jLabel6.setText("Valor");

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jLabel7.setText("Data");

        jLabel8.setText("Nome vendedor");

        jTextField1.setEditable(false);

        jLabel9.setText("CPF vendedor");

        cpfdovendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfdovendedorActionPerformed(evt);
            }
        });

        pesquisacpfvendedor.setText("Pesquisar");
        pesquisacpfvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisacpfvendedorActionPerformed(evt);
            }
        });

        RealizarCompra.setText("Realizar Compra");
        RealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(cpfdocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisarcpf))
                            .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigo)
                                    .addComponent(nomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(pesquisarcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(cpfdovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisacpfvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cpfdovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisacpfvendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpfdocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarcpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarcodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(RealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarcpfActionPerformed
        if(this.cpfdocliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o CPF do cliente");
        }else{
            ClienteDao pesquisa = new ClienteDao();
            Cliente dados = pesquisa.BuscaCpf(this.cpfdocliente.getText());
            if(dados == null){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }else{
                this.nomecliente.setText(dados.getNome());
            }
        }
    }//GEN-LAST:event_pesquisarcpfActionPerformed

    private void cpfdoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfdoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfdoclienteActionPerformed

    private void cpfdovendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfdovendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfdovendedorActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void RealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCompraActionPerformed
        if(QuantidadeDisponivel())
            ConfirmaCompra();
    }//GEN-LAST:event_RealizarCompraActionPerformed

    private void pesquisacpfvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisacpfvendedorActionPerformed
        if(this.cpfdovendedor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o CPF do vendedor");
        }else{
            VendedorDao pesquisa = new VendedorDao();
            Vendedor dados = pesquisa.searchCpf(this.cpfdovendedor.getText());
            if(dados == null){
                JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
            }else{
                this.jTextField1.setText(dados.getNome());
            }
        }
    }//GEN-LAST:event_pesquisacpfvendedorActionPerformed

    private void pesquisarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarcodigoActionPerformed
         if(this.codigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o codigo do produto");
        }else{
            ProdutoDao pesquisa = new ProdutoDao();
            Produto dados = pesquisa.buscaCodigo(this.codigo.getText());
            if(dados == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }else{
                this.nomeproduto.setText(dados.getNome());
            }
        }
    }//GEN-LAST:event_pesquisarcodigoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RealizarCompra;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField cpfdocliente;
    private javax.swing.JTextField cpfdovendedor;
    private javax.swing.JTextField data;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTextField nomeproduto;
    private javax.swing.JButton pesquisacpfvendedor;
    private javax.swing.JToggleButton pesquisarcodigo;
    private javax.swing.JButton pesquisarcpf;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    
    private boolean QuantidadeDisponivel(){
        try{
            double quantidade = Double.parseDouble(this.quantidade.getText());
            IControleBusca ControleBusca = new ControleBusca();
            double QuantidadeDisponivel = ControleBusca.buscaProdutocodigo(this.codigo.getText()).getQt_disponiveis();
            if(QuantidadeDisponivel - quantidade <= 0){
                JOptionPane.showMessageDialog(null, "No momento só temos " + (QuantidadeDisponivel) + "disponivel no estoque");
                return false;
            }
            return true;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Dado inválido");
            return false;
        } 
    }
    
    private void ConfirmaCompra() {  
        if(testarNulos()){
            int confirma = JOptionPane.showConfirmDialog(null, "Quer Realizar compra?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION){
                try{
                    ArrayList<Produto> produtos = new ArrayList(); //Ainda falta bolar a ideia de pegar vários produtos os dados do produto, criar for depois
                    IControleCompras compras = new ControleCompras();
                    IControleBusca ControleBusca = new ControleBusca();
                    //Manipulando data
                    Date data;
                    String convert = this.data.getText(); 
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    data = sdf.parse(convert);
                    double valor = Double.parseDouble(this.valor.getText());
                    compras.Comprar(ControleBusca.ClienteBuscaCpf(this.cpfdocliente.getText()), produtos, ControleBusca.buscaVendedorCpf(this.cpfdovendedor.getText()), data, 1, valor);
                    //Alterando quantidade
                    double quantidade = Double.parseDouble(this.quantidade.getText());
                    ProdutoDao newquantidade = new ProdutoDao();
                    newquantidade.updateQuantidade(this.codigo.getText(), quantidade);
                    this.setarCampos();
                } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Campos não foram preenchidos CORRETAMENTE!");
                    } 
            }
        } else{
            JOptionPane.showMessageDialog(null, "Campos obrigatorios não foram preenchidos!");
        }
    }     
    
    private boolean testarNulos(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(this.codigo.getText());
        lista.add(this.cpfdocliente.getText());
        lista.add(this.cpfdovendedor.getText());
        lista.add(this.jTextField1.getText());
        lista.add(this.nomecliente.getText());
        lista.add(this.nomeproduto.getText());
        lista.add(this.pesquisarcodigo.getText());
        lista.add(this.pesquisarcpf.getText());
        lista.add(this.quantidade.getText());     
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals("")){
                return false;
            }
        }
        return true;
    }
   
    private void setarCampos(){
        this.codigo.setText("");
        this.cpfdocliente.setText("");
        this.cpfdovendedor.setText("");
        this.jTextField1.setText("");
        this.nomecliente.setText("");
        this.nomeproduto.setText("");
        this.pesquisarcodigo.setText("");
        this.pesquisarcpf.setText("");
        this.quantidade.setText("");
    }
}
