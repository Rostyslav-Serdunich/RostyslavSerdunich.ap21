public class Pyramid extends Shape {
    private double s; // площа основи
    private double h; // висота

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3.0) * s * h;
    }
}