import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = console.nextLine();
        Human man = new Human(name);
        man.checkName();

        System.out.println("Введите число:");
        int number = console.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите элементы массива. Его длина равна "+ number +": ");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        
        System.out.println("Элементы массива кратные 3:");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        console.close();
    }
}