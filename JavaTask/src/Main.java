import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = console.nextLine();
        Human man = new Human(name);
        man.checkName();

        System.out.println("Введите число:");
        int num = console.nextInt();
        Numbers.checkNum(num);


        System.out.println("Введите элементы массива. Его длина равна "+ num +": ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        System.out.println("Элементы массива кратные 3:");
        Numbers.multipleOf3(array);
    }
}