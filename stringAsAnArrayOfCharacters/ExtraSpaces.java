package by.epam.learn.main;

class ExtraSpaces {
    private final String str;

    public ExtraSpaces(String str) {
        this.str = str;
    }

    public String removeExtraSpaces() {
        StringBuilder newStr = new StringBuilder();
        newStr.append(str.trim());
        int space = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == ' ') {
                space++;
            } else {
                if (space > 0) {
                    newStr.delete(i - space, i - 1);
                    space = 0;
                }
            }
        }
        return newStr.toString();
    }
}