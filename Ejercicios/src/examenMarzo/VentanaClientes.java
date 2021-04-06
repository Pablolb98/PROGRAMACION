package examenMarzo;

import java.awt.EventQueue;
import javax.swing.event.*;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VentanaClientes implements ChangeListener, ItemListener {

	Cliente actual = null;

	private static JFrame frame;
	private JLabel lblid;
	private JTextField jtfId;
	private JLabel lblNombre;
	private JTextField jtfNombre;
	private JLabel lblApellido;
	private JTextField jtfApellido;
	private JLabel lblLocalidad;
	private JTextField jtfLocalidad;
	private JLabel lbldniNie;
	private JTextField jtfdniNie;
	private JLabel lblemail;
	private JTextField jtfEmail;

	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnFinal;
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JButton btnNuevo;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaClientes window = new VentanaClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		cerrarAplicacion();
		
	}

	/**
	 * Create the application.
	 */
	public VentanaClientes() {
		initialize();
		this.actual = ControladorCliente.getInstance().findPrimero();
		cargarActualEnPantalla();
	}

	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellido.setText(this.actual.getApellidos());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfdniNie.setText(this.actual.getDniNie());
			this.jtfEmail.setText(this.actual.getEmail());
		}
	}

	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellidos(jtfApellido.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDniNie(jtfdniNie.getText());
		this.actual.setEmail(jtfEmail.getText());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 69, 77, 76 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		lblid = new JLabel("id");
		GridBagConstraints gbc_lblid = new GridBagConstraints();
		gbc_lblid.insets = new Insets(0, 0, 5, 5);
		gbc_lblid.anchor = GridBagConstraints.EAST;
		gbc_lblid.gridx = 0;
		gbc_lblid.gridy = 0;
		frame.getContentPane().add(lblid, gbc_lblid);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		frame.getContentPane().add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		lblNombre = new JLabel("nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);

		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);

		lblApellido = new JLabel("apellidos");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 2;
		frame.getContentPane().add(lblApellido, gbc_lblApellido);

		jtfApellido = new JTextField();
		GridBagConstraints gbc_jtfApellido = new GridBagConstraints();
		gbc_jtfApellido.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido.gridx = 1;
		gbc_jtfApellido.gridy = 2;
		frame.getContentPane().add(jtfApellido, gbc_jtfApellido);
		jtfApellido.setColumns(10);

		lblLocalidad = new JLabel("localidad");
		GridBagConstraints gbc_lblLocalidad = new GridBagConstraints();
		gbc_lblLocalidad.anchor = GridBagConstraints.EAST;
		gbc_lblLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidad.gridx = 0;
		gbc_lblLocalidad.gridy = 3;
		frame.getContentPane().add(lblLocalidad, gbc_lblLocalidad);

		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		frame.getContentPane().add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);

		lbldniNie = new JLabel("dniNie");
		GridBagConstraints gbc_lbldniNie = new GridBagConstraints();
		gbc_lbldniNie.anchor = GridBagConstraints.EAST;
		gbc_lbldniNie.insets = new Insets(0, 0, 5, 5);
		gbc_lbldniNie.gridx = 0;
		gbc_lbldniNie.gridy = 4;
		frame.getContentPane().add(lbldniNie, gbc_lbldniNie);

		jtfdniNie = new JTextField();
		GridBagConstraints gbc_jtfdniNie = new GridBagConstraints();
		gbc_jtfdniNie.insets = new Insets(0, 0, 5, 0);
		gbc_jtfdniNie.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfdniNie.gridx = 1;
		gbc_jtfdniNie.gridy = 4;
		frame.getContentPane().add(jtfdniNie, gbc_jtfdniNie);
		jtfdniNie.setColumns(10);

		lblemail = new JLabel("email");
		GridBagConstraints gbc_lblemail = new GridBagConstraints();
		gbc_lblemail.anchor = GridBagConstraints.EAST;
		gbc_lblemail.insets = new Insets(0, 0, 5, 5);
		gbc_lblemail.gridx = 0;
		gbc_lblemail.gridy = 5;
		frame.getContentPane().add(lblemail, gbc_lblemail);

		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 5;
		frame.getContentPane().add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);

		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);

		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);

		btnFinal = new JButton(">>");
		btnFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnFinal);

		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 7;
		frame.getContentPane().add(panel_2, gbc_panel_2);

		btnGuardar = new JButton("Guardar");
		panel_2.add(btnGuardar);

		btnNuevo = new JButton("Nuevo");
		panel_2.add(btnNuevo);

		btnEliminar = new JButton("Eliminar");
		panel_2.add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				borrar();

			}
		});
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vaciarCampos();

			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();

			}
		});

	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

//	//String    str = new String(new char[] {'C', 'a', 'd', 'e', 'n', 'a', ' ', 's', 'e', ' ', 't', 'e', 'x', 't', 'o'});
//		System.out.println("BÃºsqueda booleana de la cadena "@": " + str.contains("@"));
//
//			        if (!str.contains("@")) {
//			            JOptionPane.showMessageDialog(null, "no has introducido bien el correo");
//			        }

	private void guardar() {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificación
			int regsAfec = ControladorCliente.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}

		} else { // Alta - nuevo
			int idNuevoReg = ControladorCliente.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
			}
		}
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfNombre.setText("");
		this.jtfApellido.setText("");
		this.jtfLocalidad.setText("");
		this.jtfdniNie.setText("");
		this.jtfEmail.setText("");
	}
	
	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = { "Si�", "No" };
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el
		// icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "�Desea eliminar?", "Gesti�n venta de coches",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas,
				posiblesRespuestas[1]);
		if (opcionElegida == 0) {
			int regsAfectados = ControladorCliente.getInstance().borrar(this.actual.getId());
			if (regsAfectados > 0) {
				vaciarCampos();
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
			}
		}
	}
	
	
	private static void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(null, "¿Desea cerrar la aplicación?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
