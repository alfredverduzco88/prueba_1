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


class Disponibilidad extends JPanel
{
	
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
	public Disponibilidad()
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
		
		boton = new JButton("Mostrar");		
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
		
		panel.setBackground(Color.WHITE);
		add(panel,BorderLayout.CENTER);
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evento)
			{
				System.out.println("Aqui se registra el nuevo boleto y se agrega a estacionamiento");
				String x= modeloText.getText();
				//String Folio2=folioText.getText();
				System.out.println(x);
				Boleto nuevoBoleto= new Boleto(x);
				//Boleto folio = new Boleto(Folio2);
				//Estacionamiento.dispinibilidad();
				mensajeSalida.setText(Estacionamiento.dispinibilidad());
				
				//folioText.setText(nuevoBoleto.getFolio());
				
				
			}
			
			
		});
		
	}

	
		
		
	
	
	
	
}