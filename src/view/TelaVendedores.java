
package view;

import controller.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaVendedores extends javax.swing.JInternalFrame {

    public TelaVendedores() {
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
        label_cpf22 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        label_cpf23 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Cliente");
        setPreferredSize(new java.awt.Dimension(674, 555));

        label_titulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        label_titulo.setText("Registrar Vendedores");
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

        label_cpf22.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf22.setText("*SENHA");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente", "Outros" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        label_cpf23.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        label_cpf23.setText("TIPO");

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        jLabel1.setText("o que esta com * no começo é obrigatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(label_titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_cpf10)
                                    .addComponent(label_cpf13)
                                    .addComponent(label_cpf11)
                                    .addComponent(label_cpf14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_cpf17, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label_cpf16)))
                                    .addComponent(label_cpf18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_cpf15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_cpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rua, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label_cpf19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(104, 104, 104))
                                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_cpf21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_cpf23)
                                .addGap(18, 18, 18)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(label_cpf22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf10)
                    .addComponent(label_cpf)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf13)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf14)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf15)
                    .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf17)
                    .addComponent(label_cpf19)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf18)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf21)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cpf22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        setBounds(0, 0, 640, 536);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
       //RESOLVER O PROBLEMA DO mysql permitir campos '' e não os considerar como null
       
        int confirma = JOptionPane.showConfirmDialog(null, "Quer cadastrar esse Vendedor?", "Confiarmar", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
        
            //to criando esse arrayList para resolver o problema no comentario acima 
            ArrayList<String> lista = new ArrayList<String>();
            lista.add(this.nome.getText());
            lista.add(this.cpf.getText());
            lista.add(this.rg.getText());
            lista.add(this.cidade.getText());
            lista.add(this.rua.getText());
            lista.add(this.bairro.getText());
            lista.add(this.senha.getText());

            //melhorar codificação de telaProduto
            //fazer isso em telacliente
            if (testeNulos(lista)){
                try{
                    long num;
                    if (this.numero.getText().equals("")){ //se não for fonecido um numero para casa setar como 0
                        num = 0;
                    }else{
                        num = Long.parseLong(this.numero.getText()); //coloacr na variavel num o valor da casa
                    }
                    IControleCadastro c = new ControleCadastro(); //instanciar o controlador de cadastro
                    //chamar a função de cadastrar cliente
                    c.CadastrarVendedor(this.nome.getText(), this.cpf.getText(), this.rg.getText(), this.telefone1.getText(), 
                     this.telefone2.getText(), this.email.getText(), this.cidade.getText(), this.rua.getText(), 
                     this.bairro.getText(), this.complemento.getText(), num,
                     this.tipo.getSelectedItem().toString(), this.senha.getText());
                    //limpar os campos apos a edição
                    this.setarCampos();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Campos não foram preenchidos CORRETAMENTE!");
                }  
            }else{
                JOptionPane.showMessageDialog(null, "Campos obrigatorios não foram preenchidos!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed
    
    //função abixo verifica se campos que não podem ser nulos são nulos
    //ou seja se campos obrigatorios foram preenchidos
    private boolean testeNulos(ArrayList<String> lista){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals("")){
                return false;
            }
        }
        return true;
    }
    //função abaixo serve para retornar o valor dos capos para vazio
    private void setarCampos(){
        this.nome.setText(""); this.cpf.setText(""); this.rg.setText(""); this.telefone1.setText("");
        this.telefone2.setText(""); this.email.setText(""); this.cidade.setText("");this.email.setText(""); this.cidade.setText(""); this.rua.setText(""); this.bairro.setText(""); this.complemento.setText("");
        this.numero.setText(""); this.senha.setText("");
    }
        
    private void ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed


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
    private javax.swing.JLabel label_cpf22;
    private javax.swing.JLabel label_cpf23;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rua;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField telefone1;
    private javax.swing.JTextField telefone2;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}