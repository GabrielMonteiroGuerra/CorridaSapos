package controller;

import java.util.Random;

public class CorridaSapos extends Thread{ //Extendendo a classe para Thread
	
	private int sapo; //Variável sapo
	private int maxiDist; //Variável distancia máxima
	private int maxiPulo; //Variável pulo
	static int posicao; //Variável posição
	
	public CorridaSapos (int sapo, int maxiDist, int maxiPulo) { //Método "this" para todas as variáveis
		this.sapo = sapo;
		this.maxiDist = maxiDist;
		this.maxiPulo = maxiPulo;
	}
	@Override
	public void run() { //Tudo que estiver dentro do método run será executado
		Random random = new Random();
		int dist = 0;
		int pulo = 0;
		String result = "";
		while (dist < maxiDist) { //Enquanto a distancia for menor que a distancia máxima, o sapo vai pulando
		    pulo = random.nextInt(maxiPulo);
		    dist = dist + pulo;
		    System.out.println("O sapo " + sapo+ " pulou" +pulo+ " metros, e agora percorreu "+dist+" metros");
	}
	posicao++;
	result += ("\nO sapo "+sapo+" chegou em "+ posicao+ "º lugar");
	try {
		sleep (sapo * 100);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(result);
	
}
}
