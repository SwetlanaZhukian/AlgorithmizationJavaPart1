package by.jonline.mod02.part01;

import java.util.Random;
import java.util.Scanner;

//Даны действительные числа a1, a2,..., a2n. Найти max(  a1 + a2n, a2 + a2n−1 ,..., an + an+1)
public class Task07 {

	public static void main(String[] args) {
		int n;
		double max;
		double[] mas;
		double[] newMas;

		n = enterFromConsole("Введите n >> ");
		mas = new double[2 * n];

		initArray(mas);
		System.out.println("Исходная последовательность a1, a2,..., a2n : ");
		printArray(mas);

		newMas = createNewArray(mas, n);
		System.out.println("Новая последовательность a1 + a2n, a2 + a2n−1 ,..., an + an+1 : ");
		printArray(newMas);

		max = findMax(newMas);
		System.out.printf("max(a1 + a2n, a2 + a2n−1 ,..., an + an+1) = %.2f ", max);

	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 10;
		}

	}

	public static void printArray(double[] mas) {
		if (mas == null) {
			return;
		}

		for (double element : mas) {
			System.out.printf("%.2f  ", element);
		}

		System.out.println("\n");

	}

	public static int enterFromConsole(String str) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print(str);

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 50);

		return value;
	}

	public static double[] createNewArray(double[] mas, int n) {
		if (mas == null || n <= 0) {
			return null;
		}

		double[] arr = new double[n];

		int j = 0;
		int k = mas.length - 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = mas[j] + mas[k];
			j++;
			k--;
		}

		return arr;

	}

	public static double findMax(double[] mas) {
		if (mas == null) {
			return 0;
		}

		double max = 0;

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}

		return max;

	}

}
