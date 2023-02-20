package homework;

import homework.shapes.Shape;

public class DrawImp implements Draw {
    private Shape shape;

    public DrawImp(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        String shapeName = shape.getShapeName();

        if (!shapeName.equalsIgnoreCase(shape.getClass().getSimpleName())) {
            throw new IllegalArgumentException(shapeName + " does not match this shape");
        }

        System.out.println("Coordinates " + shape.getClass().getSimpleName() + ": X = " + shape.getPointX() + ", Y = " + shape.getPointY());
        System.out.println("Color: " + shape.getShapeColor());

        if (shapeName.equalsIgnoreCase("Circle")) {
            System.out.println('\u25EF');
        }

        if (shapeName.equalsIgnoreCase("Quad")) {
            System.out.println('\u25A1');
        }

        if (shapeName.equalsIgnoreCase("Rhombus")) {
            System.out.println('\u25CA');
        }

        if (shapeName.equalsIgnoreCase("Rectangle")) {
            System.out.println('\u25AD');
        }

        if (shapeName.equalsIgnoreCase("Triangle")) {
            System.out.println('\u25B3');
        }
    }
}
