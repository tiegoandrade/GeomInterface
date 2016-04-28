package geointf;

import javax.swing.JOptionPane;

//Implementa a interface.
//O usuário não terá acesso a essa implementação
public class Triangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	// Construtor que recebe os valores dos atributos "base" e "altura" através de uma JOptionPane.
	public Triangulo(){
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
	}
	
	// Método que implementa a interface, apresentando a área da forma geométrica.
	public double calcularArea() {
		return (base * altura)/2;
	}
}
