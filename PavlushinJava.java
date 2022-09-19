import java.util.Scanner;

public class PavlushinJava {
    public PavlushinJava(int num) {
        if (num > 7)
            System.out.println("Привет");
    }

    public PavlushinJava(String name) {
        if (name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, "+ name.substring(0, 1).toUpperCase() + name.substring(1));
        else
            System.out.println("Нет такого имени");
    }

    public PavlushinJava(int[] array) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = console.nextInt();

        System.out.println("Элементы массива кратные 3:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0)
                System.out.print(array[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = console.nextLine();
        PavlushinJava test = new PavlushinJava(name);

        System.out.println("Введите число:");
        int num = console.nextInt();
        PavlushinJava test2 = new PavlushinJava(num);

        System.out.println("Введите элементы массива. Его длина равна "+ num +": ");
        int[] array = new int[num];
        PavlushinJava test3 = new PavlushinJava(array);
    }
}
