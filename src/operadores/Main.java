package operadores;

public class Main {

	public static void main(String[] args) {
		
		// USO DO OPERADOR TERNÁRIO 
		
		int a,b;
		
		a = 10;
		b = 70;
		String resultado = "";
		
	/*	if(a == b)
			resultado = "verdadeiro";
		else
			resultado = "falso"; */ 
		
	   resultado = (a==b) ? "Verdadeiro" : "falso";
		
		System.out.println("Resultado: " + resultado);
		
		
		String nome1 = "Clívisson";
		String nome2 = new String("Clívisson");
		
		System.out.println("Os nome são iguais? " + nome1.equals(nome2));
		
		

	}

}
