package personajes;

import javax.swing.ImageIcon;

public class CuerpoRey extends Cuerpo{

	ImageIcon cuerpo;
	@Override
	public void crearCuerpo() {
		// TODO Auto-generated method stub
		cuerpo = new ImageIcon(getClass().getResource("/img/CuerpoRey.jpg"));
	}

	@Override
	public ImageIcon mostrarCuerpo() {
		// TODO Auto-generated method stub
		return cuerpo;
	}

}
