
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JanGerenciarProduto extends javax.swing.JFrame {

    private static JanGerenciarProduto janGerenciarProdutoUnico;
    public GerProdutos gerProdutos = new GerProdutos();
    private Produtos produtos = new Produtos();
    
    private JanGerenciarProduto() {
        initComponents();
    }
    
    public static JanGerenciarProduto getJanGerenciarProduto(){
        if(janGerenciarProdutoUnico == null){
            janGerenciarProdutoUnico = new JanGerenciarProduto();
        }
        return janGerenciarProdutoUnico;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotAdicionarProduto = new javax.swing.JButton();
        BotExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotaoVoltarGerenciar = new javax.swing.JButton();
        TexCodigo = new javax.swing.JTextField();
        EtqCodigo = new javax.swing.JLabel();
        EtqNome = new javax.swing.JLabel();
        EtqPreço = new javax.swing.JLabel();
        TexNome = new javax.swing.JTextField();
        TexPreço = new javax.swing.JTextField();
        EtqEstoque = new javax.swing.JLabel();
        TexEstoque = new javax.swing.JTextField();
        BotAlterarEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotAdicionarProduto.setText("Adicionar Produto");
        BotAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAdicionarProdutoActionPerformed(evt);
            }
        });

        BotExcluirProduto.setText("Excluir Produto");
        BotExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotExcluirProdutoActionPerformed(evt);
            }
        });

        TabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabProdutos);
        if (TabProdutos.getColumnModel().getColumnCount() > 0) {
            TabProdutos.getColumnModel().getColumn(0).setResizable(false);
            TabProdutos.getColumnModel().getColumn(1).setResizable(false);
            TabProdutos.getColumnModel().getColumn(2).setResizable(false);
            TabProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GERENCIADOR DE PRODUTOS");

        BotaoVoltarGerenciar.setText("Voltar");
        BotaoVoltarGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarGerenciarActionPerformed(evt);
            }
        });

        TexCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexCodigoActionPerformed(evt);
            }
        });

        EtqCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtqCodigo.setText("Código do produto:");

        EtqNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtqNome.setText("Nome do produto:");

        EtqPreço.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtqPreço.setText("Preço do produto:");

        TexNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexNomeActionPerformed(evt);
            }
        });

        TexPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexPreçoActionPerformed(evt);
            }
        });

        EtqEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtqEstoque.setText("Estoque do produto");

        TexEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexEstoqueActionPerformed(evt);
            }
        });

        BotAlterarEstoque.setText("Alterar Estoque");
        BotAlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAlterarEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(BotaoVoltarGerenciar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EtqNome)
                                            .addComponent(EtqCodigo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TexCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(EtqPreço))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TexNome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(EtqEstoque)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TexEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TexPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(BotAdicionarProduto)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotExcluirProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotAlterarEstoque))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqCodigo)
                    .addComponent(TexCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqPreço)
                    .addComponent(TexPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqNome)
                    .addComponent(TexNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqEstoque)
                    .addComponent(TexEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotAdicionarProduto)
                    .addComponent(BotExcluirProduto)
                    .addComponent(BotAlterarEstoque))
                .addGap(28, 28, 28)
                .addComponent(BotaoVoltarGerenciar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TexCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexCodigoActionPerformed

    private void BotaoVoltarGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarGerenciarActionPerformed
        JanGerenciar.getJanGerenciar().setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoVoltarGerenciarActionPerformed

    private void TexNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexNomeActionPerformed

    private void TexPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexPreçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexPreçoActionPerformed

    private void BotAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAdicionarProdutoActionPerformed
        cadastro();
        listarTabela();
        limpar();
    }//GEN-LAST:event_BotAdicionarProdutoActionPerformed

    private void BotExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotExcluirProdutoActionPerformed
        excluir();
        listarTabela();
        limpar();
    }//GEN-LAST:event_BotExcluirProdutoActionPerformed

    private void TexEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexEstoqueActionPerformed

    private void BotAlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAlterarEstoqueActionPerformed
       alterarEstoque();
       listarTabela();
       limpar();
    }//GEN-LAST:event_BotAlterarEstoqueActionPerformed

    public void cadastro(){
        produtos = new Produtos();
       
        produtos.setCodigo(Integer.parseInt(TexCodigo.getText()));
        produtos.setPreco(Integer.parseInt(TexPreço.getText()));
        produtos.setNome(TexNome.getText());
        produtos.setEstoque(Integer.parseInt(TexEstoque.getText()));
        
        produtos = gerProdutos.cadProdutos(produtos);
        if(produtos == null){
            JOptionPane.showMessageDialog(null, "Já exsite um produtos com este codigo", "Erro de cadastro", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto cadastrada com sucesso", "Cadastro OK", 1);        
        }
    }
    
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel)TabProdutos.getModel();
        modelo.setRowCount(0);
        int posicaoLinha = 0;
        
        for(Produtos p : gerProdutos.getBdProdutos()){
            modelo.insertRow(posicaoLinha, new Object[]{p.getCodigo(),p.getNome(),p.getPreco(),p.getEstoque()});
            posicaoLinha++;
        }
    }
    
     private void limpar(){
        TexNome.setText("");
        TexCodigo.setText("");
        TexPreço.setText("");
        TexEstoque.setText("");
        TexCodigo.requestFocus();
    }
     
    public void excluir(){
        produtos = new Produtos();
        produtos.setCodigo(Integer.parseInt(TexCodigo.getText()));
        
        produtos = gerProdutos.consultaProdutos(produtos);
        if(produtos == null){
            JOptionPane.showMessageDialog(null, "Produto não existe. Codigo:"+TexCodigo.getText(), "Remover Produto", 0); 
        }
        if(produtos.getEstoque()== 0){
            produtos = gerProdutos.retiraProdutos(produtos);
            if(produtos != null){
                JOptionPane.showMessageDialog(null, "Produto retirada com sucesso", "Remover Produto", 1);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Estoque positivo. Codigo:"+TexCodigo.getText(), "Remover Produto", 0);
        }
    }

    public void alterarEstoque(){
        produtos = new Produtos();
        produtos.setCodigo(Integer.parseInt(TexCodigo.getText()));
        produtos = gerProdutos.atualizaEstoque(produtos);
        if(produtos == null){
            JOptionPane.showMessageDialog(null, "Não existe nenhum produto com esse código", "Erro de atualização", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso", "Atualização OK", 1);        
        }
    }
        
    
    
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
            java.util.logging.Logger.getLogger(JanGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanGerenciarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAdicionarProduto;
    private javax.swing.JButton BotAlterarEstoque;
    private javax.swing.JButton BotExcluirProduto;
    private javax.swing.JButton BotaoVoltarGerenciar;
    private javax.swing.JLabel EtqCodigo;
    private javax.swing.JLabel EtqEstoque;
    private javax.swing.JLabel EtqNome;
    private javax.swing.JLabel EtqPreço;
    private javax.swing.JTable TabProdutos;
    private javax.swing.JTextField TexCodigo;
    private javax.swing.JTextField TexEstoque;
    private javax.swing.JTextField TexNome;
    private javax.swing.JTextField TexPreço;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
