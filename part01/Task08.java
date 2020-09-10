package by.jonline.mod02.part01;

/*Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1 ,a2, ..., an ).*/
public class Task08 {
	public static void main(String[] args) {
		int[] mas = new int[] { -5, -5, 7, 4, 0, 9, -5, 8, 6, 4, 10, -5 };

		System.out.println("Исходная последовательность: ");
		printArray(mas);

		int[] newMas = createNewArray(mas);
		System.out.println("Новая последовательность: ");
		printArray(newMas);
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

	public static int findMin(int[] mas) {
		if (mas == null) {
			return 0;
		}

		int min = 0;

		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}

		return min;
	}

	public static int[] createNewArray(int[] mas) {
		int[] arr;
		int n;
		int min;

		int count = 0;
		int j = 0;

		min = findMin(mas);

		for (int i = 0; i < mas.length; i++) {
			if (min == mas[i]) {
				count++;
			}
		}

		if (count == mas.length) {
			System.out.println("В массиве нет минимального элемента!");
		}

		n = mas.length - count;
		arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			while (j < mas.length) {

				if (mas[j] == min) {
					j++;
					continue;
				}

				arr[i] = mas[j];
				break;
			}

			j++;
		}

		return arr;

	}

}
