/**
 * Esta clase est� dedicada a implementar los m�todos de resta necesarios para implementar una series de clase que compongan una calculadora.
 * Cada clase que compone los m�todos de resta est�n documentados para poder instruirse en caso de necesitar informaci�n del m�todo. 
 * @author Franco Pellizzari
 * @version version 1.0
 *
 */

public class Resta {

	/** M�todo que calcula la diferencia entre dos n�meros reales.
	 * La diferencia se obtiene restando los n�meros en el orden que se hayan introducido.
	 * 
	 * @param dos n�meros reales de los cuales se desea obtener la diferencia.
	 * @return un n�mero que ser� el resultado de la resta.
	 */
	  
	public double resta1(double numero) {
		double resultado = 0;
		//Inicializo a 0 para que no me de error.
		return resultado;
		}
	
	/**
	 * M�todo que calcula la diferencia entre dos n�meros enteros..
	 * La diferencia se obtiene restando los n�meros en el orden que se hayan introducido.
	 * En caso de que se ingresen n�meros con decimales, la clase dar� error. 
	 * @param dos n�meros enteros de los cuales se desea obtener la diferencia.
	 * @return devolver� un n�mero entero que ser� el resultado de la resta.
	 */
	public int resta2(int numero) {
		int resultado = 0;
				//Inicializo a 0 para que no me de error
				return resultado; 
	    }
	
	/** M�todo que calcula la diferencia entre 3 n�meros reales.
	 * La diferencia se obtiene restando los n�meros en el orden que se hayan introducido.
	 * 
	 * @param tres n�meros reales de los cuales se desea obtener la diferencia.
	 * @return un n�mero que ser� el resultado de la resta.
	 */
	  
	public double restaVersion1(double numero) {
		double resultado = 0;
		//Inicializo a 0 para que no me de error
		return resultado;
		}
	
	/** 
	 * Este m�todo resta el valor inicial de la variable "acumulado" (2000). Se ingresar� un n�mero real, cada vez que se ejecute el m�todo
	 * se restar� el numero ingresado al valor de la variable. Este m�todo permite que el valor acumulado se guarde como una propiedad 
	 * durante toda la clase. 
	 * 
	 * @param un solo n�mero real que se utilizar� para restar a la variable.
	 * 
	 * @return devolver� el resultado de la resta cada vez que se utilice el m�todo guardandose el valor tras cada resta realizada. 
	 */

	 // Este comentario es para probar Git
	
	public double restaValorAcumulado(double numero) {
		// Inicializo la variable "acumulado" para que no salte ning�n error. 
		double acumulado = 2000;
		acumulado = acumulado - numero;

		return acumulado;

	    } 

}

