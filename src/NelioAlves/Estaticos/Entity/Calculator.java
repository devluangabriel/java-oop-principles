package NelioAlves.Estaticos.Entity;

public class Calculator {
    public double radiuns;
    public static final double PI = 3.14159;

    public static double circumFerence(Double radiuns){
        return 2.0 * PI * radiuns;
    }

    public static double volume(Double radiuns){
        return 4.0 * PI * radiuns * radiuns * radiuns / 3.0;
    }

}
