package geointf;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Cria��o de objetos e chamadas de m�todos.
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
		
		JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo �: " + area1 + "\n"
											 + "A �rea do Quadrado �: " + area2 + "\n"	
											 + "A �rea da Circunfer�ncia �: " + area3 + "\n"
											 + "A �rea do Tri�ngulo �: " + area4 + "\n"
											 + "A �rea do Trap�zio �: " + area5);
		
	}
}
