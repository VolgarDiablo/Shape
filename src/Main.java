import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ShapePrinterName printer = new ShapePrinterName();

        Shape square = new Square(5.3, "Blue");
        Shape rectangle = new Rectangle(23.4, 84.3, "Green");
        Shape cube = new Cube(8.7, "Red");
        Shape triangle = new Triangle(10.6, 47.2, "Grey");
        Shape circle = new Circle(12.3, "Green");

        try {
            Shape clonedSquare = (Shape) square.clone();
            System.out.println(square==clonedSquare);
            System.out.println(square.equals(clonedSquare));
            System.out.println(square.toString());
            System.out.println(clonedSquare.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


//        List<Shape> shapeList = new ArrayList<>();
//        shapeList.add(square);
//        shapeList.add(rectangle);
//        shapeList.add(cube);
//        shapeList.add(triangle);
//        shapeList.add(circle);


//        for (Shape elem : shapeList) {
//            printer.printShapeName(elem);
//        }

//        for (Shape elem : shapeList) {
//            System.out.println(elem.getDescription());
//        }

//        for (Shape elem : shapeList) {
//            System.out.println(elem.getName());
//        }
    }
}