import java.util.Locale;
import java.util.Scanner;

public class Lesson
{
     void main()
     {
       /* int a = 8;
        if(a<10)
        {
        System.out.println("Child");
        }
        else if(a>10)
        {
        System.out.println("Yang");
        }
        char c= 'A';

        long b = 9_000_000_00000L;
         System.out.println(c);*/
// Четное/нечетное
       /*  Scanner scanner = new Scanner(System.in);
         while (true)
         {
             System.out.print("Введите число: ");
             int n = scanner.nextInt();
             if (n == 0)
             {
                 System.out.println("Прграмма завершена.");
                 break;
             }
             if(n%2==0)
             {
                 System.out.println("Четное");
             }
             else
             {
                 System.out.println("Нечетное");
             }
         }
         scanner.close();*/

//Password
        /* Scanner scanner = new Scanner(System.in);
         System.out.print("Введите пароль: ");
         String password = scanner.nextLine();

         boolean hasDigit = false;
         boolean hasUppercase = false;

         int uppercaseCount = 0;
         int lowercaseCount = 0;
         int vowelCount = 0;
         int digitCount = 0;

         String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";

         for (int i = 0; i < password.length(); i++)
         {
             char ch = password.charAt(i);

             if (Character.isUpperCase(ch)) {
                 hasUppercase = true;
                 uppercaseCount++;
             }
             if (Character.isLowerCase(ch)) {
                 lowercaseCount++;
             }

             char lowerCh = Character.toLowerCase(ch);
             if (vowels.indexOf(lowerCh) != -1) {
                 vowelCount++;
             }

             if (Character.isDigit(ch)) {
                 hasDigit = true;
                 digitCount++;
             }
         }

         System.out.println("Количество заглавных: " + uppercaseCount);
         System.out.println("Количество гласных: " + vowelCount);
         System.out.println("Количество строчных : " + lowercaseCount);
         System.out.println("Количество цифр: " + digitCount);

         if (hasDigit && hasUppercase && lowercaseCount >= 3) {
             System.out.println("Пароль надёжный");
         } else {
             if (lowercaseCount < 3) {
                 System.out.println("Слабый: строчных букв меньше 3");
             } else if (!hasDigit) {
                 System.out.println("Слабый: нет цифры");
             } else if (!hasUppercase) {
                 System.out.println("Слабый: нет заглавной буквы");
             } else {
                 System.out.println("Слабый");
             }
         }

         scanner.close();*/

         // Circle
        /* Scanner scanner = new Scanner(System.in);
         scanner.useLocale(Locale.US);
         System.out.print("Введите радиус круга: ");
         double r = scanner.nextDouble();
         double d = r * 2;
         double c = 2 * Math.PI * r;
        // double s = Math.PI * r * r;
         double s = Math.PI * Math.pow(r, 2);

         System.out.println("Радиус: " + r);
         System.out.println("Диаметр: " + d);
         System.out.println("Длина круга: " + c);
         System.out.println("Площадь круга: " + s);
         scanner.close();*/

         Scanner scanner = new Scanner(System.in);
         scanner.useLocale(Locale.US);
         //System.out.print("Введите температуру С°: " );
         while (true)
         {
             System.out.print("Введите температуру C° (или 'q' для выхода): ");

             if (!scanner.hasNextDouble()) {
                 String input = scanner.next();
                 if (input.equalsIgnoreCase("q")) break;
                 System.out.println("Ошибка: введите число.");
                 continue;
             }

             double t = scanner.nextDouble();
             double f = t * 9 / 5 + 32;
             double k = t + 273.15;

             System.out.println("Температура в Цельсиях: " + t + " °C");
             System.out.println("Температура по Фаренгейту: " + f + " °F");
             System.out.println("Температура в Кельвинах: " + k + " K");
             System.out.println("--------------------------");
         }
         scanner.close();
    }
}
