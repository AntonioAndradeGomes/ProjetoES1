/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ClienteDao;

/**
 *
 * @author jonathas
 */
public class ComprasRealizadas extends javax.swing.JInternalFrame {

    /**
     * Creates new form listarcompras2
     */
    public ComprasRealizadas() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) this.Compras.getModel();
        this.Compras.setRowSorter(new TableRowSorter(modelo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cpfdocliente = new javax.swing.JTextField();
        Pesquisacliente = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Compras = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Compras Realizadas");
        setMinimumSize(new java.awt.Dimension(674, 555));

        jLabel1.setText("CPF cliente");

        Pesquisacliente.setText("Pesquisar");
        Pesquisacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaclienteActionPerformed(evt);
            }
        });

        Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Produto", "Preço", "Data", "Vendedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Compras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(cpfdocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pesquisacliente)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisacliente)
                    .addComponent(jLabel1)
                    .addComponent(cpfdocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaclienteActionPerformed
        if(this.cpfdocliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o CPF do cliente");
        }else{
            ClienteDao pesquisa = new ClienteDao();
            Cliente dados = pesquisa.BuscaCpf(this.cpfdocliente.getText());
            if(dados == null){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }else{
                Listarcompras();
            }
        }
    }//GEN-LAST:event_PesquisaclienteActionPerformed

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
            java.util.logging.Logger.getLogger(ComprasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprasRealizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Compras;
    private javax.swing.JToggleButton Pesquisacliente;
    private javax.swing.JTextField cpfdocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void Listarcompras(){
        DefaultTableModel modelo = (DefaultTableModel) this.Compras.getModel();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT infotech.Cliente.nome as NomedoCliente, infotech.Produto.nome as ProdutoComprado, infotech.Compra.valor, infotech.Compra.data as Datadacompra, infotech.Vendedor.nome as NomedoVendedor\n" +
"	FROM infotech.Cliente, infotech.Produto, infotech.Cliente_Realiza_Compra, infotech.Compra, infotech.Produto_tem_Compra, infotech.Vendedor\n" +
"	where (Cliente.cpf = Cliente_Realiza_Compra.Cliente_cpf and Cliente_Realiza_Compra.Compra_Codigo_compra = Compra.Codigo_compra) and\n" +
"    (Compra.Codigo_compra = Produto_tem_Compra.Compra_Codigo_compra and Produto.codigo = Produto_tem_Compra.Produto_codigo) and\n" +
"    (Vendedor.cpf = Compra.Vendedor_cpf) and (Cliente.cpf = '"  + this.cpfdocliente.getText() + "' );"   );
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                modelo.addRow(new Object[]{
                    rs.getString("NomedoCliente"),
                    rs.getString("ProdutoComprado"),
                    rs.getDouble("valor"),
                    rs.getDate("Datadacompra"),
                    rs.getString("NomedoVendedor"),
                });
                
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs); 
        }
        
    }
}
