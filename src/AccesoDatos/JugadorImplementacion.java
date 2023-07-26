/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Modelo.Jugador;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class JugadorImplementacion implements DAOJugador{
    
    Conexion instanciaMsql = Conexion.getInstance();

    @Override
    public boolean guardar(Jugador jugador) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO jugador (cedula, nombres, apellidos, nacionalidad, edad, dorsal, posicion) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, jugador.getCedula());
            consulta.setString(2, jugador.getNombres());
            consulta.setString(3, jugador.getApellidos());
            consulta.setString(4, jugador.getNacionalidad());
            consulta.setString(5, String.valueOf(jugador.getEdad()));
            consulta.setString(6, jugador.getDorsal());
            consulta.setString(7, jugador.getPosicion());
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    @Override
    public List<Jugador> buscar(String apellido) {
        List<Jugador> lista = new ArrayList<Jugador>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
           conexion = instanciaMsql.conectar();
           consulta = conexion.prepareStatement("select * from jugador where apellidos LIKE '"+ apellido + "%'");
           ResultSet rs = consulta.executeQuery();
           while(rs.next()){
               Jugador jugador = new Jugador();
               jugador.setCedula(rs.getString(2));
               jugador.setNombres(rs.getString(3));
               jugador.setApellidos(rs.getString(4));
               jugador.setNacionalidad(rs.getString(5));
               jugador.setEdad(Integer.parseInt(rs.getString(6)));
               jugador.setDorsal(rs.getString(7));
               lista.add(jugador);
           }
        } 
        catch (Exception e) {
        }
        return lista;
    }

    @Override
    public List<Jugador> listarTodos() {
        List<Jugador> lista = new ArrayList<Jugador>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
           conexion = instanciaMsql.conectar();
           consulta = conexion.prepareStatement("select * from jugador ");
           ResultSet rs = consulta.executeQuery();
           while(rs.next()){
               Jugador jugador = new Jugador(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Integer.parseInt(rs.getString(6)), rs.getString(7));
               lista.add(   jugador);
           }
        } catch (Exception e) {
        }
        return lista;
    }
    
    @Override
    public boolean eliminar(String cedula){
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("DELETE FROM jugador WHERE cedula = ?;");
            consulta.setString(1, cedula);
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean modificar(Jugador jugador) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("UPDATE jugador SET nombres = ?, apellidos = ?, edad = ?, dorsal = ?, WHERE cedula = ?;");
            consulta.setString(1, jugador.getNombres());
            consulta.setString(2, jugador.getApellidos());
            consulta.setString(3, String.valueOf(jugador.getEdad()));
            consulta.setString(4, jugador.getDorsal());
            consulta.setString(5, jugador.getCedula());
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    
}

    
