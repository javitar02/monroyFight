package elementos;

//CLASE REFERIDA AL PERSONAJE EN SI
public abstract class Jugador extends Elemento{
	private int velocidad;
	private int magia;
	private int fuerza;
	private int dinero;
	private int gemas;
	private int pociones;
	private String nombre;
	private char simbolo;

	public Jugador(char simbolo, int velocidadOgro, int maxMagiaOgro, int maxFuerzaOgro) {
		super(simbolo);
		this.velocidad = velocidad;
		this.magia = magia;
		this.fuerza = fuerza;
		this.dinero = 0;
		this.gemas = 0;
		this.pociones = 0;
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

	public int getGemas() {
		return gemas;
	}

	public int getPociones() {
		return pociones;
	}

	public String getNombre() {
		return nombre;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void ganaDinero() {
		dinero++;
	}
	
	public void pierdeTodoElDinero() {
		dinero=0;
	}

	public void ganaGema() {
		gemas++;
	}
	
	public void usaGema() {
		gemas--;
	}

	
	public void ganaPocion() {
		pociones++;
	}
	
	public void usaPocion() {
		pociones--;
	}



	@Override
	public String toString() {
		return "Jugador [dinero=" + dinero + ", gemas=" + gemas + ", pociones=" + pociones + ", nombre=" + nombre + "]";
	}

	
}
