package org.figure;

public class FigureMaker {

    public static void run() {


        Ring ring = new Ring(0,0,1);
        System.out.println(ring.r);

        Circle circle = new Circle(0,0,1);
        System.out.println(circle.area());

//        System.out.println(ring instanceof Circle);
//        System.out.println(circle instanceof Circle);

        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println(ring.getClass());

        System.out.println("Ala ma Asa " + "i kota " + ring.toString());
    }
}
//      Ring circle = new Circle(0,0,1);
//      System.out.println(((Circle) circle).area());     <- Rzutowanie

