void main()
{
   /* Scanner scanner = new Scanner(System.in);
    double[] temps = new double[7];
    String[] days = {"Понtдельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
    for (int i = 0; i < temps.length; i++) {
        System.out.print("Введите температуру: " + days[i] + " ");
        temps[i] = scanner.nextDouble();
    }
    double avg = average(temps);
    double max = temps[0];
    double min = temps[0];
    for(double temp : temps)
    {
        if(temp > max)
        {
            max = temp;
        }
        if(temp < min)
        {
            min = temp;
        }
    }
    int a = 0;
    for(double value : temps)
    {
        if(value > avg)
        {
            a++;
        }
    }
    System.out.println("Средняя температура: " + avg);
    System.out.println("Самая высокая температура: " + max);
    System.out.println("Самая низкая температура: " + min);
    System.out.println("Дней выше средней: " + a);
    scanner.close();*/

    //Задача №2
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите текст:");
    String text = scanner.nextLine();
    char[] symbols = {'!', '?', '@', '#', '$', '%', '&', '№'};

    System.out.println("Букв 'А': " + countA(text));
    System.out.println("Пробелов: " + countSpace(text));
    System.out.println("Цифр: " + countDigit(text));
    System.out.println("Символов в верхнем регистре: " + countUppercase(text));
    System.out.print("Найденные спецсимволы: ");

    boolean foundAny = false;
    for (char s : symbols)
    {
        if (containsSymbol(text, s))
        {
            System.out.print(s + " ");
            foundAny = true;
        }
    }

    if (!foundAny) {
        System.out.print("нет");
    }
    System.out.println(); // перевод строки после вывода

    scanner.close();

}
public static int countA(String text)
{
    int count = 0;
    for (char c : text.toCharArray())
    {
        if (c == 'А' || c == 'а' || c == 'A' || c == 'a')  count++;
    }
    return count;
}
public static int countSpace(String text)
{
    int count = 0;
    for (char c : text.toCharArray())
    {
        if (c == ' ')
        {
            count++;
        }
    }
        return count;
}
public static int countDigit(String text)
    {
    int count = 0;
    for (char c : text.toCharArray())
        {
        if (Character.isDigit(c)) count++;
        }
    return count;
    }
    public static int countUppercase(String text)
    {
        int count = 0;
        for (char c : text.toCharArray())
            {
            if (Character.isUpperCase(c)) count++;
            }
        return count;
    }
public static boolean containsSymbol(String text, char symbol) {
    for (char c : text.toCharArray()) {
        if (c == symbol)
        {
            return true;
        }
    }
    return false;
}




   /* public static double average ( double[] temps)
    {
        double sum = 0;
        for (double value : temps)
        {
            sum += value;
        }
        return sum / temps.length;
    }*/
