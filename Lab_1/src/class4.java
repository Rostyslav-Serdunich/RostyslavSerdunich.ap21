        class Car {
        double horsePower;
        double engineVolume;
        String model;
        int year; // 2
        boolean isElectric; // 3
        String color; // 4
        double maxSpeed; // 5

        Car(double hp, double vol) {
            this.horsePower = hp;
            this.engineVolume = vol;
        }
    }

    public class class4 {
        public static void main(String[] args) {
            Car[] cars = new Car[10];
            for (int i = 0; i < 10; i++) {
                cars[i] = new Car(100 + i * 10, 1.5 + i * 0.1);
            }

            double sumHP = 0, sumVol = 0;
            for (Car c : cars) {
                sumHP += c.horsePower;
                sumVol += c.engineVolume;
            }

            System.out.println("Сумарна потужність: " + sumHP);
            System.out.println("Сумарний об'єм: " + sumVol);
        }
    }

