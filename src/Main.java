//Ти створюєш графічний редактор.
//        Продумай ієрархію класів. Мають бути як мінімум:
//        базовий клас для фігури Shape. Цей клас повинен мати метод для виведення назви фігури.
//        класи, що наслідуються від Shape - Circle, Quad тощо - не менше п'яти варіантів.
//        повинен бути клас, що приймає фігуру, та виводить її назву. Клас повинен працювати саме з базовим класом Shape.
//Зверни увагу на використання засобів ООП - інтерфейсів, абстрактних класів, модифікаторів доступу.
//        Немає єдиного правильного шляху розв'язання цієї задачі. Намагайсь спроєктувати гнучку архітектуру, задаючи собі запитання, наприклад,
//        "А що буде, якщо цей клас потрібно буде змінювати? Що ще зміниться, якщо тут потрібно буде розширити можливості?"

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square(5.3, "Blue");
        Shape rectangle = new Rectangle(23.4, 84.3, "Green");
        Shape cube = new Cube(8.7, "Red");
        Shape triangle = new Triangle(10.6, 47.2, "Grey");
        Shape circle = new Circle(12.3, "Green");


        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(cube);
        shapeList.add(triangle);
        shapeList.add(circle);

        for (Shape elem : shapeList) {
            System.out.println(elem.getDescription());
        }
    }
}