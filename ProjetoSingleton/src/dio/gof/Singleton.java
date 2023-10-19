package dio.gof;

/**
 * Singleton "preguiçoso"
 * não cria a instnacia dele mesmo
 * o usuario tem que criar
 * 
 * 
 * @author roger
 *
 */

public class Singleton {
	private static Singleton instancia;
	private Singleton() {
		super();
	}
	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
