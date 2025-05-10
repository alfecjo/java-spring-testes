/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.netbeans.project.exerc09;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class JFImprimirExcluirTodosPasseio extends javax.swing.JFrame {

    DefaultTableModel modeloTab = new DefaultTableModel();
    private static final VeicExistException veicExistException = new VeicExistException();
    private static JFMenuVeicPasseio jFMenuVeicPasseio;
    private static BDVeiculos bDVeiculos = new BDVeiculos();
    private static Passeio passeio;
    private static List<Passeio> retornaLista = new BDVeiculos().getListaPasseio();

    public JFImprimirExcluirTodosPasseio() {
        initComponents();
    }

    public void mailmanPasseio(JFMenuVeicPasseio veioReferenciaPasseio, List<Passeio> listaPasseio) {
        if (jFMenuVeicPasseio != null) {
            retornaLista.removeAll(retornaLista);
            retornaLista.addAll(listaPasseio);
            atulizaTab();
            listaPasseio.removeAll(listaPasseio);
        }
        this.jFMenuVeicPasseio = veioReferenciaPasseio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodosPasseio = new javax.swing.JTable();
        jBImprimirTodos = new javax.swing.JButton();
        jBExcluirTodos = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imprimir ou Excluir Todos Passeio");
        setLocation(new java.awt.Point(52, 905));
        setName("frameImprimirExcluirTodosPasseio"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTableTodosPasseio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Qtd. de Rodas", "Qtd. de Pistoes", "Potencia", "Qtd. de Passageiros", "Velocidade Maxima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTodosPasseio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableTodosPasseioFocusGained(evt);
            }
        });
        jTableTodosPasseio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTodosPasseioMouseClicked(evt);
            }
        });
        jTableTodosPasseio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableTodosPasseioComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTodosPasseio);
        if (jTableTodosPasseio.getColumnModel().getColumnCount() > 0) {
            jTableTodosPasseio.getColumnModel().getColumn(0).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(1).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(2).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(3).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(4).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(5).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(6).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(7).setResizable(false);
            jTableTodosPasseio.getColumnModel().getColumn(8).setResizable(false);
        }

        jBImprimirTodos.setText("Imprimir Todos");
        jBImprimirTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBImprimirTodos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBImprimirTodos.setMaximumSize(new java.awt.Dimension(24, 19));
        jBImprimirTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBImprimirTodosMouseClicked(evt);
            }
        });
        jBImprimirTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirTodosActionPerformed(evt);
            }
        });

        jBExcluirTodos.setText("Excluir Todos");
        jBExcluirTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBExcluirTodos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExcluirTodos.setMaximumSize(new java.awt.Dimension(24, 19));
        jBExcluirTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirTodosActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSair.setMaximumSize(new java.awt.Dimension(24, 19));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 754, Short.MAX_VALUE)
                        .addComponent(jBImprimirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBImprimirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExcluirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        jBImprimirTodos.setEnabled(true);
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBImprimirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirTodosActionPerformed
        jBImprimirTodos.setEnabled(false);
        imprimirTodosPasseio(JFMenuTelaPrincipal.IMPRIMIRTODOS);
        atulizaTab();
    }//GEN-LAST:event_jBImprimirTodosActionPerformed

    private void jBExcluirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirTodosActionPerformed
        excluirTodosPasseio(JFMenuTelaPrincipal.EXCLUIRTODOS);
        atulizaTab();
    }//GEN-LAST:event_jBExcluirTodosActionPerformed

    private void jTableTodosPasseioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodosPasseioMouseClicked
        excluirTodosPasseio(JFMenuTelaPrincipal.EXCLUIRTODOS);
        atulizaTab();
    }//GEN-LAST:event_jTableTodosPasseioMouseClicked

    private void jTableTodosPasseioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableTodosPasseioFocusGained

    }//GEN-LAST:event_jTableTodosPasseioFocusGained

    private void jBImprimirTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBImprimirTodosMouseClicked

    }//GEN-LAST:event_jBImprimirTodosMouseClicked

    private void jTableTodosPasseioComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableTodosPasseioComponentShown

    }//GEN-LAST:event_jTableTodosPasseioComponentShown

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
            java.util.logging.Logger.getLogger(JFImprimirExcluirTodosPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFImprimirExcluirTodosPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFImprimirExcluirTodosPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFImprimirExcluirTodosPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JFImprimirExcluirTodosPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluirTodos;
    private javax.swing.JButton jBImprimirTodos;
    private javax.swing.JButton jBSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTodosPasseio;
    // End of variables declaration//GEN-END:variables

    private void excluirTodosPasseio(char opcao) {
        if (jFMenuVeicPasseio != null) {
            DefaultTableModel modeloTab = new DefaultTableModel();
            modeloTab = (DefaultTableModel) jTableTodosPasseio.getModel();
            for (int i = 0; i < modeloTab.getRowCount(); i++) {
                modeloTab.removeRow(i);
            }
            jFMenuVeicPasseio.retornaGeral(opcao, referenciaCadastroPasseio());
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void imprimirTodosPasseio(char opcao) {
        if (jFMenuVeicPasseio != null) {
            jFMenuVeicPasseio.retornaGeral(opcao, referenciaCadastroPasseio());
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }

    private Passeio referenciaCadastroPasseio() {
        passeio = new Passeio();
        return passeio;
    }

    private void atulizaTab() {
//        DefaultTableModel modeloTab = new DefaultTableModel();
        modeloTab = (DefaultTableModel) jTableTodosPasseio.getModel();
        passeio = new Passeio();
        int posLinha = 0;
        modeloTab.setRowCount(posLinha);
        for (Passeio p1 : retornaLista) {
            if (p1.getPlaca() != "") {
                modeloTab.insertRow(posLinha, new Object[]{p1.getPlaca(), p1.getMarca(), p1.getModelo(), p1.getCor(), p1.getQtdRodas(),
                    p1.getMotor().getQtdPist(), p1.getMotor().getPotencia(), p1.getQtdPassageiros(), p1.getVelMax()});
                posLinha++;

            }
        }
        for (int i = 0; i < modeloTab.getRowCount(); i++) {
            if (modeloTab.getValueAt(i, 1) == modeloTab.getValueAt(i + 1, 1)) {
                modeloTab.removeRow(i);
            }
        }
        retornaLista.removeAll(retornaLista);
    }

    private void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Abandona Sistema", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
