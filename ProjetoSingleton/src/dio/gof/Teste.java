package dio.gof;

import Facade.Facade;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressimo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		
		/**
		 * 
		 * Singleton
		 */
		Singleton lazy = Singleton.getInstancia();
		System.out.println(lazy);
		SingletonAprss apress = SingletonAprss.getInstancia();
		System.out.println(apress);
		Singletonholder holder = Singletonholder.getInstancia();
		System.out.println(holder);
		
		
		
		/**
		 * Strategy
		 */
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoAgressimo();
		Comportamento agressivo = new ComportamentoDefensivo();
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		
		
		/**
		 * 
		 * Facade
		 */
		Facade facade = new Facade();
		facade.migrarCliente("Roger", "32.341-140");
		
	}
	
}
