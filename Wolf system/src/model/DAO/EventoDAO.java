/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import Conexion.Conectar;
import model.Evento;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Diana
 */




/*Metodo listar*/
public class EventoDAO{

    public ArrayList<Evento> Listar_Evento(){
        ArrayList<Evento> list = new ArrayList<Evento>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM evento;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Evento modelo = new Evento();
                modelo.setIdEvento(rs.getInt(1));
                modelo.setNombreEvento(rs.getString(2));
                modelo.setDescripcion(rs.getString(3));
                modelo.setFechaEvento(rs.getString(4));
                modelo.setStatusEvento(rs.getString(5));
                list.add(modelo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public Evento AgregarEvento(String nombreEvento,String fechaEvento, String descripcion){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO Evento (nombreEvento, fechaEvento,descripcion) VALUES(?,?,?);";
        PreparedStatement ps = null;
        Evento evento = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, nombreEvento);
            ps.setString(2,fechaEvento);
            ps.setString(3, descripcion);
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return evento;
    }}


///*Metodo Modificar*/
//    public void Modificar_Usuario(Usuario us){
//        Conectar conec = new Conectar();
//        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
//        PreparedStatement ps = null;
//        try{
//            ps = conec.getConnection().prepareStatement(sql);
//            ps.setInt(1, us.getIdUsuario());
//            ps.setString(2, us.getNombreUsuario());
//            ps.setString(3, us.getUsername());
//            ps.setString(4, us.getPassword());
//            ps.executeUpdate();
//        }catch(SQLException ex){
//            System.out.println(ex.getMessage());
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }finally{
//            try{
//                ps.close();
//                conec.desconectar();
//            }catch(Exception ex){}
//        }
//    }
//
//
///*Metodo Eliminar*/
//    public void Eliminar_Usuario(Usuario us){
//        Conectar conec = new Conectar();
//        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
//        PreparedStatement ps = null;
//        try{
//            ps = conec.getConnection().prepareStatement(sql);
//            ps.setInt(1, us.getIdUsuario());
//            ps.setString(2, us.getNombreUsuario());
//            ps.setString(3, us.getUsername());
//            ps.setString(4, us.getPassword());
//            ps.executeUpdate();
//        }catch(SQLException ex){
//            System.out.println(ex.getMessage());
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }finally{
//            try{
//                ps.close();
//                conec.desconectar();
//            }catch(Exception ex){}
//        }
//    }
//


