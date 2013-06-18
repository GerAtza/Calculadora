import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora2 extends Ventana implements Operaciones, MouseListener {
	
	private JTextField txt;
	private JLabel lbl;
	private JButton btnSuma,btnResta,btnMult,btnDiv;
	
	public Calculadora2(){
		
		
		this.setLayout(null);
		
		this.btnSuma=new JButton("+");
		this.btnSuma.setName("+");
		this.btnSuma.setBounds(400, 100, 50, 50);
		this.add(btnSuma);
		
		this.btnResta=new JButton("-");
		this.btnResta.setBounds(400, 160, 50, 50);
		this.add(btnResta);
		
		this.btnMult=new JButton("*");
		this.btnMult.setBounds(400, 220, 50, 50);
		this.add(btnMult);
		
		this.btnDiv=new JButton("/");
		this.btnDiv.setBounds(400, 280, 50, 50);
		this.add(btnDiv);
		
		this.txt=new JTextField();
		this.txt.setBounds(50, 100, 250, 50);
		this.add(txt);
		
		this.lbl=new JLabel("0");
		this.lbl.setBounds(50, 10, 250, 50);
		this.add(lbl);
		
	}

	@Override
	public float suma(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float resta(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float division(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float multiplicasion(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
