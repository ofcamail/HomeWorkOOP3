package transport;

import driver.DriverC;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }
}