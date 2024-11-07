package FactoryPattern;

public class MainClass {
    public static void main(String[] args) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape circle = shapeFactoryObj.getShape("CIRCLE");
        Shape rectangle = shapeFactoryObj.getShape("RECTANGLE");

        circle.draw();
        rectangle.draw();
    }
}
