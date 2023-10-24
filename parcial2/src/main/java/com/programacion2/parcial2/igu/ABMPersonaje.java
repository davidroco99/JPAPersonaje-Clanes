
package com.programacion2.parcial2.igu;

import com.programacion2.parcial2.logica.ControladoraLogica;
import com.programacion2.parcial2.logica.DTOClan;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ABMPersonaje extends javax.swing.JFrame {

    ControladoraLogica controla = new ControladoraLogica();
    private static ABMPersonaje instance = null;
    
    public ABMPersonaje() {
        initComponents();
        
    }
    
    public static ABMPersonaje getInstance() {
        if (instance == null) {
            instance = new ABMPersonaje();
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloClan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablePersonaje = new javax.swing.JTable();
        btnAgregarPersonaje = new javax.swing.JButton();
        btnEditarPersonaje = new javax.swing.JButton();
        btnEliminarPersonaje = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jLabel1.setText("ABM PERSONAJE");

        jtablePersonaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtablePersonaje);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        btnAgregarPersonaje.setText("Agregar");
        btnAgregarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonajeActionPerformed(evt);
            }
        });

        btnEditarPersonaje.setText("Editar");
        btnEditarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPersonajeActionPerformed(evt);
            }
        });

        btnEliminarPersonaje.setText("Eliminar");
        btnEliminarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersonajeActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloClanLayout = new javax.swing.GroupLayout(TituloClan);
        TituloClan.setLayout(TituloClanLayout);
        TituloClanLayout.setHorizontalGroup(
            TituloClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloClanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TituloClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(TituloClanLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(TituloClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        TituloClanLayout.setVerticalGroup(
            TituloClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloClanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TituloClanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloClanLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(TituloClanLayout.createSequentialGroup()
                        .addComponent(btnAgregarPersonaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarPersonaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPersonaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TituloClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TituloClan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonajeActionPerformed
        AgregarPersonaje pantallaAgregarPersonaje = AgregarPersonaje.getInstance();
        pantallaAgregarPersonaje.setVisible(true);
        pantallaAgregarPersonaje.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarPersonajeActionPerformed

    private void btnEditarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPersonajeActionPerformed
       //hay mas de una fila en la tabla
        if (jtablePersonaje.getRowCount() > 0) {
            //hay por lo menos una selección
            if (jtablePersonaje.getSelectedRow() != -1) {
                //optengo la id a Editar.
                int idClan = Integer.parseInt(String.valueOf(jtablePersonaje.getValueAt(jtablePersonaje.getSelectedRow(), 0)));
                
                EditarClan pantallaEditarClan = new EditarClan(idClan);
                pantallaEditarClan.setVisible(true);
                pantallaEditarClan.setLocationRelativeTo(null);
                
               // mostrarMensajes("Se Editó correctamente El Clan","Info", "Edicíon exitosa");
            }
            else{
                mostrarMensajes("No Seleccionó ningún CLAN ","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para eliminar","Error", "No se elimnó el registro");
        }
        cargarTabla();                                             
 
    }//GEN-LAST:event_btnEditarPersonajeActionPerformed

    private void btnEliminarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersonajeActionPerformed
       //hay mas de una fila en la tabla
        if (jtablePersonaje.getRowCount() > 0) {
            //hay por lo menos una selección
            if (jtablePersonaje.getSelectedRow() != -1) {
                //optengo la id a borrar
                int idClan = Integer.parseInt(String.valueOf(jtablePersonaje.getValueAt(jtablePersonaje.getSelectedRow(), 0)));
                
                controla.borrarClan(idClan);
                
                mostrarMensajes("Se Eliminó correctamente El Clan","Info", "Eliminación Exitoso");
            }
            else{
                mostrarMensajes("No Seleccionó ningún CLAN ","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para eliminar","Error", "No se elimnó el registro");
        }
        cargarTabla();                                          
                           
    }//GEN-LAST:event_btnEliminarPersonajeActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();  
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         cargarTabla();
    }//GEN-LAST:event_formWindowGainedFocus
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TituloClan;
    private javax.swing.JButton btnAgregarPersonaje;
    private javax.swing.JButton btnEditarPersonaje;
    private javax.swing.JButton btnEliminarPersonaje;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablePersonaje;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
          
        DefaultTableModel tabla = new DefaultTableModel(){
            
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        
        String titulos[] = {"ID CLAN", "NOMBRE CLAN ", "RANKING CLANES"};
        tabla.setColumnIdentifiers(titulos);
        
        
        //carga de los datos desde la base de datos
        List <DTOClan> listaClanes = controla.traerClanes();
        
        
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
     
        if (listaClanes !=null){
            for (DTOClan dtoClan : listaClanes){
                Object[] objeto = {dtoClan.getIdClan(),dtoClan.getNombreClan(),dtoClan.getRankingClanes()};
                
                tabla.addRow(objeto);
            }
        }
        jtablePersonaje.setModel(tabla);

    }
    
    
    public void mostrarMensajes(String mensaje, String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);  
    }
}
