package by.epam.learn.main;

class Triangle {

    public boolean triangleExists(int a, int b) {
        return ((180 - a - b) > 0);
    }

    public boolean rightTriangle(int a, int b) {
        return ((a + b) == 90 || a == 90 || b == 90);
    }
}
