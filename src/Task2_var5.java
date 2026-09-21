import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введите значение x (в радианах): ");
    double x = sc.nextDouble();
    double cosCube = Math.pow(Math.cos(x), 3);
    double sinDouble = Math.sin(2 * x);
    double tan = Math.tan(x);
    if (Math.abs(tan) == 0) {
        System.out.println("Ошибка: ctg(x) не определён при x = " + x);
        return;
    }
    double ctg = 1.0 / tan;
    double y = cosCube - sinDouble + ctg;

    System.out.printf("y = %.6f%n", y);

    sc.close();
}