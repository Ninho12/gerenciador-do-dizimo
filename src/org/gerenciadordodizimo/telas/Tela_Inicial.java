package org.gerenciadordodizimo.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.gerenciadordodizimo.paineis.Aniversariantes;
import org.gerenciadordodizimo.paineis.Dizimistas;
import org.gerenciadordodizimo.paineis.Graficos;
import org.gerenciadordodizimo.paineis.Painel;
import org.gerenciadordodizimo.paineis.Prestacao_de_Conta;

public class Tela_Inicial extends JFrame{

	
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	public JTabbedPane abas;

	public Tela_Inicial() {
		
		inicializarComponentes();
		
		setTitle("Gerenciador do Dizimo");
		
		setResizable(true);
		setSize(900, 700);
		setLocation(100, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void inicializarComponentes() {
		
		// Conficurando as Abas
		abas = new JTabbedPane();
		abas.setFont(new Font("Arial", Font.BOLD, 20));
		abas.setBackground(Color.WHITE);
		
		
		// Adicionando Abas
		abas.add(new Painel(), "Painel");
		abas.add(new Dizimistas(), "Dizimistas");
		abas.add(new Prestacao_de_Conta(), "Prestação de Conta");
		abas.add(new Aniversariantes(), "Aniversariantes");
		abas.add(new Graficos(), "Graficos");
		
		// Adicionando as abas na janela
		this.setLayout(new BorderLayout());
		this.add( BorderLayout.CENTER, abas);
	
	}

	
}
