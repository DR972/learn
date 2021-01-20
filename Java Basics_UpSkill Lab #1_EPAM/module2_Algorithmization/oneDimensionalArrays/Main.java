package by.epam.learn.main;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
 *      этим числом. Подсчитать количество замен.
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 *      положительных и нулевых элементов.
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 *      являются простыми числами.
 * 7. Даны действительные числа а1 ,а2 ,..., аn. Найти
 *      max(a1+a2n, a2+a(2n-1), ..., an+a(n+1))
 * 8. Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность,
 *      выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 *      Если таких чисел несколько, то определить наименьшее из них.
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый
 *      второй элемент (освободившиеся элементы заполнить нулями).
 */

public class Main {

    public static void main(String[] args) {
        doMultiples();
        makingSequence();
        amountOfElements();
        resultMaxMin();
        resultNumberAndIndex();
        resultSumIntegersIndexes();
        resultMaxAmount();
        resultSequenceMinusMin();
        resultFrequentNumber();
        resultCompressingAnArray();
    }

    private static void doMultiples() {
        int k = (int) (Math.random() * 10 + 1);
        int n = (int) (Math.random() * 100);
        System.out.println("\nЗадание 1. Имеется массив из " + n + " элементов:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        Multiples multiples = new Multiples(arr, k);
        System.out.print("\n\nСумма элементов массива, кратных " + k + ": ");
        System.out.println(multiples.searchMultiples());
    }

    private static void makingSequence() {
        int n = (int) (Math.random() * 50);
        int z = (int) (Math.random() * 20);
        double newNumber = Math.random() * 5;
        System.out.println("\nЗадание 2. Имеется последовательность из " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * n;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        Sequence sequence = new Sequence(arr, z, newNumber);
        System.out.println("\n\nВсе члены, большие " + z + ", меняем на число: " + newNumber);
        System.out.println("\nПолучилась новая последовательность:");
        double[] newArr = sequence.searchSequence();
        for (int i = 0; i < newArr.length; i++) {
            if ((i % 6) == 0) System.out.println();
            System.out.print(newArr[i] + "\t\t");
        }
        System.out.println("\n\nМы сделали " + sequence.replacements() + " замен.");
    }

    public static void amountOfElements() {
        int n = (int) (Math.random() * 50);
        System.out.println("\nЗадание 3. Дан массив из " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * n - (double) n / 2;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        PlusMinusZero plusMinusZero = new PlusMinusZero();
        System.out.println("\nВ отрицательных,положительных и нулевых элементов:\n" +
                plusMinusZero.searchPlusMinusZero(arr));
    }

    public static void resultMaxMin() {
        int n = (int) (Math.random() * 50);
        System.out.println("\nЗадание 4. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * n * 2 - (double) n;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        ChangeMaxMin changeMaxMin = new ChangeMaxMin(arr);
        System.out.println("\n\nМеняем местами наибольшее из них с наименьшим:");
        double[] newArr = changeMaxMin.replacement();
        for (int i = 0; i < newArr.length; i++) {
            if ((i % 6) == 0) System.out.println();
            System.out.print(newArr[i] + "\t\t");
        }
    }

    public static void resultNumberAndIndex() {
        int n = (int) (Math.random() * 50 + 1);
        System.out.println("\n\nЗадание 5. Дано " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        NumberGreaterThanIndex numberGreaterThanIndex = new NumberGreaterThanIndex(arr);
        System.out.println("\nУ следующих чисел значение больше номера индекса:");
        System.out.println(numberGreaterThanIndex.NumberIndex());
    }

    public static void resultSumIntegersIndexes() {
        int n = (int) (Math.random() * 50 + 1);
        System.out.println("\n\nЗадание 6. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * n *2- (double) n);
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        SumIntegersIndeces SumIntegersIndeces = new SumIntegersIndeces(arr);
        System.out.print("\nСумму чисел, порядковые номера которых являются простыми числами: ");
        System.out.println(SumIntegersIndeces.sumIntegers());
    }

    public static void resultMaxAmount() {
        int n = ((int) (Math.random() * 50 + 1)) * 2;
        System.out.println("\n\nЗадание 7. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * n*2 - (double) n);
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        MaxAmount maxAmount = new MaxAmount(arr, n);
        maxAmount.amountMax();
        System.out.println("\n\nМаксимальная сумма равна: " + maxAmount.max());
    }

    public static void resultSequenceMinusMin() {
        int n = (int) (Math.random() * 50 + 1);
        System.out.println("\n\nЗадание 8. Дана последовательность " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        SequenceMinusMin sequenceMinusMin = new SequenceMinusMin(arr, n);
        sequenceMinusMin.searchForMinimumMembers();
        int[] minusArr = sequenceMinusMin.sequenceMinus();
        System.out.println("\nПосле удаления минимальных членов образовалась новая последовательность:");
        for (int i = 0; i < minusArr.length; i++) {
            if ((i % 30) == 0) System.out.println();
            System.out.print(minusArr[i] + "\t");
        }
    }

    public static void resultFrequentNumber() {
        int n = (int) (Math.random() * 100 + 1);
        System.out.println("\n\nЗадание 9. Дан массив " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        FrequentNumber frequentNumber = new FrequentNumber(arr);
        System.out.println("\n\nНаименьшее из часто встречающихся чисел равно: " + frequentNumber.frequentNumber());
    }

    public static void resultCompressingAnArray() {
        int n = (int) (Math.random() * 100 + 1);
        System.out.println("\n\nЗадание 10. Дан массив " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        CompressingAnArray compressingAnArray = new CompressingAnArray(arr);
        System.out.println("\nПосле сжатия и замены получили такой массив: ");
        compressingAnArray.compressing();
        for (int i = 0; i < arr.length; i++) {
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }
    }
}
