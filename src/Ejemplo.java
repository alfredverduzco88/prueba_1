import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Random;
import java.awt.event.*;


//import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo 
{
	public static void main( String args[] )
	{
		MarcoBotones aplicacion = new MarcoBotones();
		aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicacion.pack();
		aplicacion.setVisible(true);
	}

}




	