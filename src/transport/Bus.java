package transport;

import driver.DriverD;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }
}