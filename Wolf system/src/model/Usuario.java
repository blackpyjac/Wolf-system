package model;

import java.util.Date;

public class Usuario {
	private int idUsuario;
	private String nombreUsuario;
	private String username;
	private String statusUsuario="Activo";
	private String tipoUsuario="Admin";
	private String password;
	
	private Date ultimaModUsuario;
        
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStatusUsuario() {
		return statusUsuario;
	}
	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getUltimaModUsuario() {
		return ultimaModUsuario;
	}
	public void setUltimaModUsuario(Date ultimaModUsuario) {
		this.ultimaModUsuario = ultimaModUsuario;
	}
	
	
		
}
