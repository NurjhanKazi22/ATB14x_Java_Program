package Exercises.Test16112025;

 interface Drawable {
    void draw();
}

class Circle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class TestDrawable {
    public static void main(String[] args) {
        Drawable circle = new Circle2();
        Drawable rectangle = new Rectangle2();

        circle.draw();
        rectangle.draw();
    }
}

