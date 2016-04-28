package geointf;

import javax.swing.JOptionPane;

//Implementa a interface.
//O usuário não terá acesso a essa implementação
public class Circunferencia implements AreaCalculavel {

	private double raio;
	
	// Construtor que recebe o valor do atributo "raio" através de uma JOptionPane.
	public Circunferencia(){
		raio = Double.parseDouble(JOptionPane.showInputDialog("Informe qual é o raio da circunferência: "));
	}
	
	// Método que implementa a interface, apresentando a área da forma geométrica.
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
