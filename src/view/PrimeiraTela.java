package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Arrancada;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Color;		

public class PrimeiraTela extends JFrame {
	
	public JTextField txtPlacar1;
	public JTextField txtPlacar2;
	
	
	public JTextField getTxtPlacar1() {
		return txtPlacar1;
	}

	public void setTxtPlacar1(String txtPlacar1) {
		this.txtPlacar1.setName(txtPlacar1);
	}

	public JTextField getTxtPlacar2() {
		return txtPlacar2;
	}

	public void setTxtPlacar2(String txtPlacar2) {
		this.txtPlacar2.setName(txtPlacar2);
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeiraTela() {
		getContentPane().setLayout(null);
		
		JLabel lblCarro1 = new JLabel("Carro 1");
		lblCarro1.setForeground(Color.BLUE);
		lblCarro1.setBounds(10, 72, 46, 14);
		getContentPane().add(lblCarro1);
		
		JLabel lblCarro2 = new JLabel("Carro 2");
		lblCarro2.setForeground(Color.RED);
		lblCarro2.setBounds(10, 106, 46, 14);
		getContentPane().add(lblCarro2);
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setBounds(124, 162, 65, 14);
		getContentPane().add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setBounds(124, 187, 65, 14);
		getContentPane().add(lblPerdedor);
		
		txtPlacar1 = new JTextField();
		txtPlacar1.setBounds(222, 159, 86, 20);
		getContentPane().add(txtPlacar1);
		txtPlacar1.setColumns(10);
		
		txtPlacar2 = new JTextField();
		txtPlacar2.setBounds(222, 184, 86, 20);
		getContentPane().add(txtPlacar2);
		txtPlacar2.setColumns(10);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(10, 227, 89, 23);
		getContentPane().add(btnCorrer);
		
		JLabel label = new JLabel("________________________________________________________________");
		label.setBounds(10, 84, 466, 14);
		getContentPane().add(label);
		
		Arrancada carroController = new Arrancada(lblCarro1, lblCarro2, btnCorrer, txtPlacar1, txtPlacar2);
		
		JLabel lblChegada = new JLabel("Chegada!");
		lblChegada.setBounds(457, 84, 58, 14);
		getContentPane().add(lblChegada);
		btnCorrer.addActionListener(carroController); 
		
			
		
	}

}
