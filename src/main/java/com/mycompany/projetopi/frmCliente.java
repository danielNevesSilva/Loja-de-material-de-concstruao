package com.mycompany.projetopi;

import br.com.infox.DAO.ClienteDAO;
<<<<<<< HEAD
=======
import br.com.infox.DAO.ProdutoDAO;
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
import java.awt.Color;
import javax.swing.JOptionPane;
import com.mycompany.projetopi.model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
public class frmCliente extends javax.swing.JFrame {

    public frmCliente() {
        initComponents();
        lblid.setVisible(false);

=======

public class frmCliente extends javax.swing.JFrame {

    
    public frmCliente() {
        initComponents();
        lblid.setVisible(false);
        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        ArrayList<Cliente> lista = ClienteDAO.listaCliente();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (Cliente item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_cliente()),
                String.valueOf(item.getCpf()),
                String.valueOf(item.getNome()),
                String.valueOf(item.getTelefone()),
                String.valueOf(item.getEmail()),
                String.valueOf(item.getDataNascimento()),
                String.valueOf(item.getSexo()),
                String.valueOf(item.getEstadocivil()),
                String.valueOf(item.getNomePais()),
                String.valueOf(item.getNomeCidade()),
                String.valueOf(item.getCep()),
                String.valueOf(item.getLogradouro()),
                String.valueOf(item.getNumero()),
                String.valueOf(item.getComplemento())});
        }
<<<<<<< HEAD

    }

=======
        
    }

    
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
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
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        txtIdcliente = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExcluir1 = new javax.swing.JButton();

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CPF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 194, -1));

        btnFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 180, 60));

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 171, -1));

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 230, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 40, 0, -1));

        txtIdcliente.setText("jTextField2");
        jPanel1.add(txtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 30, 0, -1));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "CPF", "Nome", "Telefone", "Email", "Data Nascimento", "Sexo", "Estado Civil", "Pais", "Cidade", "Logradouro", "Numero", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1270, 320));

        btnExcluir1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
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
        ArrayList<Cliente> lista = ClienteDAO.filtrar(
                txtCpf.getText().replace(".", "").replace("-", ""),
                txtNome.getText()
        );

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setRowCount(0);

        for (Cliente item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_cliente()),
                String.valueOf(item.getCpf()),
                String.valueOf(item.getNome()),
                String.valueOf(item.getTelefone()),
                String.valueOf(item.getEmail()),
                String.valueOf(item.getDataNascimento()),
                String.valueOf(item.getSexo()),
                String.valueOf(item.getEstadocivil()),
                String.valueOf(item.getNomePais()),
                String.valueOf(item.getNomeCidade()),
                String.valueOf(item.getCep()),
                String.valueOf(item.getLogradouro()),
                String.valueOf(item.getNumero()),
                String.valueOf(item.getComplemento())});
        }

    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void brnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAtualizarActionPerformed
        ArrayList<Cliente> lista = ClienteDAO.listaCliente();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (Cliente item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getId_cliente()),
                String.valueOf(item.getCpf()),
                String.valueOf(item.getNome()),
                String.valueOf(item.getTelefone()),
                String.valueOf(item.getEmail()),
                String.valueOf(item.getDataNascimento()),
                String.valueOf(item.getSexo()),
                String.valueOf(item.getEstadocivil()),
                String.valueOf(item.getNomePais()),
                String.valueOf(item.getNomeCidade()),
                String.valueOf(item.getCep()),
                String.valueOf(item.getLogradouro()),
                String.valueOf(item.getNumero()),
                String.valueOf(item.getComplemento())});
        }
<<<<<<< HEAD

    }//GEN-LAST:event_brnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
        System.out.println(id);

=======
        
    }//GEN-LAST:event_brnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow() ,0));
        System.out.println(id);
        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        frmAlterarCliente formulario;
        try {
            formulario = new frmAlterarCliente(id);
            formulario.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< HEAD
        }
=======
        }        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        frmCadastroCliente formCadCliente = new frmCadastroCliente();
        formCadCliente.setVisible(true);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // TODO add your handling code here:
        txtCpf.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
        txtCpf.setBackground(Color.white);
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // TODO add your handling code here:
        txtNome.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
        txtNome.setBackground(Color.yellow);
    }//GEN-LAST:event_txtNomeFocusGained

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
=======
        int id = Integer.parseInt((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow() ,0));
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        try {
            ClienteDAO.deletar(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD

=======
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAtualizar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblid;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdcliente;
    private javax.swing.JFormattedTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
