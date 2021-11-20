package com.CS102;




public class Project6 {
    public static void main(String[] args) {

        GeometricObject2[] objects = new GeometricObject2[5];
        objects[0] = new Square(8);
        objects[1] = new Square(6);
        objects[2] = new Square(9);
        objects[3] = new Square(3);
        objects[4] = new Square(4);

        for (int i = 0; i < objects .length; i++) {

            System.out.println("shape #" + (i + 1) + " area = " + objects[i].getArea());
            if (objects [i] instanceof Colorable) {
                System.out.println("How to color: " + ((Colorable)objects [i]).howToColor());
            }
        }

    }

}
abstract class GeometricObject2{


    public GeometricObject2(){

    }
    public abstract double getArea();

}
class Square extends GeometricObject2 implements Colorable {
    private double side;

    Square() {
        this(20);
    }

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }


    @Override
    public String howToColor() {
        return "Color all four sides.";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

interface Colorable {

    String howToColor();
}
