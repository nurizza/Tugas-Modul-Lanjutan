/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Izza
 */
public class bank extends javax.swing.JFrame {

    /**
     * Creates new form bank
     */
    public bank() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pindigit4 = new javax.swing.JTextField();
        jButtonok = new javax.swing.JButton();
        jButtonkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Masukkan PIN Anda");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 10, 150, 60);
        jPanel1.add(pindigit4);
        pindigit4.setBounds(70, 60, 160, 40);

        jButtonok.setText("ok");
        jButtonok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonokActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonok);
        jButtonok.setBounds(100, 110, 100, 23);

        jButtonkeluar.setText("keluar");
        jButtonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonkeluar);
        jButtonkeluar.setBounds(180, 190, 73, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 240);

        setBounds(0, 0, 335, 278);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonokActionPerformed
        String digit = pindigit4.getText().toString();

        if(digit.equals("1234")){
            new pilihantransaksi().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "PIN yang anda masukkan salah silahkan coba lagi","Peringatan",JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonokActionPerformed

    private void jButtonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonkeluarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonkeluar;
    private javax.swing.JButton jButtonok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pindigit4;
    // End of variables declaration//GEN-END:variables
}
