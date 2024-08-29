public class Tractor extends Car implements IWipeStreet, ITransitCargo {

    public Tractor(String autoMarkName, String modelName, String color, String carBodyType, int wheelsCount, String fuelType, String gear_type, double engineVolume) {
        super(autoMarkName, modelName, color, carBodyType, wheelsCount, fuelType, gear_type, engineVolume);
    }

    @Override
    public void wipeTheStreet() {
        System.out.printf("%s %s is now cleaning the street\n", autoMarkName, modelName);
    }

    @Override
    public void transitCargo() {
        System.out.printf("%s %s transiting cargo\n", autoMarkName, modelName );
    }
}
