package geointf;

import javax.swing.JOptionPane;

//Implementa a interface.
//O usu�rio n�o ter� acesso a essa implementa��o
public class Circunferencia implements AreaCalculavel {

	private double raio;
	
	// Construtor que recebe o valor do atributo "raio" atrav�s de uma JOptionPane.
	public Circunferencia(){
		raio = Double.parseDouble(JOptionPane.showInputDialog("Informe qual � o raio da circunfer�ncia: "));
	}
	
	// M�todo que implementa a interface, apresentando a �rea da forma geom�trica.
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
