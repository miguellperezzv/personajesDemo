import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import fabricas.crearCaballero;
import fabricas.crearHechicero;
import fabricas.crearJinete;
import fabricas.crearOgro;
import fabricas.crearPersonajeAbstracto;
import fabricas.crearRey;
import personajes.Arma;
import personajes.Cuerpo;
import personajes.Escudo;
import personajes.Hombre;

public class Frame extends JFrame implements ActionListener {
	
	private JComboBox<String> cmb;
	public String opcion ="";
	private JLabel nombre = new JLabel("Personaje");
	
	private JButton btnMov = new JButton("Movimientos");
	//JLabel imgArma= new JLabel();
	//JLabel imgEscudo= new JLabel();
	JLabel fuerzalbl= new JLabel();
	JLabel resistencialbl= new JLabel();
	JLabel estrategialbl= new JLabel();
	
	Frame(){
		this.setVisible(true);
		this.setSize(500, 500);
		cmb = new JComboBox<String>();
		this.add(btnMov);
		btnMov.setBounds(350, 30, 100, 30);
		btnMov.addActionListener(this);
		cmb.addItem("Caballero");
		cmb.addItem("Hechicero");
		cmb.addItem("Ogro");
		cmb.addItem("Rey");
		cmb.addItem("Jinete");
		this.add(cmb);
		cmb.setBounds(200, 30, 100, 30);
		cmb.addActionListener(this);
		this.add(nombre);
		nombre.setBounds(30, 100, 100, 40);
		this.add(fuerzalbl);
		fuerzalbl.setBounds(250, 320, 100, 30);
		this.add(resistencialbl);
		resistencialbl.setBounds(250, 360, 100, 30);
		this.add(estrategialbl);
		estrategialbl.setBounds(250, 400, 100, 30);
		//this.add(imgArma);
		//imgArma.setBounds(40, 200, 100, 100);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource().equals(btnMov)) {
			this.setVisible(false);
			JuegoFrame frame = new JuegoFrame();
		
		}
		else 
		{
		Container c = getContentPane();
		this.getContentPane().removeAll();
		this.getContentPane().repaint();
		crearPersonajeAbstracto fabrica = null;
		opcion = (String) cmb.getSelectedItem();
		System.out.println("opcion del action "+ opcion);
		c.add(btnMov);
		btnMov.setBounds(350, 30, 100, 30);
		btnMov.addActionListener(this);
		 
		switch(opcion) {
			case "Caballero" : 
				fabrica = new crearCaballero();
			break;	
			case "Hechicero": 
				fabrica = new crearHechicero();
			break;
			case "Ogro": 
				fabrica = new crearOgro();
			break;	
			case "Rey": 
				fabrica = new crearRey();
			break;	
			case "Jinete": 
				fabrica = new crearJinete();
			break;	
			default:
				System.out.print("Error");
			}
			
		
			Escudo escudo = fabrica.crearEscudo();
			Arma arma = fabrica.crearArma();
			Cuerpo cuerpo = fabrica.crearCuerpo();
			arma.cargarArma();
			escudo.crearEscudo();
			cuerpo.crearCuerpo();
			Hombre hombre = fabrica.crearHombre();
			
			nombre.setText(opcion);
			nombre.setBounds(30, 100, 100, 40);
			JLabel imgArma = new JLabel(arma.mostrarArma());
			imgArma.setBounds(40, 150, 100, 100);
			this.getContentPane().add(imgArma);
			JLabel lblarma = new JLabel("ARMA");
			lblarma.setBounds(25, 130, 100, 30);
			this.getContentPane().add(lblarma);
			
			JLabel imgEscudo=new JLabel(escudo.mostrarEscudo());
			imgEscudo.setBounds(40, 300, 100, 100);
			this.getContentPane().add(imgEscudo);
			JLabel lblpro = new JLabel("PROTECCIÓN:");
			lblpro.setBounds(25, 270, 150, 30);
			this.getContentPane().add(lblpro);
			
			JLabel imgCuerpo=new JLabel(cuerpo.mostrarCuerpo());
			imgCuerpo.setBounds(250, 150, 100, 100);
			this.getContentPane().add(imgCuerpo);
			JLabel lblcuerpo = new JLabel("CUERPO:");
			lblcuerpo.setBounds(270, 130, 150, 30);
			this.getContentPane().add(lblcuerpo);
			
			JLabel lbl = new JLabel("");
			lblpro.setBounds(25, 270, 150, 30);
			this.getContentPane().add(lbl);
			this.getContentPane().add(fuerzalbl);
			this.getContentPane().add(resistencialbl);
			this.getContentPane().add(estrategialbl);
			this.getContentPane().add(cmb);
			this.getContentPane().add(nombre);
			
			fuerzalbl.setText("Fuerza: "+hombre.MostrarFuerza());
			resistencialbl.setText("Resistencia: "+hombre.MostrarResistencia());
			estrategialbl.setText("Estrategia: "+hombre.MostrarEstrategia());
			//hombrelbl.setBounds(250, 100, 200, 200);
			//System.out.println(info);
		}
	}
	
	public JComboBox<String> getCmb () {
		return cmb;
	}
	
}
