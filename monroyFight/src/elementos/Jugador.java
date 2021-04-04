package elementos;

import logicaJuego.TipoJugador;

public abstract class Jugador {
	private int velocidad;
	private int magia;
	private int fuerza;
	private int fila;
	private int columna;
	private int dinero;
	private int gemas;
	private int pociones;
	private TipoJugador tipo;
	private String nombre;
	
	public Jugador(int velocidad, int magia, int fuerza, int fila, int columna, int dinero, int gemas, int pociones) {
		super();
		this.velocidad = velocidad;
		this.magia = magia;
		this.fuerza = fuerza;
		this.fila = fila;
		this.columna = columna;
		this.dinero = dinero;
		this.gemas = gemas;
		this.pociones = pociones;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public int getMagia() {
		return magia;
	}


	public int getFuerza() {
		return fuerza;
	}


	public int getDinero() {
		return dinero;
	}


	public void setDinero(int dinero) {
		this.dinero = dinero;
	}


	public int getGemas() {
		return gemas;
	}


	public void setGemas(int gemas) {
		this.gemas = gemas;
	}


	public int getPociones() {
		return pociones;
	}


	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

}
