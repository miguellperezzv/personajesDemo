package personajes;


import java.awt.Image;

import javax.swing.ImageIcon;

public class ArmaCaballero extends Arma {

	ImageIcon arma;
	

	@Override
	public ImageIcon mostrarArma() {
		// TODO Auto-generated method stub
		System.out.println(arma.hashCode()+" Arma mostrada");
		return  arma;
	}

	@Override
	public void cargarArma() {
		arma = new ImageIcon(getClass().getResource("/img/ArmaCaballero.jpg"));
		
		System.out.println(arma.hashCode()+" Arma cargada");
		
    }

	
	
	
	}


