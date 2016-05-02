package geointf;

import javax.swing.JOptionPane;

    /* Implementa a interface. 
     * O usu�rio n�o ter� acesso a essa implementa��o
     */
public class Trapezio implements AreaCalculavel {
	
	private double altura, baseMaior, baseMenor;
	
	/* Construtor que recebe os valores dos atributos "baseMaior", 
	 * "baseMenor e "altura" atrav�s de uma JOptionPane.
	 */
	public Trapezio(){
		altura = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a altura do trap�zio: "));
		baseMaior = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a base maior do trap�zio: "));
		baseMenor = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a base menor do trap�zio: "));
	}
	
	/* M�todo que implementa a interface,
	 *  apresentando a �rea da forma geom�trica.
	 */
	public double calcularArea() {
		return ((baseMaior + baseMenor) / 2) * altura;
	}
}
