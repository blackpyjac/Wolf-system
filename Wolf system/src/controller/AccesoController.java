package controller;

import model.Usuario;
import model.DAO.AccesoDAO;

public class AccesoController {
	private AccesoDAO accesoDAO = new AccesoDAO();

	public Usuario autenticarUsuario(String username, String password) {
		return accesoDAO.autenticarUsuario(username, password);
	}
}
