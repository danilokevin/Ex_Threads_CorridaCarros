package controller;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;  
import javax.swing.JButton; 
import javax.swing.JLabel;
import javax.swing.JTextField;  

public class Arrancada implements ActionListener {
	
	private JLabel lblCarro1;  
	private JLabel lblCarro2;  
	private JButton btnCorrer; 
	private JTextField txtPlacar1;
	private JTextField txtPlacar2;
	
	
	public Arrancada(JLabel lblCarro1, JLabel lblCarro2, JButton btnCorrer, JTextField txtPlacar1, JTextField txtPlacar2){
		this.lblCarro1 = lblCarro1;
		this.lblCarro2 = lblCarro2;
		this.btnCorrer = btnCorrer;
		this.txtPlacar1 = txtPlacar1;
		this.txtPlacar2 = txtPlacar2;
		
	}
	
	public void botaoCarrinho(){
		Thread t1 = new ThreadCarro(lblCarro1, btnCorrer, txtPlacar1, txtPlacar2);   
		Thread t2 = new ThreadCarro(lblCarro2, btnCorrer, txtPlacar1, txtPlacar2);
		t1.start();   
		t2.start(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botaoCarrinho();
		
	}

}
