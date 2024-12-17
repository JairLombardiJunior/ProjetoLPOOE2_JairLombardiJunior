/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.ui;

import br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.dao.PersistenciaJPA;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Alugamento;

/**
 *
 * @author 20181pf.cc0256
 */
public class TelaAlugamento extends javax.swing.JFrame {
    
    PersistenciaJPA jpa;
    /**
     * Creates new form TelaAlugamento
     */
    public TelaAlugamento() {
        initComponents();
        
        jpa = new PersistenciaJPA();
        carregarAlugeisCadastrados();
        //carregarCdsCadastrados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlugueis = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        lblBuscaClienteNome = new javax.swing.JLabel();
        txfClienteBusca = new javax.swing.JTextField();
        lblBuscaCD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfCdBusca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnNovoAlugel = new javax.swing.JButton();
        btnEditarAlugel = new javax.swing.JButton();
        btnRemoverAlugel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitulo.setText("Alugueis Registrados");

        jScrollPane1.setViewportView(lstAlugueis);

        lblBuscaClienteNome.setText("Cliente:");

        txfClienteBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfClienteBuscaActionPerformed(evt);
            }
        });
        txfClienteBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        lblBuscaCD.setText("Cd:");

        jLabel1.setText("Procurar Pessoa:");

        txfCdBusca.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                txtBuscaCdKeyPressed(evt);
            }
        });
        txfCdBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCdBuscaActionPerformed(evt);
            }
        });
        txfCdBusca.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtBuscaCdKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBuscaClienteNome)
                            .addComponent(lblBuscaCD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaClienteNome)
                    .addComponent(txfClienteBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaCD)
                    .addComponent(txfCdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setText("<html><p>Opções para Alugel: </p></html>");

        btnNovoAlugel.setText("Novo");
        btnNovoAlugel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAlugelActionPerformed(evt);
            }
        });

        btnEditarAlugel.setText("Editar");
        btnEditarAlugel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlugelActionPerformed(evt);
            }
        });

        btnRemoverAlugel.setText("Remover");
        btnRemoverAlugel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAlugelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovoAlugel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarAlugel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverAlugel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovoAlugel)
                .addGap(18, 18, 18)
                .addComponent(btnEditarAlugel)
                .addGap(19, 19, 19)
                .addComponent(btnRemoverAlugel)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblTitulo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfClienteBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfClienteBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfClienteBuscaActionPerformed

    private void btnNovoAlugelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAlugelActionPerformed
        TelaCadastroAlugel telaCadastroAlugel
                = new TelaCadastroAlugel(this, rootPaneCheckingEnabled);
        telaCadastroAlugel.setVisible(true);

        carregarAlugeisCadastrados();
    }//GEN-LAST:event_btnNovoAlugelActionPerformed

    private void txfCdBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCdBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCdBuscaActionPerformed

    private void btnRemoverAlugelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAlugelActionPerformed
        Alugamento alugelSelecionado = lstAlugueis.getSelectedValue();
        if (alugelSelecionado != null) {
            System.out.println("Alugamento: " + alugelSelecionado.getCertificacao());
            try {
                jpa.conexaoAberta();

                int delOp = JOptionPane.showConfirmDialog(this,
                        "Tem certeza que deseja remover " + alugelSelecionado.getDescricao()+ "?");
                if (delOp == JOptionPane.YES_OPTION) {
                    jpa.remover(alugelSelecionado);
                }

                jpa.fecharConexao();
                carregarAlugeisCadastrados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao remover pessoa " + alugelSelecionado + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um alugel para remover");
        }
    }//GEN-LAST:event_btnRemoverAlugelActionPerformed

    private void btnEditarAlugelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlugelActionPerformed
        Alugamento alugelSelecionado = lstAlugueis.getSelectedValue();
        if (alugelSelecionado != null) {
            TelaCadastroAlugel telaEdt = new TelaCadastroAlugel(this, rootPaneCheckingEnabled);
            //telaEdt.setalugamento(alugelSelecionado);
            telaEdt.setVisible(true);
            
            
            carregarAlugeisCadastrados();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para Editar");
        }
    }//GEN-LAST:event_btnEditarAlugelActionPerformed

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeKeyPressed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        if(txfClienteBusca.getText().trim().isEmpty()){
            carregarAlugeisCadastrados();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
            modeloLista.addAll(jpa.getClientes(txfClienteBusca.getText().trim()));
            System.out.println("Clientes carregadas: "+jpa.getClientes(txfClienteBusca.getText().trim()));
            lstAlugueis.setModel(modeloLista);

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyReleased

    private void txtBuscaCdKeyPressed(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_txtBuscaCdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaCdKeyPressed

    private void txtBuscaCdKeyReleased(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtBuscaCdKeyReleased
        if(txfCdBusca.getText().trim().isEmpty()){
            carregarAlugeisCadastrados();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
            
            //modeloLista.addAll(jpa.getCds(txfCdBusca.getText().trim())); 
            //?
            
            System.out.println("Clientes carregadas: "+jpa.getClientes(txfCdBusca.getText().trim()));
            lstAlugueis.setModel(modeloLista);

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaCdKeyReleased

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
            java.util.logging.Logger.getLogger(TelaAlugamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlugamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlugamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlugamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlugamento().setVisible(true);
            }
        });
    }
    
    public void carregarAlugeisCadastrados() {
        jpa.conexaoAberta();

        DefaultListModel modeloListaA = new DefaultListModel();
        modeloListaA.addAll(jpa.getAlugamentos());
        lstAlugueis.setModel(modeloListaA);

        jpa.fecharConexao();

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarAlugel;
    private javax.swing.JButton btnNovoAlugel;
    private javax.swing.JButton btnRemoverAlugel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaCD;
    private javax.swing.JLabel lblBuscaClienteNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Alugamento> lstAlugueis;
    private javax.swing.JTextField txfCdBusca;
    private javax.swing.JTextField txfClienteBusca;
    // End of variables declaration//GEN-END:variables
}
