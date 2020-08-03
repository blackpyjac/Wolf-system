/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Diana
 */
public class playlist {
    private int idPlaylist;
    private String tituloPlaylist;
    private Date fechaCreacionPlaylist;
    private String statusPlaylist="Activo";
    private Archivos archivo;

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getTituloPlaylist() {
        return tituloPlaylist;
    }

    public void setTituloPlaylist(String tituloPlaylist) {
        this.tituloPlaylist = tituloPlaylist;
    }

    public Date getFechaCreacionPlaylist() {
        return fechaCreacionPlaylist;
    }

    public void setFechaCreacionPlaylist(Date fechaCreacionPlaylist) {
        this.fechaCreacionPlaylist = fechaCreacionPlaylist;
    }

    public String getStatusPlaylist() {
        return statusPlaylist;
    }

    public void setStatusPlaylist(String statusPlaylist) {
        this.statusPlaylist = statusPlaylist;
    }

    public Archivos getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivos archivo) {
        this.archivo = archivo;
    }
    
    
}
