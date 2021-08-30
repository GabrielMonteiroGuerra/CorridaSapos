package view;

import java.util.Random;
import controller.CorridaSapos;

public class Principal {

	public static void main(String[] args) {
		
		Random random = new Random();
		//Forma aleat�ria de gerar a distancia
		int Dist = random.nextInt((20) + 1)+ 30;
		//Forma aleat�ria de gerar o tamanho do pulo
		int pulo = random.nextInt((5) + 1)+ 5;
		
		System.out.println("Cada sapo ter� de percorrer " +Dist+ " metros "
				+"\nCada sapo consegue dar um pulo de at� "+ pulo+" metros\n");
		
		for (int sapo = 0; sapo < 5; sapo++) {
			Thread corrida = new CorridaSapos (sapo +1, Dist, pulo);
			corrida.start();
		}
	}

}
