package view;

import conection.ConnectionFactory;
import java.text.DateFormat;
import java.util.Date;

public class TelaPrincipal extends javax.swing.JFrame {

    private String cpf;
    private String tipo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public TelaPrincipal() {
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

        Desktop = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_produto = new javax.swing.JMenu();
        menu_clientes = new javax.swing.JMenuItem();
        menu_vendedores = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_listarVendedores = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menu_comprasPorCliente = new javax.swing.JMenuItem();
        buscaCliente = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        jButton1.setText("Compar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario.setText("Usuário");

        data.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        data.setText("data");

        menu_produto.setText("Cadastros");

        menu_clientes.setText("Clientes");
        menu_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clientesActionPerformed(evt);
            }
        });
        menu_produto.add(menu_clientes);

        menu_vendedores.setText("Vendedores");
        menu_vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_vendedoresActionPerformed(evt);
            }
        });
        menu_produto.add(menu_vendedores);

        jMenuItem3.setText("Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_produto.add(jMenuItem3);

        jMenuBar1.add(menu_produto);

        jMenu2.setText("Listagem");

        menu_listarVendedores.setText("Minhas Vendas");
        jMenu2.add(menu_listarVendedores);

        jMenuItem7.setText("Listar Vendedores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        menu_comprasPorCliente.setText("Compras por Cliente");
        jMenu2.add(menu_comprasPorCliente);

        buscaCliente.setText("Busca de Cliente");
        buscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(buscaCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");
        jMenuBar1.add(jMenu3);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario)
                            .addComponent(data))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(usuario)
                .addGap(18, 18, 18)
                .addComponent(data)
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Desktop)
        );

        setSize(new java.awt.Dimension(878, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clientesActionPerformed
        //As linhas abaixo abrem a tela de cadastro de usuario dentro do desktoppane 
        TelaCliente telacliente = new TelaCliente(); //criei uma instancia da tela cliente
        telacliente.setVisible(true); //isso já sabe o qfaz
        this.Desktop.add(telacliente); //coloco dentro da desktop pane
        
        
    }//GEN-LAST:event_menu_clientesActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //abaixo o que irá acontecer quando a tela for ativada
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        this.data.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaProduto telaproduto = new TelaProduto();
        telaproduto.setVisible(true);
        this.Desktop.add(telaproduto);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menu_vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_vendedoresActionPerformed
        TelaVendedores tela = new TelaVendedores();
        tela.setVisible(true);
        this.Desktop.add(tela);
    }//GEN-LAST:event_menu_vendedoresActionPerformed

    private void buscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCompra telaCompra = new TelaCompra();
        telaCompra.setVisible(true);
        this.Desktop.add(telaCompra);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        this.Desktop.disable();
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JRadioButtonMenuItem buscaCliente;
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menu_clientes;
    private javax.swing.JMenuItem menu_comprasPorCliente;
    private javax.swing.JMenuItem menu_listarVendedores;
    private javax.swing.JMenu menu_produto;
    private javax.swing.JMenuItem menu_vendedores;
    private javax.swing.JMenu sair;
    public static javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
