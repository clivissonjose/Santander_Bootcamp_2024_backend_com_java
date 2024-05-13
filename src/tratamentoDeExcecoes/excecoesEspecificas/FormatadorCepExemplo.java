package tratamentoDeExcecoes.excecoesEspecificas;

public class FormatadorCepExemplo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			String cep = formatarCep("2374787");
			System.out.println(cep);
		} catch (CepInvalidoException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("O cep não possui 8 dígitos");
		}

	}
	
	static String formatarCep(String cep)  throws CepInvalidoException{
			
			if(cep.length() != 8) {
			   throw new CepInvalidoException();
			}
			
			return "23.674-787";
	}

}
