package tratamentoDeExcecoes;


import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;


public class Excecoes {

	public static void main(String[] args) {
		
		try {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		
		System.out.println("Olá meu nome é " + nome + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("E minha altura é " + altura);
		
		} catch(InputMismatchException e) {
			System.out.println("Digte numeros em idade e altura não textos!");
		}
	};

}
