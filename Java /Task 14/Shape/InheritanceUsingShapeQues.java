package com.company.wiproPracticeQuestion.Shape;

public class InheritanceUsingShapeQues {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }


}
