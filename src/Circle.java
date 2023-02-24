public class Circle extends Shape {
    private double radius;
    private Color color;
    private static final double PI = Math.PI;

    public Circle(double radius, String colorName) {
        this.radius = radius;
        this.color = ColorFactory.getColor(colorName);
    }

    @Override
    public String getDescription() {
        return "Description of the figure: \n"
                + "1. Name: " + getName() + "\n"
                + "2. Area: " + getArea() + "\n"
                + "3. Color: " + color.getName().toLowerCase() + "\n";
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }
}
