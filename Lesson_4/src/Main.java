public class Main {
    public static void main(String[] args) {
        IShape circle = new Circle(5.0);
        IShape bigCircle = new Circle(15.0);
        GeometryFigure boxOxFigures = new GeometryFigure();
        boxOxFigures.add(circle);
        boxOxFigures.add(bigCircle);
        boxOxFigures.getFiguresInfo();
    }
}
