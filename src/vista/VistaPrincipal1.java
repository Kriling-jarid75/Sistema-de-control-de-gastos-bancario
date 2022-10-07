/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexionBaseDeDatos.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.VistaPrincipal1.cmbTipoOperacion;
import static vista.VistaPrincipal1.jTableRegistros;
import static vista.VistaPrincipal1.txtSaldoActual;
import static vista.VistaPrincipal1.txtSaldoNuevo;
import static vista.VistaPrincipal1.txtSaldoAUsar;

/**
 *
 * @author Garci
 */
public class VistaPrincipal1 extends javax.swing.JFrame {

    Calendar calendario;
    String valor;
    double cantidadTotal = 0;
    double cantidad1, cantidad2;

    public VistaPrincipal1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        txtFecha.setText(año + "-" + mes + "-" + dia);
        recuperarRegistros();
        txtSaldoActual.setText("0000.00");
        txtSaldoAUsar.setText("0000.00");
        txtSaldoNuevo.setText("0000.00");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtSaldoActual = new javax.swing.JTextField();
        txtSaldoAUsar = new javax.swing.JTextField();
        txtSaldoNuevo = new javax.swing.JTextField();
        cmbTipoOperacion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Control De Gastos Bancario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/payment.png"))); // NOI18N
        jButton1.setText("Realizar Proceso de Gasto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SISTEMA DE CONTROL DE GASTOS BANCARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado de cuenta actual:  $");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Saldo a utilizar:                  $");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de movimiento a realizar:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saldo nuevo del estado de cuenta: $");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "SALDO ACTUAL", "SALDO UTILIZADO", "SALDO NUEVO", "TIPO DE OPERACIÓN", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRegistros);
        if (jTableRegistros.getColumnModel().getColumnCount() > 0) {
            jTableRegistros.getColumnModel().getColumn(0).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(1).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(2).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(3).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(4).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 1190, 260));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton2.setText("Eliminar un registro de la tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        txtSaldoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActualActionPerformed(evt);
            }
        });
        getContentPane().add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 210, -1));
        getContentPane().add(txtSaldoAUsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 210, -1));

        txtSaldoNuevo.setEditable(false);
        getContentPane().add(txtSaldoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 370, -1));

        cmbTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">> Seleccione el Tipo de Operación <<", "Depósito de un cliente ", "Pago de Nominas", "Transferencias a Javier", "Otro..." }));
        cmbTipoOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoOperacionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 370, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha del día:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        txtFecha.setEditable(false);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/montañaConNeblina.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1280, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (validarCamposVacios() == true) {
            JOptionPane.showMessageDialog(null,
                    " [Hay campos vacios] - A continuación escriba algo en ellos y "
                    + "proceda a elegir el tipo de operación, Por favor :D ",
                    "Mensaje de Alerta !! ", JOptionPane.INFORMATION_MESSAGE);

        } else {
            int r = JOptionPane.showConfirmDialog(null, "¿Desea Proceder a Registrar el Gasto $_$ ?",
                    "Mensaje de Imprensión", JOptionPane.YES_NO_OPTION);
            if (r == 0) {
                registroDeGastosGenerales();
            } else {

                JOptionPane.showMessageDialog(null, "Entendido, :D ");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSaldoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActualActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTableRegistros.getSelectedRow() >= 0) {
            elimnarRegistro();

        } else {
            JOptionPane.showMessageDialog(null, "Primero seleccione un fila para eliminar el registro",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbTipoOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoOperacionActionPerformed
       
///*Lo que realiza este fragmento de código es validar que opción escogio dentro del combo box*/
//        if (validarCamposVacios() == true) {
//            JOptionPane.showMessageDialog(null,
//                    "Antes de seleccionar el Tipo de Operación asegurese de llenar los campos primero !!",
//                    "Mensaje de Alerta", JOptionPane.INFORMATION_MESSAGE);
//
//            cmbTipoOperacion.setSelectedItem(">> Seleccione el Tipo de Operación <<");

//        } else {

        cantidad1 = Double.parseDouble(txtSaldoActual.getText());
        cantidad2 = Double.parseDouble(txtSaldoAUsar.getText());

        int combo = cmbTipoOperacion.getSelectedIndex();

        switch (combo) {
            case 1:
                cantidadTotal = cantidad1 + cantidad2;
                txtSaldoNuevo.setText(String.valueOf(cantidadTotal));
//                    System.out.println("Resultado de la suma de un deposito de unc cliente " + cantidadTotal); // Resultado => de la suma
//                  System.out.println(String.valueOf(cantidadTotal));
                break;
            case 2:
                cantidadTotal = cantidad1 - cantidad2;
                txtSaldoNuevo.setText(String.valueOf(cantidadTotal));
                //System.out.println("Pago de nomimas" + cantidadTotal); // Resultado => de la resta
                //System.out.println(String.valueOf(cantidadTotal));
                break;
            case 3:
                cantidadTotal = cantidad1 - cantidad2;
                txtSaldoNuevo.setText(String.valueOf(cantidadTotal));
                //System.out.println("Transferencias a javier " + cantidadTotal); // Resultado => resta
                //System.out.println(String.valueOf(cantidadTotal));
                break;
            case 4:
                cantidadTotal = cantidad1 - cantidad2;
                txtSaldoNuevo.setText(String.valueOf(cantidadTotal));
                // System.out.println("otro " + cantidadTotal); // Resultado => resta
                // System.out.println(String.valueOf(cantidadTotal));
                break;
            default:
                break;
        }

//        }

    }//GEN-LAST:event_cmbTipoOperacionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal1().setVisible(true);
            }
        });
    }

    private void registroDeGastosGenerales() {

        ConexionBD objCBD = new ConexionBD();

        objCBD.realizarConexion();
        ArrayList instruccionBD = new ArrayList();
        instruccionBD.add("{call sp_insertarGastoNuevo(?,?,?,?,?)}");
        instruccionBD.add(txtSaldoActual.getText());
        instruccionBD.add(txtSaldoAUsar.getText());
        instruccionBD.add(txtSaldoNuevo.getText());
        instruccionBD.add(cmbTipoOperacion.getSelectedItem());
        instruccionBD.add(txtFecha.getText());
        objCBD.ejecutarABC(instruccionBD);
        JOptionPane.showMessageDialog(null, "Gasto Almacenado Satisfactoriamente :D \n"
                + "Ahora tu saldo Nuevo es: $$ " + txtSaldoNuevo.getText(),
                "Gasto Realizado", JOptionPane.INFORMATION_MESSAGE);

        recuperarRegistros();
        limpiarCampos();
    }

    private void limpiarCampos() {

        txtSaldoActual.setText("0000.00");
        txtSaldoAUsar.setText("0000.00");
        txtSaldoNuevo.setText("0000.00");
        cmbTipoOperacion.setSelectedItem(">> Seleccione el Tipo de Operación <<");

    }

    public void recuperarRegistros() {
//Localidad: Inglaterra
        Locale locale = new Locale("en", "UK");
        NumberFormat objNF = NumberFormat.getInstance(locale);
        objNF.format(999999.999);

        ConexionBD objCBD = new ConexionBD();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IDENTIFICADOR");
        modelo.addColumn("SALDO ACTUAL");
        modelo.addColumn("SALDO UTLIZADO");
        modelo.addColumn("SALDO NUEVO");
        modelo.addColumn("TIPO DE OPERACIÓN");
        modelo.addColumn("FECHA DEL MOVIMIENTO");

        jTableRegistros.setModel(modelo);

        String[] datos = new String[6];

        objCBD.realizarConexion();
        ArrayList instruccionBD = new ArrayList();
        instruccionBD.add("{call sp_ConsultarGastosTable()}");
        ResultSet cdr = objCBD.ejecutarConsulta(instruccionBD);
        try {
            while (cdr.next()) {
                datos[0] = cdr.getString(1);
                datos[1] = objNF.format(cdr.getDouble(2));
                datos[2] = objNF.format(cdr.getDouble(3));
                datos[3] = objNF.format(cdr.getDouble(4));
                datos[4] = cdr.getString(5);
                datos[5] = cdr.getString(6);

                modelo.addRow(datos);
            }
            jTableRegistros.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);

        } finally {

            objCBD.cerrarConexion();
        }
    }

    private boolean validarCamposVacios() {

        boolean x = txtSaldoActual.getText().equalsIgnoreCase("0000.00")
                || txtSaldoAUsar.getText().equalsIgnoreCase("0000.00");

        return x;

    }

    private void elimnarRegistro() {

        ConexionBD objCBD = new ConexionBD();
        DefaultTableModel dtm = (DefaultTableModel) jTableRegistros.getModel();
        int fila = jTableRegistros.getSelectedRow();
        String valor = jTableRegistros.getValueAt(fila, 0).toString();

        int r = JOptionPane.showConfirmDialog(null, "¿Estás seguro de Eliminar Este Registro?",
                "Eliminar", JOptionPane.YES_NO_OPTION);
        if (r == 0) {
            ArrayList instruccionBD = new ArrayList();
            instruccionBD.add("{call sp_eliminarGasto(?)}");
            instruccionBD.add(valor);

            objCBD.ejecutarABC(instruccionBD);
            JOptionPane.showMessageDialog(null, "Felicidades!! El Gasto Se Eliminó Correctamente");
            dtm.removeRow(jTableRegistros.getSelectedRow());

            objCBD.cerrarConexion();
        } else {
            JOptionPane.showMessageDialog(null, "Excelente!!, Inténtalo cuando gustes!! ");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cmbTipoOperacion;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableRegistros;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtSaldoAUsar;
    public static javax.swing.JTextField txtSaldoActual;
    public static javax.swing.JTextField txtSaldoNuevo;
    // End of variables declaration//GEN-END:variables
}