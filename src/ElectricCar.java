public class ElectricCar  extends Car {
    public ElectricCar(String name, Engine engine, VehicleType vehicleType) {
        super(name, engine, vehicleType);
    }
    @Override
    public String drive(int speed){
        return "Driving an electric car ar speed:" + speed + "km/h";
    }
}
