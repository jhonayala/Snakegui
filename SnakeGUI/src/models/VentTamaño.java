package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentTamaño {

	private JFrame frame;
	private int Lado1;
	private int Lado2;
	private JTextField Textlado1;
	private JTextField Textlado2;
	private boolean Visible;
	
	

	/**
	 * Create the application.
	 */
	public VentTamaño() {
		initialize();
		
	}
public void TamVisible() {
	Visible=true;
	frame.setVisible(true);
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Textlado1 = new JTextField();
		Textlado1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Textlado1.setHorizontalAlignment(SwingConstants.CENTER);
		Textlado1.setBounds(33, 90, 124, 33);
		frame.getContentPane().add(Textlado1);
		Textlado1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TAMA\u00D1O DEL MAPA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 10, 141, 23);
		frame.getContentPane().add(lblNewLabel);
		
		Textlado2 = new JTextField();
		Textlado2.setHorizontalAlignment(SwingConstants.CENTER);
		Textlado2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Textlado2.setColumns(10);
		Textlado2.setBounds(256, 90, 124, 33);
		frame.getContentPane().add(Textlado2);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lado1=Integer.parseInt(Textlado1.getText());
			Lado2=Integer.parseInt(Textlado2.getText());
			Visible=false;
			frame.dispose();
			}
		});
		btnGuardar.setBounds(157, 158, 85, 21);
		frame.getContentPane().add(btnGuardar);
		}
	public boolean getVisible() {
		if(Visible=false) {
		return false;}
		else
			return true;
	}
		public int getLado1(){
			
			return Lado1;
			
		}
		public int getLado2() {
			
			return Lado2;
		}
		
}
