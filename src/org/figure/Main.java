package org.figure;

public class Main {

	public static void main(String[] args) {

		FigureMaker.run();

		Ring ring1 = new Ring(0,0,7);
        Ring ring2 = new Ring(0,0,7);
        System.out.println(ring1.equals(ring2));
        System.out.println(ring1.toString());

        Circle circle = new Circle(0,0,7);
        System.out.println(ring1.equals(circle));
        System.out.println(ring1.hashCode());
        System.out.println(ring2.hashCode());
        System.out.println(circle.hashCode());

	}
}
