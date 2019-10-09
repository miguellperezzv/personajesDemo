package fabricas;

import personajes.Arma;
import personajes.ArmaHechicero;
import personajes.Cuerpo;
import personajes.CuerpoCaballero;
import personajes.Escudo;
import personajes.EscudoHechicero;
import personajes.HHechicero;
import personajes.Hombre;

public class crearHechicero extends crearPersonajeAbstracto {

	@Override
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new ArmaHechicero();
	}

	@Override
	public Escudo crearEscudo() {
		// TODO Auto-generated method stub
		return new EscudoHechicero();
	}

	@Override
	public Hombre crearHombre() {
		// TODO Auto-generated method stub
		return new HHechicero();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoCaballero();
	}

}
