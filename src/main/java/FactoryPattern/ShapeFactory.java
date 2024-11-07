package FactoryPattern;

public class ShapeFactory {

    Shape getShape(String input) {
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
