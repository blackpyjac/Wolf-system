/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author Diana
 */

import Login.Login1;
import controller.UsuarioController;
import java.awt.BorderLayout;
import model.DAO.UsuarioDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.Usuario;

public class Registro extends JFrame {
	private static final long serialVersionUID = 1L;
private Dimension dim;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	protected Connection connection;
	

	/**
	 * Create the frame.
	 */
	public Registro() {
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(12,12,12));
		
	
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(348, 445, 126, 25);
		contentPane.add(lblPassword);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(361, 300, 101, 25);
		contentPane.add(lblNombre);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(348, 367, 126, 25);
		contentPane.add(lblUsername);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Registro.class.getResource("/img/Home.png")));
		label_1.setBounds(59, 60, 150, 125);
		contentPane.add(label_1);
		
		JLabel lblWhoWillUse = new JLabel("GRACIAS POR TU PREFERENCIA A");
		lblWhoWillUse.setFont(new Font("Stencil Std", Font.BOLD, 30));
		lblWhoWillUse.setForeground(Color.WHITE);
		lblWhoWillUse.setBounds(405, 65, 703, 78);
		contentPane.add(lblWhoWillUse);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Aharoni", Font.PLAIN, 24));
		textFieldNombre.setBounds(478, 296, 374, 41);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Aharoni", Font.PLAIN, 24));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(478, 363, 374, 41);
		contentPane.add(textFieldUsername);
		
		JButton btnAccept = new JButton("ACEPTAR");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioController usuarioController = new UsuarioController();
				Usuario registrado = usuarioController.registrar(textFieldNombre.getText(),textFieldUsername.getText(),
						String.valueOf(passwordField.getPassword()));
				if (registrado != null) {
					JOptionPane.showMessageDialog(null, "Bienvenido: " + registrado.getNombreUsuario());
				}else {
					JOptionPane.showMessageDialog(null, "registrado");
                                        dispose();
                                        Login1 login=new Login1();
                                        login.setVisible(true);

				}
			}
		});

			btnAccept.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAccept.setBounds(844, 591, 166, 57);
		contentPane.add(btnAccept);
		
		JButton btnCancel = new JButton("CANCELAR");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Login login=new Login();
				//login.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel.setBounds(425, 591, 166, 57);
		contentPane.add(btnCancel);
		
		JLabel lblWolfSystemTo = new JLabel("WOLF SYSTEM PARA INICIAR NECESITAS COMPLETAR");
		lblWolfSystemTo.setForeground(Color.WHITE);
		lblWolfSystemTo.setFont(new Font("Stencil Std", Font.BOLD, 30));
		lblWolfSystemTo.setBounds(295, 123, 894, 78);
		contentPane.add(lblWolfSystemTo);
		
		JLabel lblTheFollowingRegistration = new JLabel("EL SIGUIENTE REGISTRO");
		lblTheFollowingRegistration.setForeground(Color.WHITE);
		lblTheFollowingRegistration.setFont(new Font("Stencil Std", Font.BOLD, 30));
		lblTheFollowingRegistration.setBounds(462, 181, 846, 78);
		contentPane.add(lblTheFollowingRegistration);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setBounds(478, 429, 374, 41);
		contentPane.add(passwordField);
		 dim=super.getToolkit().getScreenSize();
	        super.setSize(dim);
	        super.setUndecorated(true);
	        super.setVisible(true);
	        
	}
	


		

}

