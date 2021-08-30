package view;

import java.util.Random;
import controller.CorridaSapos;

public class Principal {

	public static void main(String[] args) {
		
		Random random = new Random();
		//Forma aleatória de gerar a distancia
		int Dist = random.nextInt((20) + 1)+ 30;
		//Forma aleatória de gerar o tamanho do pulo
		int pulo = random.nextInt((5) + 1)+ 5;
		
		System.out.println("Cada sapo terá de percorrer " +Dist+ " metros "
				+"\nCada sapo consegue dar um pulo de até "+ pulo+" metros\n");
		
		for (int sapo = 0; sapo < 5; sapo++) {
			Thread corrida = new CorridaSapos (sapo +1, Dist, pulo);
			corrida.start();
		}
	}

}
