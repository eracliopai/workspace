
import java.util.Arrays;
import java.util.Scanner;

public class Desafio01 {
	private static Scanner numeros;

	public static void main(String[] args) {

numeros = new Scanner(System.in);

// Constrói um Array com 4 posições
		int[] listaDeNumeros = new int[4];

		// Preenche o Array aparti da posição 1
		for (int i = 1; i < listaDeNumeros.length; i++) {
			System.out.print("Digite " + i + "° numeros: ");
			listaDeNumeros[i] = (numeros.nextInt());
		}

		// Coloca o Array em ordem crescente
		Arrays.sort(listaDeNumeros);

		// Lista o Array em ordem crescente
		System.out.print("Ordem crescente:    ");

		for (int j = 1; j < listaDeNumeros.length; j++) {
			System.out.print(listaDeNumeros[j] + ", ");
		}

	}
}

