package personajes;

import javax.swing.ImageIcon;

public class ArmaOgro extends Arma{

	ImageIcon arma;
	@Override
	public void cargarArma() {
		// TODO Auto-generated method stub
		arma = new ImageIcon(getClass().getResource("/img/ArmaOgro.jpg"));
	}

	@Override
	public ImageIcon mostrarArma() {
		// TODO Auto-generated method stub
		return arma;
	}

	
 
}
