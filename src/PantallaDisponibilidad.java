import javax.swing.JFrame;
public class PantallaDisponibilidad extends JFrame{
	

		public PantallaDisponibilidad()
		{
			setTitle("Estacioamiento, la esquina");
			Disponibilidad tablero = new Disponibilidad();
			add(tablero);
			
		}


	}



