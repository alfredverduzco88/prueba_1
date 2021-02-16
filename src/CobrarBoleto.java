
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

	import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


	public class CobrarBoleto  extends JPanel{

		private static final long serialVersionUID = 1L;
		private JPanel panel;
		private JPanel panelEspacioLogo;
		private JButton logo;
		Dimension tamaño = new  Dimension(700,500); //tamanio de el panel de trabajo
		Dimension tamañoEspacioLogo = new  Dimension(700,170); //tamanio de el panel de trabajo
		Date cal =Calendar.getInstance().getTime();
		private JButton boton;
		private JButton boton2;
		Color colorazul=new Color(8, 75, 138);
		
		public CobrarBoleto()
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
			
			
			JLabel folio= new JLabel("Ingrese el NO de Folio: ");
			folio.setHorizontalAlignment(JLabel.LEFT);
			folio.setFont(new Font("Verdana", Font.BOLD, 16));
			folio.setForeground(colorazul);
			panel.add(folio, BorderLayout.AFTER_LINE_ENDS);
			
			final JTextField folioText= new JTextField(30);
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
			panel.add(boton, BorderLayout.CENTER);
			
			final JLabel mensajeSalida= new JLabel("");
			mensajeSalida.setHorizontalAlignment(JLabel.LEFT);
			mensajeSalida.setFont(new Font("Verdana", Font.BOLD, 16));
			mensajeSalida.setForeground(colorazul);
			panel.add(mensajeSalida, BorderLayout.SOUTH);
		
			
			boton2 = new JButton("Guardar");		
			tamaño = new  Dimension(200,60); 
			boton2.setPreferredSize(tamaño);
			boton2.setFont(new Font("Verdana", Font.BOLD, 16));
			boton2.setForeground(Color.WHITE);
			boton2.setBackground(colorazul);
			panel.add(boton2, BorderLayout.CENTER);
		
		
			panel.setBackground(Color.WHITE);
			add(panel,BorderLayout.CENTER);
			
			boton2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evento)
				{

			Window w = SwingUtilities.getWindowAncestor(CobrarBoleto.this);
		       w.setVisible(false);
				}
			}
			);
			
			boton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evento)
				{
					System.out.println("registra la hora de salida del auto");
					String x= folioText.getText();
					System.out.println(x);
					Boleto nuevoBoleto= new Boleto(x);
					Boleto folio1 = new Boleto(x);
					//nuevoBoleto.cobrarBoleto();
					Estacionamiento.cobrarBoleto(x);
					mensajeSalida.setText(Estacionamiento.cobrarBoleto(x));
					
					//Estacionamiento.RegistrarSalida();
					
					
					
				}
			});
			
		}
	}

