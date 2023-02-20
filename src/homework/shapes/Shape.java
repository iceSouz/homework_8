package homework.shapes;

import homework.Color;

public abstract class Shape {
    private double pointX;
    private double pointY;
    private String shapeName;
    private Color shapeColor;

    public Shape(double pointX, double pointY, String shapeName, Color shapeColor) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.shapeName = shapeName;
        this.shapeColor = shapeColor;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }
}
