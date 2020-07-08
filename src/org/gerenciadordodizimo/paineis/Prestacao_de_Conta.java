package org.gerenciadordodizimo.paineis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  Prestação de Conta é uma classe responsavel pela 
 *  prestação de conta da comunidade.
 * 
 * */

public class Prestacao_de_Conta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Prestacao_de_Conta() {
		// TODO Auto-generated constructor stub
		
		JLabel texto = new JLabel("Prestação de Conta");
		texto.setFont(new Font("Arial", Font.BOLD, 25));
		
		this.add(texto);
		
		this.setBackground(new Color(220, 220, 250));
		
	}

}
