
package mediaPlayer;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;


public class Metodo {

    BasicPlayer musica;
    File archivos[] = null;
    int condicion = -1;
    Object control;

    String[] abrirArchivo() {
        String urls[] = null;
        String rutas[] = null;
        JFileChooser dialogo = new JFileChooser();
        dialogo.setMultiSelectionEnabled(true);
        dialogo.setFileFilter(new FileNameExtensionFilter("Archivos .mp3 .wav", "mp3"));
        int seleccion = dialogo.showOpenDialog(dialogo);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivos = dialogo.getSelectedFiles();
            urls = new String[archivos.length];
            for (int i = 0; i < urls.length; i++) {
                urls[i] = archivos[i].getPath();
            }
            return urls;
        }
        return null;
    }

    String[] nombresArchivo() {
        String nombres[] = new String[archivos.length];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = archivos[i].getName();
        }
        return nombres;
    }

    void ejecutar(String ruta) {
        musica = new BasicPlayer();
        File archivo = new File(ruta);
        try {
            musica.open(archivo);
        } catch (BasicPlayerException ex) {
        }
    }

    void reproducir() {
        condicion = 1;
        try {
            if (musica.getStatus() == 1) {
                musica.resume();
            } else {
                musica.play();
            }
        } catch (BasicPlayerException ex) {
        }
    }

    void pausar() {
        condicion = 1;
        try {
            musica.pause();
        } catch (BasicPlayerException ex) {
        }
    }

    int siguiente(int posicion, int max) {
        if (posicion == max) {
            posicion = 0;
        } else {
            posicion++;
        }
        return posicion;
    }

    int volver(int posicion) {
        if (posicion == 0) {
            posicion = 0;
        } else {
            posicion--;
        }
        return posicion;
    }

    int estado() {
        if (condicion == -1) {
            return condicion;
        } else {
            return musica.getStatus();
        }
    }

    void detener() {
        condicion = 1;
        try {
            musica.stop();
        } catch (BasicPlayerException ex) {
        }
    }

    void jtable(JTable jTable1) {
        jTable1.getColumnModel().getColumn(0).setMinWidth(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        jTable1.getColumnModel().getColumn(1).setMinWidth(120);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
    }

    class control {

        public control() {
        }
    }


}
