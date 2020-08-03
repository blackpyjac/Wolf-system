/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaPlayer;

import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import java.io.File;
import java.io.PrintStream;

/**
 *
 * @author Diana
 */
public class reproductor implements BasicPlayerListener{

    BasicPlayer player=new BasicPlayer();
    BasicController control=(BasicController ) player;
    private PrintStream out = null;
    
    public reproductor(){
       player.addBasicPlayerListener(this);
       out=System.out;
        
    }
    
    public void opened(Object stream, Map properties) {
        display("opened :"+properties.toString());
    }

    
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        display("progress : "+properties.toString());
        
        
    }

    @Override
    public void stateUpdated(BasicPlayerEvent event) {
        display("stateUpdated :"+event.toString());
    }

    @Override
    public void setController(BasicController controller) {
        display("setController : " + controller);
    }

   public void display(String msg) {
if (out != null) {
out.println(msg);
}
}
   
   
    
}
