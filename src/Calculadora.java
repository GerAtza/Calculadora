import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora extends Ventana{
	
	private JButton suma;
	private JButton resta;
	private JButton division;
	private JButton multiplicasion;
	private JButton igual;
	
	private JTextField valor1;
	private JTextField valor2;
	private JTextField resultado;
	
	private JLabel operacion; 
	
	
	public Calculadora(){
		super();
		
		this.setLayout(null);
				
		valor1 =new JTextField();
		valor1.setBounds(20, 50, 100, 40);
		this.add(valor1);
		
		valor2 =new JTextField();
		valor2.setBounds(20, 140, 100, 40);
		this.add(valor2);
		
		operacion=new JLabel(" ");
		operacion.setBounds(150, 90, 100, 40);
		this.add(operacion);
		
		resultado =new JTextField();
		resultado.setBounds(190, 90, 150, 40);
		this.add(resultado);
				
		suma=new JButton("+");
		suma.setBounds(600, 50, 50, 40);
		suma.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				operacion.setText(suma.getText());
				
				String V1=valor1.getText();
				double r1=Double.parseDouble(V1);
				
				String V2=valor2.getText();
				double r2=Double.parseDouble(V2);
				
				double operacion=r1+r2;
				
				String respuesta=Double.toString(operacion);
				
				resultado.setText(respuesta);
				
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
		});
		this.add(suma);	
		
		resta=new JButton("-");
		resta.setBounds(600, 100, 50, 40);
		resta.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				operacion.setText(resta.getText());
				
				String V1=valor1.getText();
				double r1=Double.parseDouble(V1);
				
				String V2=valor2.getText();
				double r2=Double.parseDouble(V2);
				
				double operacion=r1-r2;
				
				String respuesta=Double.toString(operacion);
				
				resultado.setText(respuesta);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		this.add(resta);	
		
		division=new JButton("/");
		division.setBounds(600, 150, 50, 40);
		division.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				operacion.setText(division.getText());
				
				String V1=valor1.getText();
				double r1=Double.parseDouble(V1);
				
				String V2=valor2.getText();
				double r2=Double.parseDouble(V2);
				
				double operacion=r1/r2;
				
				String respuesta=Double.toString(operacion);
				
				resultado.setText(respuesta);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		this.add(division);	
		
		multiplicasion=new JButton("*");
		multiplicasion.setBounds(600, 200, 50, 40);
		multiplicasion.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				operacion.setText(multiplicasion.getText());
				
				String V1=valor1.getText();
				double r1=Double.parseDouble(V1);
				
				String V2=valor2.getText();
				double r2=Double.parseDouble(V2);
				
				double operacion=r1*r2;
				
				String respuesta=Double.toString(operacion);
				
				resultado.setText(respuesta);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		this.add(multiplicasion);
	}
}
