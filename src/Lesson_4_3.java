void main() {
    Scanner scanner = new Scanner(System.in);
    String[] products = new String[2];
    int[] quantity = new int[2];


    for (int i = 0; i < products.length; i++) {
        System.out.println("Товар № " + (i+1));
        System.out.print("Название продукта: ");
        products[i] = scanner.nextLine();
        System.out.print("Количество: ");
        quantity[i] = scanner.nextInt();
        scanner.nextLine();
    }
    productList(products, quantity);

    System.out.print("\nВведите название товара для поиска: ");
    String target = scanner.nextLine();

    List<Integer> found = findProduct(products,  target);

    if (found.isEmpty()) {
        System.out.println(RED + "Товар \"" + target + "\" не найден." + RESET);
    } else {
        System.out.println(GREEN + "Найдено товаров: " + target + " - " + found.size() + RESET);
        for (int idx : found) {
            System.out.printf("  %-15s | %10d шт%n", products[idx], quantity[idx]);
        }
    }
    scanner.close();

}
public static final String RESET = "\u001B[0m";
public static final String GREEN = "\u001B[32m";
public static final String RED   = "\u001B[31m";

public static void productList(String[] products, int[] quantity) {
    System.out.println("\nСписок товаров");
    System.out.printf(" %-15s | %10s%n","Товар", "Количество");
    System.out.println("------------------------------");

    int maxIndex = 0;
    for (int i = 0; i < products.length; i++) if (quantity[i] > quantity[maxIndex]) maxIndex = i;

    for (int i = 0; i < products.length; i++) {
        String color = "";
        if (i == maxIndex) { color = GREEN;}
        else if (quantity[i] < 10) { color = RED;}
        System.out.printf(color + " %-15s | %10s" + RESET + "%n", products[i], quantity[i] + " шт");
    }
}


public static List<Integer>findProduct(String[] products, String target) {
    List<Integer> indices = new ArrayList<>();
    String cleanTarget = target.trim().toLowerCase();

    for (int i = 0; i < products.length; i++) {
       /* if (products[i].equalsIgnoreCase(target)) {
            return i;
        }*/
        if (products[i].toLowerCase().contains(cleanTarget)) {indices.add(i);}
    }
    return indices;
}