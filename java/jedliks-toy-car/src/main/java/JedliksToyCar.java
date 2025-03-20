public class JedliksToyCar {
    private int battery = 100;
    private int distanceDriven = 0;

    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (battery != 0) {
            return "Battery at " + this.battery + "%";
        } else
            return "Battery empty";
    }

    public void drive() {
        if (this.battery != 0) {
            this.battery -= 1;
            this.distanceDriven += 20;
        }
    }
}
