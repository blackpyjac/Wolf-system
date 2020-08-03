
package mediaPlayer;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Mp3 {
    mediaPlayer media;
    BasicPlayer musica;
    String ruta;
    Mp3(){
        this.musica = new BasicPlayer();
    }
    
    boolean abrir(String ruta){
        File archivo = new File(ruta);
        try {            
            this.ruta = ruta;
            musica.open(archivo);
            return true;
        } catch (BasicPlayerException ex) {
            return false;
        }
    }
    
    boolean reproducir(){
        try {
            musica.play();
            return true;
        } catch (BasicPlayerException ex) {
            return false;
        }
    }
    

    
}
