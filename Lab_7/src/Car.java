public class Car {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    // Методи для модифікації за завданням
    public void upgradePower(double percentage) {
        this.enginePower += this.enginePower * (percentage / 100);
    }

    public void upgradePrice(double percentage) {
        this.price += this.price * (percentage / 100);
    }

    // Геттери та сеттери
    public String getBrand() { return brand; }
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }

    @Override
    public String toString() {
        return String.format("Авто: %s, Потужність: %.1f, Ціна: %.1f, %s",
                brand, enginePower, price, driver);
    }
}