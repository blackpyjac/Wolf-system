package model.DAO;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Usuario;

public class AccesoDAO {

	public Usuario autenticarUsuario(String username, String password) {
		Conectar miConexion = new Conectar();
		Connection conexion = miConexion.getConnection();
		String sql = "SELECT * FROM Usuario WHERE username=? AND password=?";
		Usuario usuario = null;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
                        //preparedStatement.setString(3, tipoUsuario);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setUsername(rs.getString("username"));
				usuario.setPassword(rs.getString("password"));
                                //usuario.setPassword(rs.getString("tipoUsuario"));
                                
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return usuario;
	}

}
