package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Choice theTask = new Choice();
        int o = 0;
        for (; ; ) {
            do {
                theTask.showMenu(o++);
                while (!in.hasNextInt()) {
                    System.out.println("Это не номер!");
                    in.next();
                }
                choice = in.nextInt();
            } while (!theTask.isvalid(choice));
            if (choice == 0) {
                System.out.println("\nНу как? Жду рекомендаций.");
                break;
            }
            System.out.println("\n");
            theTask.choiceOn(choice);
        }
    }

    private static int[][] theMatrix(int n, int m) {
        System.out.println("Есть матрица " + m + "x" + n + ":");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * n);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    static void resultMatrixColumns() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 1.");
        int[][] matrix = theMatrix(n, m);
        MatrixColumns matrixColumns = new MatrixColumns(matrix);
        System.out.println("\nНовая матрица, в которую взяты нечетные столбцы,где первый элемент больше последнего:");
        int[][] newMatrix = matrixColumns.searchMatrixColumns();
        for (int[] i : newMatrix) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    static void resultDiagonal() {
        int n = 15;
        int m = 15;
        System.out.println("\nЗадание 2.");
        int[][] matrix = theMatrix(n, m);
        Diagonals diagonals = new Diagonals(matrix);
        System.out.println("\nЭлементы, стоящие на главной диагонали: " + diagonals.mainDiagonal());
        System.out.println("\nЭлементы, стоящие на побочной диагонали: " + diagonals.sideDiagonal());
    }

    static void resultColumnPRowK() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 3.");
        int[][] matrix = theMatrix(n, m);
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите номер строки и номер столбца:\n");
        int k = in.nextInt();
        int p = in.nextInt();
        ColumnPRowK columnPRowK = new ColumnPRowK(matrix, k, p);
        System.out.println("\nСтрока " + k + ":" + columnPRowK.row());
        System.out.println("Столбец " + p + ":" + columnPRowK.column());
    }

    static void resultMatrixFormation4() {
        System.out.println("\nЗадание 4. Введите размер квадратной матрицы (число должно быть четным):\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Новая матрица выглядит так:");
        MatrixFormation4 matrixFormation4 = new MatrixFormation4(n);
        int[][] formation4 = matrixFormation4.formation4();
        for (int[] i : formation4) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    static void resultMatrixFormation5() {
        System.out.println("\nЗадание 5. Введите размер квадратной матрицы (число должно быть четным):\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Новая матрица выглядит так:");
        MatrixFormation5 matrixFormation5 = new MatrixFormation5(n);
        int[][] formation5 = matrixFormation5.formation5();
        for (int[] i : formation5) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    static void resultMatrixFormation6() {
        System.out.println("\nЗадание 6. Введите размер квадратной матрицы (число должно быть четным):\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Новая матрица выглядит так:");
        MatrixFormation6 matrixFormation6 = new MatrixFormation6(n);
        int[][] formation6 = matrixFormation6.formation6();
        for (int[] i : formation6) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    static void resultMatrixFormation7() {
        System.out.println("\nЗадание 7. Введите размер квадратной матрицы (число должно быть четным):\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Новая матрица выглядит так:");
        MatrixFormation7 matrixFormation7 = new MatrixFormation7(n);
        float[][] formation7 = matrixFormation7.formation7();
        for (float[] i : formation7) {
            for (float j : i) {
                System.out.format("%10.5f", j);
            }
            System.out.println();
        }
        System.out.println("Положительных элементов в этой матрице: " + matrixFormation7.plus());
    }

    static void resultSwapColumns() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 8.");
        int[][] matrix = theMatrix(n, m);
        System.out.println("Какие столбцы вы хотите поменять местами?");
        Scanner in = new Scanner(System.in);
        int columnOld = in.nextInt() - 1;
        int columnNew = in.nextInt() - 1;
        SwapColumns swapColumns = new SwapColumns(matrix, columnOld, columnNew);
        int[][] swap = swapColumns.swapColumns();
        System.out.println("Матрица после замены:");
        for (int[] i : swap) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    static void resultColumnSums() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 9.");
        int[][] matrix = theMatrix(n, m);
        ColumnSums columnSums = new ColumnSums(matrix);
        int[] sums = columnSums.columnSums();
        System.out.println("\nСумма элентов каждого столбца:");
        for (int i : sums) {
            System.out.print(i + "\t");
        }
        System.out.println("\nМаксимальная сумма в " + (columnSums.maxColumnSum() + 1) +
                " столбце и она равна: " + sums[columnSums.maxColumnSum()]);
    }

    static void resultPositiveDiagonalElements() {
        int n = 15;
        System.out.println("\nЗадание 10. Есть квадратная матрица" + n + "x" + n + ":");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * n - n / 2);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        PositiveDiagonalElements positiveDiagonalElements = new PositiveDiagonalElements(matrix);
        System.out.println("\nПоложительные элементы, стоящие на главной диагонали:\n"
                + positiveDiagonalElements.posiniveMainDiagonal());
    }

    static void resultLinesWith5() {
        System.out.println("\nЗадание 11. Есть матрица 10x20:");
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        LinesWith5 linesWith5 = new LinesWith5(matrix);
        System.out.println("В этих строках число 5 встречается три и более раз: " + linesWith5.linesWith5());
    }

    static void resultSortingStrings() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 12.");
        int[][] matrix = theMatrix(n, m);
        SortingStrings sortingStrings = new SortingStrings(matrix);
        System.out.println("\nНовая матрица с элементами, отсортированными по возрастанию:");
        int[][] increase = sortingStrings.sortAscending();
        for (int[] ints : increase) {
            for (int j = 0; j < increase[increase.length - 1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nНовая матрица с элементами, отсортированными по убыванию:");
        int[][] decrease = sortingStrings.sortDescending();
        for (int[] ints : decrease) {
            for (int j = 0; j < decrease[decrease.length - 1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    static void resultSortingColumns() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 13.");
        int[][] matrix = theMatrix(n, m);
        SortingColumns sortingColumns = new SortingColumns(matrix);
        System.out.println("\nНовая матрица с элементами, отсортированными по возрастанию:");
        int[][] increase = sortingColumns.sortAscending();
        for (int[] ints : increase) {
            for (int j = 0; j < increase[increase.length - 1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nНовая матрица с элементами, отсортированными по убыванию:");
        int[][] decrease = sortingColumns.sortDescending();
        for (int[] ints : decrease) {
            for (int j = 0; j < decrease[decrease.length - 1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    static void resultRandomMatrix() {
        int n = 9;
        int m = 10;
        System.out.println("\nЗадание 14. Получили случайную матрица " + n + "x" + m + ", состоящую" +
                " из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца:");
        RandomMatrix randomMatrix = new RandomMatrix(n, m);
        int[][] matrixRandom = randomMatrix.matrixRandom();
        for (int[] ints : matrixRandom) {
            for (int j = 0; j < matrixRandom[matrixRandom.length - 1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    static void resultOddChangeToMaximum() {
        int n = 30;
        int m = 10;
        System.out.println("\nЗадание 15.");
        int[][] matrix = theMatrix(n, m);
        OddChangeToMaximum oddChangeToMaximum = new OddChangeToMaximum(matrix);
        System.out.println("\nМеняем все её нечетные элементы на максимальный элемент '" +
                oddChangeToMaximum.maximumElement() + "':");
        int[][] oddToMax = oddChangeToMaximum.oddChangeToMaximum();
        for (int[] toMax : oddToMax) {
            for (int j = 0; j < oddToMax[oddToMax.length - 1].length; j++) {
                System.out.print(toMax[j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] resultMagicSquare() {
        System.out.println("\nЗадание 16. Для создания магического квадрата (метод террас) введите нечетное " +
                "натуральное число больще 2:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MagicSquare magicSquare = new MagicSquare(n);
        int[][] mS = magicSquare.magicSquare();
        System.out.println();
        for (int[] m : mS) {
            for (int j = 0; j < mS[mS.length - 1].length; j++) {
                System.out.print(m[j] + "\t");
            }
            System.out.println();
        }
        return mS;
    }

    static void resultCheckMS() {
        int[][] mS = resultMagicSquare();
        System.out.println("\nПроверка магического квадрата:");
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < mS.length; i++) {
            int sumForI = 0;
            int sumForJ = 0;
            for (int j = 0; j < mS[mS.length - 1].length; j++) {
                sumForI += mS[i][j];
                sumForJ += mS[j][i];
                System.out.print(mS[i][j] + "\t");
            }
            System.out.println("\t" + sumForI + "\t" + sumForJ);
            d1 += mS[i][i];
            d2 += mS[mS.length - i - 1][i];
        }
        System.out.println(d1 + "\t" + d2);
    }
}