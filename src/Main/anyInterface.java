package Main;

public interface anyInterface {
    default double calculate (double width, double length) {
        return width * length;
    }

    double compute (double radius);
}

