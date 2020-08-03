package calendario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class guardado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guardado frame = new guardado();
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
	public guardado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 240);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListo = new JLabel("LISTO");
		lblListo.setForeground(Color.WHITE);
		lblListo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblListo.setBounds(112, 11, 134, 63);
		contentPane.add(lblListo);
		
		JLabel lblEventoGuardado = new JLabel("EVENTO GUARDADO");
		lblEventoGuardado.setForeground(Color.WHITE);
		lblEventoGuardado.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblEventoGuardado.setBounds(37, 60, 298, 63);
		contentPane.add(lblEventoGuardado);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(119, 136, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}

}
