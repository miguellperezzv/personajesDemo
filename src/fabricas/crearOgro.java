package fabricas;

import personajes.Arma;
import personajes.ArmaOgro;
import personajes.Cuerpo;
import personajes.CuerpoOgro;
import personajes.Escudo;
import personajes.EscudoOgro;
import personajes.HOgro;
import personajes.Hombre;

public class crearOgro extends crearPersonajeAbstracto {

	@Override
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new ArmaOgro();
	}

	@Override
	public Escudo crearEscudo() {
		// TODO Auto-generated method stub
		return new EscudoOgro();
	}

	@Override
	public Hombre crearHombre() {
		// TODO Auto-generated method stub
		return new HOgro();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoOgro();
	}

}
