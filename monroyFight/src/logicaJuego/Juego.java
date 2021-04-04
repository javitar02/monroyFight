package logicaJuego;

import elementos.Elemento;
import elementos.Jugador;

public class Juego {
	private Elemento [][]tablero;
	private Jugador [] jugadores;
	private int alto;
	private int ancho;
	private int numJugadores;
	private boolean finished;
	private int jugadorJuega;

	public Juego(int alto, int ancho, int numJugadores) {
	
		this.alto = Constantes.ALTO;
		this.ancho = Constantes.ANCHO;
		this.numJugadores = numJugadores;
		this.finished=false;
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}
	
	public int getNumJugadores() {
		return numJugadores;
	}
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
	public int getJugadorJuega() {
		return jugadorJuega;
	}
	public void setJugadorJuega(int jugadorJuega) {
		this.jugadorJuega = jugadorJuega;
	}

	public char[] nombresJugadores() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] valoresJugadores() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isTerminado() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getNumeroMovimientosJugador() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getJugadorTurno() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] moverJugador(char direccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public void proximoJugador() {
		// TODO Auto-generated method stub
		
	}

	public String getGanador() {
		// TODO Auto-generated method stub
		return null;
	}

	public void crearJugador(TipoJugador tipo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
