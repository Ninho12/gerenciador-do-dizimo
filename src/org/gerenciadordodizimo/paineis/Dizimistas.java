package org.gerenciadordodizimo.paineis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe responsavel pela administração dos dizimistas
 * 
 * */

public class Dizimistas extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Dizimistas() {
		// TODO Auto-generated constructor stub
		
		JLabel texto = new JLabel("Dizimistas");
		texto.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.add(texto);
		this.setBackground(new Color(220, 220, 250));
		
	}
	
	
	
}
