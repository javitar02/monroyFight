package elementos;

import logicaJuego.Constantes;

public class Guerrero extends Jugador{

	public Guerrero(char simbolo) {
		super(simbolo,Constantes.VELOCIDAD_GUERRERO, Constantes.MAX_MAGIA_GUERRERO, Constantes.MAX_FUERZA_GUERRERO);
		
	}


}
