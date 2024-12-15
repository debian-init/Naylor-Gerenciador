package Main;

import java.awt.*;
import javax.swing.*;

public class Main {
	// Variável de instância para a janela
    private static JFrame Janela;
    
    public static void main(String[] args) {
        // Chama o método para criar a janela
        Janela();
        // Chama o método para adicionar os componentes
        Controler();
    }

    public static void Janela() {
        // Criando Interface Gráfica
        Janela = new JFrame("Naylor Gerenciador");
        Janela.setSize(250, 150); // Tamanho da janela
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Fechar ao clicar no X
    }
    
    
	public static void Controler() {
		// Criando o painel para entrada de dados
		JPanel Input = new JPanel();
		Input.setLayout(new FlowLayout());

		// Definindo limete de caracters
		JTextField Email = new JTextField(15);
		JTextField Passaword = new JTextField(15);
		
		// Fields
		Input.add(new JLabel("Email:"));
		Input.add(Email);
		Input.add(new JLabel("Passaword:"));
		Input.add(Passaword);

		// Adicionando o painel ao JFrame
		Janela.add(Input);

		// Tornar a janela visível
		Janela.setVisible(true);

	};
};

