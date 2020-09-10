package by.jonline.mod02.part01;

import java.util.*;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task01 {

	public static void main(String[] args) {

		int n;
		int k;
		int sum;
		int[] mas;

		n = enterFromConsole("Введите размерность массива >> ");
		k = enterFromConsole("Введите K  >> ");
		mas = new int[n];

		initArray(mas);
		printArray(mas);

		sum = findSum(mas, k);

		if (sum == 0) {
			System.out.println("В массиве нет элементов, кратных " + k);
		} else {
			System.out.println("Сумма элементов массива, кратных " + k + " = " + sum);
		}
	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		System.out.println();
	}

	public static int enterFromConsole(String str) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int value;

		do {
			System.out.print(str);
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.print(str);
			}

			value = scanner.nextInt();

		} while (value <= 0 || value > 50);

		return value;
	}

	public static int findSum(int[] mas, int k) {
		if (mas == null) {
			return 0;
		}

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}

		return sum;

	}

}
