package geointf;

import javax.swing.JOptionPane;

    /* Implementa a interface.
     * O usuário não terá acesso a essa implementação
     */
public class Quadrado implements AreaCalculavel {
	private double lado;
	
	/* Construtor que recebe o valor do 
	 * atributo "lado" através de uma JOptionPane.
	 */
	public Quadrado(){
		lado = Double.parseDouble(JOptionPane.showInputDialog
				("Informe o lado do quadrado: "));
	}
	
	/* Método que implementa a interface, 
	 * apresentando a área da forma geométrica. 
	 */
	public double calcularArea() {
		return lado * lado;
	}
}
