public class Rectangle extends Shape {
    public double width;
    public double height;
    public Color color;

    public Rectangle(double width, double height, String colorName) {
        this.width = width;
        this.height = height;
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
        return "rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
