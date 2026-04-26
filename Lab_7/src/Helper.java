import java.util.ArrayList;
import java.util.Random;

public class Helper {
    public void processOrder(ArrayList<Car> cars) {
        if (cars.isEmpty()) return;

        // Вибір рандомного елемента
        Random random = new Random();
        int index = random.nextInt(cars.size());
        Car selectedCar = cars.get(index);

        System.out.println("Автомобіль марки " + selectedCar.getBrand() +
                " з водієм " + selectedCar.getDriver().getName() + " виїхав за вами");

        arriveAtLocation(selectedCar);
    }

    public void arriveAtLocation(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }
}