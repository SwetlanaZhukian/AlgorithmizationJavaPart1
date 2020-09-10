package by.jonline.mod02.part01;

import java.util.*;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
public class Task05 {

	public static void main(String[] args) {

		int[] mas = new int[15];

		initArray(mas);

		System.out.println("Исходная последовательность: ");
		printAllArray(mas);

		System.out.println("Числа последовательности для которых а[i] > i: ");
		printArray(mas);

	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(30);
		}
	}

	public static void printAllArray(int[] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + " ");
		}
		System.out.println();

	}

	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}
		System.out.println();

	}

}
