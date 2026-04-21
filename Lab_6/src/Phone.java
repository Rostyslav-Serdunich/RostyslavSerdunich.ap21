public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор з трьома параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор з двома параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    // Конструктор без параметрів
    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + ", номер: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Відправка повідомлення на номери:");
        for (String num : numbers) {
            System.out.println("- " + num);
        }
    }

    public void printInfo() {
        System.out.println("Телефон [Модель: " + model + ", Номер: " + number + ", Вага: " + weight + "]");
    }
}