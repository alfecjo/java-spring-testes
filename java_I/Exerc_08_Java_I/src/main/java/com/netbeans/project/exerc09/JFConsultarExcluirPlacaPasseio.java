/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.netbeans.project.exerc09;

import javax.swing.JOptionPane;

/**
 *
 * @author AntonioCarlos
 */
public class JFConsultarExcluirPlacaPasseio extends javax.swing.JFrame {

    private static final VeicExistException veicExistException = new VeicExistException();
    private static JFMenuVeicPasseio jFMenuVeicPasseio;
    private static Passeio passeio;
//    private static final char EXCLUIR = 'd';
//    private static final char CONSULTAR = 'c';

    public JFConsultarExcluirPlacaPasseio() {
        initComponents();
    }

    public void mailmanPasseio(JFMenuVeicPasseio veioPlacaPasseio, String placa) {
        jTPlaca.setText(placa);
        this.jFMenuVeicPasseio = veioPlacaPasseio;
    }

    public void mailmanPasseio(JFMenuVeicPasseio veioReferenciaPasseio, Passeio passeio) {
        jTMarca.setText(passeio.getMarca());
        jTModelo.setText(passeio.getModelo());
        jTCor.setText(passeio.getCor());
        jTQuantidadeDeRodas.setText(String.valueOf(passeio.getQtdRodas()));
        jTQuantidadeDePistoes.setText(String.valueOf(passeio.getMotor().getQtdPist()));
        jTPotencia.setText(String.valueOf(passeio.getMotor().getPotencia()));
        jTVelocidadeMaxima.setText(String.valueOf(passeio.getVelMax()));
        jTQuantidadeDePassageiros.setText(String.valueOf(passeio.getQtdPassageiros()));
        this.jFMenuVeicPasseio = veioReferenciaPasseio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblQuantidadeDeRodas = new javax.swing.JLabel();
        lblQuantidadeDePistoes = new javax.swing.JLabel();
        lblVelocidadeMaxima = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        lblQuantidadeDePassageiros = new javax.swing.JLabel();
        jTQuantidadeDePistoes = new javax.swing.JTextField();
        jTPotencia = new javax.swing.JTextField();
        jTVelocidadeMaxima = new javax.swing.JTextField();
        jTMarca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTCor = new javax.swing.JTextField();
        jTQuantidadeDeRodas = new javax.swing.JTextField();
        lblInformeAPlaca = new javax.swing.JLabel();
        jBConsultar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jTQuantidadeDePassageiros = new javax.swing.JTextField();
        jTPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar ou Excluir pela Placa Passeio");
        setLocation(new java.awt.Point(512, 905));
        setName("frameConsultaExcluiPlacaPasseio"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblQuantidadeDeRodas.setText("Quantidade de rodas (+ step)");

        lblQuantidadeDePistoes.setText("Quantidade de pistoes");

        lblVelocidadeMaxima.setText("Velocidade Maxima");

        lblPotencia.setText("Potencia");

        lblQuantidadeDePassageiros.setText("Quantidade de Passageiros");

        lblInformeAPlaca.setForeground(new java.awt.Color(255, 102, 0));
        lblInformeAPlaca.setText("Informe a Placa");
        lblInformeAPlaca.setName("frameCadastroPasseio"); // NOI18N

        jBConsultar.setText("Consultar");
        jBConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBConsultar.setMaximumSize(new java.awt.Dimension(24, 19));
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExcluir.setMaximumSize(new java.awt.Dimension(24, 19));
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
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

        jTPlaca.setForeground(new java.awt.Color(0, 0, 255));
        jTPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPlacaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQuantidadeDePistoes, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblVelocidadeMaxima, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblQuantidadeDePassageiros, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCor, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblInformeAPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblQuantidadeDeRodas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTQuantidadeDePassageiros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTMarca)
                            .addComponent(jTVelocidadeMaxima, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTQuantidadeDePistoes)
                            .addComponent(jTQuantidadeDeRodas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTCor)
                            .addComponent(jTModelo)
                            .addComponent(jTPlaca, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInformeAPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTQuantidadeDeRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeDeRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTQuantidadeDePistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeDePistoes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTQuantidadeDePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeDePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        consultaOUexcluiPasseio(JFMenuTelaPrincipal.EXCLUIR);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        consultaOUexcluiPasseio(JFMenuTelaPrincipal.CONSULTAR);
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jTPlacaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPlacaFocusGained
        jTPlaca.selectAll();
    }//GEN-LAST:event_jTPlacaFocusGained

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
            java.util.logging.Logger.getLogger(JFConsultarExcluirPlacaPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConsultarExcluirPlacaPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConsultarExcluirPlacaPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConsultarExcluirPlacaPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFConsultarExcluirPlacaPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jTCor;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTextField jTPotencia;
    private javax.swing.JTextField jTQuantidadeDePassageiros;
    private javax.swing.JTextField jTQuantidadeDePistoes;
    private javax.swing.JTextField jTQuantidadeDeRodas;
    private javax.swing.JTextField jTVelocidadeMaxima;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblInformeAPlaca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblQuantidadeDePassageiros;
    private javax.swing.JLabel lblQuantidadeDePistoes;
    private javax.swing.JLabel lblQuantidadeDeRodas;
    private javax.swing.JLabel lblVelocidadeMaxima;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Abandona Sistema", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaOUexcluiPasseio(char opcao) {
        jTCor.setEditable(false);
        jTMarca.setEditable(false);
        jTModelo.setEditable(false);
        jTPotencia.setEditable(false);
        jTQuantidadeDePassageiros.setEditable(false);
        jTQuantidadeDePistoes.setEditable(false);
        jTQuantidadeDeRodas.setEditable(false);
        jTVelocidadeMaxima.setEditable(false);
        jTPlaca.requestFocus();
        if (jFMenuVeicPasseio != null) {
            boolean validaPlaca;
            String relatorio = "";
            validaPlaca = veicExistException.validaPlaca(jTPlaca.getText());
            if (!validaPlaca) {
                relatorio = "Digite \"Placa\" no formato: ABC1234.\n";
            }
            if (relatorio != "") {
                veicExistException.atencao(relatorio, "Consulta ", 1);
            } else {
                jFMenuVeicPasseio.retornaGeral(opcao,referenciaCadastroPasseio());
            }
        }
        throw new UnsupportedOperationException(
                "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private Passeio referenciaCadastroPasseio() {
        passeio = new Passeio();
        passeio.setPlaca(jTPlaca.getText());        
        return passeio;
    }
}
