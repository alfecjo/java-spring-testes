package com.netbeans.project.exerc09;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JFMenuVeicPasseio extends javax.swing.JFrame {

    private static JFMenuVeicPasseio jFMenuVeicPasseioUnico;
    private static JFCadastroPasseio jFCadastroPasseio;
    private static JFConsultarExcluirPlacaPasseio jFConsultarExcluirPlacaPasseio;
    private static JFImprimirExcluirTodosPasseio jFImprimirExcluirTodosPasseio;
    private static final VeicExistException veicExistException = new VeicExistException();
    private static final BDVeiculos bDVeiculos = new BDVeiculos();
    private static List<Passeio> listaPasseioGeral = new BDVeiculos().getListaPasseio();
    private static Passeio passeio;

    private JFMenuVeicPasseio() {
        initComponents();
    }

    public static JFMenuVeicPasseio criaJFMenuVeicPasseio() {
        if (jFMenuVeicPasseioUnico == null) {
            jFMenuVeicPasseioUnico = new JFMenuVeicPasseio();
        }
        return jFMenuVeicPasseioUnico;
    }

    @SuppressWarnings("empty-statement")
    public void retornaGeral(char origem, Passeio passeio) {
        String placa = "";
        if (bDVeiculos != null) {
            switch (origem) {
                case JFMenuTelaPrincipal.CADASTRAR -> {
                    passeio = bDVeiculos.cadastroPasseio(passeio);
                    if (passeio != null) {
                        placa = "Cadastrado com sucesso!";
                    } else {
                        placa = "Veiculo ja esta cadastrado!";
                    }
                    jTFPlacaMenuVeicPasseioCadastro.setText(placa);
                    abreJFCadastroPasseio();
                }
                case JFMenuTelaPrincipal.EXCLUIR -> {
                    passeio = bDVeiculos.removePlacaPasseio(passeio);
                    if (passeio != null) {
                        placa = "Nao excluiu, erro no sistema!";
                        jTFPlacaMenuVeicPasseioConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaPasseio(0, passeio);
                    } else {
                        placa = "Placa excluida!";
                        jTFPlacaMenuVeicPasseioConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaPasseio(0, passeio);
                    }
                }
                case JFMenuTelaPrincipal.CONSULTAR -> {
                    passeio = bDVeiculos.consultaPlacaPasseio(passeio);
                    if (passeio != null) {
                        abreJFConsultarExcluirPlacaPasseio(1, passeio);
                    } else {
                        placa = "Placa nao cadastrada!";
                        jTFPlacaMenuVeicPasseioConsulta.setText(placa);
                        abreJFConsultarExcluirPlacaPasseio(0, passeio);
                    }
                }
                case JFMenuTelaPrincipal.IMPRIMIRTODOS -> {
                    listaPasseioGeral.removeAll(listaPasseioGeral);
                    listaPasseioGeral.addAll(bDVeiculos.getListaPasseio());
                    if (!(listaPasseioGeral.size() > 0)) {
                        listaPasseioGeral.add(passeio);
                        listaPasseioGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setPlaca("Não");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setMarca("há");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.NAOHAREGISTRO).setModelo("registro!");
                    }
                    abreJFImprimirExcluirTodosPasseio(1, listaPasseioGeral);
                }
                case JFMenuTelaPrincipal.EXCLUIRTODOS -> {
                    bDVeiculos.removeTodosPasseio();
                    listaPasseioGeral.removeAll(listaPasseioGeral);
                    listaPasseioGeral.add(passeio);
                    if ((listaPasseioGeral.size() >= 1)) {
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setPlaca("Todos");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setMarca("foram");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ELIMINADOS).setModelo("eliminados!");
                        abreJFImprimirExcluirTodosPasseio(1, listaPasseioGeral);
                    } else {
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setPlaca("Erro");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setMarca("no");
                        listaPasseioGeral.get(JFMenuTelaPrincipal.ERROSISTEMA).setModelo("sistema!");
                    }
                    abreJFImprimirExcluirTodosPasseio(1, listaPasseioGeral);
                }
            }
        } else {
            veicExistException.atencao("Verificar se BDVeiculos está no diretório correto!", "Alerta do Sistema!", 1);
        }
    }

    public List<Passeio> uniquuePasseio(Passeio passeio) {
        for (int i = 0; i < listaPasseioGeral.size(); i++) {
            if (!(listaPasseioGeral.get(i).getPlaca().equalsIgnoreCase(String.valueOf(passeio.getPlaca())))) {
                listaPasseioGeral.add(passeio);
            }
        }
        return listaPasseioGeral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFPlacaMenuVeicPasseioCadastro = new javax.swing.JTextField();
        jTFPlacaMenuVeicPasseioConsulta = new javax.swing.JTextField();
        jTFPlacaMenuVeicPasseioImprimir = new javax.swing.JTextField();
        jBImprimirOUExcluirTodos = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBCadastar = new javax.swing.JButton();
        jBConsultarOUExcluirPelaPlaca = new javax.swing.JButton();

        jTFPlacaMenuVeicPasseioCadastro.setForeground(new java.awt.Color(0, 0, 204));
        jTFPlacaMenuVeicPasseioCadastro.setText("Digite a Placa  aqui!");
        jTFPlacaMenuVeicPasseioCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPlacaMenuVeicPasseioCadastroFocusGained(evt);
            }
        });
        jTFPlacaMenuVeicPasseioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaMenuVeicPasseioCadastroActionPerformed(evt);
            }
        });

        jTFPlacaMenuVeicPasseioConsulta.setForeground(new java.awt.Color(0, 0, 204));
        jTFPlacaMenuVeicPasseioConsulta.setText("Digite a Placa  aqui!");
        jTFPlacaMenuVeicPasseioConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPlacaMenuVeicPasseioConsultaFocusGained(evt);
            }
        });
        jTFPlacaMenuVeicPasseioConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaMenuVeicPasseioConsultaActionPerformed(evt);
            }
        });

        jTFPlacaMenuVeicPasseioImprimir.setForeground(new java.awt.Color(0, 0, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Veiculo de Passeio");
        setLocation(new java.awt.Point(512, 1005));
        setName("frameMenuVeiculodePasseio"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

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

        jBCadastar.setText("Cadastrar");
        jBCadastar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastarActionPerformed(evt);
            }
        });

        jBConsultarOUExcluirPelaPlaca.setText("Consultar ou Excluir pela Placa");
        jBConsultarOUExcluirPelaPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBConsultarOUExcluirPelaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarOUExcluirPelaPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCadastar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBConsultarOUExcluirPelaPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBImprimirOUExcluirTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBCadastar)
                .addGap(18, 18, 18)
                .addComponent(jBConsultarOUExcluirPelaPlaca)
                .addGap(18, 18, 18)
                .addComponent(jBImprimirOUExcluirTodos)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBImprimirOUExcluirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirOUExcluirTodosActionPerformed
        abreJFImprimirExcluirTodosPasseio(1, listaPasseioGeral);
    }//GEN-LAST:event_jBImprimirOUExcluirTodosActionPerformed

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed
        abreJFCadastroPasseio();
    }//GEN-LAST:event_jBCadastarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBConsultarOUExcluirPelaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarOUExcluirPelaPlacaActionPerformed
        abreJFConsultarExcluirPlacaPasseio(0, passeio);
    }//GEN-LAST:event_jBConsultarOUExcluirPelaPlacaActionPerformed

    private void jTFPlacaMenuVeicPasseioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicPasseioCadastroActionPerformed

    }//GEN-LAST:event_jTFPlacaMenuVeicPasseioCadastroActionPerformed

    private void jTFPlacaMenuVeicPasseioCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicPasseioCadastroFocusGained
        jTFPlacaMenuVeicPasseioCadastro.selectAll();
    }//GEN-LAST:event_jTFPlacaMenuVeicPasseioCadastroFocusGained

    private void jTFPlacaMenuVeicPasseioConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicPasseioConsultaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaMenuVeicPasseioConsultaFocusGained

    private void jTFPlacaMenuVeicPasseioConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaMenuVeicPasseioConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaMenuVeicPasseioConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuVeicPasseio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicPasseio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicPasseio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuVeicPasseio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuVeicPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastar;
    private javax.swing.JButton jBConsultarOUExcluirPelaPlaca;
    private javax.swing.JButton jBImprimirOUExcluirTodos;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jTFPlacaMenuVeicPasseioCadastro;
    private javax.swing.JTextField jTFPlacaMenuVeicPasseioConsulta;
    private javax.swing.JTextField jTFPlacaMenuVeicPasseioImprimir;
    // End of variables declaration//GEN-END:variables

    private void abreJFCadastroPasseio() {
        if (!jTFPlacaMenuVeicPasseioCadastro.getText().isEmpty()) {
            if (jFCadastroPasseio == null) {
                jFCadastroPasseio = new JFCadastroPasseio();
                jFCadastroPasseio.setLocationRelativeTo(null);
                jFCadastroPasseio.setVisible(true);
                jFCadastroPasseio.setResizable(false);
            } else {
                jFCadastroPasseio.setVisible(true);
                jFCadastroPasseio.setResizable(false);
            }
            jFCadastroPasseio.mailmanPasseio(this, jTFPlacaMenuVeicPasseioCadastro.getText());
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abreJFConsultarExcluirPlacaPasseio(int placaOUpasseio, Passeio passeio) {
        if (!jTFPlacaMenuVeicPasseioCadastro.getText().isEmpty()) {
            if (jFConsultarExcluirPlacaPasseio == null) {
                jFConsultarExcluirPlacaPasseio = new JFConsultarExcluirPlacaPasseio();
                jFConsultarExcluirPlacaPasseio.setLocationRelativeTo(null);
                jFConsultarExcluirPlacaPasseio.setVisible(true);
                jFConsultarExcluirPlacaPasseio.setResizable(false);
            } else {
                jFConsultarExcluirPlacaPasseio.setVisible(true);
                jFConsultarExcluirPlacaPasseio.setResizable(false);
            }
            if (placaOUpasseio == JFMenuTelaPrincipal.SOPLACAPASSEIO) {
                jFConsultarExcluirPlacaPasseio.mailmanPasseio(this, jTFPlacaMenuVeicPasseioConsulta.getText());
            }
            if (placaOUpasseio == JFMenuTelaPrincipal.CARGACOMPLETAPASSEIO) {
                jFConsultarExcluirPlacaPasseio.mailmanPasseio(this, passeio);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abreJFImprimirExcluirTodosPasseio(int placaOUPasseio, List<Passeio> listaPasseio) {
        if (!jTFPlacaMenuVeicPasseioCadastro.getText().isEmpty()) {
            if (jFImprimirExcluirTodosPasseio == null) {
                jFImprimirExcluirTodosPasseio = new JFImprimirExcluirTodosPasseio();
                jFImprimirExcluirTodosPasseio.setLocationRelativeTo(null);
                jFImprimirExcluirTodosPasseio.setVisible(true);
                jFImprimirExcluirTodosPasseio.setResizable(false);
            } else {
                jFImprimirExcluirTodosPasseio.setVisible(true);
                jFImprimirExcluirTodosPasseio.setResizable(false);
            }

            if (placaOUPasseio == 1) {
                jFImprimirExcluirTodosPasseio.mailmanPasseio(this, listaPasseio);
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
