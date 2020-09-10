package by.jonline.mod02.part01;

import java.util.Scanner;

/*Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/
public class Task10 {

	public static void main(String[] args) {
		int n;
		int[] mas;

		n = enterFromConsole("Введите длину массива: ");
		while (n <= 0) {
			n = enterFromConsole("Введите длину массива: ");
		}

		mas = new int[n];
		initArray(mas);
		System.out.println("Исходный массив: ");
		printArray(mas);

		compressArray(mas);
		System.out.println("Сжатый массив: ");
		printArray(mas);

	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("mas[%d] ", i);
			mas[i] = enterFromConsole("= ");
		}
	}

	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int element : mas) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static int enterFromConsole(String str) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(str);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(str);

		}

		value = sc.nextInt();

		return value;
	}

	public static void compressArray(int[] mas) {
		if (mas == null) {
			return;
		}

		int temp;

		for (int i = 1; i < mas.length; i += 2) {
			mas[i] = 0;
		}

		for (int j = 2; j < mas.length; j += 2) {
			temp = mas[j];
			mas[j] = mas[j / 2];
			mas[j / 2] = temp;
		}

	}

}
