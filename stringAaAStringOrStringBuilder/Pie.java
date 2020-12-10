package by.epam.learn.main;

class Pie {
    private final String informatics;

    public Pie(String informatics) {
        this.informatics = informatics;
    }

    public String makingPie() {
        String pie = String.valueOf(informatics.charAt(informatics.indexOf('т')));
        pie += informatics.substring(3, 5) + pie;
        return pie;
    }
}
