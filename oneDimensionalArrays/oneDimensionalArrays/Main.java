package by.epam.learn.main;

public class Main {

    public static void main(String[] args) {
        doMultiples();
        makingSequence();
        amountOfElements();
        resultMaxMin();
        resultNumberAndIndex();
        resultSumIntegersIndeces();
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
            if ((i % 30) == 0)  System.out.println();
            System.out.print(arr[i] + "\t");
        }

        Multiples multiples = new Multiples(arr, k);
        System.out.print("\n\nСумма элементов массива, кратных " + k + ": ");
        System.out.println(multiples.searchMultiples());
    }

    private static void makingSequence() {
        int n = (int) (Math.random()*100);
        int z = (int) (Math.random()*20);
        double newNumber = Math.random()*5;
        System.out.println("\nЗадание 2. Имеется последовательность из " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = Math.random() * n;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        Sequence sequence = new Sequence(arr, z, newNumber);
        System.out.println("\n\nВсе члены, большие " + z + ", меняем на число: " + newNumber);
        sequence.searchSequence();
        System.out.println("\nПолучилась новая последовательность:");
        for (int i=0; i< arr.length; i++) {
            if ((i % 6) == 0)  System.out.println();
            System.out.print(arr[i] + "\t\t");
        }
        System.out.println("\n\nМы сделали " + sequence.searchSequence() + " замен.");
    }

    public static void amountOfElements() {
        int n = (int) (Math.random()*100);
        System.out.println("\nЗадание 3. Дан массив из " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = Math.random() * n - (double) n/2;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        PlusMinusZero plusMinusZero = new PlusMinusZero(arr);
        System.out.println("\nВ нем отрицательных элементов:\t" + plusMinusZero.minus());
        System.out.println("положительных:\t" + plusMinusZero.plus());
        System.out.println("нулевых:\t" + (2*n - plusMinusZero.minus() - plusMinusZero.plus()));
        }

    public static void resultMaxMin() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\nЗадание 4. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = Math.random() * n - (double) n/2;
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        ChangeMaxMin changeMaxMin = new ChangeMaxMin(arr);
        changeMaxMin.replacement();
        System.out.println("\n\nМеняем местами наибольшее из них с наименьшим:");
        for (int i=0; i< arr.length; i++) {
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }
    }

    public static void resultNumberAndIndex() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\n\nЗадание 5. Дано " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        NumberGreaterThanIndex numberGreaterThanIndex = new NumberGreaterThanIndex(arr);
        System.out.println("\nУ следующих чисел значение больше номера индекса:");
        System.out.println(numberGreaterThanIndex.NumberIndex());
    }

    public static void resultSumIntegersIndeces() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\n\nЗадание 6. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] =  (Math.random() * n - (double) n/2);
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        SumIntegersIndeces SumIntegersIndeces = new SumIntegersIndeces(arr);
        System.out.print("\nСумму чисел, порядковые номера которых являются простыми числами: ");
        System.out.println(SumIntegersIndeces.sumIntegers());
    }

    public static void resultMaxAmount() {
        int n = ((int) (Math.random()*50 + 1)) * 2;
        System.out.println("\n\nЗадание 7. Дано " + n + " действительных чисел:");
        double[] arr = new double[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (Math.random() * n - (double) n/2);
            if ((i % 6) == 0) System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        MaxAmount maxAmount = new MaxAmount(arr, n);
        maxAmount.amountMax();
        System.out.println("\n\nМаксимальная сумма равна: " + maxAmount.max());
    }

    public static void resultSequenceMinusMin() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\n\nЗадание 8. Дана последовательность " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        SequenceMinusMin sequenceMinusMin = new SequenceMinusMin(arr,n);
        sequenceMinusMin.searchForMinimumMembers();
        int[] minusArr = sequenceMinusMin.sequenceMinus();
        System.out.println("\nПосле удаления минимальных членов образовалась новая последовательность:");
        for (int i=0; i< minusArr.length; i++) {
            if ((i % 30) == 0) System.out.println();
            System.out.print(minusArr[i] + "\t");
        }
    }

    public static void resultFrequentNumber() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\n\nЗадание 9. Дан массив " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        FrequentNumber frequentNumber = new FrequentNumber(arr);
        System.out.println("\n\nНаименьшее из часто встречающихся чисел равно: " + frequentNumber.frequentNumber());
    }

    public static void resultCompressingAnArray() {
        int n = (int) (Math.random()*100+1);
        System.out.println("\n\nЗадание 10. Дан массив " + n + " целых чисел:");
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }

        CompressingAnArray compressingAnArray = new CompressingAnArray(arr);
        System.out.println("\nПосле сжатия и замены получили такой массив: ");
        compressingAnArray.compressing();
        for (int i=0; i< arr.length; i++) {
            if ((i % 30) == 0) System.out.println();
            System.out.print(arr[i] + "\t");
        }
    }
}