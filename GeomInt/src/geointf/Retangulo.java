package geointf;

import javax.swing.JOptionPane;

//Implementa a interface.
//O usuário não terá acesso a essa implementação
public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	// Construtor que recebe os valores dos atributos "base" e "altura" através de uma JOptionPane.
	public Retangulo(){
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do retângulo: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retângulo: "));
	}
	
	// Método que implementa a interface, apresentando a área da forma geométrica.
	public double calcularArea() {
		return base * altura;
	}
}
