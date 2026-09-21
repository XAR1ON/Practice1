import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введите A: ");
    double A = sc.nextDouble();

    System.out.print("Введите B: ");
    double B = sc.nextDouble();

    if (A > B) {
        double temp = A;
        A = B;
        B = temp;
    }

    System.out.println("После: A = " + A + ", B = " + B);
    }
