public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new Engine("Petrol Engine");
        Engine electricEngine = new Engine("Electric Engine");

        Car objectA = new Car("Toyota", petrolEngine, VehicleType.CAR);
        ElectricCar objectB = new ElectricCar("Tesla", electricEngine, VehicleType.CAR);
        ElectricCar objectC = new ElectricCar("Nissan Leaf", electricEngine, VehicleType.CAR);

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

        System.out.println(objectA.drive());
        System.out.println(objectA.drive(100));
        System.out.println(objectA.drive("Los Angeles"));

        System.out.println(objectB.drive(120));
        System.out.println(objectC.drive(90));
    }
}