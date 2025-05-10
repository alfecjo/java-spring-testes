/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.netbeans.project.exerc09;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class JFCadastroCarga extends javax.swing.JFrame {

    private static final VeicExistException veicExistException = new VeicExistException();
    private static JFMenuVeicCarga jFMenuVeicCarga;
    private static Carga carga;
    private static final float VELNAXCARGA = 90.0F;
    private static final int MENORQUE = 80;
    private static final int MAIORQUE = 110;

    public JFCadastroCarga() {
        initComponents();
    }

    public void mailmanCarga(JFMenuVeicCarga veioPlaca, String placa) {
        jTPlaca.setText(placa);
        this.jFMenuVeicCarga = veioPlaca;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblQuantidadeDeRodas = new javax.swing.JLabel();
        lblQuantidadeDePistoes = new javax.swing.JLabel();
        lblVelocidadeMaxima = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblCargaMaxima = new javax.swing.JLabel();
        lblTara = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTCor = new javax.swing.JTextField();
        jTPotencia = new javax.swing.JTextField();
        jTVelocidadeMaxima = new javax.swing.JTextField();
        jTCargaMaxima = new javax.swing.JTextField();
        jTTara = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jTPlaca = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        jTQuantidadeDeRodas = new javax.swing.JTextField();
        jTQuantidadeDePistoes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Frota Carga");
        setLocation(new java.awt.Point(512, 1305));
        setName("frameCadastroFrotaCarga"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblQuantidadeDeRodas.setText("Quantidade de rodas (+ step)");

        lblQuantidadeDePistoes.setText("Quantidade de pistoes");

        lblVelocidadeMaxima.setText("Velocidade Maxima");

        lblPotencia.setText("Potencia");

        lblMarca.setText("Marca");

        lblCargaMaxima.setText("Carga Maxima");

        lblTara.setText("Tara");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCadastrar.setMaximumSize(new java.awt.Dimension(24, 19));
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLimpar.setMaximumSize(new java.awt.Dimension(24, 19));
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNovo.setMaximumSize(new java.awt.Dimension(24, 19));
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
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

        lblPlaca.setText("Placa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTara)
                            .addComponent(lblCargaMaxima)
                            .addComponent(lblModelo)
                            .addComponent(lblCor)
                            .addComponent(lblQuantidadeDeRodas)
                            .addComponent(lblQuantidadeDePistoes)
                            .addComponent(lblVelocidadeMaxima)
                            .addComponent(lblPotencia)
                            .addComponent(lblMarca)
                            .addComponent(lblPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPlaca)
                            .addComponent(jTMarca)
                            .addComponent(jTVelocidadeMaxima, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTCor)
                            .addComponent(jTModelo)
                            .addComponent(jTCargaMaxima)
                            .addComponent(jTTara)
                            .addComponent(jTQuantidadeDeRodas)
                            .addComponent(jTQuantidadeDePistoes))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidadeDeRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidadeDeRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeDePistoes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidadeDePistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCargaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTara, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpa();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        cadastraCarga(JFMenuTelaPrincipal.CADASTRAR);
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        novo();
    }//GEN-LAST:event_jBNovoActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadastroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastroCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jTCargaMaxima;
    private javax.swing.JTextField jTCor;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTextField jTPotencia;
    private javax.swing.JTextField jTQuantidadeDePistoes;
    private javax.swing.JTextField jTQuantidadeDeRodas;
    private javax.swing.JTextField jTTara;
    private javax.swing.JTextField jTVelocidadeMaxima;
    private javax.swing.JLabel lblCargaMaxima;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblQuantidadeDePistoes;
    private javax.swing.JLabel lblQuantidadeDeRodas;
    private javax.swing.JLabel lblTara;
    private javax.swing.JLabel lblVelocidadeMaxima;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Abandona Sistema", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpa() {
        jTMarca.setText("");
        jTModelo.setText("");
        jTCor.setText("");
        jTQuantidadeDeRodas.setText("");
        jTQuantidadeDePistoes.setText("");
        jTPotencia.setText("");
        jTVelocidadeMaxima.setText("");
        jTCargaMaxima.setText("");
        jTTara.setText("");
        jTPlaca.setText("Digite a Placa aqui!");
        jTPlaca.requestFocus();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cadastraCarga(char opcao) {
        if (jFMenuVeicCarga != null) {
            boolean validaPlaca, validaIsDigito = false;
            String relatorio = "";
            validaPlaca = veicExistException.validaPlaca(jTPlaca.getText());
            if (!validaPlaca) {
                relatorio = "Digite \"Placa\" no formato: ABC1234.\n";
            } else {
                jTPlaca.setEditable(false);
                if ("".equals(jTMarca.getText())) {
                    relatorio += "Campo \"Marca\"  deve ser preenchido.\n";
                }
                if ("".equals(jTModelo.getText())) {
                    relatorio += "Campo: \"Modelo\"  deve ser preenchido.\n";
                }
                if ("".equals(jTCor.getText())) {
                    relatorio += "Campo \"Cor\" deve ser preenchido.\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTQuantidadeDeRodas.getText()))) {
                    relatorio += "Formato Invalido: \"Quantidade De Rodas\".\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTQuantidadeDePistoes.getText()))) {
                    relatorio += "Formato Invalido: \"Quantidade De Pistoes\".\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTPotencia.getText()))) {
                    relatorio += "Formato Invalido: \"Potencia\".\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTVelocidadeMaxima.getText()))) {
                    relatorio += "Formato Invalido: \"Velocidade Maxima\".\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTCargaMaxima.getText()))) {
                    relatorio += "Formato Invalido: \"Carga Maxima\".\n";
                }
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTTara.getText()))) {
                    relatorio += "Formato Invalido: \"Tara\".\n";
                }
            }
            if (relatorio != "") {
                veicExistException.atencao(relatorio, "Cadastro ", 1);
            } else {
                float velPadrao = Float.valueOf(jTVelocidadeMaxima.getText());
                if (velPadrao < MENORQUE || velPadrao > MAIORQUE) {
                    relatorio = "A velocidade maxima esta fora dos limites brasileiros!\n"
                            + " Valor assumido para Velocidade Maxima Carga foi de 90Km/h.\n";
                    veicExistException.atencao(relatorio, "Cadastro ", 1);
                    jTVelocidadeMaxima.setText(String.valueOf(VELNAXCARGA));
                }
                jBCadastrar.setEnabled(false);
                jFMenuVeicCarga.retornaGeral(opcao, referenciaCadastroCarga());
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

private Carga referenciaCadastroCarga() {
        carga = new Carga();
        carga.setPlaca(jTPlaca.getText());
        carga.setMarca(jTMarca.getText());
        carga.setModelo(jTModelo.getText());
        carga.setCor(jTCor.getText());
        carga.setQtdRodas(Integer.parseInt(jTQuantidadeDeRodas.getText()));
        carga.getMotor().setQtdPist(Integer.parseInt(jTQuantidadeDePistoes.getText()));
        carga.getMotor().setPotencia(Integer.parseInt(jTPotencia.getText()));
        carga.setVelMax(Float.parseFloat(jTVelocidadeMaxima.getText()));
        carga.setCargaMax(Integer.parseInt(jTCargaMaxima.getText()));
        carga.setTara(Integer.parseInt(jTTara.getText()));      
        return carga;
    }

    private void novo() {
        jBCadastrar.setEnabled(true);
        jTPlaca.requestFocus();
        jTPlaca.setEditable(true);
        jTPlaca.setText("Digite a Placa aqui!");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
