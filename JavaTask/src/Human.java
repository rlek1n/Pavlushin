public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void checkName() {
        String result = "";
        if (name.equals("Вячеслав")) {
            result = "Привет, " + name;
        } else if (name.equals("вячеслав")) {
            result = "Пожалуйста, введите имя с заглавной буквы";
        } else {
            result = "Нет такого имени";
        }
        System.out.println(result);
    }
}
