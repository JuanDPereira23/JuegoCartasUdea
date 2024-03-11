/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class FrmJuego extends javax.swing.JFrame {

    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();

    public FrmJuego() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRepartir = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        tpJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        btnEscaleras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CalcularPuntaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Cartas");

        btnRepartir.setText("Repartir");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        pnlJugador1.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Martín Estrada Contreras", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Raúl Vidal", pnlJugador2);

        btnEscaleras.setText("Escaleras");
        btnEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalerasActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        CalcularPuntaje.setText("Puntaje");
        CalcularPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularPuntajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnRepartir)
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addGap(18, 18, 18)
                .addComponent(btnEscaleras)
                .addGap(18, 18, 18)
                .addComponent(CalcularPuntaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tpJugadores)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepartir)
                    .addComponent(btnVerificar)
                    .addComponent(btnEscaleras)
                    .addComponent(CalcularPuntaje))
                .addGap(18, 18, 18)
                .addComponent(tpJugadores))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        jugador1.repartir();
        jugador2.repartir();
        
        jugador1.mostrar(pnlJugador1);
        jugador2.mostrar(pnlJugador2);

    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        int pestaña = tpJugadores.getSelectedIndex();
        String mensaje = "";
        switch (pestaña) {
            case 0:
                mensaje=jugador1.getGrupos();
                break;
            case 1:
                mensaje=jugador2.getGrupos();
                break;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnEscalerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalerasActionPerformed
                                            
    int pestaña = tpJugadores.getSelectedIndex();
List<List<Carta>> escaleras = new ArrayList<>();
String mensaje = "";
switch (pestaña) {
    case 0:
        escaleras = jugador1.getEscaleras();
        mensaje = "<html>" + jugador1.getEscalerasTexto().replaceAll("\n", "<br>") + "</html>";
        break;
    case 1:
        escaleras = jugador2.getEscaleras();
        mensaje = "<html>" + jugador2.getEscalerasTexto().replaceAll("\n", "<br>") + "</html>";
        break;
}

if (escaleras.isEmpty()) {
    JOptionPane.showMessageDialog(this, "No se encontraron escaleras", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    return;
}

// Mostrar las imágenes de las cartas en escalera en un nuevo panel
JFrame frame = new JFrame("Escaleras encontradas");
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
JPanel panel = new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

JLabel lblTexto = new JLabel(mensaje);
lblTexto.setHorizontalAlignment(SwingConstants.LEFT); // Alineación a la izquierda
JPanel panelTexto = new JPanel(new FlowLayout(FlowLayout.LEFT));
panelTexto.add(lblTexto);
panel.add(panelTexto);

JPanel panelCartas = new JPanel();
panelCartas.setLayout(new FlowLayout(FlowLayout.LEFT));

for (List<Carta> escalera : escaleras) {
    for (Carta c : escalera) {
        c.mostrar(panelCartas, 0, 0); // Mostrar las cartas en horizontal
    }
    // Agregar un espacio entre escaleras
    panelCartas.add(Box.createRigidArea(new Dimension(20, 0)));
}
panel.add(panelCartas);

JScrollPane scrollPane = new JScrollPane(panel);
frame.add(scrollPane);
frame.pack();
frame.setVisible(true);


    }//GEN-LAST:event_btnEscalerasActionPerformed

    private void CalcularPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularPuntajeActionPerformed
    int pestaña = tpJugadores.getSelectedIndex();
        switch (pestaña){
            case 0:
                JOptionPane.showMessageDialog(pnlJugador1, "Su puntaje es: "+jugador1.calcularPuntajeTotal());
                break;
            case 1:
                JOptionPane.showMessageDialog(pnlJugador2, "Su puntaje es: "+jugador2.calcularPuntajeTotal());
                break;
        }
    }//GEN-LAST:event_CalcularPuntajeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularPuntaje;
    private javax.swing.JButton btnEscaleras;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JTabbedPane tpJugadores;
    // End of variables declaration//GEN-END:variables
}