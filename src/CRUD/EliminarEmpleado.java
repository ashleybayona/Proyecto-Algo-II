/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUD;

import Modelo.Empleado;
import Controlador.Principal;
import static Controlador.Principal.empleados;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class EliminarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form EliminarEmpleado
     */
    public EliminarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Eliminar empleado");
        
        //para que haya info q borrar
        llenarListaPrueba();
        
        //para que al dar enter se busquen los datos
        dniFieldElim.addKeyListener(new java.awt.event.KeyAdapter() {
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
        bttCancelarElim = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        nombreFieldElim = new javax.swing.JTextField();
        apellidoFieldElim = new javax.swing.JTextField();
        contactoFieldElim = new javax.swing.JTextField();
        contraFieldElim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dniFieldElim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        bttCancelarElim.setLabel("Cancelar");
        bttCancelarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarElimActionPerformed(evt);
            }
        });

        bttEliminar.setText("Eliminar");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        nombreFieldElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldElimActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DNI:");

        dniFieldElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniFieldElimActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Contacto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttCancelarElim)
                        .addGap(28, 28, 28)
                        .addComponent(bttEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dniFieldElim)
                            .addComponent(nombreFieldElim)
                            .addComponent(apellidoFieldElim)
                            .addComponent(contactoFieldElim)
                            .addComponent(contraFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contactoFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contraFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttEliminar)
                    .addComponent(bttCancelarElim))
                .addContainerGap())
        );

        nombreFieldElim.setEditable(false);
        apellidoFieldElim.setEditable(false);
        contactoFieldElim.setEditable(false);
        contraFieldElim.setEditable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttCancelarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarElimActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttCancelarElimActionPerformed

    private void dniFieldElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldElimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldElimActionPerformed

    private void nombreFieldElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldElimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldElimActionPerformed

    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        //pasos eliminar: buscar el dni, en caso lo encuentre que se llenen los campos restantes y al
        //darle click a eliminar que salga una ventana de confirmación, en caso no se encuentre el dni
        //que salga una ventana de dni inválido
        eliminarEmpleado();
    }//GEN-LAST:event_bttEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoFieldElim;
    private javax.swing.JButton bttCancelarElim;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JTextField contactoFieldElim;
    private javax.swing.JTextField contraFieldElim;
    private javax.swing.JTextField dniFieldElim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreFieldElim;
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
        String dni = dniFieldElim.getText();
        
        //if else buscar dni
        if(buscarDni(dni) != null){
            Empleado empleadoDatos = buscarDni(dni);
            //que se rellenen los datos
            nombreFieldElim.setText(empleadoDatos.getNombres());
            apellidoFieldElim.setText(empleadoDatos.getApellidos());
            contactoFieldElim.setText(empleadoDatos.getContacto());
            contraFieldElim.setText(empleadoDatos.getContrasena());
        }else {
            // Mostrar un mensaje de error si no se encuentra el DNI
            JOptionPane.showMessageDialog(this, "DNI inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void eliminarEmpleado(){
        String dni = dniFieldElim.getText();
        Empleado empleadoAEliminar = buscarDni(dni);
        
        int respuesta = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro que desea eliminar al empleado?", "Confirmación", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(respuesta == JOptionPane.YES_OPTION){
            System.out.println(Principal.empleados);
            empleados.remove(empleadoAEliminar);
            System.out.println(Principal.empleados);
            AgregarEmpleado.vaciarCampos(this);
        } else {
            AgregarEmpleado.vaciarCampos(this);
            return;
        }
    }
    
    public static void llenarListaPrueba(){
        Empleado emp1 = new Empleado("99999999", "Ashley", "Bayona", "999999999", "user1");
        Empleado emp2 = new Empleado("99999998", "Elizabeth", "Vera", "999999998", "user2");
        Empleado emp3 = new Empleado("99999997", "Ola", "Chau", "999999997", "user3");
        
        Principal.empleados.add(emp1);
        Principal.empleados.add(emp2);
        Principal.empleados.add(emp3);
    }
}
