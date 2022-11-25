package com.mycompany.projetopi;

import br.com.infox.DAO.ClienteDAO;
import br.com.infox.DAO.ProdutoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class frmProduto extends javax.swing.JFrame {

    
    public frmProduto() {
        initComponents();
        lblid.setVisible(false);
        
        ArrayList<Produto> lista = ProdutoDAO.listarProduto();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_produto()),
                String.valueOf(item.getDescricao()),
                String.valueOf(item.getUnidadeMedida()),
                String.valueOf(item.getPreco())});
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        brnAtualizar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtIdcliente = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Código");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 194, -1));

        btnFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 180, 60));

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 50));

        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 170, 50));

        brnAtualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        brnAtualizar.setText("Atualizar");
        brnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(brnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 170, 50));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 40, 0, -1));

        txtIdcliente.setText("jTextField2");
        jPanel1.add(txtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 30, 0, -1));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Unidade Medida", "Valor (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 970, 320));

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 170, 50));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        
        ArrayList<Produto> lista = ProdutoDAO.filtrar(
                Integer.parseInt(txtCodigo.getText())
        );

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setRowCount(0);
        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_produto()),
                String.valueOf(item.getDescricao()),
                String.valueOf(item.getUnidadeMedida()),
                String.valueOf(item.getPreco())
            });
        }        
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void brnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAtualizarActionPerformed
        ArrayList<Produto> lista = ProdutoDAO.listarProduto();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_produto()),
                String.valueOf(item.getDescricao()),
                String.valueOf(item.getUnidadeMedida()),
                String.valueOf(item.getPreco())});
        }
    }//GEN-LAST:event_brnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow() ,0));
        System.out.println(id);
        
        frmAlterarProduto formulario;
        try {
            formulario = new frmAlterarProduto(id);
            formulario.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        frmCadastroProduto formulario = new frmCadastroProduto();
        formulario.setVisible(true);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow() ,0));
        try {
            ProdutoDAO.deletar(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAtualizar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdcliente;
    // End of variables declaration//GEN-END:variables
}
