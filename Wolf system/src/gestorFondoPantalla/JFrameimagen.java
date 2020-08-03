package gestorFondoPantalla;



import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class JFrameimagen extends JFrame {
	
	public static void main(String[] args) {

		  EventQueue.invokeLater(new Runnable() {

		   public void run() {
		    try {
		     JFrameimagen frame = new JFrameimagen();
		     frame.setExtendedState(MAXIMIZED_BOTH);
		     frame.setVisible(true);
		    } catch (Exception e) {
		     e.printStackTrace();
		    }
		   }
		  });
		 }
		 public JFrameimagen() {

		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setBounds(100, 100, 450, 300);
		  Panelimagen label = new Panelimagen();
		  label.setBorder(new EmptyBorder(5, 5, 5, 5));
		  label.setLayout(new BorderLayout(0, 0));
		  setContentPane(label);
                 
                 }
                 
}
