import javax.swing.JFrame;

public class PantallaRegistrarSalida extends JFrame {
	
	public PantallaRegistrarSalida()
	{
		setTitle("Estacioamiento, la esquina");
		RegistrarSalida tablero = new RegistrarSalida();
		add(tablero);
		
	}
}