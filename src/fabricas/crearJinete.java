package fabricas;

import personajes.Arma;
import personajes.ArmaJinete;
import personajes.Cuerpo;
import personajes.CuerpoJinete;
import personajes.Escudo;
import personajes.EscudoJinete;
import personajes.HJinete;
import personajes.Hombre;

public class crearJinete extends crearPersonajeAbstracto {

	@Override
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new ArmaJinete();
	}

	@Override
	public Escudo crearEscudo() {
		// TODO Auto-generated method stub
		return new EscudoJinete();
	}

	@Override
	public Hombre crearHombre() {
		// TODO Auto-generated method stub
		return new HJinete();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoJinete();
	}

}
