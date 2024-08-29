public class Main {
    public static void main(String[] args) {
        Car nissan = new NissanCar("Nissan", "Camry", "blue", "Sedan", 4, "Gasoline", "Automatic", 3.5d);
        nissan.lightsTurnOn();
        nissan.wipesTurnOn();

        Tractor tracktor = new Tractor("Belarus", "T150", "Black", "Tractor", 4, "Diesel", "Manual", 4.5d);
        tracktor.turnFogLightsOn();
        tracktor.transitCargo();
        tracktor.wheelsCount = 3;
        System.out.println(tracktor.wheelsCount);

    }

}
