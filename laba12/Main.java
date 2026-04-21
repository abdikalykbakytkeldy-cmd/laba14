import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = sc.nextLine();

        int length = text.length();
        System.out.println("Длина строки: " + length);

        String upper = text.toUpperCase();
        System.out.println("Верхний регистр: " + upper);

        String lower = text.toLowerCase();
        System.out.println("Нижний регистр: " + lower);
    }
}