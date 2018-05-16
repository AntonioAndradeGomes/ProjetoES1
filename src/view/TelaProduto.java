package view;

import controller.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Produto;

/**
 *
 * @author julio
 */
public class TelaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Produto
     */
    public TelaProduto(String tipo) {
        initComponents();
        this.read();
        this.read.setEnabled(false);
        //dando somente ao gerente permissão pra realizar operações sql
        if (tipo.equals("gerente") || tipo.equals("Gerente") || tipo.equals("GERENTE")) {
            this.deletar.setEnabled(true);
            this.atualizar.setEnabled(true);
            this.btn_cadastrar.setEnabled(true);
        } else {
            this.deletar.setEnabled(false);
            this.atualizar.setEnabled(false);
            this.btn_cadastrar.setEnabled(false);
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

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        label_codigo = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_valor = new javax.swing.JLabel();
        campo_codigo = new javax.swing.JTextField();
        campo_garantia = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        label_descricao = new javax.swing.JLabel();
        campo_descricao = new javax.swing.JTextField();
        campo_quantidade = new javax.swing.JTextField();
        label_quantidade = new javax.swing.JLabel();
        campo_valor = new javax.swing.JTextField();
        label_garantia = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        atualizar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        pesquisarNome = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        read = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tela de Cadastro de Produtos e Visulização de Estoque");
        setMaximumSize(new java.awt.Dimension(727, 634));
        setMinimumSize(new java.awt.Dimension(727, 634));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(727, 634));

        label_codigo.setText("*CODIGO");

        label_nome.setText("*NOME");

        label_valor.setText("*VALOR R$");

        campo_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_codigoActionPerformed(evt);
            }
        });

        campo_garantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_garantiaActionPerformed(evt);
            }
        });

        campo_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nomeActionPerformed(evt);
            }
        });

        label_descricao.setText("DESCRIÇÃO");

        campo_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_descricaoActionPerformed(evt);
            }
        });

        campo_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_quantidadeActionPerformed(evt);
            }
        });

        label_quantidade.setText("*QUANTIDADE");

        campo_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_valorActionPerformed(evt);
            }
        });

        label_garantia.setText("GARANTIA (MESES)");

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Garantia", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEstoqueMouseClicked(evt);
            }
        });
        tabelaEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaEstoqueKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEstoque);

        jLabel1.setText("o que esta com * no começo é obrigatorio");

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        pesquisarNome.setText("Pesquisar por nome");
        pesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarNomeActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar por código");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        read.setText("Mostrar todos os produtos");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campo_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_valor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_garantia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campo_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(label_descricao)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(label_codigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_nome)
                            .addGap(167, 167, 167)
                            .addComponent(label_quantidade))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atualizar)
                .addGap(46, 46, 46)
                .addComponent(deletar)
                .addGap(42, 42, 42)
                .addComponent(btn_cadastrar)
                .addGap(49, 49, 49)
                .addComponent(pesquisarNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(read)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(label_codigo)
                    .addComponent(label_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_valor)
                        .addComponent(label_garantia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizar)
                    .addComponent(deletar)
                    .addComponent(btn_cadastrar)
                    .addComponent(pesquisarNome)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(read)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_garantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_garantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_garantiaActionPerformed

    private void campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nomeActionPerformed

    private void campo_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_descricaoActionPerformed

    private void campo_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_quantidadeActionPerformed

    private void campo_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_valorActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        //colocar no padrão das outras classes de cadastro
        int confirma = JOptionPane.showConfirmDialog(null, "Quer cadastrar esse Produto?", "Confiarmar", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            ArrayList<String> lista = new ArrayList<String>();
            lista.add(this.campo_codigo.getText());
            lista.add(this.campo_nome.getText());
            lista.add(this.campo_quantidade.getText());
            lista.add(this.campo_valor.getText());
            String qt_string = this.campo_quantidade.getText();
            String garan_string = this.campo_garantia.getText();
            String valor_string = this.campo_valor.getText();
            long g1;
            int g2;
            double g3;

            if (testeNulos(lista)) {
                try {
                    if (this.campo_garantia.getText().equals("")) { //se não for preenchido o tempo de garantia coloca-se o tempo default
                        g2 = 1;//um mes de garantia
                    } else {
                        g2 = 1;//um mes de garantia
                    }
                    IControleCadastro i = new ControleCadastro();
                    g1 = Long.parseLong(qt_string);
                    g2 = Integer.parseInt(garan_string);
                    g3 = Double.parseDouble(valor_string);

                    i.CadastrarProduto(this.campo_nome.getText(), this.campo_codigo.getText(),
                            this.campo_descricao.getText(), g1, g2, g3);
                    this.setarCampos();
                    this.read();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Campos não foram preenchidos CORRETAMENTE!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campos obrigatorios não foram preenchidos");
            }
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void campo_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_codigoActionPerformed

    private void tabelaEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaEstoqueKeyPressed
        if (this.tabelaEstoque.getSelectedRow() > -1) {
            this.campo_codigo.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 0).toString());
            this.campo_nome.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 1).toString());
            this.campo_quantidade.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 2).toString());
            this.campo_garantia.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 3).toString());
            this.campo_descricao.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 4).toString());
            this.campo_valor.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tabelaEstoqueKeyPressed

    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked
        if (this.tabelaEstoque.getSelectedRow() > -1) {
            this.campo_codigo.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 0).toString());
            this.campo_nome.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 1).toString());
            this.campo_quantidade.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 2).toString());
            this.campo_garantia.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 3).toString());
            this.campo_descricao.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 4).toString());
            this.campo_valor.setText(this.tabelaEstoque.getValueAt(this.tabelaEstoque.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed

        if (this.tabelaEstoque.getSelectedRow() != -1) {
            int confirma = JOptionPane.showConfirmDialog(null, "Quer atualizar esse Produto?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                IControleCadastro i = new ControleCadastro();
                long g = Long.parseLong(this.campo_quantidade.getText());
                int g2 = Integer.parseInt(this.campo_garantia.getText());
                double g3 = Double.parseDouble(this.campo_valor.getText());
                i.AtualizarProduto(this.campo_nome.getText(), this.campo_codigo.getText(), this.campo_descricao.getText(),
                        g, g2, g3);
                this.setarCampos();
                this.read();
            } else {
                this.setarCampos();
                this.read();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atulaizar na tabela \n"
                    + "Basta só clicar em um dos produtos na tabela \n"
                    + "modificar os campos que deseja atualizar com exceção do codigo \n"
                    + "e clicar em atualizar! \n");
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        if (this.tabelaEstoque.getSelectedRow() != -1) {
            int confirma = JOptionPane.showConfirmDialog(null, "Quer deletar esse Produto?", "Confiarmar", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                IControleCadastro i = new ControleCadastro();
                long g = Long.parseLong(this.campo_quantidade.getText());
                int g2 = Integer.parseInt(this.campo_garantia.getText());
                double g3 = Double.parseDouble(this.campo_valor.getText());
                i.DeletarProduto(this.campo_nome.getText(), this.campo_codigo.getText(), this.campo_descricao.getText(),
                        g, g2, g3);
                this.setarCampos();
                this.read();
            } else {
                this.setarCampos();
                this.read();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atulaizar na tabela \n"
                    + "Basta só clicar em um dos produtos na tabela \n"
                    + "e clicar em deletar novamente! \n");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void pesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarNomeActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaEstoque.getModel();
        modelo.setNumRows(0); //eliminar duplicadas do java 
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        IControleBusca i = new ControleBusca();
        ArrayList<Produto> prods = i.buscaProdutoNome(nome);
        if (prods.size() >= 1) { //se o array retornado tiver elementos 
            for (Produto p : prods) { //atribuir um obbjeto já que vamos percorer o objeto
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getNome(),
                    p.getQt_disponiveis(),
                    p.getTempo_garantia(),
                    p.getDescicao(),
                    p.getPrecoUnitario()
                });
            }
            this.read.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            this.read();
        }
    }//GEN-LAST:event_pesquisarNomeActionPerformed

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        this.read();
    }//GEN-LAST:event_readActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaEstoque.getModel();
        modelo.setNumRows(0); //eliminar duplicadas do java 
        IControleBusca i2 = new ControleBusca();
        String nome = JOptionPane.showInputDialog("Digite o codigo do produto");
        Produto prod = i2.buscaProdutocodigo(nome);
        if (prod != null) {
            modelo.addRow(new Object[]{
                prod.getCodigo(),
                prod.getNome(),
                prod.getQt_disponiveis(),
                prod.getTempo_garantia(),
                prod.getDescicao(),
                prod.getPrecoUnitario()
            });
            this.read.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            this.read();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //função abixo verifica se campos que não podem ser nulos são nulos
    //ou seja se campos obrigatorios foram preenchidos
    private boolean testeNulos(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("")) {
                return false;
            }
        }
        return true;
    }

    //funçaõ abaixo seta os campos para vazio
    private void setarCampos() {
        this.campo_codigo.setText("");
        this.campo_descricao.setText("");
        this.campo_garantia.setText("");
        this.campo_nome.setText("");
        this.campo_quantidade.setText("");
        this.campo_valor.setText("");
    }

    public void read() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaEstoque.getModel();
        modelo.setNumRows(0); //eliminar duplicadas do java 
        IControleListagem i = ControleDeListagem.getInstace();
        for (Produto p : i.Produtos()) { //atribuir um obbjeto já que vamos percorer o objeto
            if (p.getQt_disponiveis() > 0) {//garantindo que somente o estoque será mostrado e não produtos com 0 de qtd
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getNome(),
                    p.getQt_disponiveis(),
                    p.getTempo_garantia(),
                    p.getDescicao(),
                    p.getPrecoUnitario()
                });
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JTextField campo_codigo;
    private javax.swing.JTextField campo_descricao;
    private javax.swing.JTextField campo_garantia;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_quantidade;
    private javax.swing.JTextField campo_valor;
    private javax.swing.JButton deletar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel label_codigo;
    private javax.swing.JLabel label_descricao;
    private javax.swing.JLabel label_garantia;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_quantidade;
    private javax.swing.JLabel label_valor;
    private javax.swing.JButton pesquisarNome;
    private javax.swing.JButton read;
    private javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
