package projeto1;

public class Usuario {

	public static void main(String[] args) {
		
		SmarTv smarTv = new SmarTv();
		
		System.out.println("A TV estáa ligada? " + smarTv.ligado);
		System.out.println("Canal: " + smarTv.canal);
		System.out.println("Volume: "+ smarTv.volume);
		System.out.println(" ");
		
		smarTv.ligar();
		smarTv.abaixarVolume();
		smarTv.canal(40);
		
		System.out.println("A TV estáa ligada? " + smarTv.ligado);
		System.out.println("Canal: " + smarTv.canal);
		System.out.println("Volume: "+ smarTv.volume);
		System.out.println(" ");
		
		smarTv.aumentarVolume();
		smarTv.aumentarCanal();
		
		System.out.println("A TV estáa ligada? " + smarTv.ligado);
		System.out.println("Canal: " + smarTv.canal);
		System.out.println("Volume: "+ smarTv.volume);
		System.out.println(" ");
		
		smarTv.aumentarVolume();
		smarTv.diminuirCanal();
		
		System.out.println("A TV estáa ligada? " + smarTv.ligado);
		System.out.println("Canal: " + smarTv.canal);
		System.out.println("Volume: "+ smarTv.volume);
		

	}

}
