package homework;

import homework.shapes.Shape;
import homework.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle(4, 3, "triangle", Color.BLACK);
        DrawImp drawImp = new DrawImp(shape);
        drawImp.draw();
        System.out.println(shape.getShapeName());

        shape.setShapeColor(Color.BLUE);
        drawImp.draw();
    }
}