package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TresEnRaya extends Canvas {

	
	private static JFrame ventana = new JFrame("3 en raya");
	private static TresEnRaya instance = null;
	List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	public int turnoActual = JUGADOR_1;
	private int matrizJugadas [][] = new int [][] {{0, 0, 0,},
													{0, 0, 0},
													{0, 0, 0}};


	// Patron Singleton de la Ventana
	public static TresEnRaya getInstance() {

		if (instance == null) { // Comprobamos si está inicializada(A null en este caso)
			instance = new TresEnRaya();
		}
		return instance;
	}

	public static void main(String[] args) {

		TresEnRaya.getInstance();

	}
	

	public TresEnRaya() {
		JPanel panel = (JPanel) ventana.getContentPane();
		ventana.setSize(600, 600); // Tamaño de la ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		panel.add(this, BorderLayout.CENTER);
		inicializarCuadros();
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getButton() == MouseEvent.BUTTON1) {
					for (CuadroDeJuego cuadro : cuadros) {
						if (cuadro.clicEnCuadro(e.getX(), e.getY())) {
							cuadro.clic(turnoActual);
							if (turnoActual == JUGADOR_1) {
								turnoActual = JUGADOR_2;
							}
							else {
								turnoActual= JUGADOR_1;
							}
						}
					}
				}
			}
		});
		
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		ventana.setVisible(true);
//		this.requestFocus();
	}
	

	public void inicializarCuadros() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cuadros.add(new CuadroDeJuego(i, j));
			}
		}
	}

	private void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar la aplicación?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public void paint(Graphics g) {

		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (CuadroDeJuego cuadro: cuadros) {
			cuadro.paint(g);
		}
	}

	public int[][] getMatrizJugadas() {
		return matrizJugadas;
	}
}
