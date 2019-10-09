package personajes;

import java.awt.Graphics;

public abstract class Sprite extends Thread{
	public int direccion;
	public abstract void paint(Graphics g);
	
	static Thread hilo = new Thread();
	public abstract void mover();
	public abstract void setdireccion(int i);
}
