package by.epam.learn.main.modul3.simpleClasess;

public class BestStudents {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ivanov I.I.", 11, new int[]{7, 9, 4, 6, 9});
        students[1] = new Student("Jackson M.V.", 3, new int[]{9, 10, 8, 10, 9});
        students[2] = new Student("Johnson D.A.", 4, new int[]{4, 9, 6, 7, 9});
        students[3] = new Student("Kovalyev A.A.", 7, new int[]{6, 8, 8, 9, 7});
        students[4] = new Student("Sergeev S.K.", 9, new int[]{10, 10, 10, 10, 10});
        students[5] = new Student("Pattinson R.T.", 2, new int[]{9, 10, 9, 10, 9});
        students[6] = new Student("Petrov S.S.", 2, new int[]{10, 8, 8, 9, 9});
        students[7] = new Student("Sidorov P.P.", 3, new int[]{4, 5, 6, 8, 6});
        students[8] = new Student("Tajson M.M.", 9, new int[]{3, 6, 4, 7, 8});
        students[9] = new Student("Tramp I.P.", 11, new int[]{10, 9, 10, 10, 9});

        System.out.println("Excellent student:\n" + Student.studyWell(students));
    }
}
