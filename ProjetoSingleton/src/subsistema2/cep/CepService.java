package subsistema2.cep;

public class CepService {
		private static CepService cepApi = new CepService();
		private CepService() {
			super();
		}
		public static CepService getInstancia() {
			return cepApi;
		}
		
		
		public String recuperarCidade(String cep) {
			return "Contagem";
			
		}
		public String recuperarEstado(String cep) {
			return  "Minas Gerais";
		}
}
