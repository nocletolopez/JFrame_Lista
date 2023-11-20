/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Joda;

public class CuadrosListas extends javax.swing.JFrame {

    public CuadrosListas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        etiresultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstcolor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Cuadro listas de colores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 140, 16);

        btn.setText("Aceptar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(160, 210, 75, 23);

        etiresultado.setEditable(false);
        getContentPane().add(etiresultado);
        etiresultado.setBounds(60, 242, 290, 40);

        lstcolor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Rojo\t", "Azul", "Verde", "Morado", "Amarillo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstcolor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 40, 210, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        String mensaje;
        if (lstcolor.getSelectedIndex() == -1) {

            mensaje = "Por favor elija una opción del recuadro";

        } else {

            mensaje = "El color seleccionado es: " + lstcolor.getSelectedValue().toString();

        }
        
        etiresultado.setText(mensaje);

    }//GEN-LAST:event_btnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuadrosListas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JTextField etiresultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstcolor;
    // End of variables declaration//GEN-END:variables
}
