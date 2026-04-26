import java.util.ArrayList;

public class TaxiService {
    public static void main(String[] args) {
        ArrayList<Car> taxiFleet = new ArrayList<>();

        // Створення 10 автомобілів
        taxiFleet.add(new Car("Toyota", 150, new Driver("Олег", 30, 7), 15000, 2018));
        taxiFleet.add(new Car("BMW", 250, new Driver("Іван", 24, 3), 35000, 2020));
        taxiFleet.add(new Car("Skoda", 110, new Driver("Андрій", 28, 4), 12000, 2015));
        taxiFleet.add(new Car("Audi", 200, new Driver("Максим", 40, 15), 28000, 2019));
        taxiFleet.add(new Car("VW", 140, new Driver("Юрій", 26, 2), 14000, 2017));
        taxiFleet.add(new Car("Mazda", 165, new Driver("Дмитро", 22, 1), 18000, 2021));
        taxiFleet.add(new Car("Ford", 130, new Driver("Сергій", 35, 10), 10000, 2014));
        taxiFleet.add(new Car("Honda", 160, new Driver("Артем", 29, 6), 17000, 2016));
        taxiFleet.add(new Car("Kia", 120, new Driver("Микола", 27, 4), 13000, 2018));
        taxiFleet.add(new Car("Renault", 90, new Driver("Петро", 50, 25), 8000, 2012));

        System.out.println("--- ЕТАП 1: Ремонт та зміна водіїв ---");
        // Ремонт половині автопарку (+10% потужності)
        for (int i = 0; i < taxiFleet.size() / 2; i++) {
            Car car = taxiFleet.get(i);
            car.upgradePower(10);
            // Найм нових водіїв
            car.setDriver(new Driver("Новий Водій " + (i + 1), 30, 5));
            System.out.println("Відремонтовано: " + car.getBrand() + ", нова потужність та новий водій.");
        }

        System.out.println("\n--- ЕТАП 2: Підвищення кожній другій машині ---");
        // Кожна друга машина: +10% потужності, +5% ціни
        for (int i = 0; i < taxiFleet.size(); i += 2) {
            Car car = taxiFleet.get(i);
            car.upgradePower(10);
            car.upgradePrice(5);
            System.out.println("Машина #" + i + " (" + car.getBrand() + ") - параметри збільшено.");
        }

        System.out.println("\n--- ЕТАП 3: Перевірка досвіду водіїв ---");
        for (Car car : taxiFleet) {
            Driver d = car.getDriver();
            // Якщо досвід < 5, а вік > 25
            if (d.getExperience() < 5 && d.getAge() > 25) {
                d.setExperience(d.getExperience() + 1);
                System.out.println("Водія " + d.getName() + " відправлено на курси. Новий стаж: " + d.getExperience());
            }
        }

        System.out.println("\n--- ЕТАП 4: Виклик таксі ---");
        Helper helper = new Helper();
        // Рандомний вибір та виведення повідомлення про виїзд
        helper.processOrder(taxiFleet);
    }
}