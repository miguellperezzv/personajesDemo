package personajes;

import javax.swing.ImageIcon;

public class EscudoJinete extends Escudo {

	ImageIcon escudo;
	@Override
	public void crearEscudo() {
		// TODO Auto-generated method stub
		escudo = new ImageIcon(getClass().getResource("/img/EscudoJinete.jpg"));
	}

	@Override
	public ImageIcon mostrarEscudo() {
		// TODO Auto-generated method stub
		return escudo;
	}

}
