package geointf;

import javax.swing.JOptionPane;

    /* Implementa a interface.
     * O usu�rio n�o ter� acesso a essa implementa��o
     */
public class Quadrado implements AreaCalculavel {
	private double lado;
	
	/* Construtor que recebe o valor do 
	 * atributo "lado" atrav�s de uma JOptionPane.
	 */
	public Quadrado(){
		lado = Double.parseDouble(JOptionPane.showInputDialog
				("Informe o lado do quadrado: "));
	}
	
	/* M�todo que implementa a interface, 
	 * apresentando a �rea da forma geom�trica. 
	 */
	public double calcularArea() {
		return lado * lado;
	}
}
