package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DifVent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	private int dificultad;

	/**
	 * Create the application.
	 */
	public DifVent() {
		initialize();

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

		JButton btnFACIL = new JButton("FACIL");
		btnFACIL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultad = 20;
				frame.dispose();

			}
		});
		btnFACIL.setBounds(44, 31, 111, 45);
		frame.getContentPane().add(btnFACIL);

		JButton btnNORMAL = new JButton("NORMAL");
		btnNORMAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultad = 10;
				frame.dispose();
			}
		});
		btnNORMAL.setBounds(282, 31, 111, 45);
		frame.getContentPane().add(btnNORMAL);

		JButton btnDIFICIL = new JButton("DIFICIL");
		btnDIFICIL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultad = 5;
				frame.dispose();
			}
		});
		btnDIFICIL.setBounds(44, 171, 111, 45);
		frame.getContentPane().add(btnDIFICIL);

		JButton btnIMPOSIBLE = new JButton("IMPOSIBLE");
		btnIMPOSIBLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificultad = 1;
				frame.dispose();
			}
		});
		btnIMPOSIBLE.setBounds(282, 171, 111, 45);
		frame.getContentPane().add(btnIMPOSIBLE);
	}

	public int getDificultad() {
		return dificultad;
	}
}
