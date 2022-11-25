
package com.mycompany.projetopi;

import javax.swing.JOptionPane;


public class frmMenu extends javax.swing.JFrame {

    
    public frmMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnVendas = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        btnVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEstoque.setText("Produto");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRelatorio.setText("Relatorio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        // TODO add your handling code here:
        frmVendas vendas = new frmVendas();
        vendas.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        frmCliente cliente = new frmCliente();
        cliente.setVisible(true);

    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        frmRelatorio frmMenu = new frmRelatorio();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        frmProduto produto = new frmProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

<<<<<<< HEAD
    private void btnVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseClicked
        
        frmVendas frmMenu = new frmVendas();
        frmMenu.setVisible(true);

    }//GEN-LAST:event_btnVendasMouseClicked

=======
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
