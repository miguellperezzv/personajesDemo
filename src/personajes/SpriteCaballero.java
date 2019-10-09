package personajes;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class SpriteCaballero extends Sprite {
	
	static int numero=0;
	static int columna = 3;
	int fila =200;
	static Graphics general;
	
	int direccion = 2 ; //derecha default
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		ImageIcon imagen = new ImageIcon(new ImageIcon (getClass().getResource("/imgJuego/caballero/caballero_run_"+ numero+".png")).getImage());
		g.drawImage(imagen.getImage(), columna, fila, null);
	}
	
	public SpriteCaballero(Graphics g){
		SpriteCaballero.general=g;
	}
	
	public Thread hilo = new Thread() {
		public void run () {
		
			while(numero<6) {
				
			
		
			
			try {
				
				//System.out.println("se entra el hilo run, numero, columna, fila =  "+ numero+" "  +columna+ " " + fila );
				numero++;
				if (numero==6) {
					numero=0;
				}
				
				else {
					System.out.println("DIRECCION DENTRO DEL HILO "+ direccion);
					switch (direccion){
					
					case 0:
						if(columna>=900) {
							columna=900;
						}else {
							columna+=10;
						}
					break;
					case 1:
						if(columna<=0) {
							columna=0;
						}
						else {
							columna-=10;
						}
					break;
					case 2:
						if (fila>=600) {
							fila=600;
						}else {
							fila+=10;
						}
					break;
					case 3:
						if (fila<=200) {
							fila=200;
						}else {
							fila-=10;
						}
					}
				
					
				
				
				paint(general);
				//System.out.println("sale del run, numero, columna, fila =  "+ numero+" "  +columna+ " " + fila );
				Thread.sleep(100);
				general.clearRect(10, 200, 1000, 500);
			}
			}catch (Exception ex ) {
				System.out.println("error en la ejecución del hilo" + ex);
			}
			}	
		}
	};
	
	public void mover() {
		if(!hilo.isAlive()) {
			hilo.start();
		}
		columna=3;
		
	}

	@Override
	public void setdireccion(int i) {
		// TODO Auto-generated method stub
		this.direccion=i;
	}

	

	
}
