import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Сумма: " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println("Разность: " + difference);

        int product = firstNumber * secondNumber;
        System.out.println("Произведение: " + product);

        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + quotient);

        scanner.close();
    }
}