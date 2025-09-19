import java.util.Scanner;

/**
 * Головний клас програми для обчислення числа Люка за заданим індексом.
 * Програма запитує у користувача номер числа, створює об'єкт LucasNumber,
 * виводить номер та значення числа Люка, а також перевіряє нерівність n*L(n+1) > (n+1)*L(n).
 */
public class Main {

    /**
     * Конструктор за замовчуванням.
     * Використовується для створення об'єкта класу Main.
     */
    public Main() {

    }

    /**
     * Точка входу у програму.
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть номер числа Люка: ");
        int n = sc.nextInt();

        LucasNumber ln = new LucasNumber(n);

        System.out.println();
        System.out.println("Номер числа: " + ln.getIndex());
        System.out.println("Значення числа Люка: " + ln.getValue());

        if (ln.checkInequality()) {
            System.out.println("Нерівність n*Ln+1 > (n+1)*Ln виконується: True");
        } else {
            System.out.println("Нерівність n*Ln+1 > (n+1)*Ln виконується: False");
        }

        sc.close();
    }
}
