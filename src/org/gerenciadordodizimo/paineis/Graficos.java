package org.gerenciadordodizimo.paineis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta classe é responsavel por relatorios
 * visuais. 
 * 
 * */

public class Graficos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Graficos() {
		
		JLabel texto = new JLabel("Graficos");
		texto.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.add(texto);
		
		this.setBackground(new Color(220, 220, 250));
		
	}

}
