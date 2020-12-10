package by.epam.learn.main;

public class ConsecutiveSpaces {
    private final String str;

    public ConsecutiveSpaces(String str) {
        this.str = str;
    }

    public int countSpaces() {
        int maxSpace = 0;
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            } else {
                if (maxSpace < space) maxSpace = space;
                space = 0;
            }
        }
        if (maxSpace < space) maxSpace = space;
        return maxSpace;
    }
}
