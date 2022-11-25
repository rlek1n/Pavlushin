public class Numbers {
    public static void checkNum(int num) {
        if (num > 7)
            System.out.println("Привет");
    }

    public static void multipleOf3(int[] array) {
        for (int i : array) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
