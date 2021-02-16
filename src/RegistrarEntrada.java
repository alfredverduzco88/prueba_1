import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


class RegistrarEntrada extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2507086275170766381L;
	private JPanel panel;
	private JPanel panelEspacioLogo;
	private JButton logo;
	Dimension tamaño = new  Dimension(700,500); //tamanio de el panel de trabajo
	Dimension tamañoEspacioLogo = new  Dimension(700,170); //tamanio de el panel de trabajo
	Date cal =Calendar.getInstance().getTime();
	private JButton boton;
	private JButton boton2;
	Color colorazul=new Color(8, 75, 138);
	@SuppressWarnings("deprecation")
	public RegistrarEntrada()
	{
		FlowLayout miFlowLayout = new FlowLayout( FlowLayout.CENTER,5,5 );
		//Crear el panel para manejar el tablero 
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
		
		
		JLabel modelo= new JLabel("Modelo del auto:");
		modelo.setHorizontalAlignment(JLabel.LEFT);
		modelo.setFont(new Font("Verdana", Font.BOLD, 16));
		modelo.setForeground(colorazul);
		panel.add(modelo, BorderLayout.AFTER_LINE_ENDS);
		
		 final JTextField modeloText= new JTextField(15);
		modeloText.setHorizontalAlignment(JLabel.LEFT);
		modeloText.setFont(new Font("Verdana", Font.ITALIC, 16));
		modeloText.setForeground(Color.BLACK);
		panel.add(modeloText, BorderLayout.BEFORE_FIRST_LINE);
		
		JLabel folio= new JLabel("Folio:");
		folio.setHorizontalAlignment(JLabel.LEFT);
		folio.setFont(new Font("Verdana", Font.BOLD, 16));
		folio.setForeground(colorazul);
		panel.add(folio, BorderLayout.AFTER_LINE_ENDS);
		
		final JTextField folioText= new JTextField(15);
		folioText.setHorizontalAlignment(JLabel.LEFT);
		folioText.setFont(new Font("Verdana", Font.ITALIC, 16));
		folioText.setForeground(Color.BLACK);
		panel.add(folioText, BorderLayout.AFTER_LINE_ENDS);
		
		boton = new JButton("Guardar");		
		tamaño = new  Dimension(200,60); 
		boton.setPreferredSize(tamaño);
		boton.setFont(new Font("Verdana", Font.BOLD, 16));
		boton.setForeground(Color.WHITE);
		boton.setBackground(colorazul);
		panel.add(boton, BorderLayout.SOUTH);
		
		final JLabel mensajeSalida= new JLabel("");
		mensajeSalida.setHorizontalAlignment(JLabel.LEFT);
		mensajeSalida.setFont(new Font("Verdana", Font.BOLD, 16));
		mensajeSalida.setForeground(colorazul);
		panel.add(mensajeSalida, BorderLayout.CENTER);
		
		
		boton2 = new JButton("Salir");		
		tamaño = new  Dimension(200,60); 
		boton2.setPreferredSize(tamaño);
		boton2.setFont(new Font("Verdana", Font.BOLD, 16));
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(colorazul);
		panel.add(boton2, BorderLayout.WEST);

		/*
		 JLabel boleto= new JLabel("No de boleto:");
			boleto.setHorizontalAlignment(JLabel.LEFT);
			boleto.setFont(new Font("Verdana", Font.BOLD, 16));
			boleto.setForeground(colorazul);
			panel.add(boleto, BorderLayout.AFTER_LINE_ENDS);
			
			
			
            // aqui modificamos el codigo
			JTextField boletoTexto= new JTextField(20);
			 boletoTexto.setHorizontalAlignment(JLabel.LEFT);
				boletoTexto.setFont(new Font("Verdana", Font.ITALIC, 16));
				boletoTexto.setForeground(Color.CYAN);
				boletoTexto.disable();
				
			panel.add(boletoTexto, BorderLayout.AFTER_LINE_ENDS);
			
			 boletoTexto.setText(boleto2());
				boton = new JButton("Salir");		
				tamaño = new  Dimension(200,85); 
				boton.setPreferredSize(tamaño);
				boton.setFont(new Font("Verdana", Font.BOLD, 16));
				boton.setForeground(Color.DARK_GRAY);
				boton.setBackground(colorazul);
				panel.add(boton, BorderLayout.SOUTH);
			
			   */
		panel.setBackground(Color.WHITE);
		add(panel,BorderLayout.CENTER);
		boton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{

		Window w = SwingUtilities.getWindowAncestor(RegistrarEntrada.this);
	       w.setVisible(false);
			}
		}
		);
		
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				System.out.println("Aqui se registra el nuevo boleto y se agrega a estacionamiento");
				String x= modeloText.getText();
				System.out.println(x);
				Boleto nuevoBoleto= new Boleto(x);
				//Estacionamiento.registrarEntrada(nuevoBoleto);
				folioText.setText(nuevoBoleto.getFolio());
			    mensajeSalida.setText(Estacionamiento.registrarEntrada(nuevoBoleto));
				//Window w = SwingUtilities.getWindowAncestor(RegistrarEntrada.this);
			      // w.setVisible(false);
				
			}
			
			
		}
		);
		
	}
	
	
		
		
	
	
	
	
}