package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        resultConsecutiveSpaces();
        resultBAfterA();
        resultPalindrome();
        resultPie();
        resultStringWithA();
        resultRepeatedCharacter();
        resultStringWithoutRepeats();
        resultLongestWord();
        resultLetterCounter();
        resultNumberOfSentences();
    }

    private static void resultConsecutiveSpaces() {
        System.out.println("\nЗадание 1. Дана строка:");
        String str = "  The  first   and the     third   tests   were easy.    ";
        System.out.println(str);
        ConsecutiveSpaces consecutiveSpaces = new ConsecutiveSpaces(str);
        System.out.println("Максимальное количество подряд идущих пробелов: " + consecutiveSpaces.countSpaces());
    }

    private static void resultBAfterA() {
        System.out.println("\nЗадание 2. Дана строка:");
        String str = "The first and the third tests were easy.";
        System.out.println(str);
        BAfterA bAfterA = new BAfterA(str);
        System.out.println("После каждого символа 'a' вставим символ 'b':\n" + bAfterA.insertBAfterA());
    }

    private static void resultPalindrome() {
        System.out.println("\nЗадание 3. Дана строка:");
        String[] words = {"first", "level", "third", "madam", "deed", "easy"};
        for (String word : words) {
            System.out.print(word + "\t");
        }
        System.out.println("\nРезультат:");
        Palindrome palindrome = new Palindrome(words);
        String[] answerPalindrome = palindrome.isPalindrome();
        for (String s : answerPalindrome) {
            System.out.println(s);
        }
    }

    private static void resultPie() {
        System.out.println("\nЗадание 4. Есть слово 'информатика'.");
        String informatics = "информатика";
        Pie pie = new Pie(informatics);
        System.out.println("Путем несложных манипуляций получаем: " + pie.makingPie());
    }

    private static void resultStringWithA() {
        System.out.println("\nЗадание 5. Дана строка:");
        char letter = 'a';
        String str = "I love animals and I have two cats at home.";
        System.out.println(str);
        StringWithA stringWithA = new StringWithA(str, letter);
        System.out.println("Буква 'a' встречается " + stringWithA.lookingForTheLetterA() + " раз.");
    }

    private static void resultRepeatedCharacter() {
        System.out.println("\nЗадание 6. Дана строка:");
        String str = "I love animals and I have two cats at home.";
        System.out.println(str);
        RepeatCharacter repeatCharacter = new RepeatCharacter(str);
        System.out.println("Новая строка, где каждый символ повторяется дважды:\n" + repeatCharacter.repeatSymbols());
    }

    private static void resultStringWithoutRepeats() {
        System.out.println("\nЗадание 7. Введите строку:");
        Scanner con = new Scanner(System.in);
        String oldStr = con.nextLine();
        StringWithoutRepeats stringWithoutRepeats = new StringWithoutRepeats(oldStr.trim());
        System.out.println("Новая строка без пробелов и повторяющихся символов:\n" +
                stringWithoutRepeats.removeDuplicateCharacters());
    }

    private static void resultLongestWord() {
        System.out.println("\nЗадание 8. Дана строка:");
        String str = "I love animals and I have two cats at home";
        System.out.println(str);
        LongestWord longestWord = new LongestWord(str);
        System.out.println("Самое длинное слово: " + longestWord.findTheLongestWord());
    }

    private static void resultLetterCounter() {
        System.out.println("\nЗадание 9. Дана строка:");
        String str = "Hi, Frank! How did you doing? Were everything fine with you?";
        System.out.println(str);
        LetterCounter letterCounter = new LetterCounter(str);
        System.out.println("В ней больших и маленьких букв соответственно: " + letterCounter.countLetters());
    }

    private static void resultNumberOfSentences() {
        System.out.println("\nЗадание 10. Дана строка:");
        String str = "Hi, Frank! How did you doing? Were everything fine with you?";
        System.out.println(str);
        NumberOfSentences numberOfSentences = new NumberOfSentences(str);
        System.out.println("В ней предложений: " + numberOfSentences.countSentences());
    }
}