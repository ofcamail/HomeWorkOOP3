import driver.*;
import transport.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Мазда", "М3", 1.3);
        Car car2 = new Car("Крайслер", "НР3", 2.3);
        Car car3 = new Car("Исузу", "Трупер", 3.0);
        Car car4 = new Car("Тойота", "Крузак", 3.2);


        Bus bus1 = new Bus("Лиаз", "М", 1.0);
        Bus bus2 = new Bus("МАЗ", "М2", 1.0);
        Bus bus3 = new Bus("Ситроен", "С6", 1.0);
        Bus bus4 = new Bus("Печка", "Мь4", 1.0);

        Truck truck1 = new Truck("МАЗ", "МАЗ", 3.0);
        Truck truck2 = new Truck("Грузовичок", "Грузовичок", 2.0);
        Truck truck3 = new Truck("Грузовой", "Грузовик", 3.0);
        Truck truck4 = new Truck("Грузовик", "Красивый", 2.0);

        DriverB driver1 = new DriverB("Годзилова Годзила Годзиловна", true, 3);
        DriverC driver2 = new DriverC("Кротов Крот Кротович", true, 4);
        DriverD driver3 = new DriverD("Мурзаев Мурзик Мурзикович", true, 5);


        car1.outPutInformationForTheRace(driver1);
        truck3.outPutInformationForTheRace(driver2);
        bus1.outPutInformationForTheRace(driver3);
    }
}