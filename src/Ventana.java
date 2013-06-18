import java.awt.Color;
import javax.swing.JFrame;
import java.awt.color.*;


public class Ventana extends JFrame {
	
	final static Color BG=Color.green;
	final static Color FG=Color.BLUE;
		
	public Ventana(){
		this.init();
		this.setTitle("Calculador");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}
}
