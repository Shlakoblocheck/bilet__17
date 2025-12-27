import java.util.Scanner;

public class MonthInputValidator {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер месяца (1-12): ");
            if (scanner.hasNextInt()) {
                int month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    System.out.println("Месяц: " + months[month - 1]);
                    break;
                } else {
                    System.out.println("Число должно быть от 1 до 12.");
                }
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next();
            }
        }
        scanner.close();
    }
}
