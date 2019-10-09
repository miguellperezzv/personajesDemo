package fabricas;

import personajes.Arma;
import personajes.Escudo;
import personajes.Hombre;
import personajes.Cuerpo;

public abstract class crearPersonajeAbstracto {
	
	public abstract Arma crearArma();
	public abstract Escudo crearEscudo();
	public abstract Hombre crearHombre();
	public abstract Cuerpo crearCuerpo();
}
