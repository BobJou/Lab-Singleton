package dio.gof;
/**
 * Instancia a classe dentro de outra classe
 * 
 * @author roger
 *
 */
public class Singletonholder {
	private static class Holder{
		public static Singletonholder instancia = new Singletonholder();
	}
	private Singletonholder() {
		super();
	}
	public static Singletonholder getInstancia(){
		return Holder.instancia;
	}
}
