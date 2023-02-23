public class Square extends Shape {
    public double width;
    public Color color;

    public Square(double width, String colorName) {
        this.width = width;
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
        return "square";
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
