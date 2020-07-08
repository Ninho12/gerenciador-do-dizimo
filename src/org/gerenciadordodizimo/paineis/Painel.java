package org.gerenciadordodizimo.paineis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta classe será responsavel pelo painel 
 * inicial do Gerenciador do Dizimo.
 * 
 * */

public class Painel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public Painel() {
		
		JLabel texto = new JLabel("Painel");
		texto.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.setLayout(new FlowLayout());
		this.add(texto);
		
		this.setBackground(new Color(220, 220, 250));
		
		
	}

}
