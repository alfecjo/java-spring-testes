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
public class JFCadastroPasseio extends javax.swing.JFrame {

    private static final VeicExistException veicExistException = new VeicExistException();
    private static JFMenuVeicPasseio jFMenuVeicPasseio;
    private static Passeio passeio;
    private static final float VELNAXPASSEIO = 100.0F;
    private static final int MENORQUE = 80;
    private static final int MAIORQUE = 110;

    public JFCadastroPasseio() {
        initComponents();
    }

    public void mailmanPasseio(JFMenuVeicPasseio veioPlaca, String placa) {
        jTPlaca.setText(placa);
        this.jFMenuVeicPasseio = veioPlaca;
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
        lblQuantidadeDePassageiros = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTCor = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        jTPotencia = new javax.swing.JTextField();
        jTVelocidadeMaxima = new javax.swing.JTextField();
        jTQuantidadeDePassageiros = new javax.swing.JTextField();
        jTQuantidadeDePistoes = new javax.swing.JTextField();
        jTQuantidadeDeRodas = new javax.swing.JTextField();
        jTPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Frota Passeio");
        setLocation(new java.awt.Point(512, 905));
        setName("frameCadastroFrotaPasseio"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblQuantidadeDeRodas.setText("Quantidade de rodas (+ step)");

        lblQuantidadeDePistoes.setText("Quantidade de pistoes");

        lblVelocidadeMaxima.setText("Velocidade Maxima");

        lblPotencia.setText("Potencia");

        lblQuantidadeDePassageiros.setText("Quantidade de Passageiros");

        lblMarca.setText("Marca");

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

        lblPlaca.setText("Placa");
        lblPlaca.setAlignmentY(0.0F);
        lblPlaca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTPlaca.setForeground(new java.awt.Color(0, 0, 255));
        jTPlaca.setSelectionEnd(10);
        jTPlaca.setSelectionStart(1);
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
                .addGap(101, 101, 101)
                .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlaca)
                    .addComponent(lblModelo)
                    .addComponent(lblCor)
                    .addComponent(lblQuantidadeDeRodas)
                    .addComponent(lblQuantidadeDePistoes)
                    .addComponent(lblVelocidadeMaxima)
                    .addComponent(lblPotencia)
                    .addComponent(lblQuantidadeDePassageiros)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTCor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTVelocidadeMaxima)
                    .addComponent(jTQuantidadeDePassageiros)
                    .addComponent(jTQuantidadeDePistoes)
                    .addComponent(jTPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTQuantidadeDeRodas)
                    .addComponent(jTPlaca))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidadeDePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidadeDePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
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
        cadastraPasseio(JFMenuTelaPrincipal.CADASTRAR);
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
            java.util.logging.Logger.getLogger(JFCadastroPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastroPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastroPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastroPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastroPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBNovo;
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
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
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

    private void limpa() {
        jTCor.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        jTPotencia.setText("");
        jTQuantidadeDePassageiros.setText("");
        jTQuantidadeDePistoes.setText("");
        jTQuantidadeDeRodas.setText("");
        jTVelocidadeMaxima.setText("");
        jTPlaca.setText("Digite a Placa aqui!");
        jTPlaca.requestFocus();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cadastraPasseio(char opcao) {
        if (jFMenuVeicPasseio != null) {
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
                if ((validaIsDigito == veicExistException.validaCampoNumerico(jTQuantidadeDePassageiros.getText()))) {
                    relatorio += "Formato Invalido: \"Quantidade de Passageiros\".\n";
                }
            }
            if (relatorio != "") {
                veicExistException.atencao(relatorio, "Cadastro ", 1);
            } else {
                float velPadrao = Float.valueOf(jTVelocidadeMaxima.getText());
                if (velPadrao < MENORQUE || velPadrao > MAIORQUE) {
                    relatorio = "A velocidade maxima esta fora dos limites brasileiros!\n"
                            + " Valor assumido para Velocidade Maxima Passeio foi de 100Km/h.\n";
                    veicExistException.atencao(relatorio, "Cadastro ", 1);
                    jTVelocidadeMaxima.setText(String.valueOf(VELNAXPASSEIO));
                }
                jBCadastrar.setEnabled(false);
                jFMenuVeicPasseio.retornaGeral(opcao, referenciaCadastroPasseio());
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Passeio referenciaCadastroPasseio() {
        passeio = new Passeio();
        passeio.setPlaca(jTPlaca.getText());
        passeio.setMarca(jTMarca.getText());
        passeio.setModelo(jTModelo.getText());
        passeio.setCor(jTCor.getText());
        passeio.setQtdRodas(Integer.parseInt(jTQuantidadeDeRodas.getText()));
        passeio.getMotor().setQtdPist(Integer.parseInt(jTQuantidadeDePistoes.getText()));
        passeio.getMotor().setPotencia(Integer.parseInt(jTPotencia.getText()));
        passeio.setVelMax(Float.parseFloat(jTVelocidadeMaxima.getText()));
        passeio.setQtdPassageiros(Integer.parseInt(jTQuantidadeDePassageiros.getText()));
        return passeio;
    }

    private void novo() {
        jBCadastrar.setEnabled(true);
        jTPlaca.requestFocus();
        jTPlaca.setEditable(true);
        jTPlaca.setText("Digite a Placa aqui!");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
