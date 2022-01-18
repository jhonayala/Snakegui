package models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyButtonListener implements ActionListener {

	private MySnakeFrame snakeFrame;
	private TableroJuego tablero;
	private JLabel puntos;
	private int dificultad;
	
	
	public MyButtonListener(MySnakeFrame sf, TableroJuego t) {
		snakeFrame = sf;
		tablero = t;
		
	}
	public MyButtonListener(MySnakeFrame x,int y) {
		snakeFrame=x;
		dificultad=y;
		
		
	}
	
	public int actiondificult(ActionEvent x) {
		return dificultad;
		}
		
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (((JButton)ae.getSource()).getText() == "Start") {
			snakeFrame.empezarDeNuevo();
			tablero.requestFocus();			
		} else { //Botón de pausar
			snakeFrame.pausaContinuaJuego();
			tablero.requestFocus();
		}
	}

}
