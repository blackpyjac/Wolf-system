/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaPlayer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import static java.awt.SystemColor.info;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import java.util.TimerTask;
import javax.sound.sampled.SourceDataLine;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javazoom.jlgui.basicplayer.BasicController; 
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Player;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javazoom.jlgui.basicplayer.BasicPlayer;
import kj.dsp.KJDigitalSignalProcessingAudioDataConsumer;
import model.Archivos;
import org.blinkenlights.jid3.ID3Exception;
import org.tritonus.share.sampled.file.TAudioFileFormat;

/**
 *
 * @author Diana
 */
public class mediaPlayer extends javax.swing.JFrame implements ActionListener, MouseListener, ChangeListener {
	DefaultTableModel dtm;
    int posicion = 0;
    Metodo metodo = new Metodo();
    ArrayList<String> urls = new ArrayList<>();
    ArrayList<String> nombres = new ArrayList<>();
    ImageIcon[] icons = new ImageIcon[5];
    int condicion = 0;
    reproductor r=new reproductor();
    public mediaPlayer() {
        this.player1 = new BasicPlayer();
        initComponents();    
    }
	  private File file;
private BasicPlayer player1;

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        popupMenu1 = new java.awt.PopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        try {
            jPanel2 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "mediaPlayer.mediaPlayer_jPanel2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        labelnombre = new java.awt.Label();
        btnPlay = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnStop = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelTiempo = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jSliderVolumen = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        popupMenu1.setLabel("popupMenu1");

        org.jdesktop.layout.GroupLayout jDialog1Layout = new org.jdesktop.layout.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage(mediaPlayer.class.getResource("/img/video_track.png")));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelnombre.setAlignment(java.awt.Label.CENTER);
        labelnombre.setBackground(new java.awt.Color(255, 255, 255));
        labelnombre.setText("...");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(184, 184, 184)
                .add(labelnombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(labelnombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 350, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_1.png"))); // NOI18N
        btnPlay.setBorder(null);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prec.png"))); // NOI18N
        btnPlay.addActionListener(this);
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 70, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Playlist Name ");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(this);
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .add(6, 6, 6)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(7, 7, 7)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .add(39, 39, 39)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 320, 380));

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        btnStop.setBorder(null);
        btnStop.setContentAreaFilled(false);
        btnStop.addActionListener(this);
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 70, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vol3.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 70, 50));

        labelTiempo.setBackground(new java.awt.Color(255, 255, 255));
        labelTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(0, 51, 153));
        labelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo.setText("   00:00:00");
        getContentPane().add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 80, 40));

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pause_1.png"))); // NOI18N
        btnPause.setBorder(null);
        btnPause.setContentAreaFilled(false);
        btnPause.addActionListener(this);
        getContentPane().add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 70, 50));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previous_1.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(this);
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 70, 50));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(this);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 70, 50));

        jSliderVolumen.setValue(0);
        jSliderVolumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderVolumen.addChangeListener(this);
        getContentPane().add(jSliderVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 110, -1));

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setForeground(new java.awt.Color(51, 51, 255));
        jSlider1.setToolTipText("");
        jSlider1.setValue(0);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setName(""); // NOI18N
        jSlider1.setPreferredSize(new java.awt.Dimension(10, 10));
        jSlider1.setValueIsAdjusting(true);
        jSlider1.addMouseListener(this);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 610, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_deltbl.png"))); // NOI18N
        jButton1.setText("Quitar");
        jButton1.addActionListener(this);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 120, 40));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_column_add.png"))); // NOI18N
        jButton8.setText("Agregar");
        jButton8.addActionListener(this);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 120, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 60, 20));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        abrirMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        abrirMenu.setText("Abrir");
        abrirMenu.addActionListener(this);
        jMenu1.add(abrirMenu);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("Guardar playlist");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setText("Quit");
        jMenuItem3.addActionListener(this);
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 954, 521);
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnPlay) {
            mediaPlayer.this.btnPlayActionPerformed(evt);
        }
        else if (evt.getSource() == btnStop) {
            mediaPlayer.this.btnStopActionPerformed(evt);
        }
        else if (evt.getSource() == btnPause) {
            mediaPlayer.this.btnPauseActionPerformed(evt);
        }
        else if (evt.getSource() == btnBack) {
            mediaPlayer.this.btnBackActionPerformed(evt);
        }
        else if (evt.getSource() == btnNext) {
            mediaPlayer.this.btnNextActionPerformed(evt);
        }
        else if (evt.getSource() == jButton1) {
            mediaPlayer.this.jButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton8) {
            mediaPlayer.this.jButton8ActionPerformed(evt);
        }
        else if (evt.getSource() == abrirMenu) {
            mediaPlayer.this.abrirMenuActionPerformed(evt);
        }
        else if (evt.getSource() == jMenuItem3) {
            mediaPlayer.this.jMenuItem3ActionPerformed(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == jTable1) {
            mediaPlayer.this.jTable1MouseClicked(evt);
        }
        else if (evt.getSource() == jSlider1) {
            mediaPlayer.this.jSlider1MouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }

    public void stateChanged(javax.swing.event.ChangeEvent evt) {
        if (evt.getSource() == jSliderVolumen) {
            mediaPlayer.this.jSliderVolumenStateChanged(evt);
        }
    }//GEN-END:initComponents

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        metodo.pausar();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     String[] direcciones = metodo.abrirArchivo();
        urls.addAll(Arrays.asList(direcciones));
        String[] canciones = metodo.nombresArchivo();
        nombres.addAll(Arrays.asList(canciones));
        llenartabla();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
metodo.detener();        
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
  if (urls.size() > 0) {
            if (condicion == 1) {
               metodo.reproducir();
               condicion = 0;
}
                
             else {
               
                    condicion = 0;
                    metodo.ejecutar(urls.get(posicion));
                    metodo.reproducir();
                   
               
               
            }
            
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 posicion = metodo.volver(posicion);
        metodo.detener();
        metodo.ejecutar(urls.get(posicion));
        metodo.reproducir();    
    }//GEN-LAST:event_btnBackActionPerformed
  
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
posicion = metodo.siguiente(posicion, urls.size() - 1);
        metodo.detener();
        metodo.ejecutar(urls.get(posicion));
        metodo.reproducir();    
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked



    }//GEN-LAST:event_jSlider1MouseClicked

    private void jSliderVolumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderVolumenStateChanged
try {
r.control.setGain(100/(double)jSliderVolumen.getValue());
} catch (BasicPlayerException ex) {
Logger.getLogger(mediaPlayer.class.getName()).log(Level.SEVERE,
null, ex);
}
jLabel2.setText(jSliderVolumen.getValue()+"%" );
    }//GEN-LAST:event_jSliderVolumenStateChanged

    private void abrirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuActionPerformed
        // TODO add your handling code here:
                String[] direcciones = metodo.abrirArchivo();
        if (direcciones.length > 0) {
            urls.addAll(Arrays.asList(direcciones));
            String[] canciones = metodo.nombresArchivo();
            nombres.addAll(Arrays.asList(canciones));
            llenartabla();
        }
        
        
    }//GEN-LAST:event_abrirMenuActionPerformed
void llenartabla() {
        dtm = (DefaultTableModel) jTable1.getModel();
        while (dtm.getRowCount() != 0) {
            dtm.removeRow(0);
        }
        if (urls.size() > 0) {
            for (int i = 0; i < urls.size(); i++) {
                Object[] ruta = {i + 1, nombres.get(i)};
                dtm.addRow(ruta);
            }
        }
        jTable1.setModel(dtm);
        metodo.jtable(jTable1);
        System.out.println("estado: " + metodo.estado());
    }
    void anyadir() {
        dtm = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < urls.size(); i++) {
            Object[] ruta = {i + 1, nombres.get(i)};
            dtm.addRow(ruta);
        }
        jTable1.setModel(dtm);
        metodo.jtable(jTable1);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if (evt.getClickCount() == 2) {
            posicion = jTable1.getSelectedRow();
            int valor = metodo.estado();
            if (valor != -1) {
                metodo.detener();
                metodo.ejecutar(urls.get(posicion));
                metodo.reproducir();
                btnPlay.setIcon(icons[3]);
            } else {
                metodo.ejecutar(urls.get(posicion));
                metodo.reproducir();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed





  
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
            java.util.logging.Logger.getLogger(mediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mediaPlayer().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem abrirMenu;
    javax.swing.JButton btnBack;
    javax.swing.JButton btnNext;
    javax.swing.JButton btnPause;
    javax.swing.JButton btnPlay;
    javax.swing.JButton btnStop;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton4;
    javax.swing.JButton jButton8;
    javax.swing.JDialog jDialog1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JMenuItem jMenuItem3;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSlider jSlider1;
    javax.swing.JSlider jSliderVolumen;
    javax.swing.JTable jTable1;
    javax.swing.JTextField jTextField1;
    javax.swing.JLabel labelTiempo;
    java.awt.Label labelnombre;
    java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

}
