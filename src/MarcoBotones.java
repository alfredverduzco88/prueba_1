import javax.swing.JFrame;

class MarcoBotones extends JFrame
{
	
	public MarcoBotones()
	{
		setTitle("ESTACIONAMIENTO : SAMAEL");
		Tablero tablero = new Tablero();
		add(tablero);
	}
}