public class IT26520069lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double pi = 3.14;

        // The rope length is the perimeter of the square
        double ropeLength = 4 * side;

        // Circumference = 2 * PI * radius, so radius = circumference / (2 * PI)
        double radius = ropeLength / (2 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}