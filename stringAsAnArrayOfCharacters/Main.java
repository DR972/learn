package by.epam.learn.main;

public class Main {

    public static void main(String[] args) {
        resultCamelCaseToSnakeCase();
        resultWordToLetter();
        resultNumberOfDigits();
        resultAmountOfNumbers();
        resultExtraSpaces();
    }

    public static void resultCamelCaseToSnakeCase() {
        System.out.println("\nЗадание 1. Дан массив названий переменных в camelCase:");
        String[] camelCase = {"gcdOfFourNumbers", "sumOfDigits", "numberOfDigits", "gcdAndLcm", "moreNumeral", "sumFactorial"};
        for (String s : camelCase) {
            System.out.print(s + "\t");
        }
        CamelCaseToSnakeCase camelCaseToSnakeCase = new CamelCaseToSnakeCase(camelCase);
        System.out.println("\nПолучили массив в SnakeCase:");
        for (String s : camelCaseToSnakeCase.creatingNewArray()) {
            System.out.print(s + "\t");
        }
    }

    public static void resultWordToLetter() {
        System.out.println("\n\nЗадание 2. Дана строка со словом word:");
        String word = "View the word count as you type in Microsoft word. Microsoft word has a real-time word" +
                " counter that counts every word.";
        System.out.println(word);
        System.out.println("Поменяем в ней слово 'word' на слово 'letter'.");
        WordToLetter wordToLetter = new WordToLetter(word);
        System.out.println(wordToLetter.changeWordToLetter());
    }

    public static void resultNumberOfDigits() {
        System.out.println("\nЗадание 3. Дана строка:");
        String str = "Yesterday was the 08/12/2020.";
        System.out.println(str);
        NumberOfDigits numberOfDigits = new NumberOfDigits(str);
        System.out.println("В ней есть цифры и их: " + numberOfDigits.countDigits());
    }

    public static void resultAmountOfNumbers() {
        System.out.println("\nЗадание 4. Дана строка:");
        String str = "Yesterday was the 08/12/2020.";
        System.out.println(str);
        AmountOfNumbers amountOfNumbers = new AmountOfNumbers(str);
        System.out.println("В ней есть числа и их: " + amountOfNumbers.countNumbers());
    }

    public static void resultExtraSpaces() {
        System.out.println("\nЗадание 5. Дана строка:");
        String str = "  The  first   and the   third   tests   were easy.  ";
        System.out.println(str);
        ExtraSpaces extraSpaces = new ExtraSpaces(str);
        System.out.println("Так выглядит строка без лишних пробелов:\n" + extraSpaces.removeExtraSpaces());
    }
}
