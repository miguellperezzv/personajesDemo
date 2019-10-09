package personajes;

import javax.swing.ImageIcon;

public class CuerpoHechiero extends Cuerpo{

	ImageIcon cuerpo;
	@Override
	public void crearCuerpo() {
		// TODO Auto-generated method stub
		cuerpo = new ImageIcon(getClass().getResource("/img/CuerpoHechicero.jpg"));
	}

	@Override
	public ImageIcon mostrarCuerpo() {
		// TODO Auto-generated method stub
		return cuerpo;
	}

}
