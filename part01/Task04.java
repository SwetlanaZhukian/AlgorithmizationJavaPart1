package by.jonline.mod02.part01;

import java.util.*;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task04 {

	public static void main(String[] args) {
		int n;
		double[] mas;

		n = enterFromConsole("Введите длину последовательности >> ");
		mas = new double[n];

		initArray(mas);

		System.out.println("Исходная последовательность:");
		printArray(mas);

		swapElementsInArray(mas);
		System.out.println("Изменённая последовательность:");
		printArray(mas);

	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}

		int min = -20;
		int max = 30;
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * (max - min) + min;
		}

	}

	public static void printArray(double[] mas) {
		if (mas == null) {
			return;
		}
		for (double element : mas) {
			System.out.printf("%.2f ", element);
		}

		System.out.println();
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

		} while (value <= 0 || value > 30);

		return value;
	}

	public static void swapElementsInArray(double[] mas) {
		if (mas == null) {
			return;
		}

		int indexOfMax = 0;
		int indexOfMin = 0;

		double temp;

		for (int i = 1; i < mas.length; i++) {
			if (mas[indexOfMax] < mas[i]) {
				indexOfMax = i;
			} else if (mas[indexOfMin] > mas[i]) {
				indexOfMin = i;
			}

		}

		temp = mas[indexOfMax];
		mas[indexOfMax] = mas[indexOfMin];
		mas[indexOfMin] = temp;

	}

}
