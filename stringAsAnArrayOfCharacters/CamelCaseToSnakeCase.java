package by.epam.learn.main;

class CamelCaseToSnakeCase {
    private final String[] camelCase;

    public CamelCaseToSnakeCase(String[] camelCase) {
        this.camelCase = camelCase;
    }

    public String[] creatingNewArray() {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < camelCase.length; i++) {
            snakeCase[i] = transformation(camelCase[i]);
        }
        return snakeCase;
    }

    public String transformation(String camelCase) {
        StringBuilder snakeCase = new StringBuilder();
        snakeCase.append(camelCase.charAt(0));
        for (int i = 1; i < camelCase.length(); i++) {
            int code = camelCase.charAt(i);
            if (code > 64 && code < 91) {
                snakeCase.append('_').append((char) (camelCase.charAt(i) + 32));
            } else snakeCase.append((char) code);
        }
        return snakeCase.toString();
    }
}
