package day45_Abstractions.shape;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        if(side<0){
            throw  new RuntimeException("Invalid side "+side);
        }
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                ", side=" + side +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}
