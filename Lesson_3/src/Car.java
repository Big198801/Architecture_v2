public abstract class Car implements IFogLights{
    protected String autoMarkName;
    protected String modelName;
    protected String color;
    protected String carBodyType;
    protected int wheelsCount;
    protected String fuelType;
    protected String gear_type;
    protected double engineVolume;

    public Car(String autoMarkName, String modelName, String color, String carBodyType, int wheelsCount, String fuelType, String gear_type, double engineVolume) {
        this.autoMarkName = autoMarkName;
        this.modelName = modelName;
        this.color = color;
        this.carBodyType = carBodyType;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.gear_type = gear_type;
        this.engineVolume = engineVolume;
    }

    protected void move(){
        System.out.printf("%s now is moving", modelName);

    };

    protected void changeGearLevel(int gearNumber) {
        System.out.printf("now is on %d_th gear\n", gearNumber );
    }

    protected  void lightsTurnOn(){
        System.out.printf("%s's lights is on\n", modelName);
    }
    protected  void wipesTurnOn(){
        System.out.printf("%s's wipes is on\n", modelName);
        System.out.println("\n");
    }

    @Override
    public void turnFogLightsOn() {
        System.out.printf("%s %s fog lights is on\n",autoMarkName, modelName);
    }
}
