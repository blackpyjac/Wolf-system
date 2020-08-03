/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author Diana
 */


import java.sql.*;

public class Conectar{

    static String bd = "wolfs";
    static String login = "wolf";
    static String password = ".wolf.-";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    public Conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }
    public ResultSet getRS(String sql) {
		ResultSet res = null;
		try{
			Statement st = connection.createStatement();
			res = st.executeQuery(sql);
		}
		catch(SQLException e) {
		}
		return res;
	}
    public boolean ejecutar(String sql){
		try{
			this.getConnection();
			Statement st = connection.createStatement();
			st.executeUpdate(sql);
			st.close();
			this.desconectar();
			return true;
		}
		catch(SQLException e) {
			return false;
		}
    }

    public void desconectar(){
        if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }

public static void main(String[] args) {
	Conectar conectar=new Conectar();
	conectar.getConnection();
}
    
}

