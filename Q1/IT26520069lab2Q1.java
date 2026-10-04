public class IT26520069lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;

        // perimeter = 2 * (length + width), and width = 3/4 * length
        // so perimeter = 2 * (length + 0.75 * length) = 3.5 * length
        double length = perimeter / 3.5;
        double width = length * 3 / 4;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}