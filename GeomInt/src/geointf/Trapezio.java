package geointf;

import javax.swing.JOptionPane;

    /* Implementa a interface. 
     * O usuário não terá acesso a essa implementação
     */
public class Trapezio implements AreaCalculavel {
	
	private double altura, baseMaior, baseMenor;
	
	/* Construtor que recebe os valores dos atributos "baseMaior", 
	 * "baseMenor e "altura" através de uma JOptionPane.
	 */
	public Trapezio(){
		altura = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a altura do trapêzio: "));
		baseMaior = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a base maior do trapêzio: "));
		baseMenor = Double.parseDouble(JOptionPane.showInputDialog
				("Informe a base menor do trapêzio: "));
	}
	
	/* Método que implementa a interface,
	 *  apresentando a área da forma geométrica.
	 */
	public double calcularArea() {
		return ((baseMaior + baseMenor) / 2) * altura;
	}
}
