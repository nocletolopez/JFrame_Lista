package Joda;
import javax.swing.*;
import java.awt.event.*;

public class Panel extends javax.swing.JFrame {

    private JTextField texto1;
    private JScrollPane despi;
    private JTextArea area1;
    private JButton bot;
    
    String texto = "";
    
    
            
    public Panel() {
        setLayout(null);
        texto1 = new JTextField( );
        texto1.setBounds(10,10,300,30);
        add(texto1);
        
        bot = new JButton();
        bot.setBounds(10,10,300,30);
        add(bot);
        bot.addActionListener(null);
        
        area1 = new JTextArea();
        area1.setBounds(10,10,300,30);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
