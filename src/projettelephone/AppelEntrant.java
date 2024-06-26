/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettelephone;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ibrahim
 */
public class AppelEntrant extends javax.swing.JPanel {
    private IAppel listener;
    
    /**
     * Creates new form AppelEntrant
     */
    public AppelEntrant() {
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

        couper = new javax.swing.JButton();
        numeroEntrant = new javax.swing.JLabel();
        repondre = new javax.swing.JButton();

        couper.setBackground(new java.awt.Color(255, 51, 51));
        couper.setText("Couper");
        couper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couperActionPerformed(evt);
            }
        });

        repondre.setBackground(new java.awt.Color(102, 255, 0));
        repondre.setText("Repondre");
        repondre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repondreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(numeroEntrant, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(repondre, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(couper, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(numeroEntrant, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couper, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repondre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void couperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couperActionPerformed
        // TODO add your handling code here:
        this.listener.onClickCouper(((JFrame) SwingUtilities.getWindowAncestor(this)).getTitle());
    }//GEN-LAST:event_couperActionPerformed

    private void repondreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repondreActionPerformed
        // TODO add your handling code here:
        this.listener.onClickDecrocher(((JFrame) SwingUtilities.getWindowAncestor(this)).getTitle());
    }//GEN-LAST:event_repondreActionPerformed

    public void setNumeroEntrant(String numero) {
        numeroEntrant.setText(numero);
    }
    
    public void setListener(IAppel listener) {
        this.listener = listener;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton couper;
    private javax.swing.JLabel numeroEntrant;
    private javax.swing.JButton repondre;
    // End of variables declaration//GEN-END:variables
}
