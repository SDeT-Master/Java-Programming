package day39_Recap.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Square square= new Square(10);
        System.out.println(square);

        square.setSide(20);
        System.out.println(square);
        System.out.println(square.getName());

        System.out.println("-----------------------------------------");


        Rectangle rectangle= new Rectangle(5,6);
        System.out.println(rectangle);


        rectangle.setWidth(10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getName());

        System.out.println("----------------------");

        Circle circle=new Circle(10);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());

        System.out.println(circle.getName());






    }
}
