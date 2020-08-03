package calendario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class modificar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificar frame = new modificar();
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
	public modificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar evento");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(231, 11, 122, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblAsunto = new JLabel("Asunto");
		lblAsunto.setForeground(Color.WHITE);
		lblAsunto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAsunto.setBounds(51, 79, 102, 24);
		contentPane.add(lblAsunto);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setForeground(Color.WHITE);
		lblFechaInicio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaInicio.setBounds(51, 145, 102, 24);
		contentPane.add(lblFechaInicio);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(51, 199, 102, 24);
		contentPane.add(lblDescripcion);
		
		textField = new JTextField();
		textField.setBounds(133, 82, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 148, 135, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 202, 265, 68);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("ir calendario");
		btnNewButton.setBounds(278, 147, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAgregarEvento = new JButton("Modificar evento");
		btnAgregarEvento.setBounds(400, 225, 122, 23);
		contentPane.add(btnAgregarEvento);
	}
}
