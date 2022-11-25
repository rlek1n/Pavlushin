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
        String message = "";
        if (name.equals("Вячеслав")) {
            message = "Привет, " + name;
        } else if (name.equals("вячеслав")) {
            message = "Пожалуйста, введите имя с заглавной буквы";
        } else {
            message = "Нет такого имени";
        }
        System.out.println(message);
    }
}
