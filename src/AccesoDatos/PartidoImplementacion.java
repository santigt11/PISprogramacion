/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.EnumEstadio;
import modelo.EnumEstadoPartidos;
import modelo.Equipo;
import modelo.Partido;
import modelo.Albitro;


/**
 *
 * @author ixcd2
 */
public class PartidoImplementacion implements DAOPartido{

    Conexion instanciaMsql = Conexion.getInstance();
    
    @Override
    public boolean guardar(Partido t) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO partido (estadio, equipo_local, equipo_visitante, albitro_principal, albitro_linea1, albitro_linea2, nombre_capeonato, nobre_equipo, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, String.valueOf(t.getEstadio()));  
            consulta.setString(0, t.getEquipoLocal().getNombre());
            consulta.setString(0, t.getEquipoVisitante().getNombre());
            consulta.setString(0, t.getArbitroPrincipal().getApellidos());
            consulta.setString(0, t.getArbitroLinea1().getApellidos());
            consulta.setString(0, t.getArbitroLinea2().getApellidos());
            consulta.setString(0, t.getCampeonato().getNombre());
            consulta.setString(0, t.getNombre());
            
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean eliminar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Partido t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Partido> listarTodos() {
        List<Partido> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from partido");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                //Partido partido = new Partido(EnumEstadio.valueOf(rs.getNString(1)), EnumEstadoPartidos.FINALIZADO, new Equipo(rs.getNString(3), null, null), new Equipo(rs.getNString(4), null, null), new Equipo(rs.getNString(5), null, null), new Albitro(null, null, rs.getNString(6), 0, null), new Albitro(null, null, rs.getNString(6), 0, null), new Albitro(null, null, rs.getNString(6), 0, null), rs.getNString(9));
                //lista.add(partido); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Partido> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
