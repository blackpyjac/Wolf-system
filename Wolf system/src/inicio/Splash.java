/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;
import Login.Login1;
import java.awt.Dimension;
import java.awt.Font;
import registro.Registro;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author Diana
 */
public class Splash extends JDialog{
    private JLabel lblSplashScreen;
private JProgressBar barraDeProgreso;
private JLabel porcentaje;
private JLabel lblLoading;
private JLabel lblWelcomTo;


public  Splash() {
	initialize();
	setUndecorated(true);
	Dimension dim = super.getToolkit().getScreenSize();
    super.setSize(dim);
    super.setUndecorated(true);
    super.setVisible(true);
	iniciarHilo();
        
}

	private void iniciarHilo() {
	// TODO Auto-generated method stub
	Thread hilo=new Thread(new Runnable() {
		int x=0;
		
		
		public void run() {
		try {
			while(x<=100) {
				barraDeProgreso.setValue(x);
				porcentaje.setText(x+ "%");
		x++;

				Thread.sleep(100);
			}
			dispose();
        Registro registro= new Registro();
			registro.setVisible(true);
                        //prueba
                        
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
			
		}
		
	});
	hilo.start();
}
	private void initialize() {
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(12, 12, 12));
		
		lblSplashScreen=new JLabel();
                lblSplashScreen.setIcon(new ImageIcon(Splash.class.getResource("/img/LogoFinal2.png")));
		lblSplashScreen.setBounds(30, 160, 363, 363);
		getContentPane().add(lblSplashScreen);
		
		barraDeProgreso=new JProgressBar();
		barraDeProgreso.setBounds(580, 650, 605, 45);
		getContentPane().add(barraDeProgreso);
		
		porcentaje=new JLabel("0%");
		porcentaje.setFont(new Font("Tempus Sans ITC",Font.PLAIN,35));
		porcentaje.setForeground(Color.WHITE);
		porcentaje.setBounds(1110, 581, 129, 60);
		getContentPane().add(porcentaje);
		
		JLabel lblLoading = new JLabel("CARGANDO");
		lblLoading.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 39));
		lblLoading.setForeground(Color.WHITE);
		lblLoading.setBounds(590, 581, 300, 60);
		getContentPane().add(lblLoading);
		
		JLabel lblWelcomTo = new JLabel("BIENVENIDO A WOLF SYSTEM");
		lblWelcomTo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 55));
		lblWelcomTo.setSize(new Dimension(10, 0));
		lblWelcomTo.setForeground(Color.WHITE);
		lblWelcomTo.setBounds(485, 201, 823, 141);
		getContentPane().add(lblWelcomTo);
                
		
		
	}

}
