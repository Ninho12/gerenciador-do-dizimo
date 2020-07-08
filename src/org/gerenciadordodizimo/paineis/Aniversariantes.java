package org.gerenciadordodizimo.paineis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta classe é responsavel pelo dizimistas aniversariantes 
 * da comunidade.
 * 
 * */

public class Aniversariantes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Aniversariantes() {
		// TODO Auto-generated constructor stub
		
		JLabel texto = new JLabel("Aniversariantes");
		texto.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.add(texto);
		this.setBackground(new Color(220, 220, 250));
		
	}
	
	

}
