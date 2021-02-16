import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Tablero extends JPanel
{
	
	private JPanel panel;
	private JPanel panelEspacioLogo;
	Boleto [] estacionamiento= new Boleto[50]; // Aqui se declara el arreglo de 50
	private JButton logo;
	Dimension tamaño = new  Dimension(700,500); //tamanio de el panel de trabajo
	Dimension tamañoEspacioLogo = new  Dimension(700,170); //tamanio de el panel de trabajo
	Date cal =Calendar.getInstance().getTime();
	private JButton boton;
	private JButton botonSalida;
	private JButton botonCobroBoleto;
	private JButton botonDisponibilidad;
	Color colorazul=new Color(8, 75, 138);
	public Tablero()
	{
		//creación de paneles
		FlowLayout miFlowLayout = new FlowLayout( FlowLayout.CENTER,5,5 );
		panel = new JPanel();
		panelEspacioLogo=new JPanel();
		panelEspacioLogo.setLayout(miFlowLayout);
		//Asignarle tamaño a los paneles
		panel.setPreferredSize(tamaño);
		panelEspacioLogo.setPreferredSize(tamañoEspacioLogo);
		panelEspacioLogo.setLocation(0,0);
		//Agregar panel de logo al panel principal
		panel.add(panelEspacioLogo,BorderLayout.LINE_START);

		// Agregar logo a la pantalla    
		logo=new JButton(new ImageIcon(getClass().getResource("img/" +"logo.jpg")));
		tamaño = new  Dimension(150,150); 
		logo.setPreferredSize(tamaño);
		logo.setLocation(50, 0);
		panelEspacioLogo.add(logo,BorderLayout.LINE_START);
		
		//Formato para agregar etiqueta
		JLabel titulo= new JLabel("Mi estacionamiento");
		titulo.setHorizontalAlignment(JLabel.LEFT);
		titulo.setFont(new Font("Verdana", Font.BOLD, 16));
		titulo.setForeground(colorazul);
		panelEspacioLogo.add(titulo, BorderLayout.CENTER);
		
		//Agregar la hora
		String hr="Hora: " +cal.getHours() + ":" + cal.getMinutes() + ":" + cal.getSeconds();
		JLabel hora= new JLabel(hr);
		hora.setHorizontalAlignment(JLabel.LEFT);
		hora.setFont(new Font("Verdana", Font.BOLD, 16));
		hora.setForeground(colorazul);
		panelEspacioLogo.add(hora, BorderLayout.AFTER_LINE_ENDS);
	
		//Agregar botón Registrar entrada
		boton = new JButton("Registrar entrada");		
		tamaño = new  Dimension(200,80); 
		boton.setPreferredSize(tamaño);
		boton.setFont(new Font("Verdana", Font.BOLD, 16));
		boton.setForeground(Color.WHITE);
		boton.setBackground(colorrojo);
		panel.add(boton, BorderLayout.CENTER);
		
		//Agregar botón Registrar salida
		botonSalida = new JButton("Registrar salida");		
		tamaño = new  Dimension(200,80); 
		botonSalida.setPreferredSize(tamaño);
		botonSalida.setFont(new Font("Verdana", Font.BOLD, 16));
		botonSalida.setForeground(Color.WHITE);
		botonSalida.setBackground(colorazul);
		panel.add(botonSalida, BorderLayout.CENTER);

		//Agregar botón Cobro de boleto
		botonCobroBoleto = new JButton("Cobro de boleto");		
		tamaño = new  Dimension(200,80); 
		botonCobroBoleto.setPreferredSize(tamaño);
		botonCobroBoleto.setFont(new Font("Verdana", Font.BOLD, 16));
		botonCobroBoleto.setForeground(Color.WHITE);
		botonCobroBoleto.setBackground(colorazul);
		panel.add(botonCobroBoleto, BorderLayout.CENTER);
		
		//Agregar botón Disponibilidad
		botonDisponibilidad = new JButton("Disponibilidad");		
		tamaño = new  Dimension(200,80); 
		botonDisponibilidad.setPreferredSize(tamaño);
		botonDisponibilidad.setFont(new Font("Verdana", Font.BOLD, 16));
		botonDisponibilidad.setForeground(Color.WHITE);
		botonDisponibilidad.setBackground(colorazul);
		panel.add(botonDisponibilidad, BorderLayout.CENTER);
		
		panel.setBackground(Color.WHITE);
		add(panel,BorderLayout.CENTER);
		
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				//realizar aqui las validaciones del juego
			System.out.println("boton de entrada");
			PantallaRegistrarEntrada aplicacion = new PantallaRegistrarEntrada();
			aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			aplicacion.pack();
			aplicacion.setVisible(true);
		//	estacionamiento=RegistrarEntrada.estacionamiento;
		
					
			}
		});
		
		botonSalida.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				//realizar aqui las validaciones del juego
			System.out.println("Boton de salida");
			PantallaRegistrarSalida aplicacion = new PantallaRegistrarSalida();
			aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			aplicacion.pack();
			aplicacion.setVisible(true);
			
					
			}
		});
		
		botonCobroBoleto.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				//realizar aqui las validaciones del juego
			System.out.println("Boton de cobro de boleto");
			PantallaCobrarBoleto aplicacion = new PantallaCobrarBoleto();
			aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			aplicacion.pack();
			aplicacion.setVisible(true);
			}
		});
		
		botonDisponibilidad.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				//realizar aqui las validaciones del juego
			System.out.println("Boton de disponibilidad");
			PantallaDisponibilidad aplicacion = new PantallaDisponibilidad();
			aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			aplicacion.pack();
			aplicacion.setVisible(true);
					
			}
		});
		
		
	}
	
	
	
}
