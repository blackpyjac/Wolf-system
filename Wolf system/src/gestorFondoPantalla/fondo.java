package gestorFondoPantalla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class fondo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fondo frame = new fondo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fondo() {
		setTitle("GESTOR FONDO DE PANTALLA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblArchivo = new JLabel("ARCHIVO");
		lblArchivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblArchivo.setBounds(10, 11, 85, 14);
		panel.add(lblArchivo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 33, 85, 34);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCerrar = new JLabel("CERRAR");
		lblCerrar.setBounds(10, 11, 65, 14);
		panel_1.add(lblCerrar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 106, 1143, 535);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Haga click en una imagen para su fondo de pantalla");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 474, 38);
		panel_2.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 61, 1143, 12);
		panel_2.add(horizontalStrut);
		
		JLabel lblImagenesPredeterminadas = new JLabel("Imagenes predeterminadas:");
		lblImagenesPredeterminadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblImagenesPredeterminadas.setBounds(10, 78, 217, 21);
		panel_2.add(lblImagenesPredeterminadas);
		
		JLabel lblImagen = new JLabel("Imagen 1");
		lblImagen.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		lblImagen.setBackground(Color.YELLOW);
		lblImagen.setBounds(38, 122, 167, 186);
		panel_2.add(lblImagen);
		
		JLabel label = new JLabel("Imagen 1");
		label.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		label.setBackground(Color.YELLOW);
		label.setBounds(244, 122, 167, 186);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Imagen 1");
		label_1.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		label_1.setBackground(Color.YELLOW);
		label_1.setBounds(446, 122, 167, 186);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Imagen 1");
		label_2.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		label_2.setBackground(Color.YELLOW);
		label_2.setBounds(675, 122, 167, 186);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Imagen 1");
		label_3.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		label_3.setBackground(Color.YELLOW);
		label_3.setBounds(900, 122, 167, 186);
		panel_2.add(label_3);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(0, 343, 1143, 12);
		panel_2.add(horizontalStrut_1);
		
		JLabel lblSubirUnaImagen = new JLabel("subir una imagen");
		lblSubirUnaImagen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSubirUnaImagen.setBounds(38, 366, 217, 21);
		panel_2.add(lblSubirUnaImagen);
		
		JLabel lblUbicacionDeLa = new JLabel("Ubicacion de la imagen");
		lblUbicacionDeLa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUbicacionDeLa.setBounds(38, 448, 217, 21);
		panel_2.add(lblUbicacionDeLa);
		
		textField = new JTextField();
		textField.setBounds(222, 451, 337, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Seleccionar");
		btnNewButton.setBounds(569, 450, 89, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblElegirFondoDe = new JLabel("ELEGIR FONDO DE PANTALLA");
		lblElegirFondoDe.setForeground(Color.WHITE);
		lblElegirFondoDe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblElegirFondoDe.setBounds(31, 78, 309, 26);
		contentPane.add(lblElegirFondoDe);
		
		JButton btnNewButton_1 = new JButton("Guardar cambios");
		btnNewButton_1.setBounds(513, 652, 178, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(895, 652, 178, 35);
		contentPane.add(btnCancelar);
	}
}
