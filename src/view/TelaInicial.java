/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 631710290
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jdpPainelInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuItemSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCidadesCadastrar = new javax.swing.JMenuItem();
        jMenuItemCIdadesListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemClientesCadastrar = new javax.swing.JMenuItem();
        jMenuItemClientesListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market");
        setSize(new java.awt.Dimension(0, 0));

        jdpPainelInicial.setBorder(null);

        javax.swing.GroupLayout jdpPainelInicialLayout = new javax.swing.GroupLayout(jdpPainelInicial);
        jdpPainelInicial.setLayout(jdpPainelInicialLayout);
        jdpPainelInicialLayout.setHorizontalGroup(
            jdpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jdpPainelInicialLayout.setVerticalGroup(
            jdpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenuItemSair.setText("Arquivo");

        jMenuItem1.setText("Sobre");
        jMenuItemSair.add(jMenuItem1);
        jMenuItemSair.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuItemSair.add(jMenuItem2);

        jMenuBar1.add(jMenuItemSair);

        jMenu2.setText("Cidades");

        jMenuItemCidadesCadastrar.setText("Cadastrar");
        jMenuItemCidadesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadesCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCidadesCadastrar);

        jMenuItemCIdadesListar.setText("Listar");
        jMenu2.add(jMenuItemCIdadesListar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clientes");

        jMenuItemClientesCadastrar.setText("Cadastrar");
        jMenuItemClientesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemClientesCadastrar);

        jMenuItemClientesListar.setText("Listar");
        jMenuItemClientesListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesListarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemClientesListar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemClientesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesCadastrarActionPerformed
        FrmCliente tela = new FrmCliente();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesCadastrarActionPerformed

    private void jMenuItemCidadesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadesCadastrarActionPerformed
        FrmCidade tela = new FrmCidade();
        jdpPainelInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadesCadastrarActionPerformed

    private void jMenuItemClientesListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesListarActionPerformed
        ListClientes tela = new ListClientes();
        jdpPainelInicial.add(tela);
        tela.setVisible( true );
    }//GEN-LAST:event_jMenuItemClientesListarActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCIdadesListar;
    private javax.swing.JMenuItem jMenuItemCidadesCadastrar;
    private javax.swing.JMenuItem jMenuItemClientesCadastrar;
    private javax.swing.JMenuItem jMenuItemClientesListar;
    private javax.swing.JMenu jMenuItemSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpPainelInicial;
    // End of variables declaration//GEN-END:variables
}
