package by.epam.learn.main;

/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
 * 2. Реализуйте сортировку выбором.
 * 3. Реализуйте сортировку обменами.
 * 4. Реализуйте сортировку вставками.
 * 5. Реализуйте сортировку Шелла.
 */

public class Main {

    public static void main(String[] args) {
        resultUnionOfArrays();
        resultSelectionSort();
        resultBubbleSort();
        resultInsertionSort();
        resultShellSort();
    }

    private static int[] array(int n) {
        System.out.println("\nЕсть массив из " + n + " элементов:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 4 * n);
            System.out.print(array[i] + "\t");
        }
        return array;
    }

    private static void resultUnionOfArrays() {
        int n = 15;
        int m = 10;
        int k = 7;
        System.out.println("\nЗадание 1.");
        int[] firstArray = array(n);
        int[] secondArray = array(m);
        UnionOfArray unionOfArray = new UnionOfArray(firstArray, secondArray, k);
        System.out.println("\nВключаем второй между " + k + " и " + (k + 1) + " элементами первого:");
        int[] newArray = unionOfArray.newArray();
        for (int j : newArray) {
            System.out.print(j + "\t");
        }
    }

    private static void resultSelectionSort() {
        int n = 15;
        System.out.println("\n\nЗадание 2. Сортировка выбором.");
        int[] array = array(n);
        SelectionSort selectionSort = new SelectionSort(array);
        int[] newArray = selectionSort.getArray();
        System.out.println("\nПолучили отсортированный массив:");
        for (int j : newArray) {
            System.out.print(j + "\t");
        }
    }

    private static void resultBubbleSort() {
        int n = 15;
        System.out.println("\n\nЗадание 3. Сортировка обменами или пузырьком.");
        int[] array = array(n);
        BubbleSort bubbleSort = new BubbleSort(array);
        int[] newArray = bubbleSort.getArray();
        System.out.println("\nПолучили отсортированный массив:");
        for (int j : newArray) {
            System.out.print(j + "\t");
        }
    }

    private static void resultInsertionSort() {
        int n = 15;
        System.out.println("\n\nЗадание 4. Сортировка вставками.");
        int[] array = array(n);
        InsertionSort insertionSort = new InsertionSort(array);
        int[] newArray = insertionSort.getArray();
        System.out.println("\nПолучили отсортированный массив:");
        for (int j : newArray) {
            System.out.print(j + "\t");
        }
    }

    private static void resultShellSort() {
        int n = 15;
        System.out.println("\n\nЗадание 5. Сортировка методом Шелла.");
        int[] array = array(n);
        ShellSort shellSort = new ShellSort(array);
        int[] newArray = shellSort.getArray();
        System.out.println("\nПолучили отсортированный массив:");
        for (int j : newArray) {
            System.out.print(j + "\t");
        }
    }
}
