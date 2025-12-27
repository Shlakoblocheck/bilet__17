import java.util.Scanner;

public class MonthInputValidator {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер месяца (1-12): ");
            String input = scanner.nextLine().trim();

            try {
                int month = Integer.parseInt(input);
                String monthName = months[month - 1];
                System.out.println("Месяц: " + monthName);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: число должно быть от 1 до 12.");
            }
        }
        scanner.close();
    }
}
