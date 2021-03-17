package actExamenProgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorCity {

	private static ControladorCity instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCity getInstance () {
		if (instance == null) {
			instance = new ControladorCity();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCity() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/world?serverTimezone=UTC", "java", "123a");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public City findPrimero () {
		City c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by ID limit 1");
			if (rs.next()) {
				c = new City();
				c.setId(rs.getInt("ID"));
				c.setName(rs.getString("Name"));
				c.setCountryCode(rs.getString("CountryCode"));
				c.setDistrict(rs.getString("District"));
				c.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public City findUltimo () {
		City c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by ID desc limit 1");
			if (rs.next()) {
				c = new City();
				c.setId(rs.getInt("ID"));
				c.setName(rs.getString("Name"));
				c.setCountryCode(rs.getString("CountryCode"));
				c.setDistrict(rs.getString("District"));
				c.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public City findSiguiente (int idActual) {
		City c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where ID > " + idActual + " order by ID limit 1");
			if (rs.next()) {
				c = new City();
				c.setId(rs.getInt("ID"));
				c.setName(rs.getString("Name"));
				c.setCountryCode(rs.getString("CountryCode"));
				c.setDistrict(rs.getString("District"));
				c.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	


	/**
	 * 
	 * @return
	 */
	public City findAnterior (int idActual) {
		City c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where ID < " + idActual + " order by ID desc limit 1");
			if (rs.next()) {
				c = new City();
				c.setId(rs.getInt("ID"));
				c.setName(rs.getString("Name"));
				c.setCountryCode(rs.getString("CountryCode"));
				c.setDistrict(rs.getString("District"));
				c.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	
	
	public int modificar (City c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update city set Name='" + c.getName() + "', " +
					" CountryCode='" + c.getCountryCode() + "', District='" + c.getDistrict() + "', Population='" + c.getPopulation() + "' where ID=" + c.getId() );
		   	
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
	public int nuevo (City c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into city values(" + idNuevoRegistro + ", " +
			"'" + c.getName() + "', '" + c.getCountryCode() + "', '" + c.getDistrict() +
			"', '" + c.getPopulation() + "');");
		   	
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

		String sql = "select max(ID) from world.city";
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
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from city where ID=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}







