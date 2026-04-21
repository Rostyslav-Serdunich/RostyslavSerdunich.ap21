public class Person {
    private final String fullName;
    private int age;

    // Конструктор без параметрів
    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    // Конструктор з параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " йде.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}