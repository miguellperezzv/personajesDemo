package fabricas;

import personajes.Arma;
import personajes.ArmaRey;
import personajes.Cuerpo;
import personajes.CuerpoRey;
import personajes.Escudo;
import personajes.EscudoRey;
import personajes.HRey;
import personajes.Hombre;

public class crearRey extends crearPersonajeAbstracto{

	@Override
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new ArmaRey();
	}

	@Override
	public Escudo crearEscudo() {
		// TODO Auto-generated method stub
		return new EscudoRey();
	}

	@Override
	public Hombre crearHombre() {
		// TODO Auto-generated method stub
		return new HRey();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoRey();
	}

}
