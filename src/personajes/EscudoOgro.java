package personajes;

import javax.swing.ImageIcon;

public class EscudoOgro extends Escudo{

	ImageIcon escudo;
	@Override
	public void crearEscudo() {
		// TODO Auto-generated method stub
				escudo = new ImageIcon(getClass().getResource("/img/EscudoOgro.jpg"));
				System.out.println(escudo.hashCode()+" escudo cargada");
		
	}

	@Override
	public ImageIcon mostrarEscudo() {
		// TODO Auto-generated method stub
		return escudo;
	}

	
	

}
