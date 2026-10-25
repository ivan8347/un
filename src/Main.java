
void main() {
    System.out.println("Hello World");
    System.out.println("12345");
    System.out.println(12345);
    System.out.println("Age " + 23);

    int a = 10;
    double b = 34 / a;
//TODO
    String s1 = "Int " + b;
    String s2 = "\"djfhg\"";
    String s3 = "\tdjfhg\t";
    String s4 = "1234";
    int i = Integer.parseInt(s4);
    System.out.println(i);

    String name = "\tdjfHJGKHJjsljgzljndhg\t";
    int c = name.length();
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String str = String.valueOf(a);
    System.out.println(str);

    Scanner console = new Scanner(System.in);
    System.out.print("Enter name ");

    String name_2 = console.nextLine();
    System.out.print("Enter age ");
    int age = console.nextInt();
    System.out.println(name_2);
    System.out.println(age + " лет");
    System.out.println(age);
    console.close();


}