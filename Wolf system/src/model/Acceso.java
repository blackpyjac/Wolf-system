package model;

import java.util.Date;

public class Acceso {
	private int idAcceso;
	private Usuario usuario;
	private Date fechaAcceso;

	public int getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(int idAcceso) {
		this.idAcceso = idAcceso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaAcceso() {
		return fechaAcceso;
	}

	public void setFechaAcceso(Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
	}

}
