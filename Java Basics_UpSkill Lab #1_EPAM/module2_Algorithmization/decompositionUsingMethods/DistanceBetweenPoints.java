package by.epam.learn.main;

class DistanceBetweenPoints {
    private final int[][] point;
    private int n1;
    private int n2;

    public DistanceBetweenPoints(int[][] point) {
        this.point = point;
    }

    public double maxDistance() {
        double max = 0;
        double distance;
        for (int i = 0; i < point.length - 1; i++) {
            for (int j = i + 1; j < point.length; j++) {
                distance = Math.sqrt(Math.pow(point[i][0] - point[j][0], 2) + Math.pow(point[i][1] - point[j][1], 2));
                if (max < distance) {
                    max = distance;
                    n1 = i;
                    n2 = j;
                }
            }
        }
        return max;
    }

    public int point1() {
        return n1;
    }

    public int point2() {
        return n2;
    }
}
