package geointf;

import javax.swing.JOptionPane;

//Implementa a interface.
//O usu�rio n�o ter� acesso a essa implementa��o
public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	// Construtor que recebe os valores dos atributos "base" e "altura" atrav�s de uma JOptionPane.
	public Retangulo(){
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do ret�ngulo: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do ret�ngulo: "));
	}
	
	// M�todo que implementa a interface, apresentando a �rea da forma geom�trica.
	public double calcularArea() {
		return base * altura;
	}
}
