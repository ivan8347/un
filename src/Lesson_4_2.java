void main() {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Double> salaries = new ArrayList<>();
    ArrayList<Integer> tasks = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество сотрудников : ");
    int n = scanner.nextInt();
   scanner.nextLine();

    for (int i = 0; i < n; i++) {
        System.out.print("Имя: ");
        String name = scanner.nextLine();

        System.out.print("Зарплата: ");
        Double salary = scanner.nextDouble();

        System.out.print("Выполненые задачи: ");
        int countTask = scanner.nextInt();
        scanner.nextLine();

        names.add(name);
        salaries.add(salary);
        tasks.add(countTask);
    }

    double totalBonuses = 0;

    for (int i = 0; i < names.size(); i++) {
        double bonus = calcBonus(salaries.get(i), tasks.get(i));
        double total = salaries.get(i) + bonus;
        totalBonuses += bonus;

        System.out.println();
        System.out.println(names.get(i) + ":");
        System.out.println("  Зарплата: " + salaries.get(i) + " руб.");
        System.out.println("  Задач выполнено: " + tasks.get(i));
        System.out.println("  Премия: " + bonus + " руб.");
        System.out.println("  Итого к выплате: " + total + " руб.");
    }
    System.out.println("\nОбщая сумма премий: " + totalBonuses + " руб.");

    scanner.close();

}

public static double calcBonus(double salary, int task) {
    if (task > 50) return salary * 0.15;
    else if (task >= 30) return salary * 0.10;
    else return 0;
}