package transport;


import driver.DriverB;

public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }
}