package logicaJuego;

import java.util.Iterator;
import java.util.Random;

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
		
		for(i=0;i<jugadores.length;i++) {
			
		}
		
		
		return null;
	}

	public char[] valoresJugadores() {
		
		
		
		
		
		
		
		
		
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

	public void crearJugador(TipoJugador tipo)throws JuegoException {
		int i;
		int posicion;
		
		
		
		boolean repetido=false;
		Jugador otro;
		
		do {
			Random r=new Random();
			posicion=r.nextInt(numJugadores);
			for (int j = 0; j < jugadores.length; j++) {
				if(jugadores[j].getSimbolo()==null) {
					
				}
				
			}
		
		} while (!repetido);
			
		 
			
			if(tipo==TipoJugador.ELFO) {
				otro=new Elfo(Constantes.NOMBRES.charAt(posicion));
			}
			if(tipo==TipoJugador.GUERRERO) {
				otro=new Guerrero(Constantes.NOMBRES.charAt(posicion));
			}
			if(tipo==TipoJugador.MAGO) {
				otro=new Mago(Constantes.NOMBRES.charAt(posicion));
			}
			if(tipo==TipoJugador.ORCO) {
				otro=new Orco(Constantes.NOMBRES.charAt(posicion));
			}else {
				throw new JuegoException("Seleccione una clase válida");
			}
		
	}
}		
	
	
