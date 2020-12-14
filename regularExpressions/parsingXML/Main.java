package by.epam.learn.main;

public class Main {

    public static void main(String[] args) {
        resultParsingXML();
    }

    private final static String text = "<notes>\n" +
            "   <note id = \"1\">\n" +
            "       <to>Вася</to>\n" +
            "       <from>Света</from>\n" +
            "       <heading>Напоминание</heading>\n" +
            "       <body>Позвони мне завтра!</body>\n" +
            "   </note>\n" +
            "   <note id = \"2\">\n" +
            "       <to>Петя</to>\n" +
            "       <from>Маша</from>\n" +
            "       <heading>Важное напоминание</heading>\n" +
            "       <body/>\n" +
            "   </note>\n" +
            "</notes>";

    public static void resultParsingXML() {
        ParsingXML parsingXML = new ParsingXML(text);
        System.out.println(parsingXML.parseXML());
    }
}
