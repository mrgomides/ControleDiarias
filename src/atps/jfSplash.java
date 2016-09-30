package atps;

import javax.swing.JOptionPane;

/**
 *
 * @author rafaelgs
 */
public class jfSplash extends javax.swing.JFrame {

    /**
     * Creates new form jfSplash
     */
    private cQuarto quarto = new cQuarto(0, null, null, null, null, 0, null);
    private jfMenu diaria = new jfMenu();

    public jfSplash() {
        System.out.println("APPLOG(jfSplash.jfSplash) -> INICIANDO COMPONENTES");
        initComponents();
        System.out.println("APPLOG(jfSplash.jfSplash) -> INICIANDO COMPONENTES [OK]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jlCopyright = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jpbCarregando = new javax.swing.JProgressBar();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARREGANDO...");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("splash"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        jlCopyright.setText("Copyright 2015, CDKMRS");
        jlTitulo.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jlTitulo.setText("ATPS - Analise Orientada a Objetos");
        jpbCarregando.setToolTipText("CARREGANDO...");
        jpbCarregando.setStringPainted(true);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jlCopyright))
                                .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpbCarregando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addComponent(jlTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpbCarregando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jlCopyright)
                        .addContainerGap())
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
        System.out.println("APPLOG(jfSplash.formWindowActivated) -> INICIANDO SPLASH");
        new Thread() {
            public void run() {
                for (int auxl = 1; auxl <= 100; auxl++) {
                    try {
                        sleep(50);
                        getJpbCarregando().setValue(auxl);
                        getJpbCarregando().setString("CARREGANDO... | " + auxl + "%");
                        if (auxl == 100) {
                            getDiaria().setVisible(true);
                            getDiaria().setLocationRelativeTo(null);
                            dispose();
                        }
                    } catch (InterruptedException ex) {
                        JOptionPane.showConfirmDialog(null, "Não foi possível carregar!");
                        System.exit(0);
                    }
                }
            }
        }.start();
        System.out.println("APPLOG(jfSplash.formWindowsActivated) -> INICIANDO SPLASH [OK]");
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("APPLOG(jfSplash.main) -> EXECUTANDO METODO MAIN DO SPLASH");
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
            java.util.logging.Logger.getLogger(jfSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//</editor-fold>
/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfSplash().setVisible(true);
            }
        });
        System.out.println("APPLOG(jfSplash.main) -> EXECUTANDO METODO MAIN DO SPLASH [OK]");
    }
// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlCopyright;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JProgressBar jpbCarregando;
// End of variables declaration//GEN-END:variables

    public cQuarto getQuarto() {
        return quarto;
    }

    public void setQuarto(cQuarto quarto) {
        this.quarto = quarto;
    }

    public jfMenu getDiaria() {
        return diaria;
    }

    public void setDiaria(jfMenu diaria) {
        this.diaria = diaria;
    }

    public javax.swing.JLabel getJlCopyright() {
        return jlCopyright;
    }

    public void setJlCopyright(javax.swing.JLabel jlCopyright) {
        this.jlCopyright = jlCopyright;
    }

    public javax.swing.JLabel getJlTitulo() {
        return jlTitulo;
    }

    public void setJlTitulo(javax.swing.JLabel jlTitulo) {
        this.jlTitulo = jlTitulo;
    }

    public javax.swing.JProgressBar getJpbCarregando() {
        return jpbCarregando;
    }

    public void setJpbCarregando(javax.swing.JProgressBar jpbCarregando) {
        this.jpbCarregando = jpbCarregando;
    }
}