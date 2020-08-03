/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;
import model.DAO.EventoDAO;
import model.Evento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class VerEventos {
   EventoDAO eventoDAO = null;


    public void visualizar_Evento(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("nombreEvento");
        dt.addColumn("descripcion");
        dt.addColumn("fechaEvento");

        eventoDAO = new EventoDAO();
        Evento evento = new Evento();
        ArrayList<Evento> list = eventoDAO.Listar_Evento();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                evento = list.get(i);
                fila[0] = evento.getNombreEvento();
                fila[1] = evento.getDescripcion();
                fila[2] = evento.getFechaEvento();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }}

       
    













