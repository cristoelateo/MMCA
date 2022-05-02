
package Paneles;

import Clases.Proyecto;
import Clases.ProyectoExcepcion;
import Clases.Servicio;
import Clases.tipoServicio;
import Principal.BaseDatos;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivanr
 */
public class PanelCotizaciones extends javax.swing.JPanel {
    //private Servicio controlServicio;
    public static ArrayList<Servicio> servicios = new ArrayList();
    public static ArrayList<Servicio> serviciosc = new ArrayList();
    DefaultTableModel dtm;
    public static Servicio controlServicio;
    BaseDatos bd= new BaseDatos();
    BigDecimal Ctotal;
    BigDecimal Csubtotal;
    BigDecimal CPresupuesto;
    /**
     * Creates new form PanelCotizaciones
     */
    public PanelCotizaciones() {
        initComponents();
        dtm=(DefaultTableModel) tblCotizacion.getModel();
        LLenarCombo();
    }
    private boolean validaCampo(JTextField t){
        try{
            estaVacio(t);
        }catch(ProyectoExcepcion e){
            showMessageDialog(this,e.getMessage()); t.requestFocus();
            return true;
        }
        return false;
    }
    public boolean esEntero(String val){
        float cant=0;
        try{
        cant=Float.parseFloat(val);
        }catch(NumberFormatException err){
            showMessageDialog(this,"Verifique tipo de dato");
            
        }
       if(cant>0){return true;
       }else{showMessageDialog(this,"El valor debe ser >0","Cotizaciones", JOptionPane.INFORMATION_MESSAGE); return false;}
    }

   private void estaVacio(JTextField t)throws ProyectoExcepcion{
        String cad=t.getText().trim();
        if(cad.equals(""))throw new ProyectoExcepcion("Campo vacio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdPro = new javax.swing.JTextField();
        btnBucarCot = new javax.swing.JButton();
        cbxpProyAct = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtConcepto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        txtPU = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCotizacion = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(251, 229, 218));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insertado.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(251, 229, 218));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        txtIdPro.setToolTipText("");
        txtIdPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdProMousePressed(evt);
            }
        });
        txtIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProActionPerformed(evt);
            }
        });

        btnBucarCot.setBackground(new java.awt.Color(241, 172, 133));
        btnBucarCot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBucarCot.setForeground(new java.awt.Color(255, 255, 255));
        btnBucarCot.setText("Buscar cotizacion");
        btnBucarCot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBucarCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarCotActionPerformed(evt);
            }
        });

        cbxpProyAct.setBackground(new java.awt.Color(241, 172, 133));
        cbxpProyAct.setForeground(new java.awt.Color(241, 172, 133));
        cbxpProyAct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxpProyAct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxpProyActFocusLost(evt);
            }
        });
        cbxpProyAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpProyActActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("INGRESE ID DEL PROYECTO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxpProyAct, 0, 315, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucarCot, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxpProyAct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucarCot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(251, 229, 218));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });

        txtConcepto.setText("Concepto");
        txtConcepto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConceptoMousePressed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(241, 172, 133));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btAgregar.setBackground(new java.awt.Color(241, 172, 133));
        btAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar.setText("Agregar");
        btAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        txtPU.setText("P.U.");
        txtPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPUMousePressed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(241, 172, 133));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCantidad.setText("Cantidad");
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTotal.setText("00.00");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Total:");

        btnAplicar.setBackground(new java.awt.Color(241, 172, 133));
        btnAplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicar.setText("Aplicar");
        btnAplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(251, 229, 218));

        tblCotizacion.setBackground(new java.awt.Color(251, 229, 218));
        tblCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concepto", "Cantidad", "P.U", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCotizacion.setSelectionBackground(new java.awt.Color(241, 172, 133));
        tblCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCotizacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCotizacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPU, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAplicar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar los Siguientes datos");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Subtotal:");

        lblSubtotal.setBackground(new java.awt.Color(0, 0, 0));
        lblSubtotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSubtotal.setText("00.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?");
    if (JOptionPane.OK_OPTION == confirmado){
       borrar();
       buscarCot();
    }else
       System.out.println("No se ha eliminado");
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void Presupuesto() {
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
             int IDCOT = Integer.parseInt(txtIdPro.getText());
            String selectSql = "{call sp_obtn_presupuesto ("+IDCOT+")}";
            
            resultado= statement.executeQuery(selectSql);
                if(resultado.next()){
                System.out.println("seejecuta");
                CPresupuesto=resultado.getBigDecimal("PRESUPUESTO");
                
            if(CPresupuesto.compareTo(Ctotal)<0){
                JOptionPane.showMessageDialog(null,"La cotizacion excede el presupuesto, \n el presupuesto es de: " + CPresupuesto);
            }     
            }
            
                
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            
        }
    }
     ////////////////////////borrar//////////////////////////////////
    private void borrar() {


         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            int IDCOT = Integer.parseInt(txtIdPro.getText());
            String con = txtConcepto.getText();
            String selectSql = "{call sp_eliminar_ser_cot ("+IDCOT+","+"'"+con+"'"+")}";
            resultado= statement.executeQuery(selectSql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    private void txtIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProActionPerformed
       
    }//GEN-LAST:event_txtIdProActionPerformed

    private void txtIdProMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdProMousePressed
       txtIdPro.setText("");
       // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProMousePressed

    private void txtConceptoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConceptoMousePressed
        txtConcepto.setText("");
    }//GEN-LAST:event_txtConceptoMousePressed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        txtCantidad.setText("");
    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtPUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPUMousePressed
        txtPU.setText("");
    }//GEN-LAST:event_txtPUMousePressed

        
    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        if(validaCampo(txtConcepto))return;
        if(validaCampo(txtCantidad))return;
        if(esEntero(txtCantidad.getText())==false){ txtCantidad.requestFocus(); return;}
        if(validaCampo(txtPU))return;
        if(esEntero(txtPU.getText())==false){ txtPU.requestFocus(); return;}

        agregar();
        insertar();
        llenarTabla();
        buscarCot();
         System.out.println("agregar = ");
         txtCantidad.setText("");
         txtConcepto.setText("");
         txtPU.setText("");
         actualizarMontos();
         Presupuesto();        
    }//GEN-LAST:event_btAgregarActionPerformed
    
    
 ////////////////insertar//////////////////////////////////
    //HOLA
    private void insertar() {


         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            int IDCOT = Integer.parseInt(txtIdPro.getText());
            int codSev= controlServicio.getCodServicio();
            int cant = controlServicio.getCantidad();
            String selectSql = "{call sp_cot_ser ("+IDCOT+","+codSev+","+cant+")}";
            resultado= statement.executeQuery(selectSql);
        } catch (Exception ex) {
           
        }

    }
    private void agregar(){
        int numEntero = Integer.parseInt(txtCantidad.getText());
        int pos=servicios.size()-1;
        servicios.get(pos).setCantidad(numEntero);
    }
    
    /////////////////////////////////////////////////////////////
    private void actualizarMontos() {

        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
             int IDCOT = Integer.parseInt(txtIdPro.getText());
            String selectSql = "{call sp_obtn_montos ("+IDCOT+")}";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
                System.out.println("seejecuta");
            Csubtotal=resultado.getBigDecimal("SUBTOTAL");
            Ctotal=resultado.getBigDecimal("TOTAL");
            lblSubtotal.setText(Csubtotal.toString());
            lblTotal.setText(Ctotal.toString());
                
            
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            
        }
    }
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        new ServiciosCotizacion().setVisible(true);
        System.out.println(controlServicio);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       llenarTxt();
        System.out.println("focus ganado" );
    }//GEN-LAST:event_formFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
   
    }//GEN-LAST:event_txtCantidadFocusLost

    
    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
        
    }//GEN-LAST:event_jPanel2FocusGained

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        llenarTxt();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnBucarCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarCotActionPerformed
        
        if(validaCampo(txtIdPro))return;
        
        buscarCot();
        //System.out.println("se ejecuto esto");
        //llenarTabla2();
        actualizarMontos();
        Presupuesto();
    }//GEN-LAST:event_btnBucarCotActionPerformed

    private void cbxpProyActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpProyActActionPerformed
        System.out.println("accion");
    }//GEN-LAST:event_cbxpProyActActionPerformed

    private void cbxpProyActFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxpProyActFocusLost
        Proyecto p = (Proyecto) cbxpProyAct.getSelectedItem();
        txtIdPro.setText(String.valueOf(p.getId()));
    }//GEN-LAST:event_cbxpProyActFocusLost

    private void tblCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCotizacionMouseClicked
         if(evt.getClickCount()==2){
            String concepto= (String) dtm.getValueAt(tblCotizacion.getSelectedRow(), 0);
            txtConcepto.setText(concepto);
        }
    }//GEN-LAST:event_tblCotizacionMouseClicked
    private void buscarCot() {
        servicios.clear();
        eliminarTb();
         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
             int IDCOT = Integer.parseInt(txtIdPro.getText());
            String selectSql = "{call sp_obtn_coti ("+IDCOT+")}";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
                System.out.println("seejecuta");
            Servicio servicis = new Servicio(resultado.getInt("COD_SERVICIO"),resultado.getString("CONCEPTO"),resultado.getBigDecimal("PRECIO_UNITARIO"),
            resultado.getInt("TIPO_SERVICIO"),resultado.getString("PROVEEDOR"),resultado.getInt("CANTIDAD"));
            //System.out.println(servicis);
            servicios.add(servicis);
            
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            llenarTabla2();
            
        }
    }
    
       public void eliminarTb(){
        int a = tblCotizacion.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        dtm.removeRow(dtm.getRowCount()-1);
        }
        //cargaTicket();
    }
    
     public void llenarTabla(){
         BigDecimal sum = new BigDecimal(0) ;
         Object O[]=null;
         for (int i = 0; i < servicios.size(); i++) {

            dtm.addRow(O);
            Servicio ser = (Servicio) servicios.get(i);  
            dtm.setValueAt(ser.getConsepto(), i, 0);
            dtm.setValueAt(ser.getCantidad(), i, 1);
            dtm.setValueAt(ser.getPrecio(), i, 2);
            int numEntero = Integer.parseInt(txtCantidad.getText());
            BigDecimal cant = new BigDecimal(numEntero);
            BigDecimal impor= cant.multiply(ser.getPrecio());
            dtm.setValueAt(impor , i, 3);
            sum=sum.add(impor);
             System.out.println("concepto = " + ser.getConsepto());
             System.out.println(servicios.get(i));
            }
         
         lblTotal.setText(sum.toString());
     }
     
     public void llenarTabla2(){
         BigDecimal sum = new BigDecimal(0) ;
         Object O[]=null;
         for (int i = 0; i < servicios.size(); i++) {

            dtm.addRow(O);
            Servicio ser = (Servicio) servicios.get(i);  
            dtm.setValueAt(ser.getConsepto(), i, 0);
            dtm.setValueAt(ser.getCantidad(), i, 1);
            dtm.setValueAt(ser.getPrecio(), i, 2);
            BigDecimal cant = new BigDecimal(ser.getCantidad());
            BigDecimal impor= cant.multiply(ser.getPrecio());
            dtm.setValueAt(impor , i, 3);
            sum=sum.add(impor);
             System.out.println("concepto = " + ser.getConsepto());
             System.out.println(servicios.get(i));
            }
         
         //lblSubtotal.setText(sum.toString());
     }
    

      public void llenarTxt(){
          try{
         txtConcepto.setText(controlServicio.getConsepto());
         txtPU.setText(controlServicio.getPrecio().toString());
          }catch(NullPointerException npe){System.out.println("no hay datos aun" );}
    }
         
     public void LLenarCombo(){
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String selectSql = "{call sp_obtn_proy_activ}";
            resultado= statement.executeQuery(selectSql);
           while(resultado.next()){
               Proyecto proy = new Proyecto(resultado.getInt("ID_PROYECTO"),resultado.getString("CLIENTE"),resultado.getString("NOMBRE") );
               cbxpProyAct.addItem(proy);
           }
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }
    }

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnBucarCot;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Proyecto> cbxpProyAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCotizacion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtPU;
    // End of variables declaration//GEN-END:variables
}
