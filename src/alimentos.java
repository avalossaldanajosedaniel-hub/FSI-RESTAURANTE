
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class alimentos extends javax.swing.JFrame {
    Conexion cnx;
    ImageIcon cartel;
    ImageIcon icono =  new ImageIcon(getClass().getResource("/imagenes/carrito.jpeg"));
    
    public alimentos() {
        initComponents();
        
        setLocationRelativeTo(this);
       setIconImage(icono.getImage());//Cambiar el icono de la ventana
        TConsultas.setRowHeight(130);//cambiar el tamaño del rengoln de la tabla
        
        cnx = new Conexion();
        if (cnx.conectar("localhost", "fondatel", "root", "")==1) {
            cnx.entablar("SELECT *FROM peliculas", TConsultas, 20, 40, 40);
            
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la BD");
            System.exit(0);
       }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BNueva = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        LClabe = new javax.swing.JLabel();
        LTitulo = new javax.swing.JLabel();
        JLCartel = new javax.swing.JLabel();
        LCartel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TCLave = new javax.swing.JTextField();
        TTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jToolBar1.setBackground(new java.awt.Color(51, 51, 255));
        jToolBar1.setRollover(true);

        BNueva.setText("BORRAR");
        BNueva.setFocusable(false);
        BNueva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNueva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevaActionPerformed(evt);
            }
        });
        jToolBar1.add(BNueva);

        BRegistrar.setText("REGISTRAR");
        BRegistrar.setFocusable(false);
        BRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        jToolBar1.add(BRegistrar);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        LClabe.setText("CLAVE");

        LTitulo.setText("NOMBRE");

        JLCartel.setText("MENU");

        LCartel.setBackground(new java.awt.Color(153, 153, 255));
        LCartel.setForeground(new java.awt.Color(153, 153, 255));

        jButton1.setText("ABRIR MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LClabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TCLave, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JLCartel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(LCartel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LClabe)
                            .addComponent(TCLave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTitulo)
                            .addComponent(TTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(JLCartel)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LCartel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevaActionPerformed
int ren = TConsultas.getSelectedRow();
        
        if (ren >= 0) {
            int resp = JOptionPane.showConfirmDialog(
                this, 
                "¿Deseas eliminar la película seleccionada?", 
                "Confirmar eliminación", 
                JOptionPane.YES_NO_OPTION
            );
            
            if (resp == JOptionPane.YES_OPTION) {
                // Obtiene la clave directamente de la columna 0 del renglón seleccionado
                DefaultTableModel modelo = (DefaultTableModel) TConsultas.getModel();
                String cla = modelo.getValueAt(ren, 0).toString();
                String tit = modelo.getValueAt(ren, 1).toString();
                
                Peliculas pp = new Peliculas(cla, tit, cartel);
                
                if (pp.eliminar(cnx) == 1) {
                    JOptionPane.showMessageDialog(this, "Película eliminada correctamente");
                    
                    // Reconsulta a la base de datos para refrescar la tabla
                    cnx.entablar("SELECT * FROM peliculas", TConsultas, 20, 40, 40);
                    
                    // Limpia la interfaz gráfica
                    TCLave.setText("CLAVE");
                    TTitulo.setText("TITULO");
                    LCartel.setIcon(null);
                    cartel = null;
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar de la base de datos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila de la tabla primero");
        }
    }//GEN-LAST:event_BNuevaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File archivo = fc.getSelectedFile();
        cartel = new ImageIcon(archivo.getPath());
        LCartel.setIcon(new ImageIcon(cnx.escalarImagen(cartel.getImage(), 194, 235)));
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        String cla = TCLave.getText();
        String tit = TTitulo.getText();
        ImageIcon car = cartel;

        Peliculas pp = new Peliculas(cla, tit, car);
        if (pp.insertar(cnx) == 1) {
        cnx.entablar("SELECT * FROM peliculas", TConsultas, 20, 40, 40);
        } else {
         JOptionPane.showMessageDialog(this, "No se pudo registrar la película");
        }
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        int ren = TConsultas.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TConsultas.getModel();

        if (ren >= 0) {
        TCLave.setText(modelo.getValueAt(ren, 0).toString());
        TTitulo.setText(modelo.getValueAt(ren, 1).toString());
        cartel = new ImageIcon(cnx.escalarImagen(((ImageIcon)modelo.getValueAt(ren, 2)).
                getImage(), 194,235));
        LCartel.setIcon(cartel);
        }
    }//GEN-LAST:event_TConsultasMousePressed

    private void TTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTituloActionPerformed

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
            java.util.logging.Logger.getLogger(alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNueva;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JLabel JLCartel;
    private javax.swing.JLabel LCartel;
    private javax.swing.JLabel LClabe;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JTextField TCLave;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
