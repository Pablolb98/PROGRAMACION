package tresEnRaya;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Paint;
import javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler;

public class CuadroDeJuego {
	int xEnTablero, yEnTablero;
	int esquinaSupIzquierdaX, esquinaSupIzquierdaY;
	int ancho, alto;
	private boolean clicHecho = false;
	private int jugadorPropietario = 0;
	

	public CuadroDeJuego(int xEnTablero, int yEnTablero) {
		super();
		this.xEnTablero = xEnTablero;
		this.yEnTablero = yEnTablero;
	}

	public void paint(Graphics g) {
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSupIzquierdaX = this.xEnTablero * ancho;
		esquinaSupIzquierdaY = this.yEnTablero * alto;
				
		g.setColor(Color.black);
		g.drawRect(esquinaSupIzquierdaX, esquinaSupIzquierdaY, ancho, alto);
		
		if (this.clicHecho) {
			pintaImagenesVectoriales(g);
		}
	}
	
	
	public void pintaImagenesVectoriales(Graphics g) {
		if(jugadorPropietario == TresEnRaya.JUGADOR_1) {
			g.drawLine(this.esquinaSupIzquierdaX, this.esquinaSupIzquierdaY, 
					this.esquinaSupIzquierdaX + this.ancho, this.esquinaSupIzquierdaY + alto);
			
			g.drawLine(this.esquinaSupIzquierdaX, this.esquinaSupIzquierdaY + alto, 
					this.esquinaSupIzquierdaX + this.ancho, this.esquinaSupIzquierdaY);
		}
		
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_2) {
			g.drawOval(this.esquinaSupIzquierdaX, this.esquinaSupIzquierdaY, this.ancho, this.alto);
		}
	}

	
	public boolean clicEnCuadro(int xClic, int yClic) {
		if (xClic > this.esquinaSupIzquierdaX && xClic <(esquinaSupIzquierdaX + ancho) 
				&& 
			yClic > this.esquinaSupIzquierdaY && yClic < (esquinaSupIzquierdaY + alto)){
			return true;
		}
		return false;
	}
	
	public void clic(int jugador) {
		this.clicHecho = true;
		
		if (this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
		}  
		
		TresEnRaya.getInstance().getMatrizJugadas()[this.yEnTablero][this.xEnTablero] = jugador;
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
		System.out.println("Estado del juego");
		for (int i = 0; i < TresEnRaya.getInstance().getMatrizJugadas().length; i++) {
			for (int j = 0; j < TresEnRaya.getInstance().getMatrizJugadas()[i].length; j++) {
				System.out.print(TresEnRaya.getInstance().getMatrizJugadas()[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public int getxEnTablero() {
		return xEnTablero;
	}

	public void setxEnTablero(int xEnTablero) {
		this.xEnTablero = xEnTablero;
	}

	public int getyEnTablero() {
		return yEnTablero;
	}

	public void setyEnTablero(int yEnTablero) {
		this.yEnTablero = yEnTablero;
	}


	@Override
	public String toString() {
		return "CuadroDeJuego [xEnTablero=" + xEnTablero + ", yEnTablero=" + yEnTablero + "]";
	}



}
