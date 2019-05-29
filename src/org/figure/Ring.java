package org.figure;

import java.util.Objects;

public class Ring {

    protected float r;
    private float x0;
    private float y0;



    public Ring(float x0, float y0, float r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    @Override
    public String toString() {          //metoda toString (Alt+Insert) generowana automatycznie,
                                                // zwraca nazwy i wartości zmiennych i nazwe Klasy
        return "Ring{" +
                "x0=" + x0 +
                ", y0=" + y0 +
                ", r=" + r +
                '}';
    }

    // Getery i Setery (get & set) wykorzystujemy aby pobrac/nadać wartość zmiennej z modyfikatorem (najczęściej"private")

    public float getX0() {              // getX0 zwraca wartośc ze zmiennej "x0"
        return x0;
    }

    public float getY0() {
        return y0;
    }

    public float getR() {
        return r;
    }

    public double length() {
        return Math.PI * 2 * r;
    }

    @Override
    public boolean equals(Object o) {               //Porównuje w tym przypadku obiekty ->(Object o)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ring ring = (Ring) o;
        return Float.compare(ring.x0, x0) == 0 &&
                Float.compare(ring.y0, y0) == 0 &&
                Float.compare(ring.r, r) == 0;
    }

    @Override
    public int hashCode() {                         //Zwraca unikalny numer określający wyraz (Suma kontrolna)
        return Objects.hash(x0, y0, r);
    }


}
