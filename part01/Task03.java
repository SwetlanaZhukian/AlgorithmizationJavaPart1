package by.jonline.mod02.part01;

import java.util.*;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/
public class Task03 {

	public static void main(String[] args) {

		int n;
		int negative;
		int positive;
		int zero;
		double[] mas;

		n = enterFromConsole("Введите размерность массива >> ");
		mas = new double[n];
		negative = 0;
		positive = 0;
		zero = 0;

		initArray(mas);
		printArray(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				negative++;
			} else if (mas[i] > 0) {
				positive++;
			} else {
				zero++;
			}
		}

		System.out.println("Количество положительных элементов в массиве = " + positive);
		System.out.println("Количество отрицательных элементов в массиве = " + negative);
		System.out.println("Количество нулевых элементов в массиве = " + zero);
	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}

		double min = -30;
		double max = 30;
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

		} while (value <= 0 || value > 50);

		return value;
	}

}
