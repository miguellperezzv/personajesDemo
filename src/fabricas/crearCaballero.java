package fabricas;

import personajes.Arma;
import personajes.ArmaCaballero;
import personajes.Cuerpo;
import personajes.CuerpoCaballero;
import personajes.Escudo;
import personajes.EscudoCaballero;
import personajes.HCaballero;
import personajes.Hombre;

public class crearCaballero extends crearPersonajeAbstracto {

	@Override
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new ArmaCaballero();
	}

	@Override
	public Escudo crearEscudo() {
		// TODO Auto-generated method stub
		return new EscudoCaballero();
	}

	@Override
	public Hombre crearHombre() {
		// TODO Auto-generated method stub
		return new HCaballero();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoCaballero();
	}
	
}
