package controller;

import java.util.Random;

public class CorridaSapos extends Thread{ //Extendendo a classe para Thread
	
	private int sapo; //Vari�vel sapo
	private int maxiDist; //Vari�vel distancia m�xima
	private int maxiPulo; //Vari�vel pulo
	static int posicao; //Vari�vel posi��o
	
	public CorridaSapos (int sapo, int maxiDist, int maxiPulo) { //M�todo "this" para todas as vari�veis
		this.sapo = sapo;
		this.maxiDist = maxiDist;
		this.maxiPulo = maxiPulo;
	}
	@Override
	public void run() { //Tudo que estiver dentro do m�todo run ser� executado
		Random random = new Random();
		int dist = 0;
		int pulo = 0;
		String result = "";
		while (dist < maxiDist) { //Enquanto a distancia for menor que a distancia m�xima, o sapo vai pulando
		    pulo = random.nextInt(maxiPulo);
		    dist = dist + pulo;
		    System.out.println("O sapo " + sapo+ " pulou" +pulo+ " metros, e agora percorreu "+dist+" metros");
	}
	posicao++;
	result += ("\nO sapo "+sapo+" chegou em "+ posicao+ "� lugar");
	try {
		sleep (sapo * 100);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(result);
	
}
}
