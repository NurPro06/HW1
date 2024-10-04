public class Car extends Vehicle {
    private VehicleType vehicleType;
    public Car(String name, Engine engine, VehicleType vehicleType) {
        super(name, engine);
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String drive(){
        return "Driving a car!";
    }
    public String drive (int speed){
        return "Driving at speed:" + speed + "km/h";
    }
    public final String drive(String destination){
        return "Driving to:" + destination;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "," + "VehicleType:" + vehicleType;
    }


}
