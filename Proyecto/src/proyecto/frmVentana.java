/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto.Cliente;
/**
 *
 * @author Elektro
 */
public class frmVentana extends javax.swing.JFrame {

    private DefaultListModel<Cliente> listaClientes;
    /**
     * Creates new form frmVentana
     */
    public frmVentana() {
        initComponents();
        
        listaClientes = new DefaultListModel<>();
        lstListaClientes.setModel(listaClientes);
        this.rellenarClientes();
    }

        private genero getGeneroSeleccionado(){
        genero resultado=null;
        if(optHombre.isSelected()){
            resultado=genero.HOMBRE;
        }else if(optMujer.isSelected()){
            resultado=genero.MUJER;
        }else resultado=genero.NEUTRO;
        
        return resultado;
    }
      
    private void rellenarClientes(){
        Cliente c1=new Cliente("Mario","24/04/2022",2,false,genero.HOMBRE);
        Cliente c2=new Cliente("Laura","12/02/2022",3,"Alfredo",true,genero.MUJER);
        Cliente c3=new Cliente("Alex","12/03/2021",1,false,genero.NEUTRO);
        listaClientes.addElement(c1);
        listaClientes.addElement(c2);
        listaClientes.addElement(c3);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        optGrupo = new javax.swing.ButtonGroup();
        cmdSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkPro = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cmbMembresia = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEntrenador = new javax.swing.JTextField();
        optHombre = new javax.swing.JRadioButton();
        optMujer = new javax.swing.JRadioButton();
        optNeutro = new javax.swing.JRadioButton();
        cmdNuevo = new javax.swing.JButton();
        cmdModificar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaClientes = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Gimnasio");

        cmdSeleccionar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmdSeleccionar.setText("SELECCIONAR");
        cmdSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("LISTA DE CLIENTES");

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Fecha de inscripcion:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Membresía:");

        chkPro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        chkPro.setText("Profesional/Competidor");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Entrenador personal:");

        cmbMembresia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NoMembresia", "Basic", "Medium", "Hardcore" }));
        cmbMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMembresiaActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtEntrenador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        optGrupo.add(optHombre);
        optHombre.setText("HOMBRE");

        optGrupo.add(optMujer);
        optMujer.setText("MUJER");

        optGrupo.add(optNeutro);
        optNeutro.setText("NEUTRO");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEntrenador)
                            .addComponent(cmbMembresia, 0, 334, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(txtNombre)))
                    .addComponent(chkPro)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(optHombre)
                        .addGap(18, 18, 18)
                        .addComponent(optMujer)
                        .addGap(18, 18, 18)
                        .addComponent(optNeutro)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optHombre)
                    .addComponent(optMujer)
                    .addComponent(optNeutro))
                .addGap(39, 39, 39)
                .addComponent(chkPro)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        cmdNuevo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdModificar.setText("MODIFICAR");
        cmdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificarActionPerformed(evt);
            }
        });

        cmdBorrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("SALIR DE LA VENTANA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstListaClientes);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmdSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(cmdModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(cmdBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSeleccionar)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdModificar)
                    .addComponent(cmdBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        //Guardo en variables lo que el usuario ha escrito en la pantalla
        String nombre=txtNombre.getText();
        String fecha=txtFecha.getText();
        boolean profesional = chkPro.isSelected();
        int membresia=cmbMembresia.getSelectedIndex();
        String entrenador= txtEntrenador.getText();
        genero g=this.getGeneroSeleccionado();
        //Creamos el cliente
        Cliente c=new Cliente(nombre,fecha,membresia,entrenador,profesional,g);
        //Añadimos el cliente al DefaultListModel
        listaClientes.addElement(c);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void habilitarBotones(boolean b){
        cmdNuevo.setEnabled(b);
        cmdModificar.setEnabled(!b);
        cmdBorrar.setEnabled(!b);
    }
    
    private void mostrarClientes(){
        //Pregunto al JList el objeto Cliente que tiene seleccionado
        Cliente c =lstListaClientes.getSelectedValue();
        //Comprobamos de que haya un Cliente seleccionado
        if(c!=null){
        txtNombre.setText(c.getNombre());
        txtFecha.setText(c.getFecha());
        cmbMembresia.setSelectedIndex(c.getMembresia());
        txtEntrenador.setText(c.getEntrenador());
        chkPro.setSelected(c.isProfesional());
        switch(c.getGenero()){
            case HOMBRE:
                optHombre.setSelected(true);
                break;
            case MUJER:
                optMujer.setSelected(true);
                break;
            case NEUTRO:
                optNeutro.setSelected(true);
                break;
            default:
                optNeutro.setSelected(true);
                break;    
        }
        this.habilitarBotones(false);
        }
    }
    
    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeleccionarActionPerformed
        mostrarClientes();
    }//GEN-LAST:event_cmdSeleccionarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        Cliente c = lstListaClientes.getSelectedValue();
        listaClientes.removeElement(c);
        this.habilitarBotones(true);
        txtNombre.setText("");
        txtFecha.setText("");
        cmbMembresia.setSelectedIndex(0);
        chkPro.setSelected(false);
        optGrupo.clearSelection();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        //recupero el objeto seleccionado en el JList
        Cliente c = lstListaClientes.getSelectedValue();
        String nombreNuevo=txtNombre.getText();
        String fechaNueva=txtFecha.getText();
        int membresiaNueva=cmbMembresia.getSelectedIndex();
        boolean profesional=chkPro.isSelected();
        genero g= this.getGeneroSeleccionado();
        c.setNombre(nombreNuevo);
        c.setFecha(fechaNueva);
        c.setMembresia(membresiaNueva);
        c.setProfesional(profesional);
        c.setGenero(g);
        //Actualizar el JList
        lstListaClientes.repaint();
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void cmbMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMembresiaActionPerformed
        // ESTO NO TENDRÁ FUNCIÓN, SE HA CREADO POR ERROR.
    }//GEN-LAST:event_cmbMembresiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Para cerrar la ventana si se prefiere en vez de de darle a la "X" 
        //de la esquina superior derecha.
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Para cerrar la ventana
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Para abrir el archivo que hayamos creado de nuestra lista
        JFileChooser filechooser = new JFileChooser();
        int resultado = filechooser.showOpenDialog(this);
        if(resultado==JFileChooser.APPROVE_OPTION){
            try{
            FileInputStream archivo=new FileInputStream(filechooser.getSelectedFile());
            ObjectInputStream lector=new ObjectInputStream(archivo);
            Object o = lector.readObject();
            listaClientes=(DefaultListModel)o;
            lstListaClientes.setModel(listaClientes);
            lector.close();
            archivo.close();
            }catch(Exception error){
                JOptionPane.showMessageDialog(this,
                    "Error al cargar el archivo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Para guardar el contenido de nuestra lista
        JFileChooser filechooser = new JFileChooser();
        int resultado = filechooser.showSaveDialog(this);
        if(resultado==JFileChooser.APPROVE_OPTION){
            try{
                FileOutputStream archivo=new FileOutputStream(filechooser.getSelectedFile());
                ObjectOutputStream escritor= new ObjectOutputStream(archivo);
                escritor.writeObject(listaClientes);
                archivo.close();
                escritor.close();
            }catch (IOException error){
                JOptionPane.showMessageDialog(this,
                    "Error al serializar los datos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
            }
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // ESTO NO TENDRÁ FUNCIÓN, SE HA CREADO POR ERROR
    }//GEN-LAST:event_txtFechaActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPro;
    private javax.swing.JComboBox<String> cmbMembresia;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Cliente> lstListaClientes;
    private javax.swing.ButtonGroup optGrupo;
    private javax.swing.JRadioButton optHombre;
    private javax.swing.JRadioButton optMujer;
    private javax.swing.JRadioButton optNeutro;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtEntrenador;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
