void main() {
    //задача № 1
      /*  int a = 10;
     int[]array=new int[a*2-10];
    // double[]array=new double[10];
        array[2]=4;
        array[7]=9;
        array[9]=array[2] + array[5];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
      int[] array = new int[n];
        int max = array[0];
        int index = 0;
        for(int i = 0; i < n; i++)
      {
          System.out.print("Введите элемент [" + i + "]: ");
          array [i] = scanner.nextInt();
          if (array[i] > max) {
              max = array[i];
              index = i;
          }
      }
        System.out.print(n + "\t");
        for (int i : array) {
            System.out.print( i + " ");
        }
        System.out.println("\n");
        System.out.println("Максимальное значение: " + max + ", индекс: " + index);
        scanner.close();*/

    //Задача № 3

   /* Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ширину прямоугольника: ");
    int width = scanner.nextInt();
    System.out.print("Введите высоту прямоугольника: ");
    int height = scanner.nextInt();
    System.out.print("Введите символ заполнения: ");
    char symbol = scanner.next().charAt(0);
    printRectangle(width, height, symbol);
    scanner.close();*/

    //Задача № 2
    /* ArrayList<String> words = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите слова или S:");
    while(true)
    {
    String word = scanner.nextLine().trim();
            if (word.equalsIgnoreCase("S")) break;
        if (!word.isEmpty())
        {
            words.add(word);
        }
    }
    System.out.println(words + " ");

    System.out.println("Всего: " + words.size());
    for (String word : words) {
        if (word.length() > 4) {
            System.out.println(word);
        }
    }
    scanner.close();*/

    ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Заполни массив или S :");

    while (true) {
        if (!scanner.hasNextInt())
        {
            String input = scanner.next();
            if (input.equalsIgnoreCase("S")) break;
        }
        else
        {
            int num = scanner.nextInt();
            list.add(num);
        }
    }

    int[] arr = new int[list.size()];
    for (int i = 0; i < list.size(); i++)
    {
        arr[i] = list.get(i);
    }
    System.out.print(list);
    System.out.println();

    double avg = average(arr);
    System.out.println("Среднее арифметическое: " + avg);

    System.out.print("Больше среднего: ");
    for (int value : arr) {
        if (value > avg) {
            System.out.print(value + " ");
        }
    }
    System.out.println();

    scanner.close();
}

public static double average(int[] arr)
{
    long sum = 0;
    for (int value : arr)
    {
        sum += value;
    }
    return (double) sum / arr.length;
}




/*void printRectangle(int width, int height, char symbol)
{

    for (int i = 1; i <= height; i++)
    {
        for (int j = 1; j <= width; j++)
        {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}*/
