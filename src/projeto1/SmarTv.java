package projeto1;

public class SmarTv {

	
	int canal = 1;
	int volume = 25;
	boolean ligado = false;
	
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	
	public void canal(int canal) {
		this.canal = canal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void abaixarVolume() {
		volume--;
	}
	
	public void aumentarVolume() {
		volume++;
	}
}
