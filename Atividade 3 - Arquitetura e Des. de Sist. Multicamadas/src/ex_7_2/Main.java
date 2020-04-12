package ex_7_2;

import java.util.Arrays;

public class Main {
	// N�mero de termos.
	private static final int NUM = 5;

	// Construindo um vetor
	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	// M�todo principal
	public static void main(String[] args) throws Exception {
		// Constroi o vetor.
		Double[] v = construirVetor();

		// Ordena o vetor.
		Arrays.sort(v, new ComparatorDouble());

		// Imprime o vetor.
		System.out.println(Arrays.toString(v));
	}
}
