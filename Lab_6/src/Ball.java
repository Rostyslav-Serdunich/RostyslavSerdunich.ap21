public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        this.radius = radius;
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}