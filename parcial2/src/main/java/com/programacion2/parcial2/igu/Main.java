
package com.programacion2.parcial2.igu;

public class Main extends javax.swing.JFrame {

     private static Main instance = null;
    /**
     * Creates new form MenuInicial
     */
    public Main() {
        initComponents();
    }
    
    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloParcial = new javax.swing.JLabel();
        btnABMPersonaje = new javax.swing.JButton();
        btnABMClan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloParcial.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloParcial.setText("Parcial 2 JPA");

        btnABMPersonaje.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnABMPersonaje.setText("ABM Personaje");
        btnABMPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABMPersonajeActionPerformed(evt);
            }
        });

        btnABMClan.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnABMClan.setText("ABM Clan");
        btnABMClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABMClanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnABMClan, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnABMPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloParcial))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloParcial)
                .addGap(18, 18, 18)
                .addComponent(btnABMClan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnABMPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnABMPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABMPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnABMPersonajeActionPerformed

    private void btnABMClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABMClanActionPerformed
        ABMClan pantallaInicial = ABMClan.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnABMClanActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABMClan;
    private javax.swing.JButton btnABMPersonaje;
    private javax.swing.JLabel tituloParcial;
    // End of variables declaration//GEN-END:variables
}
