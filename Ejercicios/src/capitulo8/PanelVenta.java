package capitulo8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class PanelVenta {
	
	Venta actual = null;
	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtfidCliente;
	private JTextField jtfidConcesionario;
	private JTextField jtfidCoche;
	private JTextField jtfFecha;
	private JTextField jtfprecioVenta;



	/**
	 * Create the application.
	 */
	public PanelVenta() {
		initialize();
		this.actual = ControladorVenta.getInstance().findPrimero();
		cargarActualEnPantalla();
	}
	
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfid.setText("" + this.actual.getId());
			this.jtfidCliente.setText("" + this.actual.getIdCliente());
			this.jtfidConcesionario.setText("" +this.actual.getIdConcesionario());
			this.jtfidCoche.setText("" +this.actual.getIdCoche());
			this.jtfFecha.setText("" +this.actual.getFecha());
			this.jtfprecioVenta.setText("" +this.actual.getPrecioVenta());
		}
	}
	
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfid.getText()));
		this.actual.setIdCliente(Integer.parseInt(jtfidCliente.getText()));
		this.actual.setIdConcesionario(Integer.parseInt(jtfidCliente.getText()));
		this.actual.setIdCoche(Integer.parseInt(jtfidCliente.getText()));
		this.actual.setFecha(jtfFecha.getText());
		this.actual.setPrecioVenta(Integer.parseInt(jtfprecioVenta.getText()));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblid = new JLabel("id");
		GridBagConstraints gbc_lblid = new GridBagConstraints();
		gbc_lblid.anchor = GridBagConstraints.EAST;
		gbc_lblid.insets = new Insets(0, 0, 5, 5);
		gbc_lblid.gridx = 0;
		gbc_lblid.gridy = 0;
		frame.getContentPane().add(lblid, gbc_lblid);
		
		jtfid = new JTextField();
		jtfid.setEnabled(false);
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 0;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblidCliente = new JLabel("idCliente");
		GridBagConstraints gbc_lblidCliente = new GridBagConstraints();
		gbc_lblidCliente.anchor = GridBagConstraints.EAST;
		gbc_lblidCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblidCliente.gridx = 0;
		gbc_lblidCliente.gridy = 1;
		frame.getContentPane().add(lblidCliente, gbc_lblidCliente);
		
		jtfidCliente = new JTextField();
		GridBagConstraints gbc_jtfidCliente = new GridBagConstraints();
		gbc_jtfidCliente.insets = new Insets(0, 0, 5, 0);
		gbc_jtfidCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfidCliente.gridx = 1;
		gbc_jtfidCliente.gridy = 1;
		frame.getContentPane().add(jtfidCliente, gbc_jtfidCliente);
		jtfidCliente.setColumns(10);
		
		JLabel lblidConcesionario = new JLabel("idConcesionario");
		GridBagConstraints gbc_lblidConcesionario = new GridBagConstraints();
		gbc_lblidConcesionario.anchor = GridBagConstraints.EAST;
		gbc_lblidConcesionario.insets = new Insets(0, 0, 5, 5);
		gbc_lblidConcesionario.gridx = 0;
		gbc_lblidConcesionario.gridy = 2;
		frame.getContentPane().add(lblidConcesionario, gbc_lblidConcesionario);
		
		jtfidConcesionario = new JTextField();
		GridBagConstraints gbc_jtfidConcesionario = new GridBagConstraints();
		gbc_jtfidConcesionario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfidConcesionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfidConcesionario.gridx = 1;
		gbc_jtfidConcesionario.gridy = 2;
		frame.getContentPane().add(jtfidConcesionario, gbc_jtfidConcesionario);
		jtfidConcesionario.setColumns(10);
		
		JLabel lblCoche = new JLabel("idCoche");
		GridBagConstraints gbc_lblCoche = new GridBagConstraints();
		gbc_lblCoche.anchor = GridBagConstraints.EAST;
		gbc_lblCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoche.gridx = 0;
		gbc_lblCoche.gridy = 3;
		frame.getContentPane().add(lblCoche, gbc_lblCoche);
		
		jtfidCoche = new JTextField();
		GridBagConstraints gbc_jtfidCoche = new GridBagConstraints();
		gbc_jtfidCoche.insets = new Insets(0, 0, 5, 0);
		gbc_jtfidCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfidCoche.gridx = 1;
		gbc_jtfidCoche.gridy = 3;
		frame.getContentPane().add(jtfidCoche, gbc_jtfidCoche);
		jtfidCoche.setColumns(10);
		
		JLabel lblFecha = new JLabel("fecha");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 4;
		frame.getContentPane().add(lblFecha, gbc_lblFecha);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 4;
		frame.getContentPane().add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JLabel lblPrecioVenta = new JLabel("precioVenta");
		GridBagConstraints gbc_lblPrecioVenta = new GridBagConstraints();
		gbc_lblPrecioVenta.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioVenta.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecioVenta.gridx = 0;
		gbc_lblPrecioVenta.gridy = 5;
		frame.getContentPane().add(lblPrecioVenta, gbc_lblPrecioVenta);
		
		jtfprecioVenta = new JTextField();
		GridBagConstraints gbc_jtfprecioVenta = new GridBagConstraints();
		gbc_jtfprecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfprecioVenta.gridx = 1;
		gbc_jtfprecioVenta.gridy = 5;
		frame.getContentPane().add(jtfprecioVenta, gbc_jtfprecioVenta);
		jtfprecioVenta.setColumns(10);
		
		
	}

}
