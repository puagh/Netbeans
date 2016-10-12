/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hectorleon
 */
//Librerias utilizadas
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTable­Model;
//import javax.swing.JOptionPane;


public class Procesar extends javax.swing.JFrame {
    
    //Variables
    int contar=0;
    int quantum=5;
    int NProceso;//Carga el número de procesos ejecutándose
    int Rafaga=0;//Carga la ráfaga en ejecución
    int rafagaRestante=0;//Carga el residuo en ejecución
    int tProceso = 0;
    int progreso=0;
    /**
     * Creates new form Procesar
     */
    public Procesar() {
        initComponents();           //Inicia los componentes
        jTextField2.grabFocus();    //Enfoca al usuario al campo de texto para que introduzca la ráfaga
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jButton1.setText("Insertar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jButton2.setText("Comenzar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 24)); // NOI18N
        jLabel1.setText("Simulador de Procesos por Prioridad");

        jTable1.setFont(new java.awt.Font("Menlo", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Ráfaga", "Prioridad", "Ráfaga restante", "Progreso %", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ráfaga");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 24)); // NOI18N
        jLabel3.setText("Procesos");

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jLabel4.setText("Quantum");

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setText("5");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre del proceso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Prioridad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jTextField2)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Insertar();  //Función que inserta los elementos a la tabla
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Thread(new HiloNuevo()).start();        //Creación de un hilo para ejecución 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesar().setVisible(true);
            }
        });
        
    }
    
    public void Insertar(){     //Función que inserta procesos en la tabla jTable1.
        DefaultTableModel data = (DefaultTableModel) jTable1.getModel();
        Object[] tabla = new Object [6]; //El objeto tabla representa el numero de las columna.
        tabla[0]= jTextField2.getText();        //Nombre del proceso. OK
        tabla[1]= jTextField1.getText();        //Ráfaga. OK
        tabla[2]= jTextField3.getText();        //Prioridad. OK
        tabla[3]= jTextField1.getText();        //Ráfaga restante. OK
        tabla[4]= tProceso;                     //Progreso. OK
        tabla[5]= "Listo";                      //Estado. OK
        data.addRow(tabla);     //Asignamos el objeto tabla a la fila de la tabla "data".
        jTable1.setModel(data); //Asignamos la tabla "data" a la tabla jTable1.
        jTextField1.setText(null);  //Se vacía el textfield para la nueva captura.
        jTextField2.setText(null);  //Se vacía el textfield para la nueva captura.
        jTextField3.setText(null);  //Se vacía el textfield para la nueva captura.
        jTextField2.grabFocus();    //Enfoca en el campo para agregar con más rapidez.
        contar++; //Aumenta el contador a medida que se agregan procesos.
        //System.out.println(contar+"\n");
            
    }
    
    private class HiloNuevo implements Runnable{     //Objeto Thread ejecutable
        @Override
        public void run(){  //Método de ejecución
            boolean estado =true;   //Variable auxiliar par ala condición
            int conta=0;        //Variable contador 
            while(estado!=false){
                while(conta<=contar){ //Recorreriendo las filas
                    Carga(conta);
                    if(rafagaRestante!=0 && rafagaRestante>quantum){
                        tProceso = Rafaga-rafagaRestante;
                        for(int ejecucion=1; ejecucion<=quantum; ejecucion++){
                            jTable1.setValueAt("Ejecutando",conta,4);   //Actualización del estado del proceso a Ejecutando
                            rafagaRestante--;    //Reduciendo la ráfaga en 1
                            
                            jTable1.setValueAt(String.valueOf(rafagaRestante),conta,2);
                            Esperar();  //Función que ralentiza la ejecución para que espere 1 segundo
                            
                            tProceso++;
                            ActualizarProceso(Rafaga,tProceso);
                            jTable1.setValueAt(String.valueOf(progreso),conta,3);
                        }
                        jTable1.setValueAt("Bloqueado",conta,4);
                        if(rafagaRestante==0){
                            jTable1.setValueAt("Terminado",conta,4);
                            Limpiar(conta);
                            ActualizarProceso(Rafaga,tProceso);
                        }
                    }
                    else{
                        if(rafagaRestante>0){
                            tProceso = Rafaga-rafagaRestante;
                            while(rafagaRestante>0){     //Mientras exista un residuo de ráfaga CONDICIÓN
                                jTable1.setValueAt("Ejecutando",conta,4);
                                rafagaRestante--;
                                jTable1.setValueAt(String.valueOf(rafagaRestante),conta,2);
                                Esperar();  //Función que ralentiza la ejecución para que espere 1 segundo
                                tProceso++;
                                ActualizarProceso(Rafaga,tProceso);
                                jTable1.setValueAt(String.valueOf(progreso),conta,3);
                            }
                            jTable1.setValueAt("Bloqueado",conta,4);
                            if(rafagaRestante==0){
                                jTable1.setValueAt("Terminado",conta,4);
                                Limpiar(conta);
                            }
                        }
                        else{
                            if(rafagaRestante==0){
                                jTable1.setValueAt("Terminado",conta,4);
                                Limpiar(conta);
                            }
                        }
                    }
                    conta--;
                }
                conta=0;  
            }
        }    
    }

    public void Carga(int conta){ //Carga los valores de la Tabla a ejecución
        NProceso=(int)jTable1.getValueAt(conta,0);
        Rafaga=parseInt((String)(jTable1.getValueAt(conta,1)));
        rafagaRestante=parseInt((String)(jTable1.getValueAt(conta,2)));
    }
    
    public void Limpiar(int c){ //Cambia el estado de los procesos cuando estos terminan de ejecutarse por completo.
    jTable1.setValueAt("0",c,2);
    jTable1.setValueAt("100%",c,3);
    jTable1.setValueAt("Terminado",c,4);
    }
    
    public void ActualizarProceso(int rafaga, int tProceso){ //Calcula progreso
        progreso = tProceso*100/rafaga;
    }
    
    public void Esperar(){
        try{
            Thread.sleep(800); //Permite esperar 1 segundo al sistema
        }
        catch(InterruptedException ex){
            Logger.getLogger(Procesar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}