/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAO.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author Diana
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO=new UsuarioDAO();
 public Usuario registrar(String nombreUsuario,String username, String password){
     return usuarioDAO.Agregar_Usuario(nombreUsuario,username,password);
}
public Usuario registrarUsuario(String nombreUsuario,String username,String tipoUsuario, String password){
     return usuarioDAO.AgregarUsuario(nombreUsuario,username,tipoUsuario,password);
}
	

	}
