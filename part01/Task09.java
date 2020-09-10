package by.jonline.mod02.part01;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.*/
public class Task09 {

	public static void main(String[] args) {
		int[] mas = new int[] { -1, 2, 4, 6, 6, 2, 2, 2, 6, 8, 6, 9, 7 };
		printArray(mas);

		int number = findOftenRepeatedNumber(mas);
		System.out.println(number + " наиболее часто встречающееся число в массиве ");

	}

	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int element : mas) {
			System.out.print(element + " ");
		}

		System.out.println("\n");

	}

	public static int findOftenRepeatedNumber(int[] mas) {
		if (mas == null) {
			return 0;
		}

		int count;
		int j;
		int number = 0;
		int temp = 0;

		for (int i = 0; i < mas.length; i++) {
			count = 0;
			j = i + 1;

			while (j < mas.length) {

				if (mas[i] == mas[j]) {
					count++;
				}
				j++;
			}

			if (count > temp) {
				temp = count;
				number = mas[i];
			} else if (count == temp) {
				if (number > mas[i]) {
					number = mas[i];
				}
			}

		}

		return number;

	}

}
