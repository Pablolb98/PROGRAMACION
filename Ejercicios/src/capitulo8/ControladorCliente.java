package capitulo8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {

	private static ControladorCliente instance = null;
	public Connection conn = null;

	public static ControladorCliente getInstance() {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
public ControladorCliente() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}

public Cliente findPrimero () {
	Cliente c = null;
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id limit 1");
		if (rs.next()) {
			c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return c;
}

public Cliente findUltimo () {
	Cliente c = null;
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1");
		if (rs.next()) {
			c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return c;
}

public Cliente findSiguiente (int idActual) {
	Cliente c = null;
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id limit 1");
		if (rs.next()) {
			c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return c;
}

public Cliente findAnterior (int idActual) {
	Cliente c = null;
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
		if (rs.next()) {
			c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return c;
}

public int modificar (Cliente c) {
	int registrosAfectados = 0;
	try {
		Statement s = (Statement) this.conn.createStatement(); 

		registrosAfectados = s.executeUpdate ("update cliente set dniNie='" + c.getDniNie() + "', " +
				" nombre='" + c.getNombre() + "', " + " apellidos='" + c.getApellidos() + "', " + "localidad='" + c.getLocalidad() + 
				"', " + "fechaNac='" + c.getFechaNac() + "', " + "activo='" + c.isActivo() + "' where id=" + c.getId() + ";");
	   	
		// Cierre de los elementos
		s.close();
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return registrosAfectados;
}

public int nuevo (Cliente c) {
	int registrosAfectados = 0;
	int idNuevoRegistro = 0;
	try {
		Statement s = (Statement) this.conn.createStatement(); 

		idNuevoRegistro = nextId();
		registrosAfectados = s.executeUpdate ("insert into cliente values(" + idNuevoRegistro + ", " +
		"'" + c.getId() + "', '" + c.getNombre() + "', '" + c.getApellidos() + "', '" + c.getLocalidad() + "', '" + c.getDniNie() +
		"', '" + c.getFechaNac() + "', '" + c.isActivo() +"');");
	   	
		// Cierre de los elementos
		s.close();
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return idNuevoRegistro;

}

private int nextId () throws SQLException {
	Statement s = (Statement) this.conn.createStatement();

	String sql = "select max(id) from tutorialjavacoches.cliente";
	ResultSet rs = s.executeQuery(sql);
	int max = 1; 
	if (rs.next() ) {
		max = rs.getInt(1);
	}
	rs.close();
	s.close();
	return max + 1;
}

public int borrar(int id) {
	int registrosAfectados = 0;
	try {
		Statement s = (Statement) this.conn.createStatement(); 

		registrosAfectados = s.executeUpdate ("delete from cliente where id=" + id + ";");
		
		// Cierre de los elementos
		s.close();
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return registrosAfectados;
}

public List<Cliente> findAll () {
	List<Cliente> clientes = new ArrayList<Cliente>();
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente");
		while (rs.next()) {
			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
			// Agrego el fabricante a la lista
			clientes.add(c);
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return clientes;
}



}
