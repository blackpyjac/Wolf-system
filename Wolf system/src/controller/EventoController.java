/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.DAO.EventoDAO;
import model.Evento;

/**
 *
 * @author Diana
 */
public class EventoController {
    private EventoDAO eventoDAO=new EventoDAO();
 public Evento registrar(String nombreEvento,String fechaEvento, String descripcion){
     return eventoDAO.AgregarEvento(nombreEvento,fechaEvento,descripcion);
     
}

	

	}
