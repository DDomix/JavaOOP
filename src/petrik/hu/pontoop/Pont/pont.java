package petrik.hu.pontoop.Pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pont{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}