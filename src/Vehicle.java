public class Vehicle {
    private String name;
    private Engine engine;

    public Vehicle(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
    public String getInfo(){
        return "Vehicle:" + name + "," + "Engine:" + engine.getEngineType();
    }
}

