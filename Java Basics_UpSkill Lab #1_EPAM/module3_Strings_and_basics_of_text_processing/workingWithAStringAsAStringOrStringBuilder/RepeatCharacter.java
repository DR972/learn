package by.epam.learn.main;

class RepeatCharacter {
    private final String str;

    public RepeatCharacter(String str) {
        this.str = str;
    }

    public String repeatSymbols() {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }
        return newStr.toString();
    }
}
