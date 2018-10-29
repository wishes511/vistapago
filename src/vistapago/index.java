/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistapago;

import Persistencia.db;
import java.net.URI;
import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author gateway1
 */
public class index extends javax.swing.JFrame {

    public ButtonGroup bg = new ButtonGroup();

    String so = System.getProperty("os.name");
    String usuario = System.getProperty("user.name");
    String directorioreport = "Z:\\TIMBRADOS\\XML_TIM\\PAG_";
    String uri = "Z:/TIMBRADOS/XML_TIM";
    String coppel = "";
    String name = "";
    //   JOptionPane.showMessageDialog(null, sSistemaOperativo+" "+usuario);

    /**
     * Creates new form index
     */
    public index() {
        super("Temporalmente sin nombre");
        initComponents();
        bg.add(rb1);
        bg.add(rb2);
        rb1.setToolTipText("Busca Pagos de ATHLETIC");
        rb2.setToolTipText("Busca Pagos de UPTOWN");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/vistapago/icono.png")).getImage());
        if (so.equals("Linux") || so.equals("linux")) {
            directorio.setText("Directorio de archivos");
            directorioreport = "/home/" + usuario + "/ventareport/reportes/PAGO";
            uri = "/home/" + usuario + "/ventareport/reportes";

            File dir = new File(".");
            String[] ficheros = dir.list();
            String hp = "";
            if (ficheros == null) {
                hp = "No hay :(";
            } else {
                for (int x = 0; x < ficheros.length; x++) {
                    //System.out.println(ficheros[x]);
                    hp += "\n-" + ficheros[x] + "-";
                }
            }
            JOptionPane.showMessageDialog(null, dir.getAbsolutePath());
        }
        //JOptionPane.showMessageDialog(null, directorioreport + " " + uri);
        d1.setToolTipText("Primer folio que tomara para busqueda");
        d2.setToolTipText("Segundo folio que tomara para busqueda");
        directorio.setToolTipText("Despliega directorio en el cual se almacenan los archivos a consultar");
        boton.setToolTipText("Vista de registros");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBackgroundTitle1 = new org.edisoncor.gui.label.LabelBackgroundTitle();
        jLabel3 = new javax.swing.JLabel();
        panelTranslucido1 = new org.edisoncor.gui.panel.PanelTranslucido();
        d1 = new org.edisoncor.gui.textField.TextFieldRectImage();
        d2 = new org.edisoncor.gui.textField.TextFieldRectImage();
        boton = new org.edisoncor.gui.button.ButtonAction();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new org.edisoncor.gui.textField.TextFieldRectIcon();
        directorio = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        vistaurl = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1er folio         al       2do. Folio");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d1.setDragEnabled(true);
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        d1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                d1PropertyChange(evt);
            }
        });

        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        d2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                d2PropertyChange(evt);
            }
        });

        boton.setText("Ver registros");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros de pago del");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1er folio         al       2do. Folio");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("o al nombre de cliente con:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        directorio.setIcon(new javax.swing.ImageIcon("C:\\ventareport\\archivos\\carpeta.png")); // NOI18N
        directorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directorioMouseClicked(evt);
            }
        });

        buttonAction1.setText("Comprobante \nCoppel");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        rb1.setSelected(true);
        rb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb1MouseClicked(evt);
            }
        });
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb2MouseClicked(evt);
            }
        });
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ATHLETIC");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UPTOWN");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        vistaurl.setBackground(new java.awt.Color(0, 0, 0));
        vistaurl.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vistaurl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(vistaurl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelTranslucido1Layout = new javax.swing.GroupLayout(panelTranslucido1);
        panelTranslucido1.setLayout(panelTranslucido1Layout);
        panelTranslucido1Layout.setHorizontalGroup(
            panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucido1Layout.createSequentialGroup()
                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelTranslucido1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addGroup(panelTranslucido1Layout.createSequentialGroup()
                                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        panelTranslucido1Layout.setVerticalGroup(
            panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        getContentPane().add(panelTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        setreport("n", nombre.getText());
    }//GEN-LAST:event_botonActionPerformed
    private void setreport(String tipo, String named) {

        if (verificacampos()) {

            try {
                String tipos;
                if(rb2.isSelected()){
                tipos = (tipo.equals("n")) ? "header.jasper" : "header_coppel.jasper";
                }else tipos = (tipo.equals("n")) ? "header_ath.jasper" : "header_coppel_ath.jasper";
                System.out.println(tipos+"-"+uri+"-"+directorioreport);
                db d = new db();
                Connection conexion = (rb1.isSelected()) ? d.getConexionath() : d.getConexion();
                int c1 = Integer.parseInt(d1.getText());
                int c2 = Integer.parseInt(d2.getText());
                for (int i = c1; i <= c2; i++) {
                    if (d.ifexistfolio(i, conexion)) {
                        Map parametros = new HashMap();
                        parametros.put("d1", i);
                        parametros.put("d2", c2);
                        parametros.put("nombre", named);
                        JasperReport jasper = (JasperReport) JRLoader.loadObject(getClass().getResource(tipos));
                        JasperPrint print = JasperFillManager.fillReport(jasper, parametros, conexion);
//            JasperViewer ver = new JasperViewer(print,false); //despliegue de reporte
//            ver.setTitle("XML");
//            ver.setVisible(true);
                        JRExporter exporter = new JRPdfExporter();
                        exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                        //exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("c:\\ventareport\\reportes\\PAGO" + i + ".pdf"));
                        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(directorioreport + "" + i + ".pdf"));
                        exporter.exportReport();
                    }
                }
                JOptionPane.showMessageDialog(null, "Reportes Generados Exitosamente!, Revise la carpeta contenedora");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Algunos de los campos esta vacio, Intentelo de nuevo.");
                e.printStackTrace();
            } catch (net.sf.jasperreports.engine.JRException es) {
                JOptionPane.showMessageDialog(null, "Error con el directorio raiz de reportes.");
                es.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getCause() + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error desconocido llame a un administrador.\n Causa del error: \n" + e);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede ejecutar reporte, verifique sus datos");
        }
    }

    private boolean verificanumero(String dato) {
        boolean resp = false;
        String patt = "[0-9]*";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(dato);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }

    private boolean verificacampos() {
        boolean resp = false;
        String patt = "[0-9]*";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(d1.getText());
        Matcher match1 = pat.matcher(d2.getText());
        if (!d1.getText().equals("") && !d2.getText().equals("")) {
            if (match.matches() && match1.matches()) {
                resp = true;
            }
        }
        return resp;
    }
    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        segd1();
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        segd2();
    }//GEN-LAST:event_d2ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        setreport("n", nombre.getText());
    }//GEN-LAST:event_nombreActionPerformed

    private void d1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_d1PropertyChange

    }//GEN-LAST:event_d1PropertyChange

    private void d2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_d2PropertyChange

    }//GEN-LAST:event_d2PropertyChange

    private void directorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directorioMouseClicked
        URI url = null;
        try {
            //url=new URI ("C:/ventareport/reportes");

            url = new URI(uri);
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            desktop.browse(url);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado la carpeta de reportes.");
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_directorioMouseClicked

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        coppel = JOptionPane.showInputDialog("Ingrese numero de cliente de Coppel para continuar.");
        if (coppel.equals("289")) {
            setreport("coppel", coppel);
        } else {
            JOptionPane.showMessageDialog(null, "Se debe de introducir el numero de cliente de Coppel.");
        }

    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        rb1.setSelected(true);
        buttonempresa("Z");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        rb2.setSelected(true);
        buttonempresa("U");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void rb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb1MouseClicked
        buttonempresa("Z");
    }//GEN-LAST:event_rb1MouseClicked

    private void rb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb2MouseClicked
        buttonempresa("U");
    }//GEN-LAST:event_rb2MouseClicked

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
         buttonempresa("Z");
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        buttonempresa("U");
    }//GEN-LAST:event_rb2ActionPerformed
private void buttonempresa(String unidad){
        uri = unidad+":/TIMBRADOS/XML_TIM";
        directorioreport = unidad+":\\TIMBRADOS\\XML_TIM\\PAG_";
        vistaurl.setText(directorioreport);
}
    public void segd1() {
        if (d1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo del primer folio no puede ir vacio");
            d1.requestFocus();
        } else if (!verificanumero(d1.getText())) {
            JOptionPane.showMessageDialog(null, "Debes escribir solamente numeros para el campo del primer folio");
            d1.requestFocus();
        } else {
            d2.requestFocus();
        }
    }

    public void segd2() {
        if (d2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo del segundo folio no puede ir vacio");
            d2.requestFocus();
        } else if (!verificanumero(d2.getText())) {
            JOptionPane.showMessageDialog(null, "Deebs escribir solamente numeros para el campo del primer folio");
            d2.requestFocus();
        } else if (Integer.parseInt(d2.getText()) < Integer.parseInt(d1.getText())) {
            JOptionPane.showMessageDialog(null, "El Segundo folio debe de ser mas grande o igual que el primero!");
            d2.requestFocus();
        } else {
            nombre.requestFocus();
        }

    }

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction boton;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.textField.TextFieldRectImage d1;
    private org.edisoncor.gui.textField.TextFieldRectImage d2;
    private javax.swing.JLabel directorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelBackgroundTitle labelBackgroundTitle1;
    private org.edisoncor.gui.textField.TextFieldRectIcon nombre;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JLabel vistaurl;
    // End of variables declaration//GEN-END:variables
}
