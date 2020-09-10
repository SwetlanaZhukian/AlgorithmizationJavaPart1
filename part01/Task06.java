package by.jonline.mod02.part01;

import java.util.*;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/
public class Task06 {

	public static void main(String[] args) {
		int n;
		double sum;

		n = enterFromConsole("Введите длину последовательности >> ");

		double[] mas = new double[n];

		initArray(mas);
		printArray(mas);

		sum = findSum(mas);
		System.out.printf("Суммa чисел, порядковые номера которых являются простыми числами = %.2f", sum);
	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}

		double min = -10.5;
		double max = 20;
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * (max - min) + min;
		}
	}

	public static void printArray(double[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("mas[%d] = ", i);
			System.out.printf("%.2f\t ", mas[i]);
			System.out.println();
		}

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

	public static double findSum(double[] mas) {
		if (mas == null) {
			return 0;
		}

		double sum = mas[2];
		boolean b;

		for (int i = 3; i < mas.length; i += 2) {
			b = true;

			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}

			if (b) {
				sum = sum + mas[i];
			}
		}

		return sum;

	}

}
