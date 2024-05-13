package argumentos;

import java.util.Locale;
import java.util.Scanner;

public class MainArgumentos {

	public static void main(String[] args) {
	/*	
		String nome = args[0];
		String idade = args[1];
		String altura = args[2];
		
		System.out.println("Olá meu nome é " + nome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Altura de " + altura); */
		
		
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		// a função scanner.next(); ler uma cadeia de caracteres, mas sem espaçoes em branco!
		
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite a sua altura: ");
		float altura = scanner.nextFloat();
		
		System.out.println("Olá meu nome é " + nome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("E minha altura é " + altura);
		
		scanner.close();
	}
	

}
