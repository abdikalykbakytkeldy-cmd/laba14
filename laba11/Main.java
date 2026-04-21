import java.util.Scanner;

public class Main {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        System.out.print("Операция (+ - * /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') result = add(a, b);
        else if (op == '-') result = sub(a, b);
        else if (op == '*') result = mul(a, b);
        else if (op == '/') result = div(a, b);
        else System.out.println("Ошибка");

        System.out.println("Результат: " + result);
    }
}