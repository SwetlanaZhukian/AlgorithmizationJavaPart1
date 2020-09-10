package by.jonline.mod02.part01;

import java.util.*;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/
public class Task02 {

	public static void main(String[] args) {

		int n = 10;
		double[] mas = new double[n];

		double z;
		int count;

		z = enterFromConsole("Z >> ");

		initArray(mas);

		System.out.println("Исходная последовательность:");
		printArray(mas);

		count = countReplacedElementsInArray(mas, z);

		replaceElementsInArray(mas, z);
		System.out.println("Изменённая последовательность;");
		printArray(mas);

		System.out.print("Количество замен = " + count);

	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}

		double min = -20.0;
		double max = 50.0;

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (rand.nextDouble() * (max - min)) + min;
		}

	}

	public static void printArray(double[] mas) {
		if (mas == null) {
			return;
		}
		for (double element : mas) {
			System.out.printf("%.2f  ", element);
		}

		System.out.println();
	}

	public static double enterFromConsole(String str) {

		double value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(str);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(str);
		}

		value = sc.nextDouble();

		return value;
	}

	public static void replaceElementsInArray(double[] mas, double k) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > k) {
				mas[i] = k;
			}
		}

	}

	public static int countReplacedElementsInArray(double[] mas, double k) {
		if (mas == null) {
			return 0;
		}
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > k) {
				count++;
			}
		}
		return count;

	}

}
