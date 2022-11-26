import java.util.Scanner;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkName() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, " + name);
                break;
            } else if (name.equals("вячеслав")) {
                System.out.println("Пожалуйста, введите имя с заглавной буквы");
            } else {
                System.out.println("Нет такого имени");
            }
            setName(scan.nextLine());
        }
        scan.close();
    }
}
