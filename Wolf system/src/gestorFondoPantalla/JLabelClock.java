package gestorFondoPantalla;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class JLabelClock extends JLabel implements Runnable{

    public JLabelClock() {
        Thread hilo=new Thread(this);
        hilo.start();
    }

    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss");
        while(true){
        Date fecha=new Date();
        
        //Date fecha=Calendar.getInstance().getTime();
        setText(format.format(fecha));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
       
    }
    
}
}