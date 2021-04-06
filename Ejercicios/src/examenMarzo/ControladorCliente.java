package examenMarzo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorCliente {

	private static ControladorCliente instance = null;
	public Connection conn = null;

	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance() {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}

	/**
	 * 
	 */
	public ControladorCliente() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://127.0.0.1/datos_personales?serverTimezone=UTC", "java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero() {
		Cliente f = new Cliente();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery("select * from datos_personales.cliente order by id limit 1");
			if (rs.next()) {
				f.setId(rs.getInt("Id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDniNie(rs.getString("dniNie"));
				f.setEmail(rs.getString("email"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}

	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo() {
		Cliente f = new Cliente();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery("select * from datos_personales.cliente order by id desc limit 1");
			if (rs.next()) {
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDniNie(rs.getString("dniNie"));
				f.setEmail(rs.getString("email"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}

	/**
	 * 
	 * @return
	 */
	public Cliente findSiguiente(int idActual) {
		Cliente f = new Cliente();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery(
					"select * from datos_personales.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDniNie(rs.getString("dniNie"));
				f.setEmail(rs.getString("email"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}

	/**
	 * 
	 * @return
	 */
	public Cliente findAnterior(int idActual) {
		Cliente f = new Cliente();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery(
					"select * from datos_personales.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDniNie(rs.getString("dniNie"));
				f.setEmail(rs.getString("email"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}

	public int modificar(Cliente f) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement();

			registrosAfectados = s.executeUpdate("update cliente set id='" + f.getId() + "', " + " nombre='"
					+ f.getNombre() + "'apellidos='" + f.getApellidos() + "'Localidad='" + f.getLocalidad() + "'Email='"
					+ f.getEmail() + "' where dniNie=" + f.getDniNie() + ";");

			// Cierre de los elementos
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;

	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo(Cliente f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement();

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate("insert into cliente values(" + idNuevoRegistro + ", " + "'"
					+ f.getId() + "', '" + f.getNombre() + "', '" + f.getApellidos() + "', '" + f.getLocalidad() + "', '" + f.getDniNie() + "', '" + f.getEmail() + "');");

			// Cierre de los elementos
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId() throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from datos_personales.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1;
		if (rs.next()) {
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

			registrosAfectados = s.executeUpdate("delete from cliente where id=" + id + ";");

			// Cierre de los elementos
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
