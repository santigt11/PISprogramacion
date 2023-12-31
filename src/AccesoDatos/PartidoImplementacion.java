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
import modelo.Arbitro;
import modelo.Campeonato;
import modelo.Equipo;
import modelo.Partido;


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
            consulta = conexion.prepareStatement("INSERT INTO partido (estadio, equipo_local, equipo_visitante, arbitro_principal, arbitro_linea1, arbitro_linea2, estado , fecha, campeonato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1,t.getEstadio());  
            consulta.setString(2, t.getEquipoLocal().getNombre());
            consulta.setString(3, t.getEquipoVisitante().getNombre());
            consulta.setString(4, t.getArbitroPrincipal().getApellidos());
            consulta.setString(5, t.getArbitroLinea1().getApellidos());
            consulta.setString(6, t.getArbitroLinea2().getApellidos());
            consulta.setString(7,t.getEstado());
            consulta.setString(8, t.getFecha());
            consulta.setString(9, t.getCampeonato().getNombre());
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
            String nombreEquipo1 = rs.getString(3);
                System.out.println(rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(2));// Cambiar por la columna correcta
            String nombreEquipo2 = rs.getString(2); // Cambiar por la columna correcta
            
            // Aquí realizas una búsqueda para obtener los escudos correspondientes a los nombres de los equipos
            String escudoEquipo1 = new EquipoImplementacion().obtenerEscudoPorNombreEquipo(nombreEquipo1);
            String escudoEquipo2 = new EquipoImplementacion().obtenerEscudoPorNombreEquipo(nombreEquipo2);
                Partido partido = new Partido(
            rs.getString(1), // Cambiar por la columna correcta
            new Equipo(rs.getString(3), null, escudoEquipo1),
            new Equipo(rs.getString(2), null, escudoEquipo2),
            new Arbitro(null, rs.getString(4), null, null, 0), // Cambiar por la columna correcta
            new Arbitro(null, rs.getString(5), null, null, 0),
            new Arbitro(null, rs.getString(6), null, null, 0),
      rs.getString(8), rs.getString(9),
            new Campeonato(rs.getString(10))
            );
            lista.add(partido); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    public Partido buscarFecha(String fecha) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
           conexion = instanciaMsql.conectar();
           consulta = conexion.prepareStatement("select * from partido where fecha = '"+ fecha + "'");    
           ResultSet rs = consulta.executeQuery();
           while(rs.next()){
               Partido partido =  new Partido(rs.getString(1), new Equipo(rs.getString(3), "", ""), new Equipo(rs.getString(2), "", ""), new Arbitro(null, rs.getString(4), null, null, 0), // Cambiar por la columna correcta
            new Arbitro(null, rs.getString(5), null, null, 0),
            new Arbitro(null, rs.getString(6), null, null, 0),
      rs.getString(8), rs.getString(9),
            new Campeonato(rs.getString(10)));
               return partido;
           }
        } 
        catch (Exception e) {
        }
        return null;
    }
    
    public List<Partido> obtenerPartidoPorId(int id) {
    List<Partido> lista = new ArrayList<>();
    PreparedStatement consulta = null;
    Connection conexion = null;
    
    try {
        conexion = instanciaMsql.conectar();
        consulta = conexion.prepareStatement("SELECT * FROM partido WHERE id = ?");
        consulta.setInt(7, id);
        ResultSet rs = consulta.executeQuery();
        if (rs.next()) {
            Partido partido =  new Partido(rs.getString(1), new Equipo(rs.getString(3), "", ""), new Equipo(rs.getString(2), "", ""), new Arbitro(null, rs.getString(4), null, null, 0), // Cambiar por la columna correcta
            new Arbitro(null, rs.getString(5), null, null, 0),
            new Arbitro(null, rs.getString(6), null, null, 0),
      rs.getString(8), rs.getString(9),
            new Campeonato(rs.getString(10)));
        }
    } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    return lista;
}
    
//    public List<Equipo> cargarPartido() {
//        List<Equipo> lista = new ArrayList<>();
//        PreparedStatement consulta = null;
//        Connection conexion = null;
//        try {
//            conexion = instanciaMsql.conectar();
//            consulta = conexion.prepareStatement("select *from partido");
//            ResultSet rs = consulta.executeQuery();
//            while (rs.next()) {
//                Equipo equipo = new Equipo(rs.getString(2), rs.getString(3), rs.getString(7));
//                equipo.setEntrenador(new Entrenador(rs.getString(4), "", "", "", 0));
//                equipo.setCampeonato1(new Campeonato(rs.getString(5)));
//                equipo.setCampeonato2(new Campeonato(rs.getString(6)));
//                lista.add(equipo);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        return lista;
//    }

    @Override
    public List<Partido> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
