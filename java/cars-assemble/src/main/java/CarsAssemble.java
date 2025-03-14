public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double x;
        if (speed <= 4) {
            x = 1;
        } else if (speed > 4 && speed <= 8) {
            x = 0.9;
        } else if (speed == 9) {
            x = 0.8;
        } else {
            x = 0.77;
        }
        return speed * 221 * x;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
