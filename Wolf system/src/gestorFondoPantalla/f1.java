package gestorFondoPantalla;

import calendario.Cal;
import editorTextos.Bloc;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import model.Usuario;


public class f1 extends JFrame {
	/**
	 * 
	 */
	private JLabelClock miReloj;
	private static final long serialVersionUID = 1L;
 private Dimension dim;
 Usuario mod;
 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 frame = new f1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

   public f1() {
        initComponents();
    }

	/**
	 * Create the frame.
	 */
	 private void initComponents() {
		setUndecorated(true);
		setForeground(SystemColor.desktop);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setBackground(SystemColor.window);
		contentPane.setLayout(null);
		 
		 JButton btnPlayerMultimedia = new JButton("PLAYER"
		 		+ " MULTIMEDIA");
		 btnPlayerMultimedia.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 btnPlayerMultimedia.setFont(new Font("Arial Black", Font.BOLD, 16));
		 btnPlayerMultimedia.setForeground(Color.WHITE);
		 btnPlayerMultimedia.setContentAreaFilled(false);
                 btnPlayerMultimedia.setIcon(new ImageIcon(f1.class.getResource("/img/video_track.png")));
		 btnPlayerMultimedia.setBounds(40, 121, 296, 69);
		 contentPane.add(btnPlayerMultimedia);
		 
		 miReloj=new JLabelClock();
		 miReloj.setFont(new Font("Arial Black", Font.BOLD, 50));
		miReloj.setForeground(Color.WHITE);
		miReloj.setBounds(603, 39, 432, 47);
		contentPane.add(miReloj);
		
		JLabel lblPlayerMusic = new JLabel("PLAYER MULTIMEDIA ");
		lblPlayerMusic.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayerMusic.setForeground(Color.WHITE);
		lblPlayerMusic.setBounds(40, 199, 183, 14);
		contentPane.add(lblPlayerMusic);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(f1.class.getResource("/img/internet-logo.png")));
		label_4.setBounds(40, 247, 90, 69);
		contentPane.add(label_4);
		
		JLabel lblNavegador = new JLabel("NAVEGADOR");
		lblNavegador.setForeground(Color.WHITE);
		lblNavegador.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNavegador.setBounds(39, 313, 122, 14);
		contentPane.add(lblNavegador);
		
		
                JButton btnBloc = new JButton();
		 btnBloc.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
                            Bloc bloc=new Bloc();
                          //  Bloc.setVisible(true);
		 	}
		 });
		 btnBloc.setFont(new Font("Arial Black", Font.BOLD, 16));
		 btnBloc.setForeground(Color.WHITE);
		 btnBloc.setContentAreaFilled(false);
                 btnBloc.setBorder(null);
                 btnBloc.setIcon(new ImageIcon(f1.class.getResource("/img/editor-de-texto.png")));
		 btnBloc.setBounds(40, 338, 90, 69);
		 contentPane.add(btnBloc);
		
		JLabel lblEditorDeTextos = new JLabel("EDITOR DE TEXTOS");
		lblEditorDeTextos.setForeground(Color.WHITE);
		lblEditorDeTextos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEditorDeTextos.setBounds(40, 418, 155, 19);
		contentPane.add(lblEditorDeTextos);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(f1.class.getResource("/img/carpeta.png")));
		label_6.setBounds(40, 448, 90, 69);
		contentPane.add(label_6);
		
		JLabel lblArchivos = new JLabel("ARCHIVOS");
		lblArchivos.setForeground(Color.WHITE);
		lblArchivos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblArchivos.setBounds(40, 528, 155, 19);
		contentPane.add(lblArchivos);
		

                 JButton btnCalendario = new JButton();
		 btnCalendario.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
                            Cal cal=new Cal();
                            cal.setVisible(true);
		 	}
		 });
		 btnCalendario.setFont(new Font("Arial Black", Font.BOLD, 16));
		 btnCalendario.setForeground(Color.WHITE);
		 btnCalendario.setContentAreaFilled(false);
                 btnCalendario.setBorder(null);
                 btnCalendario.setIcon(new ImageIcon(f1.class.getResource("/img/calendario.png")));
		 btnCalendario.setBounds(40, 558, 90, 69);
		 contentPane.add(btnCalendario);
		
		JLabel lblCalendario = new JLabel("CALENDARIO");
		lblCalendario.setForeground(Color.WHITE);
		lblCalendario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalendario.setBounds(40, 638, 155, 19);
		contentPane.add(lblCalendario);
		
		JLabel label_8 = new JLabel("");
		//label_8.setIcon(new ImageIcon(f1.class.getResource("/img/1wolf.png")));
		label_8.setBounds(1176, 80, 151, 123);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		//label_9.setIcon(new ImageIcon(f1.class.getResource("/img/editor.png")));
		label_9.setBounds(1176, 660, 90, 54);
		contentPane.add(label_9);
		
		JLabel lblFondoDePantalla = new JLabel("FONDO DE PANTALLA");
		lblFondoDePantalla.setForeground(Color.WHITE);
		lblFondoDePantalla.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFondoDePantalla.setBounds(1134, 713, 203, 19);
		contentPane.add(lblFondoDePantalla);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHome.setBounds(1257, 210, 203, 19);
		contentPane.add(lblHome);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1376, 768);
		label.setIcon(new ImageIcon(f1.class.getResource("/img/pxVbM0Y.jpg")));
		contentPane.add(label);
		
		 dim=super.getToolkit().getScreenSize();
	        super.setSize(dim);
	        super.setUndecorated(true);
	        super.setVisible(true);
		
	        
	        
	       
		
		
	}
public f1(Usuario mod){
    initComponents();
    setLocationRelativeTo(null);
    if(mod.getTipoUsuario()== "Admin"){
        
    }else if(mod.getTipoUsuario()=="Invitado"){
        
    }
    
}
}
