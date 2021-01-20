package by.epam.learn.main;

class StringWithoutRepeats {
    private final String oldStr;

    public StringWithoutRepeats(String oldStr) {
        this.oldStr = oldStr;
    }

    public String removeDuplicateCharacters() {
        StringBuilder newStr = new StringBuilder();
        newStr.append(oldStr.charAt(0));
        for (int i = 1; i < oldStr.length(); i++) {
            if (oldStr.charAt(i) != ' ') {
                for (int j = 0; j < newStr.length(); j++) {
                    if (oldStr.charAt(i) == newStr.charAt(j)) break;
                    else if (j == newStr.length() - 1) newStr.append(oldStr.charAt(i));
                }
            }
        }
        return newStr.toString();
    }
}
