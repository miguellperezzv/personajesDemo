package personajes;

import java.awt.Image;

import javax.swing.ImageIcon;

public class EscudoRey extends Escudo {

	ImageIcon escudo;
	@Override
	public void crearEscudo() {
		// TODO Auto-generated method stub
		escudo = new ImageIcon(getClass().getResource("/img/EscudoRey.jpg"));
		System.out.println(escudo.hashCode()+" escudo cargada");
		
	}

	@Override
	public ImageIcon mostrarEscudo() {
		// TODO Auto-generated method stub
		return escudo;
	}



	

}
