/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettelephone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.TimerTask;
import javax.swing.*;

public class CreerTelephone extends javax.swing.JFrame implements IAppel {
    private JFrame telephone1 = null, telephone2 = null;
    private AppelEntrant appelEntrant = new AppelEntrant();    
    private AppelSortant appelSortant = new AppelSortant();
    private AppelEnCours appelEnCours1;
    private AppelEnCours appelEnCours2;
    private JPanel paneParentTelephone1;
    private JPanel paneParentTelephone2;
    int dureeAppel = 0;
    private Timer timer;
    private String numero;
    private List<Contact> listeContactsTelephone1;
    private List<Contact> listeContactsTelephone2;
    
    public CreerTelephone() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        btnCreerPhone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreerPhone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreerPhone.setText("Creer");
        btnCreerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnCreerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCreerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerPhoneActionPerformed
        // TODO add your handling code here:
        if (telephone1 == null) {
            telephone1 = new FenetreTelephone();
            FenetreTelephone.setListener(this);
            telephone1.setVisible(true);
            paneParentTelephone1 = (JPanel) telephone1.getContentPane();
            this.numero=this.txtNumero.getText();
            telephone1.setTitle("Tel : " + this.numero);
        } else {
            if (telephone2 == null) {
                telephone2 = new FenetreTelephone();
                FenetreTelephone.setListener(this);
                telephone2.setVisible(true);
                paneParentTelephone2 = (JPanel) telephone2.getContentPane();
                this.numero=this.txtNumero.getText();
                telephone2.setTitle("Tel : " + this.numero);
            } else {
                //JOptionPane.showMessageDialog(rootPane, evt);
            }
        }
    }//GEN-LAST:event_btnCreerPhoneActionPerformed

   
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
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerTelephone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onClickDecrocher(String phoneSourceTitle) {
        appelEnCours1 = new AppelEnCours();
        appelEnCours2 = new AppelEnCours();
        
        if (phoneSourceTitle.equals(telephone1.getTitle())) {
            appelEnCours1.setNumero(telephone2.getTitle().substring(5));
            appelEnCours2.setNumero(phoneSourceTitle.substring(5));
        } else {
            appelEnCours2.setNumero(telephone1.getTitle().substring(5));
            appelEnCours1.setNumero(phoneSourceTitle.substring(5));
        }
        
        appelEnCours1.setListener(this);
        appelEnCours2.setListener(this);
        telephone1.setContentPane(appelEnCours1);
        telephone2.setContentPane(appelEnCours2);
        telephone1.setVisible(true);
        telephone2.setVisible(true);
        
        timer = new Timer(1000, (ActionEvent e) -> {
            dureeAppel++;
            if (dureeAppel < 10) {
                appelEnCours1.setTemps("Durée: 00:0" + String.valueOf(dureeAppel));
                appelEnCours2.setTemps("Durée: 00:0" + String.valueOf(dureeAppel));
            } else {
                appelEnCours1.setTemps("Durée: 00:" + String.valueOf(dureeAppel));
                appelEnCours2.setTemps("Durée: 00:" + String.valueOf(dureeAppel));
            }
        });
        
        timer.start();
    }

    @Override
    public void onClickCouper(String phoneSourceTitle) {
        telephone1.setContentPane(paneParentTelephone1);
        telephone2.setContentPane(paneParentTelephone2);
        
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        
        JOptionPane.showMessageDialog(this, "Appel terminé. Durée: " + dureeAppel + " secondes", "Fin d'appel", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void onClickAppeler(String phoneSourceTitle) {
        if (telephone2.getTitle().equals(phoneSourceTitle)) {
            appelEntrant.setNumeroEntrant("Appel Entrant" + telephone2.getTitle().substring(5));
            appelSortant.setNumeroSortant("Appel Sortant" + telephone1.getTitle().substring(5));
            appelEntrant.setListener(this);
            appelSortant.setListener(this);
            telephone2.setContentPane(appelSortant);
            telephone2.setVisible(true);
            telephone1.setContentPane(appelEntrant);
            telephone1.setVisible(true);
        } else {
            appelEntrant.setNumeroEntrant("Appel Entrant" + telephone1.getTitle().substring(5));
            appelSortant.setNumeroSortant("Appel Sortant" + telephone2.getTitle().substring(5));
            appelEntrant.setListener(this);
            appelSortant.setListener(this);
            telephone1.setContentPane(appelSortant);
            telephone1.setVisible(true);
            telephone2.setContentPane(appelEntrant);
            telephone2.setVisible(true);
        }
    }
    
    @Override
    public void onClickFermer(String phoneSourceTitle) {
        if (phoneSourceTitle.equals(telephone1.getTitle())) {
            telephone1.setContentPane(paneParentTelephone1);
        } else {
            telephone2.setContentPane(paneParentTelephone2);
        }
    }
}
