package com.netbeans.project.exerc09;

import javax.swing.JTextField;

/**
 *
 * @authorAntonioCarlos
 */
public class JFMenuTelaPrincipal extends javax.swing.JFrame {

    private static JFMenuTelaPrincipal jFMenuTelaPrincipal;
    private static JFConsultarExcluirPlacaPasseio jFConsultarExcluirPlacaPasseio;
    private static BDVeiculos bDVeiculos;
    private static VeicExistException veicExistException;
    private static VelocException velocException;
    private static Passeio passeio;

    public static final int NAOHAREGISTRO = 0;
    public static final int ELIMINADOS = 0;
    public static final int ERROSISTEMA = 0;

    public static final char CONSULTARPASSEIO = 'c';
    public static final char EXCLUIRPASSEIO = 'e';
    public static int SOPLACAPASSEIO = 0;
    public static final int CARGACOMPLETAPASSEIO = 1;
    public static final int FLAGCONSULTAREXCLUIRPASSEIO = 1;
    public static final int PLACAPASSEIO = 0;
    public static final int MARCAPASSEIO = 1;
    public static final int MODELOPASSEIO = 2;
    public static final int CORPASSEIO = 3;
    public static final int QTDRODASPASSEIO = 4;
    public static final int QTDPISTOESPASSEIO = 5;
    public static final int POTENCIAPASSEIO = 6;
    public static final int VELMAXPASSEIO = 7;
    public static final int QTDPASSAGEIROSPASSEIO = 8;

    public static final char CONSULTARCARGA = 'c';
    public static final char EXCLUIRCARGA = 'e';
    public static int SOPLACACARGA = 0;
    public static final int CARGACOMPLETACARGA = 1;
    public static final int FLAGCONSULTAREXCLUIRCARGA = 1;
    public static final int PLACACARGA = 0;
    public static final int MARCACARGA = 1;
    public static final int MODELOCARGA = 2;
    public static final int CORCARGA = 3;
    public static final int QTDRODASCARGA = 4;
    public static final int QTDPISTOESCARGA = 5;
    public static final int POTENCIACARGA = 6;
    public static final int VELMAXCARGA = 7;
    public static final int CARGAMAXCARGA = 8;
    public static final int TARACARGA = 9;

    public static final char EXCLUIR = 'e';
    public static final char CONSULTAR = 'o';
    public static final char CADASTRAR = 'C';
    public static final char IMPRIMIRTODOS = 'i';
    public static final char EXCLUIRTODOS = 'x';

    private JFMenuTelaPrincipal() {
        initComponents();
    }

    public static JFMenuTelaPrincipal criaJFMenuTelaPrincipal() {
        if (jFMenuTelaPrincipal == null) {
            jFMenuTelaPrincipal = new JFMenuTelaPrincipal();
            jFMenuTelaPrincipal.setVisible(true);
        }
        return jFMenuTelaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBFrotaPasseio = new javax.swing.JButton();
        jBFrotaCarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestao de Veiculos");
        setLocation(new java.awt.Point(512, 1105));
        setName("frFormPrincipal"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jBFrotaPasseio.setText("Frota Passeio");
        jBFrotaPasseio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBFrotaPasseio.setName("btPasseio"); // NOI18N
        jBFrotaPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFrotaPasseioActionPerformed(evt);
            }
        });

        jBFrotaCarga.setText("Frota Carga");
        jBFrotaCarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jBFrotaCarga.setName("btCarga"); // NOI18N
        jBFrotaCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFrotaCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBFrotaPasseio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBFrotaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jBFrotaPasseio)
                .addGap(18, 18, 18)
                .addComponent(jBFrotaCarga)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFrotaCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFrotaCargaActionPerformed
        abreJFMenuVeicCarga();
    }//GEN-LAST:event_jBFrotaCargaActionPerformed

    private void jBFrotaPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFrotaPasseioActionPerformed
        abreJFMenuVeicPasseio();
    }//GEN-LAST:event_jBFrotaPasseioActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFrotaCarga;
    private javax.swing.JButton jBFrotaPasseio;
    // End of variables declaration//GEN-END:variables

    private void abreJFMenuVeicPasseio() {
        JFMenuVeicPasseio.criaJFMenuVeicPasseio().setVisible(true);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abreJFMenuVeicCarga() {
        JFMenuVeicCarga.criaJFMenuVeicCarga().setVisible(true);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public String consultarPasseio(String consulta) {
//        return consulta;
//    }
};
