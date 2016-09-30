package atps;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author rafaelgs
 */
public class jfMenu extends javax.swing.JFrame {

    private cQuarto quarto = new cQuarto(0, null, null, null, null, 0, null);
    private String aux0;

    /**
     * Creates new form jfMenu
     */
    private jfDiaria diaria = new jfDiaria();

    public jfMenu() {
        System.out.println("APPLOG(jfMenu.jfMenu) -> INICIANDO COMPONENTES");
        initComponents();
        System.out.println("APPLOG(jfMenu.jfMenu) -> INICIANDO COMPONENTES [OK]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnRegEntrQuart = new javax.swing.JButton();
        jbtnRegSaidQuart = new javax.swing.JButton();
        jbtnAttValDiar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATPS AOO");
        setMaximumSize(new java.awt.Dimension(191, 168));
        setMinimumSize(new java.awt.Dimension(191, 168));
        setName("jfMenu"); // NOI18N
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jbtnRegEntrQuart.setText("Registrar Entrada em Quarto");
        jbtnRegEntrQuart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegEntrQuartActionPerformed(evt);
            }
        });

        jbtnRegSaidQuart.setText("Registrar Saída do Quarto");
        jbtnRegSaidQuart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegSaidQuartActionPerformed(evt);
            }
        });

        jbtnAttValDiar.setText("Atualizar o Valor da Diária");
        jbtnAttValDiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAttValDiarActionPerformed(evt);
            }
        });

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRegEntrQuart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegSaidQuart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAttValDiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnRegEntrQuart)
                .addGap(18, 18, 18)
                .addComponent(jbtnRegSaidQuart)
                .addGap(18, 18, 18)
                .addComponent(jbtnAttValDiar)
                .addGap(18, 18, 18)
                .addComponent(jbtnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegEntrQuartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegEntrQuartActionPerformed
        // TODO add your handling code here:
        System.out.println("APPLOG(jfMenu.jbtnRegEntrQuartActionPerformed) -> INICIANDO ABERTURA DE CLASSE jfDiaria");
        diaria.setVisible(true);
        diaria.setLocationRelativeTo(null);
        quarto.setValor_quarto(new BigDecimal(aux0));
        diaria.regEntrada();
    }//GEN-LAST:event_jbtnRegEntrQuartActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "BRUNO ANTAR GOUVEIA TAVOLARO\n"
                + "CAIQUE DA SILVA RAMOS\n"
                + "DAVID FELICIO DOS ANJOS\n"
                + "KAIQUI SANTOS VIEIRA\n"
                + "MARCUS VINICIUS CAMPOS ALMEIDA\n"
                + "RAFAEL GOMIDES PORTELA E SILVA\n"
                + "SERGIO GOMES BERNARDO");
        System.exit(0);
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        System.out.println("APPLOG(jfMenu.formWindowOpened) -> SET VALOR PADRAO");
        try {
            aux0 = JOptionPane.showInputDialog(null, "Informe o valor padrão das Diárias:");
            quarto.setValor_quarto(new BigDecimal(aux0));
            diaria.entVlrPadr(aux0);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Favor inserir no formato demonstrado no exemplo \nXX.XX");
            formWindowOpened(evt);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Favor inserir no formato demonstrado no exemplo \nXX.XX");
            formWindowOpened(evt);
        }
        System.out.println("APPLOG(jfMenu.formWindowOpened) -> SET VALOR PADRAO [OK] ");

    }//GEN-LAST:event_formWindowOpened

    private void jbtnAttValDiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAttValDiarActionPerformed
        // TODO add your handling code here:
        System.out.println("APPLOG(jfMenu.formWindowOpened) -> SET VALOR PADRAO");
        try {
            aux0 = JOptionPane.showInputDialog(null, "Informe o valor padrão das Diárias:");
            quarto.setValor_quarto(new BigDecimal(aux0));
            diaria.entVlrPadr(aux0);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Favor inserir no formato demonstrado no exemplo \nXX.XX");
            jbtnAttValDiarActionPerformed(evt);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Favor inserir no formato demonstrado no exemplo \nXX.XX");
            jbtnAttValDiarActionPerformed(evt);
        }

        System.out.println("APPLOG(jfMenu.formWindowOpened) -> SET VALOR PADRAO [OK] ");
    }//GEN-LAST:event_jbtnAttValDiarActionPerformed

    private void jbtnRegSaidQuartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegSaidQuartActionPerformed
        // TODO add your handling code here:
        diaria.setVisible(true);
        diaria.setLocationRelativeTo(null);
        diaria.regSaida();
    }//GEN-LAST:event_jbtnRegSaidQuartActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "BRUNO ANTAR GOUVEIA TAVOLARO\n"
                + "CAIQUE DA SILVA RAMOS\n"
                + "DAVID FELICIO DOS ANJOS\n"
                + "KAIQUI SANTOS VIEIRA\n"
                + "MARCUS VINICIUS CAMPOS ALMEIDA\n"
                + "RAFAEL GOMIDES PORTELA E SILVA\n"
                + "SERGIO GOMES BERNARDO");
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAttValDiar;
    private javax.swing.JButton jbtnRegEntrQuart;
    private javax.swing.JButton jbtnRegSaidQuart;
    private javax.swing.JButton jbtnSair;
    // End of variables declaration//GEN-END:variables

    public cQuarto getQuarto() {
        return quarto;
    }

    public void setQuarto(cQuarto quarto) {
        this.quarto = quarto;
    }

    public String getAux0() {
        return aux0;
    }

    public void setAux0(String aux0) {
        this.aux0 = aux0;
    }

    public jfDiaria getDiaria() {
        return diaria;
    }

    public void setDiaria(jfDiaria diaria) {
        this.diaria = diaria;
    }

    public javax.swing.JButton getJbtnAttValDiar() {
        return jbtnAttValDiar;
    }

    public void setJbtnAttValDiar(javax.swing.JButton jbtnAttValDiar) {
        this.jbtnAttValDiar = jbtnAttValDiar;
    }

    public javax.swing.JButton getJbtnRegEntrQuart() {
        return jbtnRegEntrQuart;
    }

    public void setJbtnRegEntrQuart(javax.swing.JButton jbtnRegEntrQuart) {
        this.jbtnRegEntrQuart = jbtnRegEntrQuart;
    }

    public javax.swing.JButton getJbtnRegSaidQuart() {
        return jbtnRegSaidQuart;
    }

    public void setJbtnRegSaidQuart(javax.swing.JButton jbtnRegSaidQuart) {
        this.jbtnRegSaidQuart = jbtnRegSaidQuart;
    }

    public javax.swing.JButton getJbtnSair() {
        return jbtnSair;
    }

    public void setJbtnSair(javax.swing.JButton jbtnSair) {
        this.jbtnSair = jbtnSair;
    }
}