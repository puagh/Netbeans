
package graficador;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
//Para el grafico de lineas
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;
//Para el gráfico de barras
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//Para el gráfico de pastel
import org.jfree.data.general.DefaultPieDataset;

/**
 * @author hectorleon
 */

public class Graficas extends javax.swing.JFrame {

    /**
     * Creates new form Gráficas
     */
    public Graficas() { //Constructor de la GIU
        initComponents();
        this.setLocationRelativeTo(null);   //Ubica en el centro de la pantalla
        this.lineas.setVisible(false);  //Oculta las capas al inicio
        this.barras.setVisible(false);  //Oculta las capas al inicio
        this.pastel.setVisible(false);  //Oculta las capas al inicio
        this.setVisible(true);   //Hace visible la GUI
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        l = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        p = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        capa = new javax.swing.JLayeredPane();
        lineas = new javax.swing.JPanel();
        barras = new javax.swing.JPanel();
        pastel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Tipo  de gráfico");

        l.setText("Líneas");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        b.setText("Barras");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        p.setText("Pastel");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "x", "y"
            }
        ));
        jScrollPane1.setViewportView(datos);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        capa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barrasLayout = new javax.swing.GroupLayout(barras);
        barras.setLayout(barrasLayout);
        barrasLayout.setHorizontalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        barrasLayout.setVerticalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pastelLayout = new javax.swing.GroupLayout(pastel);
        pastel.setLayout(pastelLayout);
        pastelLayout.setHorizontalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        pastelLayout.setVerticalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        capa.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capa.setLayer(barras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capa.setLayer(pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout capaLayout = new javax.swing.GroupLayout(capa);
        capa.setLayout(capaLayout);
        capaLayout.setHorizontalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capaLayout.setVerticalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4)))
            .addGroup(capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l)
                            .addComponent(b)
                            .addComponent(p))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        barras.setVisible(true);  //Hace visible la capa barras
        capa.setLayer(barras, 0,0);  //Indica la posición
        l.setSelected(false);  //Deselecciona los otros radio button
        p.setSelected(false);  //Deselecciona los otros radio button
    }//GEN-LAST:event_bActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        lineas.setVisible(true);  //Hace visible la capa lineas
        capa.setLayer(lineas, 0,0);  //Indica la posición
        b.setSelected(false);  //Deselecciona los otros radio button
        p.setSelected(false);  //Deselecciona los otros radio button
    }//GEN-LAST:event_lActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        pastel.setVisible(true);  //Hace visible la capa pastel
        capa.setLayer(pastel, 0,0);  //Indica la posición
        b.setSelected(false);  //Deselecciona los otros radio button
        l.setSelected(false);  //Deselecciona los otros radio button
    }//GEN-LAST:event_pActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChartPanel panel;           //Varialbes utilizadas en los tres tipos de graficos
        JFreeChart chart = null;
        
        if (l.isSelected()){
            //Hacer el gráfico de líneas
            int validar = 1;
            
            XYSplineRenderer renderer = new XYSplineRenderer();  //Renderizador par ahacer el grafico
            XYSeriesCollection dataset = new XYSeriesCollection();  //Almacena los datos enviados
            
            ValueAxis x = new NumberAxis();  //Define los ejes
            ValueAxis y = new NumberAxis();
            
            //VAriable que almacena los conjuntos de datos 
            XYSeries serie = new XYSeries("Datos");
            
            XYPlot plot;
            lineas.removeAll();
            //Agregar informacion obtenida de la tabla
            try{
                for(int fila=0;fila<5;fila++){
                    serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(fila, 0))),
                            Float.parseFloat(String.valueOf(datos.getValueAt(fila, 1))));
                }
            }
            catch(Exception e){
                validar =0;
            }
            //if(validar ==1){
                dataset.addSeries(serie);  //Agrega una serie a la coleccion de datos
                x.setLabel("Eje X");  //Titulo del eje x
                y.setLabel("Eje Y");  //Titulo del eje y
                plot = new XYPlot(dataset, x,y,renderer);  //Graficador
                chart = new JFreeChart(plot);  //Agrega titulo al grafico
                chart.setTitle("Gráfico de lineas");
            //}
            //else{
            //    JOptionPane.showMessageDialog(this, "Solo puede agregar números");
            //}
   
        }
        else if (b.isSelected()){
            //Hacer el gráfico de barras.
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            //Datos a graficar
            String producto1 = "Sopas";
            String producto2 = "Soda";
            
            String dia1 = "Dia 1";
            String dia2 = "Dia 2";
            String dia3 = "Dia 3";
            String dia4 = "Dia 4";
            
            //Valores de los datos a graficar
            
            //Producto 1
            data.addValue(18, producto1, dia1);  //Cantidad, producto, dia
            data.addValue(13, producto1, dia2);  //Cantidad, producto, dia
            data.addValue(6, producto1, dia3);  //Cantidad, producto, dia
            data.addValue(20, producto1, dia4);  //Cantidad, producto, dia
            
            //Producto 2
            data.addValue(9, producto2, dia1);  //Cantidad, producto, dia
            data.addValue(3, producto2, dia2);  //Cantidad, producto, dia
            data.addValue(11, producto2, dia3);  //Cantidad, producto, dia
            data.addValue(14, producto2, dia4);  //Cantidad, producto, dia
            
            chart = ChartFactory.createBarChart("Gráfico de barras","Día","Cantidad",data,PlotOrientation.HORIZONTAL,true,true,true);  //Titulo, eje x, eje y, informacion, orientacion, mostrar leyendas, mostrar barras de herramientas 
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setDomainGridlinesVisible(true);
        }
        else{
            //Hacer el gráfico de pastel
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Categoria 1", 20);  //Nombre, valor
            data.setValue("Categoria 2", 40);
            data.setValue("Categoría 3", 10);
            data.setValue("Categoria 4", 15);
            data.setValue("CAtegoria 5", 15);
            chart = ChartFactory.createPieChart3D("Grafico de Pastel", data, true, true, true);
            
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5, 10, 450, 470);  //Dimensiones
        //Asignar el panel a los diferentes layers creados
        if(l.isSelected()){
            //Gráfico de líneas
            lineas.add(panel);
            lineas.repaint();
        }
        else if(b.isSelected()){
            //Gráfico de barras
            barras.add(panel);
            barras.repaint();
        }
        else{
            //Gráfico de pastel
            pastel.add(panel);
            pastel.repaint();
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b;
    private javax.swing.JPanel barras;
    private javax.swing.JLayeredPane capa;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton l;
    private javax.swing.JPanel lineas;
    private javax.swing.JRadioButton p;
    private javax.swing.JPanel pastel;
    // End of variables declaration//GEN-END:variables
}
