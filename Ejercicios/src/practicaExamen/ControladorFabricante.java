package practicaExamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorFabricante {

	private static ControladorFabricante instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorFabricante getInstance () {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorFabricante() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/world?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Fabricante findPrimero () {
		Fabricante f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by id limit 1");
			if (rs.next()) {
				f = new Fabricante();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setCountryCode(rs.getString("CountryCode"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	

	/**
	 * 
	 * @return
	 */
	public Fabricante findUltimo () {
		Fabricante f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by id desc limit 1");
			if (rs.next()) {
				f = new Fabricante();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setCountryCode(rs.getString("CountryCode"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Fabricante findSiguiente (int idActual) {
		Fabricante f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				f = new Fabricante();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setCountryCode(rs.getString("CountryCode"));			
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	


	/**
	 * 
	 * @return
	 */
	public Fabricante findAnterior (int idActual) {
		Fabricante f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				f = new Fabricante();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setCountryCode(rs.getString("CountryCode"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Fabricante f) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update city set CountryCode='" + f.getCountryCode() + "', " +
					" Name='" + f.getName() + "' where ID=" + f.getID() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Fabricante f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into city values(" + idNuevoRegistro + ", " +
			"'" + f.getCountryCode() + "', '" + f.getName() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from world.city";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param string
	 * @return
	 */
	public int borrar(String string) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from city where ID=" + string + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
