/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleBusca;
import controller.ControleCadastro;
import controller.ControleDeListagem;
import controller.IControleBusca;
import controller.IControleCadastro;
import controller.IControleListagem;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import model.bean.Cliente;

/**
 *
 * @author gomes
 */
public class ListaClientes extends javax.swing.JFrame {

    private String cpf_selecionado = null;
    private String tipo;
    public ListaClientes() {
        initComponents();
        this.read();
        this.read.setEnabled(false);
        
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
        if (!(tipo.equals("GERENTE") || tipo.equals("gerente") || tipo.equals("Gerente"))){
            this.deletar.setEnabled(false);
            this.update.setEnabled(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        BuscarNome = new javax.swing.JButton();
        dados = new javax.swing.JButton();
        read = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        buscarCpf = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de listagem de cliente");
        setResizable(false);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "RG", "Nome", "Email", "Cidade", "Bairro", "rua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("");
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        BuscarNome.setText("Buscar Pelo nome do Cliente");
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });

        dados.setText("Mais dados de Telefone e Endereço");
        dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosActionPerformed(evt);
            }
        });

        read.setText("Voltar ao Normal");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        buscarCpf.setText("Buscar Pelo CPF do Cliente");
        buscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCpfActionPerformed(evt);
            }
        });

        jButton2.setText("Minhas Compras");

        update.setText("Atualizar dados Cliente");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buscarCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(read))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dados)
                    .addComponent(jButton2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(deletar))
                .addContainerGap(729, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNome)
                    .addComponent(dados)
                    .addComponent(deletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarCpf)
                    .addComponent(jButton2)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(read)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String getCpf_selecionado() {
        return cpf_selecionado;
    }

    private void setCpf_selecionado(String cpf_selecionado) {
        this.cpf_selecionado = cpf_selecionado;
    }
    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        if (this.tabela.getSelectedRow() != -1) {
            this.setCpf_selecionado(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tabelaKeyPressed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome do Cliente!");
        IControleBusca i = new ControleBusca();
        ArrayList<Cliente> lista = i.ClienteBuscaNome(nome);
        if (lista.size() > 0) {
            DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
            modelo.setNumRows(0); //eliminar duplicadas do java 

            for (Cliente c : lista) {
                modelo.addRow(new Object[]{
                    c.getCpf(),
                    c.getRg(),
                    c.getNome(),
                    c.getEmail(),
                    c.getCidade(),
                    c.getBairro(),
                    c.getRua()
                });
            }
            this.read.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sem resultados");
            this.read();

        }

    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        this.read();
        this.read.setEnabled(false);
    }//GEN-LAST:event_readActionPerformed

    private void dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosActionPerformed

        if (this.tabela.getSelectedRow() != -1) {
            IControleBusca i = new ControleBusca();
            Cliente c = i.ClienteBuscaCpf(this.getCpf_selecionado());
            JOptionPane.showMessageDialog(null, "Cliente: " + c.getCpf() + " MORA EM: " + c.getCidade() + " NO BAIRRO:" + c.getBairro() + " \n"
                    + "NA RUA: " + c.getRua() + " COM CASA DE NUMERO: " + c.getNumero() + "\n"
                    + "COMPLEMENTO: " + c.getComplemento() + "\n"
                    + "Telefone1: " + c.getTelefone1() + " Telefone2: " + c.getTelefone2());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha depois clique nesse botao");
        }
    }//GEN-LAST:event_dadosActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (this.tabela.getSelectedRow() != -1) {
            this.setCpf_selecionado(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void buscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCpfActionPerformed
        String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente");
        IControleBusca i = new ControleBusca();
        Cliente c = i.ClienteBuscaCpf(cpf);
        if (c != null && !cpf.equals("")) {
            DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
            modelo.setNumRows(0);
            modelo.addRow(new Object[]{
                c.getCpf(),
                c.getRg(),
                c.getNome(),
                c.getEmail(),
                c.getCidade(),
                c.getBairro(),
                c.getRua()
            });
            this.read.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sem resultados");
            this.read();
        }
    }//GEN-LAST:event_buscarCpfActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        if (this.tabela.getSelectedRow() != -1) {
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja deletar este Cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                IControleCadastro i = new ControleCadastro();
                i.DeletarClienteCpf(this.getCpf_selecionado());
                this.read();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma tabela depois tente remover \n"
                    + "SE REALMENTE QUIZER CLARO!!!");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (this.tabela.getSelectedRow() != -1) {
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados deste Cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION){
                IControleBusca i = new ControleBusca();
                Cliente c = i.ClienteBuscaCpf(this.getCpf_selecionado());
                AtualizarCliente tela = new AtualizarCliente();
                tela.setCliente(c);
                tela.setVisible(true);
                this.dispose();
            }
        }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha tabela depois tente atualizar \n"
                    + "SE REALMENTE QUIZER CLARO!!!");
        }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    public void read() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        modelo.setNumRows(0); //eliminar duplicadas do java 
        IControleListagem i = ControleDeListagem.getInstace();
        for (Cliente c : i.Clientes()) {
            modelo.addRow(new Object[]{
                c.getCpf(),
                c.getRg(),
                c.getNome(),
                c.getEmail(),
                c.getCidade(),
                c.getBairro(),
                c.getRua()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNome;
    private javax.swing.JButton buscarCpf;
    private javax.swing.JButton dados;
    private javax.swing.JButton deletar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton read;
    private javax.swing.JTable tabela;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
