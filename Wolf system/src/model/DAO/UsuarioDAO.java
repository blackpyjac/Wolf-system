/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import Conexion.Conectar;
import model.Usuario;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Diana
 */




/*Metodo listar*/
public class UsuarioDAO{

    public ArrayList<Usuario> Listar_UsuarioVO(){
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario modelo = new Usuario();
                modelo.setIdUsuario(rs.getInt(1));
                modelo.setNombreUsuario(rs.getString(2));
                modelo.setUsername(rs.getString(3));
                modelo.setStatusUsuario(rs.getString(4));
                modelo.setTipoUsuario(rs.getString(5));
                modelo.setPassword(rs.getString(6));
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
    public Usuario Agregar_Usuario(String nombreUsuario,String username, String password){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (nombreUsuario, username,password) VALUES(?,?,?);";
        PreparedStatement ps = null;
        Usuario usuario = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2,username);
            ps.setString(3, password);
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
        return usuario;
    }

public Usuario AgregarUsuario(String nombreUsuario,String username,String tipoUsuario, String password){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (nombreUsuario, username,tipoUsuario,password) VALUES(?,?,?,?);";
        PreparedStatement ps = null;
        Usuario usuario = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2,username);
            ps.setString(3,tipoUsuario);
            ps.setString(4, password);
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
        return usuario;
    }


}


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


