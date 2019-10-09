package personajes;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ArmaRey extends Arma {

	ImageIcon arma;
	@Override
	public void cargarArma() {
		// TODO Auto-generated method stub
		arma = new ImageIcon(getClass().getResource("/img/ArmaRey.jpg"));
	}

	@Override
	public ImageIcon mostrarArma() {
		// TODO Auto-generated method stub
		return arma;
	}

	

}
