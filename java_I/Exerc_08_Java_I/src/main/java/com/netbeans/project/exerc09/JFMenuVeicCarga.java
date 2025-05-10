/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.netbeans.project.exerc09;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class JFMenuVeicCarga extends javax.swing.JFrame {

    private static JFMenuVeicCarga jFMenuVeicCargaUnico;
    private static JFCadastroCarga jFCadastroCarga;
    private static JFConsultarExcluirPlacaCarga jFConsultarExcluirPlacaCarga;
    private static JFImprimirExcluirTodosCarga jFImprimirExcluirTodosCarga;
    private static final VeicExistException veicExistException = new VeicExistException();
    private static final BDVeiculos bDVeiculos = new BDVeiculos();
    private static List<Carga> listaCargaGeral = new BDVeiculos().getListaCarga();
    private static Carga carga;

    private JFMenuVeicCarga() {
        initComponents();
    }

    public static JFMenuVeicCarga criaJFMenuVeicCarga() {
        if (jFMenuVeicCargaUnico == null) {
            jFMenuVeicCargaUnico = new JFMenuVeicCarga();
        }
        return jFMenuVeicCargaUnico;
    }

    @SuppressWarnings("empty-statement")
    public void retornaGeral(char origem, Carga carga) {
        String placa = "";
        if (bDVeiculos != null) {
            switch (origem) {
                case JFMenuTelaPrincipal.CADASTRAR -> {
                    carga = bDVeiculos.cadastroCarga(carga);
                    if (carga != null) {
                        placa = "Cadastrado com sucesso!";
                    } else {
                        placa = "Veiculo ja esta cadastrado!";
                    }
                    jTFPlacaMenuVeicCargaCadastro.setText(placa);
                    abreJFCadastroCarga();
                }
                case JFMenuTelaPrincipal.EXCLUIR -> {
                    carga = bDVeiculos.removePlacaCarga(carga);
                    if (carga != null) {
                        placa = "Nao excluiu, erro no sistema!";
                        jTFPlacaMenuVeicCargaConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaCarga(0, carga);
                    } else {
                        placa = "Placa excluida!";
                        jTFPlacaMenuVeicCargaConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaCarga(0, carga);
                    }
                }
                case JFMenuTelaPrincipal.CONSULTAR -> {
                    carga = bDVeiculos.consultaPlacaCarga(carga);
                    if (carga != null) {
                        abreJFConsultarExcluirPlacaCarga(1, carga);
                    } else {
                        placa = "Placa nao cadastrada!";
                        jTFPlacaMenuVeicCargaConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaCarga(0, carga);
                    }
                }
                case JFMenuTelaPrincipal.IMPRIMIRTODOS -> {
                    listaCargaGeral.removeAll(listaCargaGeral);
                    listaCargaGeral.addAll(bDVeiculos.getListaCarga());
                    if (!(listaCargaGeral.size() > 0)) {
                        listaCargaGeral.add(carga);
                        listaCargaGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setPlaca("Não");
                        listaCargaGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setMarca("há");
                        listaCargaGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setModelo("registro!");
                    }
                    abreJFImprimirExcluirTodosCarga(1, listaCargaGeral);
                }
                case JFMenuTelaPrincipal.EXCLUIRTODOS -> {
                    bDVeiculos.removeTodosCarga();
                    listaCargaGeral.removeAll(listaCargaGeral);
                    listaCargaGeral.add(carga);
                    if ((listaCargaGeral.size() >= 1)) {
                        listaCargaGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setPlaca("Todos");
                        listaCargaGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setMarca("foram");
                        listaCargaGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setModelo("eliminados!");
                        abreJFImprimirExcluirTodosCarga(1, listaCargaGeral);
                    } else {
                        listaCargaGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setPlaca("Erro");
                        listaCargaGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setMarca("no");
                        listaCargaGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setModelo("sistema!");

                    }
                    abreJFImprimirExcluirTodosCarga(1, listaCargaGeral);
                }
            }
        } else {
            veicExistException.atencao("Verificar se BDVeiculos está no diretório correto!", "Alerta do Sistema!", 1);
        }
    }

    public List<Carga> uniquueCarga(Carga carga) {
        for (int i = 0; i < listaCargaGeral.size(); i++) {
            if (!(listaCargaGeral.get(i).getPlaca().equalsIgnoreCase(String.valueOf(carga.getPlaca())))) {
                listaCargaGeral.add(carga);
            }
        }
        return listaCargaGeral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCadastrar = new javax.swing.JButton();
        jBConsultarOUExcluirPelaPlaca = new javax.swing.JButton();
        jBImprimirOUExcluirTodos = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jTFPlacaMenuVeicCargaCadastro = new javax.swing.JTextField();
        jTFPlacaMenuVeicCargaConsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Veiculo de Carga");
        setLocation(new java.awt.Point(512, 1205));
        setName("frameMenuVeiculodeCarga"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBConsultarOUExcluirPelaPlaca.setText("Consultar ou Excluir pela Placa");
        jBConsultarOUExcluirPelaPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBConsultarOUExcluirPelaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarOUExcluirPelaPlacaActionPerformed(evt);
            }
        });

        jBImprimirOUExcluirTodos.setText("Imprimir ou Excluir Todos");
        jBImprimirOUExcluirTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBImprimirOUExcluirTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirOUExcluirTodosActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jTFPlacaMenuVeicCargaCadastro.setForeground(new java.awt.Color(0, 0, 204));
        jTFPlacaMenuVeicCargaCadastro.setText("Digite a Placa  aqui!");
        jTFPlacaMenuVeicCargaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPlacaMenuVeicCargaCadastroFocusGained(evt);
            }
        });
        jTFPlacaMenuVeicCargaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaMenuVeicCargaCadastroActionPerformed(evt);
            }
        });

        jTFPlacaMenuVeicCargaConsulta.setForeground(new java.awt.Color(0, 0, 204));
        jTFPlacaMenuVeicCargaConsulta.setText("Digite a Placa  aqui!");
        jTFPlacaMenuVeicCargaConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPlacaMenuVeicCargaConsultaFocusGained(evt);
            }
        });
        jTFPlacaMenuVeicCargaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaMenuVeicCargaConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBConsultarOUExcluirPelaPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBImprimirOUExcluirTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPlacaMenuVeicCargaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPlacaMenuVeicCargaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jBConsultarOUExcluirPelaPlaca)
                .addGap(18, 18, 18)
                .addComponent(jBImprimirOUExcluirTodos)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTFPlacaMenuVeicCargaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTFPlacaMenuVeicCargaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        abreJFCadastroCarga();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBConsultarOUExcluirPelaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarOUExcluirPelaPlacaActionPerformed
        abreJFConsultarExcluirPlacaCarga(0, carga);
    }//GEN-LAST:event_jBConsultarOUExcluirPelaPlacaActionPerformed

    private void jBImprimirOUExcluirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirOUExcluirTodosActionPerformed
        abreJFImprimirExcluirTodosCarga(1, listaCargaGeral);
    }//GEN-LAST:event_jBImprimirOUExcluirTodosActionPerformed

    private void jTFPlacaMenuVeicCargaCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicCargaCadastroFocusGained
        jTFPlacaMenuVeicCargaCadastro.selectAll();
    }//GEN-LAST:event_jTFPlacaMenuVeicCargaCadastroFocusGained

    private void jTFPlacaMenuVeicCargaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicCargaCadastroActionPerformed

    }//GEN-LAST:event_jTFPlacaMenuVeicCargaCadastroActionPerformed

    private void jTFPlacaMenuVeicCargaConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicCargaConsultaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaMenuVeicCargaConsultaFocusGained

    private void jTFPlacaMenuVeicCargaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicCargaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaMenuVeicCargaConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuVeicCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuVeicCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBConsultarOUExcluirPelaPlaca;
    private javax.swing.JButton jBImprimirOUExcluirTodos;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jTFPlacaMenuVeicCargaCadastro;
    private javax.swing.JTextField jTFPlacaMenuVeicCargaConsulta;
    // End of variables declaration//GEN-END:variables

    private void abreJFCadastroCarga() {
        if (!jTFPlacaMenuVeicCargaCadastro.getText().isEmpty()) {
            if (jFCadastroCarga == null) {
                jFCadastroCarga = new JFCadastroCarga();
                jFCadastroCarga.setLocationRelativeTo(null);
                jFCadastroCarga.setVisible(true);
                jFCadastroCarga.setResizable(false);
            } else {
                jFCadastroCarga.setVisible(true);
                jFCadastroCarga.setResizable(false);
            }
            jFCadastroCarga.mailmanCarga(this, jTFPlacaMenuVeicCargaCadastro.getText());
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abreJFConsultarExcluirPlacaCarga(int placaOUcarga, Carga carga) {
        if (!jTFPlacaMenuVeicCargaCadastro.getText().isEmpty()) {
            if (jFConsultarExcluirPlacaCarga == null) {
                jFConsultarExcluirPlacaCarga = new JFConsultarExcluirPlacaCarga();

                jFConsultarExcluirPlacaCarga.setLocationRelativeTo(null);
                jFConsultarExcluirPlacaCarga.setVisible(true);
                jFConsultarExcluirPlacaCarga.setResizable(false);
            } else {
                jFConsultarExcluirPlacaCarga.setVisible(true);
                jFConsultarExcluirPlacaCarga.setResizable(false);
            }
            if (placaOUcarga == JFMenuTelaPrincipal.SOPLACACARGA) {
                jFConsultarExcluirPlacaCarga.mailmanCarga(this, jTFPlacaMenuVeicCargaConsulta.getText());
            }
            if (placaOUcarga == JFMenuTelaPrincipal.CARGACOMPLETACARGA) {
                jFConsultarExcluirPlacaCarga.mailmanCarga(this, carga);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abreJFImprimirExcluirTodosCarga(int placaOUCarga, List<Carga> listaCarga) {
         if (!jTFPlacaMenuVeicCargaCadastro.getText().isEmpty()) {
            if (jFImprimirExcluirTodosCarga == null) {
                jFImprimirExcluirTodosCarga = new JFImprimirExcluirTodosCarga();
                jFImprimirExcluirTodosCarga.setLocationRelativeTo(null);
                jFImprimirExcluirTodosCarga.setVisible(true);
                jFImprimirExcluirTodosCarga.setResizable(false);
            } else {
                jFImprimirExcluirTodosCarga.setVisible(true);
                jFImprimirExcluirTodosCarga.setResizable(false);
            }

            if (placaOUCarga == 1) {
                jFImprimirExcluirTodosCarga.mailmanCarga(this, listaCarga);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Abandona Sistema", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
