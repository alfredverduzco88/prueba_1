
	import javax.swing.JFrame;

	public class PantallaCobrarBoleto extends JFrame {
		
		public PantallaCobrarBoleto()
		{
			setTitle("Estacioamiento, la esquina");
			CobrarBoleto tablero = new CobrarBoleto();
			add(tablero);
			
		}
	}

