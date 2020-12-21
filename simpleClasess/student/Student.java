package by.epam.learn.main.modul3.simpleClasess;

public class Student {
    private final String name;
    private final int group;
    private final int[] ratings;

    public Student(String name, int group, int[] ratings) {
        this.name = name;
        this.group = group;
        this.ratings = ratings;
    }

    static String studyWell(Student[] students) {
        StringBuilder bestStudent = new StringBuilder();
        for (Student student : students) {
            int minRating = 9;
            for (int rating : student.ratings) {
                if (rating < minRating) minRating = rating;
            }
            if (minRating >= 9) {
                bestStudent.append(student.name).append(" from ").append(student.group).append(" group\n");
            }
        }
        return bestStudent.toString();
    }
}
