package by.epam.learn.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParsingXML {
    private final String text;

    public ParsingXML(String text) {
        this.text = text;
    }

    public String parseXML() {
        StringBuilder str = new StringBuilder();
        Pattern openTag = Pattern.compile("<\\w.*?[^/]>");
        Pattern closeTag = Pattern.compile("</\\w+>");
        Pattern tagBody = Pattern.compile(">.+?<");
        Pattern nobodyTag = Pattern.compile("<\\w.+?/>");
        String[] lines = text.split("\n\\s*");
        for (String line : lines) {
            Matcher open = openTag.matcher(line);
            Matcher close = closeTag.matcher(line);
            Matcher body = tagBody.matcher(line);
            Matcher nobody = nobodyTag.matcher(line);
            if (open.find()) {
                str.append(open.group()).append(" - открывающий тег\n");
            }
            if (body.find()) {
                str.append(body.group()).append(" - содержимое тега\n");
            }
            if (close.find()) {
                str.append(close.group()).append(" - закрывающий тег\n");
            }
            if (nobody.find()) {
                str.append(nobody.group()).append(" - тег без тела\n");
            }
        }
        return str.toString();
    }
}
