class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    User(int id, int age, double weight, double height) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

public class class3 {
    public static void main(String[] args) {
        User[] users = {
                new User(1, 18, 70.5, 175.0), new User(2, 19, 65.0, 180.0),
                new User(3, 20, 80.2, 170.5), new User(4, 21, 55.5, 160.0),
                new User(5, 22, 90.0, 190.0), new User(6, 19, 72.3, 177.0),
                new User(7, 20, 68.0, 174.0), new User(8, 23, 85.1, 185.0),
                new User(9, 18, 60.4, 168.0), new User(10, 20, 77.7, 182.0)
        };

        int totalAge = 0;
        double totalWeight = 0, totalHeight = 0;

        for (User u : users) {
            totalAge += u.age;
            totalWeight += u.weight;
            totalHeight += u.height;
        }

        System.out.println("Загальний вік: " + totalAge);
        System.out.printf("Загальна вага: %.2f\n", totalWeight);
        System.out.printf("Загальний зріст: %.2f\n", totalHeight);
    }
}