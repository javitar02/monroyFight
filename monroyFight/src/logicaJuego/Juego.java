package logicaJuego;

import java.util.Iterator;
import java.util.Random;

import elementos.Elemento;
import elementos.Elfo;
import elementos.Guerrero;
import elementos.Jugador;
import elementos.Mago;
import elementos.Ogro;

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
		tablero=new Elemento[alto][ancho];
		jugadores=new Jugador[numJugadores];
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

	public int getJugadorJuega() {
		return jugadorJuega;
	}


	public String nombresJugadores() {
		int i;
		StringBuilder sb= new StringBuilder();
		
		for(i=0;i<numJugadores;i++) {
			sb.append("Jugador "+i+ ":"+jugadores[i].getSimbolo());
		}
	
		return sb.toString();
	}

	public String valoresJugadores() {
		int i;
		StringBuilder sb=new StringBuilder();
		
		for(i=0;i<numJugadores;i++) {
			sb.append(jugadores[i].toString()+"/n");
		}
		
		return sb.toString();
	}

	public boolean isTerminado() {
		
		return finished;
	}

	public int getNumeroMovimientosJugador(TipoJugador a) {
		int movimientosPorJugador = 0;
		
		if(a==TipoJugador.ELFO) {
			movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_ELFO+1;
		}else if
		(a==TipoJugador.OGRO) {
			movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_OGRO+1;
		}
		else if(a==TipoJugador.GUERRERO) {
			movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_GUERRERO+1;
		}
		else if(a==TipoJugador.MAGO) {
			movimientosPorJugador=(int)Math.random()*Constantes.MAX_DADO_MAGO+1;
		}
	
		return movimientosPorJugador;
	}

	public String getJugadorTurno(char simbolo) {
		String informacion;
		

		informacion="Le toca al Jugador "+simbolo;
			
	
		return informacion;
	}

	public String moverJugador(char direccion) {
		StringBuilder sb=new StringBuilder();
		TipoJugador a=null;
		Jugador otro;
		
		
		int filaActual;
		int filaNueva;
		int columnaActual;
		int columnaNueva;
		
		for(i=0;i<Constantes.ALTO-1;i++) {
			for(k=0;k<Constantes.ANCHO-1;k++) {
				if(jugadores[i]==null){
					jugadores[j]=otro;
				}
			}
		}
		
		if(direccion==Constantes.NORTE) {
			int movimientos=getNumeroMovimientosJugador(a);
			filaActual=filaActual-movimientos;
		}
		
		
		
		
		
		
		
		return sb.toString();
	}

	public int proximoJugador() {
		int posProximoJugador;
		
		posProximoJugador=(int)Math.random()*numJugadores+Constantes.MIN_JUGADORES;
		

		return posProximoJugador;
	}

	public String getGanador() {
		String info = null;
		int i;
		
		for(i=0;i<jugadores.length;i++) {
			if(jugadores[i].getDinero()==Constantes.MAX_DINERO || jugadores[i]!=null) {
				info="Enhorabuena al Jugador: "+jugadores[i].getSimbolo()+" ha sido el ganador del juego";
			}
		}
		
		return info;
	}

	public void crearJugador(TipoJugador tipo)throws JuegoException {
		int i;
		int j;
		int k;
		int posicion;
		boolean repetido=false;
		Jugador otro=null;
		
		
		
		do {
			Random r=new Random();
			posicion=r.nextInt(numJugadores);
			for (j = 0; j < jugadores.length; j++) {
				if(jugadores[j]==null) {
					jugadores[j]=otro;
				}
			}
			for(i=0;i<Constantes.ALTO-1;i++) {
				for(k=0;k<Constantes.ANCHO-1;k++) {
					if(jugadores[i]==null){
						jugadores[j]=otro;
					}
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
			if(tipo==TipoJugador.OGRO) {
				otro=new Ogro(Constantes.NOMBRES.charAt(posicion));
			}else {
				throw new JuegoException("Seleccione una clase valida");
			}
		
	}
}		
	
	
