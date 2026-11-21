import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    double usdRate = 1.1;
    double rubRate = 89.86;
    double gbpRate = 0.83;
    double jpyRate = 175.0;

    String fromSymbol;
    String toSymbol;

    String RED = "\u001B[31m";
    String RESET = "\u001B[0m";

    while (true) {
        // 1. Исходная валюта
        System.out.println("Из какой валюты конвертируем?");
        System.out.println("1 - Евро (\u20AC)");
        System.out.println("2 - Доллар ($)");
        System.out.println("3 - Рубль (\u20BD)");
        System.out.println("4 - Фунт стерлингов (\u00A3)");
        System.out.println("5 - Японская иена (\u00A5)");
        System.out.print("Ваш выбор: ");
        int from;

        if (scanner.hasNextInt()) {
            from = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Ошибка: нужен номер валюты!");
            scanner.nextLine();
            continue;
        }


        if (from == 1) fromSymbol = "\u20AC";
        else if (from == 2) fromSymbol = "$";
        else if (from == 3) fromSymbol = "\u20BD";
        else if (from == 4) fromSymbol = "\u00A3";
        else if (from == 5) fromSymbol = "\u00A5";
        else {
            System.out.println("Неверная исходная валюта! Начнём заново.");
            continue;
        }
        System.out.printf("Выбрано: %d (%s)%n", from, fromSymbol);

        System.out.println();
        // 2. Целевая валюта
        System.out.println("В какую валюту конвертируем?");
        System.out.println("1 - Евро (\u20AC)");
        System.out.println("2 - Доллар ($)");
        System.out.println("3 - Рубль (\u20BD)");
        System.out.println("4 - Фунт стерлингов (\u00A3)");
        System.out.println("5 - Японская иена (\u00A5)");

     System.out.print("Ваш выбор: ");
        int to;
        if (scanner.hasNextInt()) {
            to = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Ошибка: нужен номер валюты!");
            scanner.nextLine();
            continue;
        }

        if (to == 1) toSymbol = "\u20AC";
        else if (to == 2) toSymbol = "$";
        else if (to == 3) toSymbol = "\u20BD";
        else if (to == 4) toSymbol = "\u00A3";
        else if (to == 5) toSymbol = "\u00A5";
        else {
            System.out.println("Неверная целевая валюта! Начнём заново.");
            continue;
        }
        System.out.printf("Выбрано: %d (%s)%n", to, toSymbol);
        System.out.println();

        // 3. Сумма
        System.out.print("Введите сумму: ");
        double amount;

        if (scanner.hasNextDouble()) {
            amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("Вы ввели: %.2f%s%n", amount, fromSymbol);
        } else {
            System.out.println("Ошибка: это не число! Начнём заново.");
            scanner.nextLine();
            continue;
        }

        System.out.println();
        // 4. Конвертация через евро
        double inEuro;
        if (from == 1) inEuro = amount;
        else if (from == 2) inEuro = amount / usdRate;
        else if (from == 3) inEuro = amount / rubRate;
        else if (from == 4) inEuro = amount / gbpRate;
        else inEuro = amount / jpyRate;

        double result;
        if (to == 1) result = inEuro;
        else if (to == 2) result = inEuro * usdRate;
        else if (to == 3) result = inEuro * rubRate;
        else if (to == 4) result = inEuro * gbpRate;
        else result = inEuro * jpyRate;
        System.out.println();
        // 5. Вывод

        System.out.printf("%s%.2f%s -> %.2f%s%s%n", RED, amount, fromSymbol, result, toSymbol, RESET);

        System.out.println();
        // 6. Повтор или выход
        System.out.println("Хотите конвертировать ещё?");
        System.out.println("1 - Да");
        System.out.println("0 - Выход");
        System.out.print("Ваш выбор: ");
        int again = scanner.nextInt();
        scanner.nextLine();

        if (again != 1) {
            System.out.println("До свидания!");
            break;
        }
    }

    scanner.close();
}
