public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        int sum = 0;

        do {
            sum = sum + (n % 10);
            n = n / 10;
        } while (n > 0);

        System.out.println("Сумма цифр: " + sum);
    }
}