package com.br.xercicioNumeroSorteado;

import java.util.Random;
import java.util.Scanner;

public class AppNumerosAleatorios {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);

		int numeroDigitado;
		int vida;

		for (vida = 10; vida > 0; vida--) {
			System.out.println("Você possue " + vida + " Vidas" + "\n");

			System.out.println("Digite um número de 0 a 50");
			numeroDigitado = entrada.nextInt();

			System.out.println("O número sorteado é :" + aleatorio.nextInt(50) + "\n");

			if (numeroDigitado == aleatorio.nextInt()) {
				System.out.println("Parabéns");
			} else if (vida == 0) {

				System.out.println("Desculpe, suas vidas acabaram");
			} else {

				System.out.println("Desculpe tente novamente");

			}
			System.out.println("------------------------------");
		}
	}
}
