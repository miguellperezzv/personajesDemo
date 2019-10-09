package personajes;

import javax.swing.ImageIcon;

public class EscudoHechicero extends Escudo{

	ImageIcon escudo;
	@Override
	public void crearEscudo() {
		// TODO Auto-generated method stub
				escudo = new ImageIcon(getClass().getResource("/img/EscudoHechicero.jpg"));
				System.out.println(escudo.hashCode()+" escudo cargado");
		
	}

	@Override
	public ImageIcon mostrarEscudo() {
		// TODO Auto-generated method stub
		return escudo;
	}

	

}
