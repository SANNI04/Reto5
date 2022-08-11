
package mintic.reto5listo.Vista;

import mintic.reto5listo.Controlador.InformesController;
import mintic.reto5listo.Modelo.ProyectoCasaCampestreVo;
import mintic.reto5listo.Modelo.ProyectoLiderVo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mintic.reto5listo.Modelo.ProyectoComprasHomecenterVo;


public class VistaInforme extends javax.swing.JFrame {
    
    public static final InformesController controlador = new InformesController();

    public VistaInforme() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInforme1 = new javax.swing.JButton();
        btnInforme3 = new javax.swing.JButton();
        btnInforme2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMES BASE DE DATOS PROYECTOS-CONSTRUCCION");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("INFORMES"); // NOI18N

        btnInforme1.setText("Informe 1");
        btnInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme1ActionPerformed(evt);
            }
        });

        btnInforme3.setText("Informe 3");
        btnInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme3ActionPerformed(evt);
            }
        });

        btnInforme2.setText("Informe 2");
        btnInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme2ActionPerformed(evt);
            }
        });

        tablaBD.setBackground(new java.awt.Color(204, 255, 204));
        tablaBD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaBD.setShowVerticalLines(false);
        tablaBD.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaBD);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\judit\\Documents\\NetBeansProjects\\reto5SandraG\\src\\main\\java\\Icono\\Captura web_9-8-2022_2293_imaster.academy.jpeg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(this);
        jLabel2.setText("INFORMES BASE DE DATOS PROYECTOS-CONSTRUCCIÓN");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnInforme2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnInforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInforme1)
                    .addComponent(btnInforme2)
                    .addComponent(btnInforme3))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme3ActionPerformed
        
        String[]columnNombre = {"Id Compra","Constructora","Banco Vinculado"};
        InformesController controller = new InformesController();
        
        ArrayList<ProyectoComprasHomecenterVo> listaHS;
        try {
            listaHS = controller.comprasHomecenterSalento();
            
            Object[][] datos3 = new Object[listaHS.size()][3];
            int index = 0;
            
            for (ProyectoComprasHomecenterVo lista: listaHS){
                datos3[index][0]= lista.getIdCompra();
                datos3[index][1] = lista.getConstructora();
                datos3[index][2] = lista.getBancoVinculado();
               
                index++;
            }
            
            DefaultTableModel modelo= new DefaultTableModel(datos3,columnNombre);
            tablaBD.setModel(modelo);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error inesperado.."+e.getMessage());
        }
    }//GEN-LAST:event_btnInforme3ActionPerformed

    private void btnInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme1ActionPerformed
        
        String[]columnNombre = {"Id Lider","Nombre","Primer Apellido","Residencia"};
        InformesController controller = new InformesController();
        
        List<ProyectoLiderVo> listaL;
        try {
            listaL = controller.listar();
            
            Object[][] datos1 = new Object[listaL.size()][4];
            int index = 0;
            
            for (ProyectoLiderVo lista: listaL){
                datos1[index][0]= lista.getId_lider();
                datos1[index][1] = lista.getNombre();
                datos1[index][2] = lista.getPrimer_apellido();
                datos1[index][3] = lista.getCiudad_residencia();
                index++;
            }
            
            DefaultTableModel modelo= new DefaultTableModel(datos1,columnNombre);
            tablaBD.setModel(modelo);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error inesperado.."+e.getMessage());
        }
            
    }//GEN-LAST:event_btnInforme1ActionPerformed

    private void btnInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme2ActionPerformed
            
        String[]columnNombre = {"Id Proyecto","Constructora","Numero Habitaciones","Ciudad"};
        InformesController controller = new InformesController();
        
        List<ProyectoCasaCampestreVo> listaCc;
        try {
            listaCc = controller.conProyectoCasaCampestre();
            
            Object[][] datos2 = new Object[listaCc.size()][4];
            int index = 0;
            
            for (ProyectoCasaCampestreVo lista: listaCc){
                datos2[index][0]= lista.getIdProyecto();
                datos2[index][1] = lista.getConstructora();
                datos2[index][2] = lista.getNumeroHabitaciones();
                datos2[index][3] = lista.getCiudad();
                index++;
            }
            
            DefaultTableModel modelo= new DefaultTableModel(datos2,columnNombre);
            tablaBD.setModel(modelo);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error inesperado.."+e.getMessage());
        }
            
    
    }//GEN-LAST:event_btnInforme2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(VistaInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme1;
    private javax.swing.JButton btnInforme2;
    private javax.swing.JButton btnInforme3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaBD;
    // End of variables declaration//GEN-END:variables
}
