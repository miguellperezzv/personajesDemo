package personajes;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ArmaHechicero extends Arma {

 ImageIcon arma;
	@Override
	public void cargarArma() {
		arma = new ImageIcon(getClass().getResource("/img/ArmaHechicero.jpg"));
		
	}

	@Override
	public ImageIcon mostrarArma() {
		// TODO Auto-generated method stub
		return arma;
	}

}
