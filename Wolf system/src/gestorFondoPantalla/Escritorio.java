/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorFondoPantalla;

import Login.Login1;
import calendario.Cal;
import calendario.Evento;
import calendario.VerEventos;
import editorTextos.Bloc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import mediaPlayer.mediaPlayer;
import navegador.navegadorWeb;
import registro.registro1;

/**
 *
 * @author Diana
 */
public class Escritorio extends javax.swing.JFrame implements ActionListener {
private final Dimension dim;
private JLabelClock miReloj;
    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
         dim=super.getToolkit().getScreenSize();
	        super.setSize(dim);
	        super.setUndecorated(true);
	        super.setVisible(true);
		  Panelimagen label = new Panelimagen();
		  label.setBorder(new EmptyBorder(5, 5, 5, 5));
		  label.setLayout(new BorderLayout(0, 0));
		  setContentPane(label);
                  miReloj=new JLabelClock();
                  miReloj.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
		 miReloj.setFont(new Font("Arial Black", Font.BOLD, 45));
		miReloj.setForeground(Color.BLACK);
		miReloj.setBounds(700, 39, 432, 47);
		jMenuBar1.add(miReloj);
             JButton btnFondo = new JButton("FONDO DE PANTALLA");
		 btnFondo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
                            Bloc bloc=new Bloc();
                          //Bloc.setVisible(true);
		 	}
		 });
		 btnFondo.setFont(new Font("Arial Black", Font.BOLD,18));
		 btnFondo.setForeground(Color.WHITE);
		 btnFondo.setContentAreaFilled(false);
                 btnFondo.setBorder(null);
                 btnFondo.setIcon(new ImageIcon(Escritorio.class.getResource("/img/editor.png")));
		 btnFondo.setBounds(0, 100, 400, 180);
		 label.add(btnFondo);
                  JButton btnBloc = new JButton("EDITOR DE TEXTOS");
		 btnBloc.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
                            Bloc bloc=new Bloc();
                         bloc.setVisible(true);
		 	}
		 });
		 btnBloc.setFont(new Font("Arial Black", Font.BOLD,18));
		 btnBloc.setForeground(Color.WHITE);
		 btnBloc.setContentAreaFilled(false);
                 btnBloc.setBorder(null);
                 btnBloc.setIcon(new ImageIcon(Escritorio.class.getResource("/img/editor-de-texto.png")));
		 btnBloc.setBounds(0, 200, 400, 180);
		 label.add(btnBloc);
                 JButton btnMediaPlayer = new JButton("MEDIA PLAYER");
		 btnMediaPlayer.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
                           mediaPlayer media=new mediaPlayer();
                          media.setVisible(true);
		 	}
		 });
		 btnMediaPlayer.setFont(new Font("Arial Black", Font.BOLD, 18));
		 btnMediaPlayer.setForeground(Color.WHITE);
		 btnMediaPlayer.setContentAreaFilled(false);
                 btnMediaPlayer.setBorder(null);
                 btnMediaPlayer.setIcon(new ImageIcon(Escritorio.class.getResource("/img/video_track.png")));
		 btnMediaPlayer.setBounds(0, 300, 400, 200);
		 label.add(btnMediaPlayer);
                
		JLabel lblEditorDeTextos = new JLabel("");
		lblEditorDeTextos.setForeground(Color.WHITE);
		lblEditorDeTextos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEditorDeTextos.setBounds(100, 418, 200, 90);
		label.add(lblEditorDeTextos);
		
                
		
                  
                 
    }
    public class Panelimagen extends  javax.swing.JPanel {
	public Panelimagen() {
		  this.setSize(1800,1500);
		 }
	
	 public void paintComponent(Graphics g) {
		  Dimension tamanio = getSize();
		  ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/img/s.jpg"));
		  g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		  setOpaque(false);
		  super.paintComponent(g);
		 }
		}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        apagarMenu = new javax.swing.JMenuItem();
        configuracionMenu = new javax.swing.JMenuItem();
        cambiarUMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        calendariooMenu = new javax.swing.JMenu();
        calendarioMenu = new javax.swing.JMenuItem();
        agregarEMenu = new javax.swing.JMenuItem();
        verEMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("jLabel2");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        homeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N
        homeMenu.setText("HOME");
        homeMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        apagarMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        apagarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/more.png"))); // NOI18N
        apagarMenu.setText("Apagar");
        apagarMenu.addActionListener(this);
        homeMenu.add(apagarMenu);

        configuracionMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        configuracionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_cog.png"))); // NOI18N
        configuracionMenu.setText("Configuracion");
        configuracionMenu.addActionListener(this);
        homeMenu.add(configuracionMenu);

        cambiarUMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cambiarUMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_usrlist.png"))); // NOI18N
        cambiarUMenu.setText("Cambiar usuario");
        cambiarUMenu.addActionListener(this);
        homeMenu.add(cambiarUMenu);

        jMenuBar1.add(homeMenu);
        jMenuBar1.add(jMenu2);

        calendariooMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        calendariooMenu.setText("CALENDARIO");
        calendariooMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        calendarioMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        calendarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_calendar.png"))); // NOI18N
        calendarioMenu.setText("Calendario");
        calendarioMenu.addActionListener(this);
        calendariooMenu.add(calendarioMenu);

        agregarEMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarEMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_event_add.png"))); // NOI18N
        agregarEMenu.setText("Agregar evento");
        agregarEMenu.addActionListener(this);
        calendariooMenu.add(agregarEMenu);

        verEMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        verEMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_events.png"))); // NOI18N
        verEMenu.setText("Ver eventos");
        verEMenu.addActionListener(this);
        calendariooMenu.add(verEMenu);

        jMenuBar1.add(calendariooMenu);
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jMenu3.setText("GESTOR DE ARCHIVOS");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/west-mini.png"))); // NOI18N
        jMenuItem1.setText("Abrir");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/internet-logo.png"))); // NOI18N
        jMenu4.setText("NAVEGADOR");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom-world-mini.png"))); // NOI18N
        jMenuItem2.setText("Abrir navegador");
        jMenuItem2.addActionListener(this);
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("");
        jMenuBar1.getAccessibleContext().setAccessibleParent(this);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 701, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1616, 839);
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == apagarMenu) {
            Escritorio.this.apagarMenuActionPerformed(evt);
        }
        else if (evt.getSource() == configuracionMenu) {
            Escritorio.this.configuracionMenuActionPerformed(evt);
        }
        else if (evt.getSource() == cambiarUMenu) {
            Escritorio.this.cambiarUMenuActionPerformed(evt);
        }
        else if (evt.getSource() == calendarioMenu) {
            Escritorio.this.calendarioMenuActionPerformed(evt);
        }
        else if (evt.getSource() == agregarEMenu) {
            Escritorio.this.agregarEMenuActionPerformed(evt);
        }
        else if (evt.getSource() == verEMenu) {
            Escritorio.this.verEMenuActionPerformed(evt);
        }
        else if (evt.getSource() == jMenuItem2) {
            Escritorio.this.jMenuItem2ActionPerformed(evt);
        }
    }//GEN-END:initComponents

    private void apagarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarMenuActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_apagarMenuActionPerformed

    private void agregarEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEMenuActionPerformed
        // TODO add your handling code here:
        Evento evento=new Evento();
        evento.setVisible(true);
    }//GEN-LAST:event_agregarEMenuActionPerformed

    private void cambiarUMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarUMenuActionPerformed
        // TODO add your handling code here:
        
        Login1 login=new Login1();
        login.setVisible(true);
    }//GEN-LAST:event_cambiarUMenuActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void verEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEMenuActionPerformed
        // TODO add your handling code here:
        VerEventos ve=new VerEventos();
        //ve.setVisible(true);
    }//GEN-LAST:event_verEMenuActionPerformed

    private void calendarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioMenuActionPerformed
        // TODO add your handling code here:
        Cal calendario=new Cal();
        calendario.setVisible(true);
    }//GEN-LAST:event_calendarioMenuActionPerformed

    private void configuracionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionMenuActionPerformed
        // TODO add your handling code here:
        registro1 registro=new registro1();
        registro.setVisible(true);
    }//GEN-LAST:event_configuracionMenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        navegadorWeb navegador=new navegadorWeb();
        navegador.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem agregarEMenu;
    javax.swing.JMenuItem apagarMenu;
    javax.swing.JMenuItem calendarioMenu;
    javax.swing.JMenu calendariooMenu;
    javax.swing.JMenuItem cambiarUMenu;
    javax.swing.JMenuItem configuracionMenu;
    javax.swing.JMenu homeMenu;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JMenuItem verEMenu;
    // End of variables declaration//GEN-END:variables
}
