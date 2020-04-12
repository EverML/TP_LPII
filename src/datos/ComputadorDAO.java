package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Computador;

public class ComputadorDAO implements IDAO {
	
    Connection con = null;
    Computador computador = null;
    PreparedStatement ps = null;

	
	
	
	public ComputadorDAO() {
		con = new Conexion().conectar();
	}

	@Override
	public List<Computador> listar(String condicion) {
		List<Computador> lista = new ArrayList<>();
		 try {
	            String SSQL = "SELECT * FROM computadores "+condicion+" order by codigo;";
	            ps = con.prepareStatement(SSQL);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	if(rs.getInt("codigo") != 0)
	            	{
		            	computador = new Computador(
		                        rs.getInt("codigo"),
		                        rs.getString("nombre"),
		                        rs.getString("descripcion"),
		                        rs.getBigDecimal("precio"),
		                        rs.getBoolean("tiene_garantia"),
		                        rs.getString("duracion_garantia")
		                );
		                lista.add(computador);

	            	}

	            }
	            return lista;

	        } catch (Exception ex) {

	            JOptionPane.showMessageDialog(null, ex.getMessage());
	        }
	        return null;

	}

	@Override
	public void insertar(Object obj) {
        try {
            Computador c = (Computador) obj;
            String SSQL = "INSERT INTO computadores (nombre, descripcion, precio, tiene_garantia,duracion_garantia) VALUES (?, ?, ?, ?,?);";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDescripcion());
            ps.setBigDecimal(3, c.getPrecio());
            ps.setBoolean(4, c.isTieneGarantia());
            ps.setString(5, c.getDuracionGarantia());
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
	}

    @Override
    public void modificar(Object obj) {
        try {
            Computador c = (Computador) obj;
            
            String SSQL = "UPDATE computadores "
                    + "       SET nombre=?,descripcion=?,precio=?,tiene_garantia=?"
                    + "     WHERE codigo=?;";
            
            ps = con.prepareStatement(SSQL);
            
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDescripcion());
            ps.setBigDecimal(3, c.getPrecio());
            ps.setBoolean(4, c.isTieneGarantia());
            ps.setString(5, c.getDuracionGarantia());
            ps.setInt(6, c.getCodigo());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    @Override
    public void eliminar(Object obj) {
                try {
            Computador c = (Computador) obj;
            
            String SSQL = "DELETE FROM computadores WHERE codigo=?;";
            
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, c.getCodigo());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
