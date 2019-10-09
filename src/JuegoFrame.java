import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import personajes.Sprite;
import personajes.SpriteCaballero;
import personajes.SpriteHechicero;

public class JuegoFrame extends JFrame implements ActionListener{

	private JButton volver = new JButton ("volver");
	private JComboBox<String> cmb;
	Sprite[] sprites = new Sprite[10];
	int cont=0;
	
	private JButton btnCaballero = new JButton ("Caballero");
	private JButton btnRey = new JButton ("Rey");
	private JButton btnJinete = new JButton ("Jinete");
	private JButton btnOgro = new JButton ("Ogro");
	private JButton btnHechicero = new JButton ("Hechiero");
	
	private JButton btnDer = new JButton ("DER");
	private JButton btnIzq = new JButton ("IZQ");
	private JButton btnAbajo = new JButton ("ABAJO");
	private JButton btnArriba = new JButton ("ARRIBA");
	
	JuegoFrame(){
	Container c = getContentPane();
	c.setLayout(null);
	cmb= new JComboBox<String>();
	 this.setSize(1000,700);
	 this.setVisible(true);
	 c.add(volver); 
	 volver.addActionListener(this); 
	 volver.setBounds(30, 30, 100, 30);
	 cmb.addItem("Caballero");
	cmb.addItem("Hechicero");
	cmb.addItem("Ogro");
	cmb.addItem("Rey");
	cmb.addItem("Jinete");
	cmb.setBounds(150, 30, 100, 40);
	//c.add(cmb); 
    cmb.addActionListener(this);
    c.setFocusable(true);
    c.requestFocus(); 
    c.add(btnCaballero); btnCaballero.setBounds(150, 30, 100, 30); btnCaballero.addActionListener(this);
    c.add(btnHechicero); btnHechicero.setBounds(150, 70, 100, 40); btnHechicero.addActionListener(this);
	//c.addKeyListener(this); 	
	c.add(btnDer); btnDer.setBounds(300, 30, 80, 30); btnDer.addActionListener(this);
	c.add(btnIzq); btnIzq.setBounds(400, 30, 80, 30); btnIzq.addActionListener(this);
	c.add(btnArriba); btnArriba.setBounds(500, 30, 80, 30); btnArriba.addActionListener(this);
	c.add(btnAbajo); btnAbajo.setBounds(600, 30, 80, 30); btnAbajo.addActionListener(this);
	
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==volver) {
			this.setVisible(false);
			Frame f = new Frame();
		}
		if(arg0.getSource()==btnCaballero)
		{	
			sprites[cont] = new SpriteCaballero(this.getGraphics());
			sprites[cont].mover();
		}
		
		if(arg0.getSource()==btnHechicero)
		{	
			sprites[cont] = new SpriteHechicero(this.getGraphics());
			sprites[cont].mover();
		}
			
		if (arg0.getSource()==btnDer) {
			System.out.print("derecha");
			sprites[0].setdireccion(0); 
			
		}
		if (arg0.getSource()==btnIzq) {
			System.out.print("izq");
			sprites[0].setdireccion(1);
			
		}
		
		if (arg0.getSource()==btnAbajo) {
			System.out.print("abajo");
			sprites[0].setdireccion(2);
			
		}
		if (arg0.getSource()==btnArriba) {
			System.out.print("arriba");
			sprites[0].setdireccion(3);
			
		}
		}
		
	}
	
	/*
	public void keyReleased (KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_DOWN){
			System.out.print("abajo");
			sprites[0].direccion=2; //direccion 2: abajo
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.print("derecha");
			sprites[0].direccion=0; //direccion 2: abajo
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT){
			sprites[0].direccion=1; //direccion 2: abajo
		}
		if (e.getKeyCode()==KeyEvent.VK_UP){
			sprites[0].direccion=3; //direccion 2: abajo
		}
	}



	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/


