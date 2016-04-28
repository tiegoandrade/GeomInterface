package geointf;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Criação de objetos e chamadas de métodos.
		AreaCalculavel r1 = new Retangulo();
		double area1 = r1.calcularArea();
		
		AreaCalculavel q1 = new Quadrado();
		double area2 = q1.calcularArea();
		
		AreaCalculavel c1  = new Circunferencia();
		double area3 = c1.calcularArea();
		
		AreaCalculavel t1  = new Triangulo();
		double area4 = t1.calcularArea();
		
		AreaCalculavel tr1  = new Trapezio();
		double area5 = tr1.calcularArea();
		
		JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area1 + "\n"
											 + "A área do Quadrado é: " + area2 + "\n"	
											 + "A área da Circunferência é: " + area3 + "\n"
											 + "A área do Triângulo é: " + area4 + "\n"
											 + "A área do Trapézio é: " + area5);
		
	}
}
