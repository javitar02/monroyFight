package logicaJuego;

import elementos.Elemento;
import elementos.Elfo;
import elementos.Guerrero;
import elementos.Jugador;
import elementos.Mago;
import elementos.Orco;

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
		int i;
		
		for(i=0;i<numJugadores;i++) {
			
		}
		
		
		return ;
	}

	public char[] valoresJugadores() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isTerminado() {
		boolean terminado=false;
		int i;
		
		for(i=0;i<jugadores.length && !terminado;i++)
		if(jugadores[i].getDinero()==Constantes.MAX_DINERO) {
			terminado=true;
		}
		
		return terminado;
	}

	public int getNumeroMovimientosJugador() {
		int movimientosPorJugador = 0;
		
		//ELFO
		movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_ELFO+1;
		//ORCO
		movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_OGRO+1;
		//GUERRERO
		movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_GUERRERO+1;
		//MAGO
		movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_MAGO+1;
		
		
		
		return movimientosPorJugador;
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
		String info = null;
		int i;
		
		for(i=0;i<jugadores.length;i++) {
			if(jugadores[i].getDinero()==Constantes.MAX_DINERO) {
				info="Enhorabuena al ganador: "+jugadores[i];
			}
		}
		
		return info;
	}

	public void crearJugador(Jugador tipo)throws JuegoException {
		int i;
		
		for(i=0;i<numJugadores;i++) {
			if(tipo instanceof Elfo) {
				Elfo elfo=(Elfo) jugadores[numJugadores];
			}
			if(tipo instanceof Guerrero) {
				Guerrero guerrero=(Guerrero) jugadores[numJugadores];
			}
			if(tipo instanceof Mago) {
				Mago mago=(Mago) jugadores[numJugadores];
			}
			if(tipo instanceof Orco) {
				Orco orco=(Orco) jugadores[numJugadores];
			}else {
				throw new JuegoException("Seleccione una clase válida");
			}
		
	}
		
	}
	}
