/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import datos.ListaTesis;
import javax.swing.table.DefaultTableModel;
import negocio.Tesis;

public class FrmMostrarTesis extends javax.swing.JInternalFrame {

    public FrmMostrarTesis() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        btnMostrar.setText("mostrar tesistas");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnMostrar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMostrar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("tesista 1");
        modelo.addColumn("tesista 2");
        modelo.addColumn("area");
        modelo.addColumn("año sustentacion");
        modelo.addColumn("paginas");
        modelo.addColumn("calificacion");
        TListas.TLista lista = ListaTesis.consultarLista();
        Object row[] = new Object[6];
        for (int i = 0; i < lista.Cantidad(); i++) {
            Tesis  objTesis =  (Tesis) lista.Obtener(i);
            row[0] = objTesis.getNombres()[0];
            row[1] = objTesis.getNombres()[1];
            row[2] = objTesis.getArea();
            row[3] = objTesis.getAnio_sustentacion();
            row[4]  = objTesis.getnPaginas();
            row[5] = retornarCalificacion(objTesis.getCalificacion());
          modelo.addRow(row);
        }
        table.setModel(modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed
   public String retornarCalificacion(int calificacion){
       String retorno = null;
       switch(calificacion){
          case 0:
              retorno = "regular";
           break;
          case  1:
               retorno =  "buena";
          break;
          case 2:
             retorno = "muy buena";
             break;
          case 3:
              retorno = "excelente";
              break;
          default:
              retorno = "no definido";
              break;
           
      }
       return  retorno;
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
