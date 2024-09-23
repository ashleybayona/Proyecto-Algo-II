/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUD;

import Modelo.Empleado;
import Controlador.Principal;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class EditarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form EditarEmpleado
     */
    public EditarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Editar empleado");
        
        dniFieldEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                rellenarDatos();
            }
        }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bttCancelarEdit = new javax.swing.JButton();
        bttGuardar = new javax.swing.JButton();
        nombreFieldEdit = new javax.swing.JTextField();
        apellidoFieldEdit = new javax.swing.JTextField();
        contactoFieldEdit = new javax.swing.JTextField();
        contraFieldEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dniFieldEdit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        puestoBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        bttCancelarEdit.setLabel("Cancelar");
        bttCancelarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarEditActionPerformed(evt);
            }
        });

        bttGuardar.setText("Guardar");
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DNI:");

        dniFieldEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniFieldEditActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Contacto:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Cargo:");

        puestoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor(a)", "At. Cliente"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttCancelarEdit)
                        .addGap(28, 28, 28)
                        .addComponent(bttGuardar)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contactoFieldEdit)
                                    .addComponent(contraFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(puestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dniFieldEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                        .addComponent(nombreFieldEdit)
                                        .addComponent(apellidoFieldEdit)))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(puestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contactoFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contraFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardar)
                    .addComponent(bttCancelarEdit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttCancelarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarEditActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttCancelarEditActionPerformed

    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
        editarEmpleado();
        this.dispose();
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void dniFieldEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldEditActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoFieldEdit;
    private javax.swing.JButton bttCancelarEdit;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JTextField contactoFieldEdit;
    private javax.swing.JTextField contraFieldEdit;
    private javax.swing.JTextField dniFieldEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreFieldEdit;
    private javax.swing.JComboBox<String> puestoBox;
    // End of variables declaration//GEN-END:variables

    private Empleado buscarDni(String dni){
        Empleado empleadoEncontrado = null;
        int i = 0;
        while(i < Principal.empleados.size() && !Principal.empleados.get(i).getDNI().equalsIgnoreCase(dni)){
            i++;
        }
        if(i < Principal.empleados.size()){
            empleadoEncontrado = Principal.empleados.get(i);
        }
        return empleadoEncontrado;
    }
    
    private void rellenarDatos(){
        //recoger dni ingresado
        String dni = dniFieldEdit.getText();
        
        //if else buscar dni
        if(buscarDni(dni) != null){
            Empleado empleadoDatos = buscarDni(dni);
            //que se rellenen los datos
            nombreFieldEdit.setText(empleadoDatos.getNombres());
            apellidoFieldEdit.setText(empleadoDatos.getApellidos());
            puestoBox.setSelectedItem(empleadoDatos.getPuesto());
            contactoFieldEdit.setText(empleadoDatos.getContacto());
            contraFieldEdit.setText(empleadoDatos.getContrasena());
        }else {
            // Mostrar un mensaje de error si no se encuentra el DNI
            JOptionPane.showMessageDialog(this, "DNI inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void editarEmpleado(){
        String dni = dniFieldEdit.getText();
        Empleado empleadoAEditar = buscarDni(dni);
        
        String nombres = nombreFieldEdit.getText();
        String apellidos = apellidoFieldEdit.getText();
        String puesto = (String) puestoBox.getSelectedItem();
        String contacto = contactoFieldEdit.getText();
        String contrasena = contraFieldEdit.getText();
        
        if(nombres.isEmpty() || apellidos.isEmpty() || puesto.isEmpty() || contacto.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        System.out.println(empleadoAEditar);
        
        empleadoAEditar.setNombres(nombres);
        empleadoAEditar.setApellidos(apellidos);
        empleadoAEditar.setPuesto(puesto);
        empleadoAEditar.setContacto(contacto);
        empleadoAEditar.setContrasena(contrasena);
        
        JOptionPane.showMessageDialog(this, "Información editada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        AgregarEmpleado.vaciarCampos(this);
        
        System.out.println(empleadoAEditar);
    }
}
