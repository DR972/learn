package by.epam.learn.main;

class BAfterA {
    private final String str;

    public BAfterA(String str) {
        this.str = str;
    }

    public String insertBAfterA() {
        StringBuilder newStr = new StringBuilder();
        newStr.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'a') {
                newStr.append('b').append(str.charAt(i));
            } else newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
