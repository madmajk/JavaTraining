package org.figure;

public class Circle extends Ring {                 //"extends" rozszerza klase Circle o klase Ring,
                                                                // która w tym pzypadku jest rodzicem.

    public Circle(float x0, float y0, float r) {
        super(x0, y0, r);             //Pola w klasie Ring(Rodzic) "super" pozwala odnosić się do zmiennych klasy Circle
    }

    double area() {
        return Math.PI * r * r;       //Klasa Math służy w Javie do wykonywania zarówno podstawowych
                                        // jak i nieco bardziej skomplikowanych operacji matematycznych.
                                        // Znajdziemy w niej metodę do potęgowania i pierwiastkowania liczb,
                                        // obliczania funkcji trygonometrycznych, a także stałe PI oraz E.
    }

}
