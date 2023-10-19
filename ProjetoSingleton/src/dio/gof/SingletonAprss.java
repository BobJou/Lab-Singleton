package dio.gof;
/**
 * cria uma instancia já no seu início e não verifica
 * se é nula
 * 
 * 
 * @author roger
 *
 */
public class SingletonAprss {

		private static SingletonAprss instancia = new SingletonAprss();
				
		
		private SingletonAprss() {
			super();
		}
		public static SingletonAprss getInstancia() {
			return instancia;
		}
}
