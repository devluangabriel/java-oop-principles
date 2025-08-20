package NelioAlves.Classes.ClassesNelio01.Entity;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double CalculoArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
