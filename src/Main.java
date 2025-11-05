import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите первое число:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Сумма:");
        int sum = number1+number2;
        System.out.println(sum);

        System.out.println("Разность:");
        int sub = number1-number2;
        System.out.println(sub);

        System.out.println("Произведение:");
        int multiply = number1*number2;
        System.out.println(multiply);

        System.out.println("Частное:");
        double quo = (double) number1/number2;
        System.out.println(quo);
    }
}