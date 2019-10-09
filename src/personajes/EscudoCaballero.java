package personajes;

import java.awt.Image;

import javax.swing.ImageIcon;

public class EscudoCaballero extends Escudo {

	ImageIcon escudo;
	@Override
	public void crearEscudo() {
		// TODO Auto-generated method stub
		escudo = new ImageIcon(getClass().getResource("/img/EscudoCaballero.jpg"));
		System.out.println(escudo.hashCode()+" escudo cargada");
	}

	@Override
	public ImageIcon mostrarEscudo() {
		// TODO Auto-generated method stub
		System.out.println(escudo.hashCode()+" escudo mostrada");
		return escudo;
	}

	
	

}
